package com.xideral.v0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AdvancedCoreDemo {
	public static void main(String[] args) {
        Path filePath = Paths.get("reporte_lote.ser");

        // 2. Concurrencia: Contador seguro para evitar Race Conditions
        AtomicInteger successCounter = new AtomicInteger(0);

        // ExecutorService para gestionar un pool de hilos de forma eficiente
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<Void>> tasks = new ArrayList<>();

        // Simulamos 10 tareas concurrentes de procesamiento
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            tasks.add(() -> {
                Thread.sleep(50); // Simulando carga de trabajo
                
                // Incremento atómico y seguro entre múltiples hilos
                successCounter.incrementAndGet();
                System.out.println("Hilo [" + Thread.currentThread().getName() + "] procesó la tarea #" + taskId);
                return null;
            });
        }

        try {
            // Ejecutamos todas las tareas concurrentemente y esperamos a que terminen
            executor.invokeAll(tasks);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("La ejecución concurrente fue interrumpida.");
        } finally {
            executor.shutdown(); // Liberamos los recursos del pool
        }

        // Creamos el objeto con el resultado final consolidado por los hilos
        ProcessingReport report = new ProcessingReport("LOTE-2026-X", successCounter.get(), "SECURE-SESSION-999");

        System.out.println("\n--- Objeto original antes de serializar ---");
        System.out.println(report);

        // 3. Archivos y Serialización: Escritura usando try-with-resources y java.nio.file.Files
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(filePath))) {
            oos.writeObject(report);
            System.out.println("\n[Archivo] Reporte serializado guardado exitosamente en: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // 4. Lectura (Deserialización) del objeto desde disco
        System.out.println("\n--- Leyendo objeto desde disco (Deserialización) ---");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(filePath))) {
            ProcessingReport loadedReport = (ProcessingReport) ois.readObject();
            System.out.println(loadedReport);
            // Nota: internalSessionId aparecerá como null debido a la palabra clave transient
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

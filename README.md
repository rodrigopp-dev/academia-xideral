# Academia Backend/Frontend/QE

Este repositorio recopila todo el contenido, las prácticas y los proyectos desarrollados a lo largo de las **6 semanas** de la **Backend/Frontend/QE**.

---

## Contenido del Repositorio

### Semana 1: Proyecto Integrador - CineHub
Durante esta primera semana se estudiaron diversos conceptos teóricos y prácticos, culminando con el desarrollo de **CineHub** —un proyecto integrador diseñado al cierre de la semana para aplicar de forma conjunta todo lo aprendido en una plataforma simulada de series y películas—.

#### Temas Implementados:
* **Fundamentos de POO:** Encapsulación, constructores, modificadores de acceso, herencia (*is-a*) y composición (*has-a*).
* **Estructura y Comportamiento:** Clases abstractas, polimorfismo, *casting*, y el uso de las palabras reservadas static y final.
* **Diseño y Buenas Prácticas:** Inmutabilidad y manejo de excepciones.
* **Tipos y Colecciones:** Genéricos (*Generics*), Comparable y Comparator.
* **Programación Funcional y Patrones de Diseño:** Clases anónimas, expresiones lambda, Singleton y Strategy.

---

### Semana 2: Spring Boot, Bases de Datos e Inyección de Dependencias
En la carpeta de esta semana se encuentran **3 proyectos** enfocados en la persistencia de datos y patrones de diseño estructurales:

**1. CRUD de Películas (Relacional)**  
Un proyecto desarrollado con **Spring Boot** para gestionar películas. Está configurado para usar una base de datos relacional mediante las dependencias de **MySQL Driver** y **Spring Data JPA**.

**2. CRUD de Películas (NoSQL)**  
Es exactamente el mismo sistema de gestión (CRUD) del proyecto anterior, pero refactorizado e implementado para utilizar **MongoDB** como base de datos.

**3. Proyecto Java Simple - Inyección de Dependencias**  
Un proyecto en Java puro diseñado específicamente para entender cómo funciona la Inyección de Dependencias (Dependency Injection).

**¿Qué es la inyección de dependencias?**  
En lugar de que una clase cree "manualmente" los objetos que necesita para funcionar (sus dependencias), alguien más se los "pasa" o inyecta desde afuera, generalmente a través de su constructor. 

**¿Qué problemas resuelve?**
* **Reduce el Acoplamiento:** Evita que tu código sea un bloque rígido. Si una clase no crea sus propias herramientas, es mucho más fácil cambiar una herramienta por otra en el futuro sin tener que reescribir toda la clase principal.
* **Mejora la Testeabilidad:** Facilita enormemente hacer pruebas (*testing*). Al poder inyectar dependencias desde afuera, puedes pasarle a tu clase objetos "falsos" (*mocks*) durante las pruebas unitarias, evitando dependencias externas como bases de datos.
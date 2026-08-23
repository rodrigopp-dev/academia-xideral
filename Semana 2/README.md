### Semana 2: Spring Boot, Bases de Datos e Inyección de Dependencias
En la carpeta de esta semana se encuentran **3 proyectos** enfocados en la persistencia de datos y patrones de diseño estructurales:

**1. CRUD de Películas (Relacional)**  
Un proyecto desarrollado con **Spring Boot** para gestionar películas. Está configurado para usar una base de datos relacional mediante las dependencias de **MySQL Driver** y **Spring Data JPA**.

**2. CRUD de Películas (NoSQL)**  
Es exactamente el mismo sistema de gestión (CRUD) del proyecto anterior, pero refactorizado e implementado para utilizar **MongoDB** como base de datos.

**3. Proyecto Java Simple - Inyección de Dependencias**  
Un proyecto en Java puro diseñado específicamente para entender cómo funciona la Inyección de Dependencias (Dependency Injection).

---

### Detalles de Implementación de las APIs

**Entidad Principal:**
* **Entidad:** `Peliculas`
* **Campos:** `id`, `titulo`, `descripcion`, `fechaEstreno`, `duracion`, `genero`, `director`, `calificacion`, `idiomaOriginal`, `paisOrigen`.

**Endpoints:**
* `GET /api/peliculas` - Obtener la lista de todas las películas.
* `GET /api/peliculas/{id}` - Obtener la película con el ID especificado.
* `POST /api/peliculas` - Agregar una nueva película.
* `PUT /api/peliculas/{id}` - Modificar una película existente (reemplazo total).
* `PATCH /api/peliculas/{id}` - Modificar parcialmente una película.
* `DELETE /api/peliculas/{id}` - Eliminar una película.

**Cómo levantar cada proyecto:**
* **Proyecto 1 (Relacional - MySQL):** En el repositorio viene adjunto el archivo `xideral.peliculas.sql`, el cual contiene el script necesario para generar la base de datos y la tabla de películas. Al ejecutar el proyecto en Spring Boot, la aplicación se levantará en el puerto **`8080`**.
* **Proyecto 2 (NoSQL - MongoDB):** No es necesario crear la base de datos manualmente, ya que Spring Boot la crea de forma automática al arrancar, al igual que la tabla `Peliculas`. Para poder correrlo de forma independiente o en paralelo con el proyecto relacional, este proyecto se levanta en el puerto **`8081`** (configurable en el archivo `application.properties`).
* **Proyecto 3 (Java Simple):** No requiere base de datos ni servidor web; se ejecuta directamente desde el método `main` del archivo principal.

---

### Conceptos Clave

**¿Qué es la inyección de dependencias?**  
En lugar de que una clase cree "manualmente" los objetos que necesita para funcionar (sus dependencias), alguien más se los "pasa" o inyecta desde afuera, generalmente a través de su constructor. 

**¿Qué demuestra el Programa 3 y por qué es inyección de dependencias?**  
El Programa 3 demuestra la separación entre la creación de un objeto y su uso. En lugar de que las clases instancien a sus propios colaboradores usando la palabra clave `new`, los reciben ya creados a través de su constructor. Esto es *inyección de dependencias* porque un actor externo (en este caso el método `main`) asume la responsabilidad de instanciar las piezas y "ensamblarlas" o inyectarlas en las clases que las requieren, logrando el principio de Inversión de Control sin necesidad de utilizar un framework complejo.

**¿Qué problemas resuelve?**
* **Reduce el Acoplamiento:** Evita que tu código sea un bloque rígido. Si una clase no crea sus propias herramientas, es mucho más fácil cambiar una herramienta por otra en el futuro sin tener que reescribir toda la clase principal.
* **Mejora la Testeabilidad:** Facilita enormemente hacer pruebas (*testing*). Al poder inyectar dependencias desde afuera, puedes pasarle a tu clase objetos "falsos" (*mocks*) durante las pruebas unitarias, evitando dependencias externas como bases de datos.
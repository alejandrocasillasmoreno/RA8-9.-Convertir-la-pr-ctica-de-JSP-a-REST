# RA8-9.-Convertir-la-pr-ctica-de-JSP-a-REST
Este proyecto es una API REST desarrollada en Java con Spring Boot. Su objetivo es gestionar las entidades de Materias, Resultados de Aprendizaje (RA) y Criterios de Evaluación mediante operaciones CRUD. No incluye cliente frontend, funcionando estrictamente como un servicio backend.

## Estructura del Proyecto

El proyecto sigue una arquitectura estricta basada en el patrón Modelo-Vista-Controlador (MVC), garantizando la separación de responsabilidades:

* **`controller`**: Capa que expone los endpoints REST de la aplicación. No contiene lógica de negocio, limitándose a recibir las peticiones HTTP y llamar a los servicios correspondientes.
* **`service`**: Capa que contiene toda la lógica de negocio. Decide qué operación CRUD ejecutar y es la única autorizada para comunicarse con los repositorios.
* **`repository`**: Interfaces que extienden de JpaRepository para la comunicación directa con la base de datos MySQL.
* **`model`**: Contiene las clases de las entidades (`Materia`, `Ra`, `Criterio`) mapeadas a la base de datos.

## Endpoints

A continuación se detallan las rutas principales de la API para interactuar con las entidades:

### Materias
* `GET /api/materias` - Obtiene la lista de todas las materias.
* `GET /api/materias/{id}` - Obtiene los detalles de una materia específica.
* `POST /api/materias` - Crea una nueva materia.
* `DELETE /api/materias/{id}` - Elimina una materia existente.

### Resultados de Aprendizaje (RA)
* `GET /api/ras` - Obtiene la lista de todos los RA.
* `GET /api/ras/{id}` - Obtiene los detalles de un RA específico.
* `POST /api/ras` - Crea un nuevo RA.
* `DELETE /api/ras/{id}` - Elimina un RA.

### Criterios de Evaluación
* `GET /api/criterios` - Obtiene la lista de todos los criterios.
* `GET /api/criterios/{id}` - Obtiene los detalles de un criterio específico.
* `POST /api/criterios` - Crea un nuevo criterio.
* `DELETE /api/criterios/{id}` - Elimina un criterio.

## Ejemplos de pruebas

A continuación, se muestran ejemplos de los cuerpos (payloads) en formato JSON necesarios para realizar peticiones `POST` a la API a través de herramientas como Postman o cURL.

**1. Crear una nueva Materia (POST a `/api/materias`)**
```json
{
  "codigo": "PROG01",
  "nombre": "Programacion JavaScript"
}
```
**2. Crear un nuevo Resultado de Aprendizaje asociado a una Materia (POST a /api/ras)**
```json
{
  "codigo": "RA1",
  "descripcion": "Desarrollar componentes software en lenguajes de programación estructurada",
  "materia": {
    "id": 1
  }
}
```

**3. Crear un nuevo Criterio asociado a un RA (POST a /api/criterios)**
```json
{
  "descripcion": "Se ha escrito código fuente legible y documentado",
  "ra": {
    "id": 1
  }
}
```

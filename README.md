# 💬 FORO HUB

**Foro Hub** es una API REST que forma parte del backend de una plataforma de discusión y aprendizaje.

Este proyecto fue desarrollado como parte del **Challenge de Alura Latam - Oracle Next Education**.

La API incluye funcionalidades para la gestión de usuarios, roles, módulos, cursos, tópicos y respuestas, con autenticación basada en **JWT** y control de acceso basado en roles.

---

## 🚀 Tecnologías utilizadas

* **Java 21**
* **Spring Boot 3**
* **Spring Security**
* **JWT (JSON Web Tokens)**
* **Spring Data JPA**
* **MySQL** (por defecto)
* **H2** (para pruebas)
* **Flyway** (migraciones)
* **Swagger / OpenAPI 3**
* **Lombok**
* **Maven**

---

La aplicación estará disponible en:

```
http://localhost:3606/api/v1
```


## 💡 Funcionalidades destacadas

* Registro y autenticación de usuarios
* Cambio de contraseña y deshabilitación de cuenta
* Gestión de roles y permisos
* CRUD para módulos, cursos, tópicos y respuestas
* Control de acceso por rol
* Paginación y ordenamiento de resultados
* Manejo centralizado de errores con `@RestControllerAdvice`

---

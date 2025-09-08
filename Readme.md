# Ejercicio de Builder para Casas

## Descripción
Este proyecto es un ejercicio para implementar el **patrón de diseño Builder** en Java utilizando **Spring Boot**.  
El objetivo es construir distintos tipos de objetos `House` con configuraciones flexibles (garage, piscina, jardín, estatuas decorativas, etc.), siguiendo **principios de diseño orientado a objetos**.

El ejercicio demuestra:

- **Patrón Builder** con métodos encadenables (method chaining).
- **Uso de `@Component`** para integración con Spring Boot.
- **Implementación de una interfaz Builder** (`InterfaceHouseBuilder`).
- **Clase Director** (`HouseDirector`) para crear configuraciones de casas predefinidas.

---

## Estructura del proyecto

- `HouseEntity.java` → la entidad que representa una casa con sus atributos y getters/setters.
- `InterfaceHouseBuilder.java` → interfaz que define los métodos del builder.
- `HouseEntityBuilder.java` → implementa la interfaz y construye la instancia de `HouseEntity`.
- `HouseDirector.java` → construye tipos de casas predefinidos, como lujo o básica.
- `src/test/java` → contiene los tests unitarios con **JUnit 5** y **Hamcrest**.

---
Uso
1.Construir una casa personalizada usando Builder()

                                      .garage(true)
                                      .pool(true)
                                      .garden(true)
                                      .statue(3);
                                      .build();





<img width="241" height="183" alt="demo-builder" src="https://github.com/user-attachments/assets/116c4d0b-61b1-4763-b709-65680ff03036" />













+-------------------+
|   HouseEntity     |
|------------------|
| - garage: boolean |
| - pool: boolean   |
| - garden: boolean |
| - statues: int    |
|------------------|
| +getGarage()      |
| +getPool()        |
| +getGarden()      |
| +getStatues()     |
+-------------------+

       
+---------------------+
|   InterfaceHouseBuilder      |
|---------------------|
| +garage(boolean)     |
| +pool(boolean)       |
| +garden(boolean)     |
| +statues(int)        |
| +build(): HouseEntity|
+---------------------+
       
+------------------------+
| HouseEntityBuilder      |
|------------------------|
| +garage(boolean)       |
| +pool(boolean)         |
| +garden(boolean)       |
| +statues(int)          |
| +build(): HouseEntity  |
+------------------------+
      
+------------------------+
|   HouseDirector        |
|------------------------|
| +constructFerLuxuryHouse()|
| +constructBasicHouse() |
| +constructGardenPool() |
+------------------------+
     











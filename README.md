# Proyecto-Sistema-de-Reporte-de-Problemas-Urbanos<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/c75150c9-2b58-478c-952f-38c0d9123837" />

````markdown
# 🏙️ Sistema de Reporte y Seguimiento de Problemas Urbanos

> **Práctica: Relaciones entre clases — Asociación de composición**

---

## 📌 Descripción

Este proyecto consiste en un sistema desarrollado en **Java** que permite registrar y realizar seguimiento a diferentes problemas que se presentan en espacios públicos de una ciudad.

El sistema permite crear un reporte urbano, agregar evidencias, registrar seguimientos y actualizar el estado del problema.

Algunos ejemplos de problemas que pueden ser reportados son:

- 🕳️ Huecos en las calles
- 💡 Luminarias dañadas
- 🚦 Señales de tránsito deterioradas
- 🚧 Alcantarillas en mal estado
- 🗑️ Basura acumulada
- 🏗️ Daños en espacios públicos

---

## 🎯 Problema

En una ciudad pueden presentarse diferentes problemas en las calles y espacios públicos. Sin embargo, cuando estos problemas no se registran y organizan correctamente, puede ser difícil realizar un seguimiento de su estado y de las acciones realizadas para solucionarlos.

Por esta razón, se plantea desarrollar un sistema que permita **organizar la información de cada problema urbano mediante un reporte**.

---

## 💡 Solución propuesta

El sistema permite registrar la información de un problema urbano y realizar un seguimiento durante su proceso de atención.

### Funciones principales

1. Crear un reporte urbano.
2. Registrar el tipo de problema.
3. Registrar la ubicación.
4. Agregar una descripción.
5. Agregar evidencias.
6. Agregar seguimientos.
7. Cambiar el estado del reporte.
8. Mostrar toda la información registrada.

---

# 🔗 Relación entre clases

El proyecto utiliza una relación de **composición** entre las clases.

La clase `ReporteUrbano` representa el **todo**, mientras que las clases `Evidencia` y `Seguimiento` representan **partes** que pertenecen al reporte.

### Representación

```text
                    ◆────────────── Evidencia
                    │
              ReporteUrbano
                    │
                    ◆────────────── Seguimiento
````

El símbolo `◆` representa una **composición** en UML.

En este proyecto:

* Un `ReporteUrbano` puede contener varias `Evidencia`.
* Un `ReporteUrbano` puede contener varios `Seguimiento`.
* Las evidencias son creadas desde el reporte.
* Los seguimientos son creados desde el reporte.
* `ReporteUrbano` administra las evidencias y los seguimientos que le pertenecen.

La composición representa una relación **todo/parte**, donde las partes dependen del objeto principal.

---

# 🧩 ¿Por qué se utiliza composición?

Se utiliza composición porque `Evidencia` y `Seguimiento` representan partes que pertenecen al `ReporteUrbano`.

La clase `ReporteUrbano` es la encargada de crear y administrar estos objetos mediante los métodos:

```java
agregarEvidencia()
```

y

```java
agregarSeguimiento()
```

Por ejemplo:

```java
Evidencia evidencia = new Evidencia(descripcion);
evidencias.add(evidencia);
```

y:

```java
Seguimiento seguimiento = new Seguimiento(descripcion);
seguimientos.add(seguimiento);
```

De esta manera, el `ReporteUrbano` mantiene dentro de sus listas las evidencias y seguimientos relacionados con el problema.

---

# 📐 Diagrama de clases

El proyecto cuenta con el siguiente diagrama UML:

![Diagrama de clases](diagrama_clases.png)

### Relación principal

```text
ReporteUrbano ◆──── 0..* Evidencia

ReporteUrbano ◆──── 0..* Seguimiento
```

Esto significa que un reporte puede tener **cero o muchas evidencias** y **cero o muchos seguimientos**.

---

# 🏗️ Clases del proyecto

## `ReporteUrbano`

Es la clase principal del sistema y representa un problema urbano registrado.

### Atributos

```text
- numero : int
- tipoProblema : String
- ubicacion : String
- descripcion : String
- estado : String
- evidencias : ArrayList<Evidencia>
- seguimientos : ArrayList<Seguimiento>
```

### Métodos principales

```text
+ agregarEvidencia(descripcion : String) : void
+ agregarSeguimiento(descripcion : String) : void
+ cambiarEstado(nuevoEstado : String) : void
+ mostrarReporte() : void
```

---

## `Evidencia`

Representa una evidencia relacionada con el problema urbano.

La evidencia contiene una descripción que permite registrar información adicional sobre el problema.

### Atributos

```text
- descripcion : String
```

### Métodos

```text
+ Evidencia(descripcion : String)
+ getDescripcion() : String
+ mostrarEvidencia() : void
```

Los objetos `Evidencia` son creados desde `ReporteUrbano`.

---

## `Seguimiento`

Representa una actualización o seguimiento realizado sobre un problema urbano.

Permite registrar información relacionada con el avance del reporte.

### Atributos

```text
- descripcion : String
```

### Métodos

```text
+ Seguimiento(descripcion : String)
+ getDescripcion() : String
+ mostrarSeguimiento() : void
```

Los objetos `Seguimiento` son creados desde `ReporteUrbano`.

---

## `Main`

La clase `Main` contiene el método principal del programa:

```java
public static void main(String[] args)
```

Esta clase se encarga de interactuar con el usuario mediante un menú y utilizar los métodos de `ReporteUrbano`.

### Menú principal

```text
====================================
   SISTEMA DE PROBLEMAS URBANOS
====================================
1. Crear reporte
2. Agregar evidencia
3. Agregar seguimiento
4. Cambiar estado
5. Mostrar reporte
6. Salir
```

Para recibir información del usuario se utiliza la clase `Scanner`.

---

# ⚙️ Funcionamiento

El flujo principal del sistema es:

```text
┌───────────────────┐
│   Crear reporte   │
└─────────┬─────────┘
          ↓
┌───────────────────────┐
│   Agregar evidencia   │
└─────────┬─────────────┘
          ↓
┌─────────────────────────┐
│   Agregar seguimiento   │
└─────────┬───────────────┘
          ↓
┌─────────────────────┐
│   Cambiar estado    │
└─────────┬───────────┘
          ↓
┌─────────────────────┐
│   Mostrar reporte   │
└─────────────────────┘
```

---

# 📝 Ejemplo de funcionamiento

### 1. Crear reporte

El usuario puede registrar un problema:

```text
Número del reporte: 001

Tipo de problema: Hueco en la vía

Ubicación: Calle 50 con Carrera 13

Descripción: Existe un hueco de gran tamaño en la vía.
```

---

### 2. Agregar evidencia

Posteriormente se puede agregar una evidencia:

```text
Descripción de la evidencia:
Fotografía del hueco tomada durante el reporte.
```

---

### 3. Agregar seguimiento

Se puede registrar un seguimiento:

```text
Descripción del seguimiento:
El reporte fue revisado por el equipo encargado.
```

---

### 4. Cambiar estado

El estado del reporte puede actualizarse:

```text
Nuevo estado:
En proceso
```

Los estados utilizados en el programa pueden ser:

```text
Pendiente
En proceso
Solucionado
```

---

### 5. Mostrar reporte

Finalmente, el sistema puede mostrar toda la información:

```text
====================================
         REPORTE URBANO
====================================
Número: 001
Problema: Hueco en la vía
Ubicación: Calle 50 con Carrera 13
Descripción: Existe un hueco de gran tamaño en la vía.
Estado: En proceso

EVIDENCIAS:
- Fotografía del hueco tomada durante el reporte.

SEGUIMIENTOS:
- El reporte fue revisado por el equipo encargado.
====================================
```

---

# 📁 Estructura del proyecto

El repositorio está organizado de la siguiente manera:

```text
SistemaProblemasUrbanos/
│
├── README.md
├── diagrama_clases.png
│
└── src/
    │
    ├── Main.java
    ├── ReporteUrbano.java
    ├── Evidencia.java
    └── Seguimiento.java
```

### Descripción de los archivos

| Archivo               | Descripción                                          |
| --------------------- | ---------------------------------------------------- |
| `Main.java`           | Contiene el método principal y el menú del programa. |
| `ReporteUrbano.java`  | Representa el reporte y administra sus partes.       |
| `Evidencia.java`      | Representa una evidencia del problema.               |
| `Seguimiento.java`    | Representa un seguimiento del problema.              |
| `README.md`           | Documentación del proyecto.                          |
| `diagrama_clases.png` | Diagrama UML de las clases.                          |

---

# 🧠 Conceptos de Programación Orientada a Objetos

En este proyecto se aplican diferentes conceptos de **Programación Orientada a Objetos**.

## Clases

El sistema está dividido en diferentes clases:

```text
Main
ReporteUrbano
Evidencia
Seguimiento
```

Cada clase tiene una responsabilidad específica.

---

## Objetos

A partir de las clases se crean objetos durante la ejecución.

Por ejemplo:

```java
ReporteUrbano reporte = new ReporteUrbano(
    numero,
    tipo,
    ubicacion,
    descripcion
);
```

También se crean objetos `Evidencia` y `Seguimiento` desde `ReporteUrbano`.

---

## Encapsulamiento

Los atributos de las clases se manejan como `private`.

Por ejemplo:

```java
private String descripcion;
```

Para acceder a determinada información se utilizan métodos públicos, como:

```java
public String getDescripcion()
```

---

## Composición

La composición es la relación principal utilizada en este proyecto.

Se representa mediante:

```text
ReporteUrbano ◆──── Evidencia
ReporteUrbano ◆──── Seguimiento
```

El `ReporteUrbano` funciona como el objeto principal y mantiene las partes que conforman el reporte.

---

# 🛠️ Tecnologías utilizadas

* ☕ Java
* 🧩 Programación Orientada a Objetos
* 📐 UML
* 🔧 Git
* 🐙 GitHub
* 💻 Visual Studio Code / NetBeans

---

# ▶️ Ejecución del proyecto

## 1. Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

## 2. Abrir el proyecto

Abrir la carpeta del proyecto utilizando un entorno de desarrollo como:

* Visual Studio Code
* NetBeans
* IntelliJ IDEA

## 3. Entrar a la carpeta `src`

```bash
cd src
```

## 4. Compilar

```bash
javac *.java
```

## 5. Ejecutar

```bash
java Main
```

---

# 🎓 Objetivo académico

El objetivo de este proyecto es aplicar los conceptos de **Programación Orientada a Objetos** y representar mediante Java una relación de **composición entre clases**.

El proyecto permite observar cómo una clase principal puede estar compuesta por objetos de otras clases que representan partes de ella.

---

# ✅ Conclusión

El **Sistema de Reporte y Seguimiento de Problemas Urbanos** permite organizar la información relacionada con problemas que pueden presentarse en una ciudad.

Mediante este proyecto se aplica una relación de **composición** entre las clases `ReporteUrbano`, `Evidencia` y `Seguimiento`.

La implementación permite relacionar un problema urbano con sus evidencias y seguimientos, demostrando cómo la composición puede utilizarse para representar relaciones entre objetos dentro de un sistema.

---

# 👨‍💻 Autores

* **Santiago Arriguí Cuellar**


---

# 📚 Información de la práctica

**Asignatura:** Lenguaje de Programación I

**Práctica:** Relaciones entre clases

**Relación utilizada:** Asociación de composición

**Lenguaje:** Java

**Repositorio:** GitHub

````

### 📌 Para que quede perfecto en GitHub

Tu repositorio debería quedar **exactamente así**:

```text
SistemaProblemasUrbanos
│
├── README.md                 ← pegas TODO lo anterior aquí
│
├── diagrama_clases.png       ← la imagen que acabamos de crear
│
└── src
    ├── Main.java
    ├── ReporteUrbano.java
    ├── Evidencia.java
    └── Seguimiento.java
````

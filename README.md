# 📦 GestorInventario
### Sistema de Gestión de Inventario en Java

**GestorInventario** es una aplicación desarrollada en **Java** que permite administrar productos en un inventario, aplicar descuentos y gestionar promociones. Este sistema es ideal para pequeñas empresas o proyectos que requieran un control básico de stock.

## 🚀 Funcionalidades
✔ Agregar productos al inventario  
✔ Aplicar descuentos por categoría  
✔ Manejar promociones con fechas específicas  
✔ Calcular el valor total del inventario  

## 🛠 Tecnologías Utilizadas
- **Java 11+**
- **Paradigma Orientado a Objetos (POO)**
- **Manejo de Excepciones Personalizadas**
- **Uso de Interfaces y Clases Abstractas**

## ⚙ Instalación y Uso
1. **Compilar el código:**
   ```sh
   javac src/*.java
   ```
2. **Ejecutar la aplicación:**
   ```sh
   java src.Main
   ```

## 📁 Estructura del Proyecto
```
src/
│── Main.java             # Punto de entrada del programa
│── Inventario.java       # Gestión del inventario
│── Producto.java         # Clase de productos
│── ProductoBase.java     # Clase base para productos
│── ProductoConPromocion.java  # Productos con promociones
│── Categoria.java        # Enum de categorías de productos
│── IDescuento.java       # Interfaz para aplicar descuentos
│── DescuentoInvalidoException.java  # Excepción para descuentos inválidos
```

## 📜 Licencia
Este proyecto es de código abierto bajo la licencia **MIT**.

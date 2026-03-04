# 💱 Conversor de Monedas

Aplicación de consola desarrollada en **Java** que permite convertir entre distintas monedas en tiempo real, consumiendo una API externa de tasas de cambio. El proyecto implementa buenas prácticas de seguridad al gestionar la API key a través de un archivo de configuración separado.

---

## 🚀 Características

- Conversión entre múltiples monedas en tiempo real
- Consumo de API externa para obtener tasas de cambio actualizadas
- Gestión segura de la API key mediante archivo `config.properties`
- Arquitectura orientada a objetos con separación de responsabilidades

---

## 🗂️ Estructura del Proyecto

```
ConversorDeMonedas/
├── src/
│   ├── Principal.java         # Punto de entrada de la aplicación
│   ├── ConsultaMoneda.java    # Lógica de conexión y consulta a la API
│   └── Conversion.java        # Modelo de datos para la conversión
├── config.properties          # Archivo de configuración (API key)
└── out/
    └── production/            # Clases compiladas
```

---

## ⚙️ Requisitos

- Java JDK 11 o superior
- Conexión a internet
- API key válida (ver sección de configuración)

---

## 🔧 Configuración

1. Clona el repositorio:

```bash
git clone https://github.com/KonvexT/Conversor-Monedas.git
cd Conversor-Monedas
```

2. Crea o edita el archivo `config.properties` en la raíz del proyecto y añade tu API key:

```properties
API_KEY=tu_api_key_aqui
```

> ⚠️ **Importante:** Nunca subas el archivo `config.properties` con tu API key real a GitHub. Asegúrate de que está incluido en el `.gitignore`.

3. Compila el proyecto:

```bash
javac -d out/production/ConversorDeMonedas src/*.java
```

4. Ejecuta la aplicación:

```bash
java -cp out/production/ConversorDeMonedas Principal
```

---

## 🧩 Descripción de Clases

| Clase | Descripción |
|---|---|
| `Principal` | Punto de entrada. Gestiona el menú e interacción con el usuario. |
| `ConsultaMoneda` | Se conecta a la API y obtiene las tasas de cambio actuales. |
| `Conversion` | Modelo que representa una conversión (moneda origen, destino, monto). |

---

## 🛡️ Seguridad de la API Key

La API key se lee desde el archivo `config.properties` y nunca se hardcodea en el código fuente. Esto evita exponer credenciales en el repositorio.

Ejemplo de uso en el código:

```java
Properties props = new Properties();
props.load(new FileInputStream("config.properties"));
String apiKey = props.getProperty("API_KEY");
```

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos. Libre de usar y modificar.

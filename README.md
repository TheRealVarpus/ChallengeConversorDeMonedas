# Conversor de Monedas

Este es un proyecto de conversión de monedas desarrollado en Java, que utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real.

## Características

- Conversión entre diferentes monedas, incluyendo Sol, Dólar, Euro y Peso Argentino.
- Interfaz de texto interactiva para seleccionar las opciones de conversión.
- Acceso en tiempo real a tasas de cambio mediante una API externa.

## Requisitos

- Java 11 o superior.
- Dependencia de Gson para el manejo de JSON.

## Configuración

1. Clona este repositorio en tu máquina local.
2. Configura el archivo `ConsultaMoneda.java` con tu clave de la API de ExchangeRate-API:
   ```java
   String apiKey = "TU_API_KEY_AQUI";
   ```
3. Asegúrate de tener acceso a internet para que el programa pueda realizar solicitudes a la API.

## Ejecución

1. Compila los archivos `.java`:
   ```bash
   javac Principal.java ConsultaMoneda.java
   ```
2. Ejecuta la aplicación:
   ```bash
   java Principal
   ```
3. Sigue las instrucciones en pantalla para seleccionar la conversión deseada e ingresa los valores a convertir.

## Funcionalidades

El programa permite convertir entre las siguientes monedas:
- Sol (PEN) y Dólar (USD).
- Sol (PEN) y Euro (EUR).
- Sol (PEN) y Peso Argentino (ARS).
- Dólar (USD) y Euro (EUR).
- Dólar (USD) y Peso Argentino (ARS).
- Euro (EUR) y Peso Argentino (ARS).

## Ejemplo de Uso

Al ejecutar el programa, se muestra un menú interactivo:
```
1. Sol => Dólar
2. Dólar => Sol
3. Sol => Euro
...
13. Salir
```

Elige la opción correspondiente a la conversión deseada, ingresa el valor y obtendrás el resultado calculado con la tasa de cambio actual.

## Notas

- Este proyecto usa la librería `HttpClient` de Java para realizar solicitudes HTTP.
- En caso de error al obtener la tasa de cambio, se mostrará un mensaje indicando que no se encontró la moneda solicitada.

## Futuras Mejoras

- Agregar soporte para más monedas.
- Implementar una interfaz gráfica.
- Manejar mejor los errores y agregar validaciones adicionales para la entrada del usuario.

---

¡Gracias por usar el Conversor de Monedas! 😊


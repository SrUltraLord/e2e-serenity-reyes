# Serenity JUnit Screenplay Demo

Prueba técnica de Serenity BDD por David Reyes.

## 1. Prerequisitos

- Java versión 17.0.11.9.1
- Gradle 8.3 (instalación local)
- Google Chrome

## 2. Instrucciones para instalar las dependencias

Las dependencias se instalan mediante el siguiente comando:
```bash
gradle build --refresh-dependencies
```

## 3. Instrucciones para ejecutar los tests.

Para iniciar los tests es necesario ejecutar el siguiente comando:

```bash
gradle test --tests "starter.demoblaze.BuyProductsTest"
```

Es importante tener java 17 en `JAVA_HOME`.

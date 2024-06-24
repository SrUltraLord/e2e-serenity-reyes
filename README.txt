# Serenity JUnit Screenplay Demo

Prueba técnica de Serenity BDD por David Reyes.

## 1. Prerequisitos

Nota: Se ha utilizado gradle >= 8.3 debido a que con versiones 7.x se produce el siguiente error al intentar ejecutar
el comando para iniciar las pruebas:
`> java.util.concurrent.ExecutionException: org.gradle.api.GradleException: Failed to create Jar file <path>\jackson-core-2.17.0.jar.`

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

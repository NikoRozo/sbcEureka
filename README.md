# Servidor Eureka - Sistema de Registro y Descubrimiento de Servicios

## Descripción

Este proyecto implementa un servidor Eureka para el descubrimiento y registro de servicios en una arquitectura de microservicios. Actúa como punto central donde todos los microservicios se registran, permitiendo la comunicación entre ellos sin necesidad de conocer sus ubicaciones exactas.

## Características

- Registro automático de servicios
- Descubrimiento de servicios
- Monitorización de salud de los servicios
- Dashboard web para visualizar los servicios registrados

## Configuración

El servidor está configurado en el puerto `8761` con las siguientes propiedades:

```properties
spring.application.name=sbcEurekaServer
server.port=8761

eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

Estas configuraciones evitan que el servidor Eureka intente registrarse a sí mismo o buscar otros servidores Eureka.

## Uso

### Acceso al Dashboard

Una vez iniciado el servidor, se puede acceder al dashboard web en:

```
http://localhost:8761
```

### Registro de Clientes

Para registrar un microservicio como cliente de Eureka, añade las siguientes dependencias y configuraciones:

1. Añadir dependencia en el `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

2. Habilitar el cliente en la aplicación:

```java
@SpringBootApplication
@EnableEurekaClient
public class MiServicioApplication {
    // ...
}
```

3. Configurar la conexión al servidor en `application.properties`:

```properties
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

## Ejecución

Para ejecutar el servidor:

```bash
mvn spring-boot:run
```

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior
- Spring Boot 3.4.4
- Spring Cloud (compatible con la versión de Spring Boot)# sbcEureka

# Sistema de ticket

## Descripción
La aplicación es un sistema de gestión de tickets diseñado para manejar solicitudes dentro de una empresa. Permite a los usuarios enviar cuestionarios que generan tickets personalizados, que pueden ser gestionados a través de un panel de control. Los administradores tienen la capacidad de agregar nuevos usuarios, asignar roles y controlar el flujo de los tickets mediante la actualización de estados. Además, el sistema incluye notificaciones por correo electrónico y funciones de seguridad como la segmentación de usuarios y la encriptación de datos sensibles.

## Problema identificado

## Solución

## Arquitectura
![Arquitectura](https://github.com/user-attachments/assets/18189250-6ee0-427c-8601-01ac5519b65c)

## Tabla de contenidos

### Requisitos del Sistema
Antes de instalar y ejecutar esta aplicación, asegúrate de que tu entorno cumpla con los siguientes requisitos:

- Sistema Operativo: Linux, macOS, Windows
- Java Development Kit (JDK) 17
- Spring Framework: Spring Boot 2.7.
- Base de Datos: MySQL 8.0.x


### Instalación
1. **Descarga** el repositorio desde GitHub usando el siguiente comando:
   ```bash
   git clone https://github.com/Virul/ticket
   ```
2. Navegar al Directorio del Proyecto
   Después de clonar el repositorio, navega al directorio del proyecto:
   ```bash
   cd ticket
   ```
3. Ejecutar un Comando de Spring Boot
   ```bash
   ./gradlew bootRun
   ```
4. **Accede** a la aplicación en tu navegador
   ```
   http://localhost:8080
   ```

### Configuración

1. Crear la Base de Datos en MySQL
Primero, necesitas crear una base de datos donde se almacenarán los datos de tu aplicación:
   ```sql
   CREATE DATABASE ticket;
   ```
2. Crear un Usuario MySQL y Asignar Privilegios
Después de crear la base de datos, puedes crear un usuario y otorgarles los privilegios necesarios para acceder a la base de datos:
   ``` sql
   CREATE USER 'ticket_user'@'localhost' IDENTIFIED BY 'ticket_password';
   GRANT ALL PRIVILEGES ON ticket.* TO 'ticket_user'@'localhost';
   FLUSH PRIVILEGES;
   ```
   Nota: ticket_user y ticket_password son ejemplos. Asegúrate de reemplazar 'ticket_user' y 'ticket_password' con tu propio nombre de usuario y contraseña que deseas utilizar para acceder a la base de datos.

3. Configurar las Credenciales en Spring Boot
Después de configurar la base de datos y crear un usuario, necesitas actualizar las credenciales en el archivo de configuración de Spring Boot application.properties.
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/ticket
   spring.datasource.username=usuario*
   spring.datasource.password=contraseña*
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
   



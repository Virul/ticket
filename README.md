# Sistema de ticket

***** Descripción *****

La aplicación es un sistema de gestión de tickets diseñado para manejar solicitudes dentro de una empresa. Permite a los usuarios enviar cuestionarios que generan tickets personalizados, que pueden ser gestionados a través de un panel de control. Los administradores tienen la capacidad de agregar nuevos usuarios, asignar roles y controlar el flujo de los tickets mediante la actualización de estados. Además, el sistema incluye notificaciones por correo electrónico y funciones de seguridad como la segmentación de usuarios y la encriptación de datos sensibles.


***** Requisitos del Sistema *****

Antes de instalar y ejecutar esta aplicación, asegúrate de que tu entorno cumpla con los siguientes requisitos:

- Sistema Operativo: Linux, macOS, Windows
- Java Development Kit (JDK) 17
- Spring Framework: Spring Boot 2.7.
- Base de Datos: MySQL 8.0.x

***** Instalación *****

git clone https://github.com/Virul/ticket

***** Base de datos *****


CREATE DATABASE ticket;

CREATE USER 'ticket_user'@'localhost' IDENTIFIED BY ticket_password;
GRANT ALL PRIVILEGES ON ticket.* TO 'ticket_user'@'localhost';
FLUSH PRIVILEGES;

Actualiza las credenciales de MySQL en el archivo de configuración de Spring (application.properties o application.yml):

spring.datasource.url=jdbc:mysql://localhost:3306/ticket

spring.datasource.username=usuario*

spring.datasource.password=contraseña*

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


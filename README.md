# Sistema de ticket

## Descripción
La aplicación es un sistema de gestión de tickets diseñado para manejar solicitudes dentro de una empresa. Permite a los usuarios enviar cuestionarios que generan tickets personalizados, que pueden ser gestionados a través de un panel de control. Los administradores tienen la capacidad de agregar nuevos usuarios, asignar roles y controlar el flujo de los tickets mediante la actualización de estados. Además, el sistema incluye notificaciones por correo electrónico y funciones de seguridad como la segmentación de usuarios y la encriptación de datos sensibles.

## Problema identificado
La problemática a abordar es la gestión y seguimiento de órdenes de servicio para modificaciones de sistema, que actualmente se realiza mediante un Excel, lo cual genera una falta de información crucial y la pérdida de datos importantes. Implementar un sistema permitirá centralizar la información, enviar alertas y rastrear el estado de las solicitudes en tiempo real. Además, el sistema anterior carece de un mecanismo para aceptar requerimientos solucionados, lo que deja tareas pendientes sin una visibilidad clara de su estado actual y contribuye a la pérdida de información valiosa.

## Solución
El sistema contará con un formulario que recopilará la información clave sobre la problemática o solicitud del usuario, incluyendo la fecha, hora y datos del solicitante. Al enviar la información, se generará automáticamente un ticket de servicio, el cual podrá ser aceptado o devuelto si la información es incorrecta. Una vez aceptado, se asignará un tiempo estimado y un responsable para su resolución. Los responsables podrán visualizar los tickets pendientes a través de un panel de control, donde se mostrará el estado y la etapa en la que se encuentran. Además, se enviarán notificaciones por correo electrónico cuando se generen, actualicen o resuelvan tickets.

## Arquitectura
![Arquitectura](https://github.com/user-attachments/assets/18189250-6ee0-427c-8601-01ac5519b65c)

## Tabla de contenidos
- [Requisitos del Sistema](https://github.com/Virul/ticket/blob/main/README.md#requisitos-del-sistema)
- [Instalación](https://github.com/Virul/ticket?tab=readme-ov-file#instalaci%C3%B3n)
- [Configuración](https://github.com/Virul/ticket?tab=readme-ov-file#configuraci%C3%B3n)


### Requisitos del Sistema
Antes de instalar y ejecutar esta aplicación, asegúrate de que tu entorno cumpla con los siguientes requisitos:

- Sistema Operativo: Linux, macOS, Windows
- Java Development Kit (JDK) 17
- Spring Framework: Spring Boot 3.3.2
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

### Uso

### Contribución

### RoadMap



   



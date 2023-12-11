# Inventario
1. Descripción
Este proyecto se enfoca en el desarrollo de una aplicación en Java para llevar un inventario de equipos de cómputo con usuarios asignados dentro de la empresa. El software permitirá registrar y editar la información detallada de cada equipo, asignarlo a un usuario de la empresa y gestionar el control de los mismos.
2. Problema Identificado
En la empresa se ha detectado que no existe una herramienta que permita llevar un control eficiente del inventario de equipos de cómputo, lo que puede generar pérdida de información valiosa de la empresa, además de crear un entorno laboral poco eficiente para los empleados. También se ha detectado que el proceso de asignación de equipos a los usuarios es muy manual y lleva mucho tiempo.
3. Solución
La solución a este problema consiste en desarrollar una aplicación en Java que proporcione una solución a los problemas identificados. La aplicación permitirá realizar un seguimiento detallado de los equipos de cómputo, asignándolos a los usuarios correspondientes y generando reportes de manera automática.
4. Arquitectura
La arquitectura del proyecto estará compuesta por los siguientes elementos:
•	Base de datos: se trabajará con una base de datos MySQL para almacenar toda la información generada por la aplicación.
•	Interfaz gráfica de usuario (GUI): se utilizará JavaFX para desarrollar la GUI fácil de usar e intuitiva.
•	Controladores: se utilizarán controladores para acceder a la base de datos y realizar todas las operaciones necesarias para el correcto funcionamiento de la aplicación (agregar equipos, asignar equipos, editar datos, eliminar equipos, etc.).
•	Modelo: se construirá un modelo que definirá las clases de la aplicación y sus atributos, esto permitirá la interacción entre la capa de presentación y la base de datos.
•	Servicios de Mensajería: Se implementarán servicios de mensajería para enviar notificaciones y alertas al correo electrónico de los usuarios, dichos mensajes serán utilizados para informar sobre los eventos importantes.
En resumen, el proyecto se desarrollará utilizando Java para la implementación de las funcionalidades, con una base de datos MySQL para el almacenamiento de la información y una interfaz de usuario intuitiva para su fácil manejo por parte de los usuarios. Además, se incluirán servicios de mensajería para mantener informados a los usuarios sobre los eventos importantes.

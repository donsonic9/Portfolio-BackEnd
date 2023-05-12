# Portfolio-BackEnd
Repositorio para toda la parte del Back-end del Portfolio hecho en "Argentina Programa" (#YoProgramo).

Bienvenido a una guía rápida sobre este backend realizado en Java con Spring Boot, JPA, y Hibernate.

Este backend es capaz de realizar operaciones CRUD (Create, Read, Update, Delete) mediante peticiones HTTP.

Consta de 11 APIs, cada una realizada de manera individual para cada componente del front-end hecho en Angular.

Cada API consta de 5 archivos;
 - Clase
 - Controladora
 - Interface
 - Repositorio
 - Servicio

El front se comunica con el back, haciendo las correspondientes peticiones http a las rutas especificadas para cada API en el archivo "controller" de cada una. Es decir, 
todas las rutas para hacer CRUD en el componente (por ejemplo) Educacion, estaran en el archivo "EducacionController".

Luego, ademas de los demas archivos, tiene una configuracion CORS global, para evitar problemas y errores de peticiones entre distintos dominios.
Dicha configuracion se encuentra dentro del package "configuration".

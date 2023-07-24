# Portfolio-BackEnd
Repositorio para toda la parte del Back-end del Portfolio hecho en "Argentina Programa" (#YoProgramo).

Bienvenido a una guía rápida sobre este backend realizado en Java con Spring Boot, JPA, y Hibernate.

Este back-end se encuentra actualmente levantado en el servicio de hosting provisto por Render, de manera gratuita, en la siguiente URL: https://portfolio-backend-g1r7.onrender.com/

Aún asi, si se descarga el proyecto y se ejecuta localmente, este se encuentrara en el puerto 10000, no en el 8080 como es de costumbre.

La documentación corre por cuenta de una dependencia externa llamada 'SpringDoc', un proyecto que combina las bondades de OpenAPI con Swagger, y Spring, que mediante la adición de la misma en el archivo 'pom.xml', se escanea el proyecto entero y se realiza la documentación de manera automática. 

Mas información sobre 'SpringDoc': https://springdoc.org/

Para ver la documentación de esta API: https://portfolio-backend-g1r7.onrender.com/doc/swagger-ui/index.html#/

Este backend es capaz de realizar operaciones CRUD (Create, Read, Update, Delete) mediante peticiones HTTP.

Consta de 11 APIs, cada una realizada de manera individual para cada componente del front-end hecho en Angular, perteneciente al proyecto de #ArgentinaPrograma.

Cada API consta de 5 archivos;
 - Clase
 - Controladora
 - Interface
 - Repositorio
 - Servicio

- FUNCIONAMIENTO:
El front se comunica con el back, haciendo las correspondientes peticiones http a las rutas especificadas para cada API en el archivo "controller" de cada una. Es decir, 
todas las rutas para hacer CRUD en el componente (por ejemplo) Educacion, estaran en el archivo "EducacionController".

- CORS POLICY
Para evitar problemas de CORS Policy, se incorporó una configuracion de CORS global, para evitar problemas y errores de peticiones entre distintos dominios.
Dicha configuracion se encuentra dentro del package ".config" -> "WebMvcConfig.java".

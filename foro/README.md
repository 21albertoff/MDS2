# MDS2 Grupo 10

_Proyecto del foro de la asignatura de Modelado y Diseño del Sotfware II_

## Comenzando 🚀

_En este repositorio te encontraras con el proyecto de creación de un foro que ha sido modelado previamente mediante diagramas y prototipados, cuyo resultado sera la implementación en codigo Java con la ayuda de la herramienta Vaadin_

```
SE RECOMIENDA visualizar las interfaces del proyecto en modo Desktop(1280x720).
```

## Construido con 🛠️

_Herramientas utilizadas para la creación del proyecto_

* [Vaadin](https://vaadin.com/start/v14) - Herramienta de aplicación web.
* [Eclipse](https://www.eclipse.org/downloads/packages/release/mars/r/eclipse-ide-java-developers) - Herramientas de programación.

## Contribuyendo 🖇️

Actualmente el proyecto esta desplegado de forma educativa para [UAL.es](https://www.ual.es/) por tanto, el proceso de pull requests se encuentra inactivo.

## Autores ✒️

* **Alberto Fuentes** - [21albertoff](https://github.com/21albertoff)
* **Daniel Ortega** - [dor494](https://github.com/dor494)


foro
==============

Template for a simple Vaadin application that only requires a Servlet 3.0 container to run.


Workflow
========

To compile the entire project, run "mvn install".

To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "mvn clean package"
- test the war file with "mvn jetty:run-war"

Client-Side compilation
-------------------------

The generated maven project is using an automatically generated widgetset by default. 
When you add a dependency that needs client-side compilation, the maven plugin will 
automatically generate it for you. Your own client-side customizations can be added into
package "client".

Debugging client side code
  - run "mvn vaadin:run-codeserver" on a separate console while the application is running
  - activate Super Dev Mode in the debug window of the application

Developing a theme using the runtime compiler
-------------------------

When developing the theme, Vaadin can be configured to compile the SASS based
theme at runtime in the server. This way you can just modify the scss files in
your IDE and reload the browser to see changes.

To use the runtime compilation, open pom.xml and comment out the compile-theme 
goal from vaadin-maven-plugin configuration. To remove a possibly existing 
pre-compiled theme, run "mvn clean package" once.

When using the runtime compiler, running the application in the "run" mode 
(rather than in "debug" mode) can speed up consecutive theme compilations
significantly.

It is highly recommended to disable runtime compilation for production WAR files.

Using Vaadin pre-releases
-------------------------

If Vaadin pre-releases are not enabled by default, use the Maven parameter
"-P vaadin-prerelease" or change the activation default value of the profile in pom.xml .

---
Escrito con ❤️ por [Alberto Fuentes](https://github.com/21albertoff) 😊

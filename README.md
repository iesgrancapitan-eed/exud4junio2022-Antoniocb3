# Examen UD4: Optimización y documentación. Junio 2022
1.  Realiza un clone del repositorio. Las instrucciones están en este README, así como los códigos java (debidamente empaquetados) para trabajar desde Eclipse.  
   
2.  La entrega la harás en este mismo repositorio. Trabajarás con git con los comandos desde **gitBash** y con el flujo de trabajo **GitFlow**. Comienza creando la rama "develop" a partir de la maestra. Trabajarás en ella los cambios del código.


## Issue
3. A continuación aparecen distintos commits. En el primero  "refactor: encapsula atributos" ha de cerrarse un issue desde el mensaje. 


4. Para ello abre en este repositorio un nuevo issue con el mensaje/descripción adecuado. Debes indicar la **línea del código** a la que afecta. Etiqueta el issue con la **etiqueta** adecuada. Usa las menciones para que me llegue una notificación (**@lmagarin**). Lo cerrarás directamente desde el mensaje del commit.

## Refactorización
5. Crea la **rama "refactoring"** a partir de la rama "develop". Trabajarás en ella la refactorización
   
6. Los atributos no están encapsulados. Encapsula los atributos usando los getters y los setters
   
7. Realiza un commit con el mensaje "refactor: encapsula atributos" 

8. Añade al paquete tu nombre en una nueva carpeta intermedia entre com y examen

9.  Realiza un commit con el mensaje apropiado

10. En la clase Bicycle haz las refactorizaciones que necesites para que cambie a Bike. Asegúrate de que se cambian también las referencias en comentarios y cadenas.

11. Añade el diálogo de la refactorización con todo debidamente marcado

![img1](img1.PNG)

12. Realiza un commit con el mensaje apropiado

13. Extrae el interfaz "Vehicle" a partir de la clase "Bike". Incluye todos los métodos menos toString

14. Realiza un commit con el mensaje adecuado


15. Fusiona la rama "refactoring" en la rama "develop" 

## Documentación
16. Crea la **rama "documentation"** a partir de la rama "develop". Trabajarás en ella la documentación.

17. Escribe los comentarios Javadoc. Recuerda que debes documentar debidamente todos:

- Los paquetes 
- Las clases (incluidas las excepciones)
- Los constructores
- Los atributos
- Los métodos
 
18. Realiza un commit con el mensaje "docs: comentarios javadoc " 
19. En Eclipse, genera la documentación Javadoc en la carpeta **docs**

20. Realiza un commit con el mensaje "docs: documentación javadoc " 

21. Fusiona la rama "documentation" en la rama "develop". 

22. Fusiona la rama "develop" en la rama maestra. 

## GitHub Pages

23. Sube el repositorio a GitHub (https://github.com/iesgrancapitan-eed/exud4junio2022-Antoniocb3) y activa el hosting (GitHub Pages)(https://iesgrancapitan-eed.github.io/exud4junio2022-Antoniocb3/com/antonio/examen/junio/package-summary.html). Selecciona la carpeta docs como inicio

## BitBucket

24. Crea en tu servidor Bitbucket una copia del repositorio actual. Añade aquí la url para que al menos yo pueda verla (mlmagarin@iesgrancapitan.org). (https://bitbucket.org/antoniocb03/exud4junio/src/main/) El mismo repositorio ha de estar en ambos servidores 



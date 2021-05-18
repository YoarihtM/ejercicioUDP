El código se escribió y se ejecutó con Maven en VSCode

Para poder correrlo primero se necesita el Java Extension Pack y configurar Maven en el path del sistema
Una vez realizado este proceso se realiza la compilación del proyecto en el submenú Maven que aparece luego 
de instalar el Java Extension Pack en VSCode. Y una vez compilado se puede ejecutar pulsando el botón de play
en la esquina superior izquierda, se recomienda hacer un split de las terminales como se muestra en las imágenes
adjuntas de las pruebas luego de ejecutar el servidor, con eso se puede dar click en la flecha arriba para ejecutar
ahora el cliente, solamente cambiando el nombre del archivo que deseamos ejecutar, tal y como se muestra en las 
imágenes de ejemplo de ejecución del servidor y del cliente.

La razón por la que he decidido trabajar con Maven fue porque en el desarrollo de la práctica 1 aunque no me fue 
posible entregarla encontré algunos beneficios ya que podía usar bibliotecas como zip4j y PDFBox que tienen sus 
propios repositorios Maven y pueden ser utilizados al declararlos en el pom.xml sin necesidad de descargar directamente
la biblioteca, sino que Maven lo construye por sí mismo y el uso de VSCode es por pura preferencia mía. 
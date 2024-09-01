<h1 align="left">Equipo #5: </h1> 
<h2 align="left">Actividad: Sistema de númeracion romano.</h2>  
<h3 algin="left">Resumen del proyecto:</h3>   
<p>Desarrollar un programa en Java que reciba a través de argumentos de línea de comandos una lista de n cadenas de números en notación romana y muestre para cada una su equivalente en el sistema de numeración decimal.   
Adicionalmente, generar un archivo en formato CSV en el que la primera columna sea el número romano y la segunda columna el equivalente en sistema decimal.</p>
<h3 align="left"> Tareas: </h3>
1.<b> R1 -</b> Hacer la conversión de numero romanos a decimales.<br>
2.<b> R2-</b> Hacer la generacion de archivos csv.<br>  
3.<b> R3-</b> Correr los casos de prueba. <br>
<h3 align="left"> Integrantes del Equipo: </h3>
<b>Nombre y responsabilidad </b> <br>
Jose Eduardo Martinez Pimbert <b>R1,R2,R3 </b><br>
<h3 algin="left"> Instrucciones de ejecución: </h3>
<p>
  Se ingresa los argumentos de líneas de comando necesarios siempre y cuando se traten de las letras que están en los números romanos, en este caso las letras pueden ser minúsculas o mayúsculas,
  si no ocurrirá una excepción lanzando un mensaje. Al igual el programa debe de tener al menos un argumento, si no también lanzará otro mensaje.
  Con la ayuda de un Hashmap se crea un mapa para asociar las letras principales de los números romanos con sus respectivos valores.
  Con el método romanTodecimal que recibe como parámetro un string, va a leer de derecha a izquierda haciendo que cada carácter tomado, primero lo asocie a un valor decimal,
  después que pase a ciertos filtros donde se cumplan las reglas establecidas de los números romanos que incluye la suma, la resta, la repetición de más de tres caracteres, entre otros.
  el método regresa el valor decimal representado por el numero romano que se dio como parámetro.
  Finalmente, dentro del main se crea un archivo CSV con la ayuda de la clase PrintWriter y FileWriter, se crea dos columnas donde va el numero romano y el numero decimal,
  conforme vaya leyendo los argumentos, se agregará a las columnas los valores dados. El programa finaliza con la creación del archivo csv con los datos ingresados y el archivo se guarda en el mismo directorio del programa. 
  El programa solo lanzará los números romanos del 1-3999, porque para describir el 4000 y los demás son otra forma de representarlo.

</p><br>
<h3 aling="left">Referencias:</h3>
<p>
  Los materiales de referencias están en dos videos donde me base la elaboración del codigo:<br> <a href="https://www.youtube.com/watch?v=XCjfq54KrZA" >video 1</a><br>
  <a href="https://www.youtube.com/watch?v=f7ozQRNiYyw" >video 2</a>
  Tambien utlice paginas web para generar archivos CSV:<br>
  <a href="https://evilnapsis.com/2019/04/30/crear-y-escribir-archivos-en-java-con-printwriter/"> página 1 </a> <br>
   <a href="https://evilnapsis.com/2019/04/30/crear-y-escribir-archivos-en-java-con-printwriter/"> página 2 </a> <br>
  
</p>

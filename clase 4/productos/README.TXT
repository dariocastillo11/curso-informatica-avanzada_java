BlueJ project "productos".
Authors:  David J. Barnes and Michael Kolling

Este proyecto es parte del material suplementario de Java para
el cap�tulo 4 del libro

   Programaci�n Orientada a Objetos con Java
   Una Introducci�n Pr�ctica usando BlueJ
   Third edition
   David J. Barnes and Michael Kolling
   Pearson Educacion, 2007
 

Purp�sito del proyecto
======================
El proyecto est� orientado a extender la comprensi�n de
las colecciones de objetos, incluyendo el uso de ciclos,
iteradores y moldeo. El ejercicio puede ser encarado
despu�s de completar la Secci�n 4.9 del Cap�tulo 4.

Los ejercicios
==============
Una compa�ia registra los niveles de stock de los productos que vende.
Un objeto GestorDeStock mantiene una lista de longitud arbitraria de
objetos de la clase Producto. La tarea consiste en completar el esquema
de implementaci�n de la clase GestorDeStock.

La clase DemoDeStock se ha provisto para ayudar a demostrar diversas
formas en las cuales pueden usarse las clases GestorDeStock y Producto.
Se puede crear un objeto GestorDeStock en el banco de objetos y llamar
a su m�todo demo(). A medida que se desarrolla la clase GestorDeStock,
demo() debe reflejar una funcionalidad creciente.

La clase GestorDeStock
======================
La clase GestorDeStock usa un objeto LinkedList para almacenar cero o
m�s items de Producto. Su m�todo agregaProducto agrega un nuevo producto
a la colecci�n. Es necesario completar los siguientes m�todos:
entrega, encuentraProducto, imprimeDetallesDeProducto y numeroEnStok.

+ El m�todo entrega() debe encontrar el Producto con el ID dado
en la lista de productos y luego llamar su m�todo incrementaCantidad.

+ El m�todo encuentraProducto() debe buscar en la colecci�n 
un producto cuyo campo id sea el argumento id de este m�todo.
Si se encuentra un producto, ese Producto deber�a ser retornado
como el resultado del m�todo. Si no se encuentra un producto
el m�todo deber�a retornal null.

+ El m�todo imprimirDetallesDelProducto() deber�a iterar sobre la lista
de productos e imprimir el resultado del llamadao al m�todo toString()
con cada uno.

+ El m�todo cantidadEnStock() deber�a ubicar un producto en la colecci�n
con un ID que se ajuste al solicitado y retornal al cantidad actual del
como resultado del m�todo. Si no se encuentra un producto con el ID 
solicitado se debe retornar cero.

La clase Producto
=================
Se ha provisto esta clase y se espera que no se le hagan
alteraciones a la misma.

Cada producto vendido por la compa��a es representado por una
instancia de la clase Producto, la cual registra un ID del mismo, su
nombre y cuantos productos hay actualmente en stock.
La clase Producto define el metodo incrementarCantidad() para 
registrar los incrementos en el nivel de stock del producto.
El m�todo venderUno() registra que un �tem del producto ha sido 
vendido por medio de la reducci�n del campo de nivel de cantidad
en una unidad. 

Implementaci�n en Etapas
========================
La tarea general ha sido descompuesta en etapas sugeridas para
ayudar a crear la versi�n terminada en peque�os pasos. Se
recomienda compilar y ejecutar el programa despu�s de cada
etapa para verificar que los cambios realizados sean correstos.

1. Implementar el m�todo imprimirDetallesDelProducto() para 
asegurarse que se es capaz de iterar sobre la colecci�n de 
productos. Simplemente se debe imprimir cada producto usando 
System.out.  El enfoque preferido para ello es usar un iterador,
pero se puede usar una variable �ndice si se lo encuentra m�s
f�cil de entender. 

2. Implementar m�todo encuentraProducto(). Este difiere del m�todo
imprimirDetallesDelProducto() en que no necesariamente tiene que
examinar cada producto en la colecci�n antes de que se encuentre
lo buscado. Por ejemplo, si el primer producto en la colecci�n
se corresponde con el nombre del producto buscado, la iteraci�n
puede terminar y retornar el primer porducto. Por otra parte, es 
posible que no se porduzaca ninguna correspondencia con ning�n 
producto y en este caso se debe retornal null.

Cuando se busca una correspondencia, ser� necesario llamar al 
m�todo getID() sobre un Producto. Esto significa que ser� necesario
usar un molde cuando se recupere un iyem de la lista. Se puede 
leer sobre moldes (casting) en la lista de discusi�n del proyecto
de subasta (auction) en el Cap�tulo 4. 

3. Implementar el m�todo cantidadEnStock(). Esto es relativamente 
simple de implementar una vez que el m�todo encuentraProducto() haya
sido completado. Por ejemplo, cantidadEnStock puede llamar al m�todo
encuentraProducto() para hacer la b�squeda, y luego llamar al m�todo 
getCantidad() sobre el resultado. Sin embargo se debe cobservar que
ocurre con los productos no encontrados.

4. Implementar el m�todo se entrega() usando un enfque similar al
usado en el m�todo cantidadEnStock().

Ejercicios opcionales desafiantes
=================================
+ Implementar un m�todo en la clase GestorDeStock para imprimir los
detalles de todos los productos con un nivel de stock debajo de un 
valor (pasado al m�todo como par�metro).  

+ Modifique el m�todo agregarProcucto() de tal manera que el nuevo
producto no pueda ser a�adido a la lista si ya existe otro producto
con el mismo ID.

+ Agregar a la clase GestorDeStock un m�todo que encuentre un producto
a partir de su nombre en ves de su ID.

    public Product encuentraProduct(String nombre)

Para hacer esto se necesita conocer como se pueden comparar para 
establecer la igualdad de dos objetos String s1 y s2 con la 
expresi�n boolena:

    s1.equals(s2)

Se pueden encontrar m�s detalles en el Cap�tulo 5.
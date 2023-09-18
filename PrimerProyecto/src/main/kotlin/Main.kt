import kotlin.system.exitProcess
/*
* Ejercicios para practicar Kotlin Cristian M. Espinosa Leal 2o DAM B
*
* 1 Escribe un programa que le pida al usuario un número n e imprima la suma de los números 1 a n
* 2 Modifica el programa anterior de modo que solo se consideren múltiplos de tres o cinco en la suma, p.3,5,6,9,10,12,15 para n=17
* 3 Escribe un programa que le pida al usuario un número n y le da la posibilidad de elegir entre calcular
* la suma o calcular el producto de 1, ... n. Usa un menú y especifica qué tiene que elegir el usuario.
* 4 Escribe un programa que imprima una tabla de multiplicar para números hasta el 10
* 5 Escribe una función que devuelva el elemento más grande de una lista.
* 6 Función que devuelva el resultado de invertir una lista (1,2,3,4) se convierte en (4,3,2,1)
* 7 Escribe una función que compruebe si un elemento aparece en una lista
* 8 Escribe una función que devuelva la media de los elementos en posiciones impares en una lista.
* 9 Escribe una función que calcule el total acumulado de una lista.
* 10 Escribe una función que pruebe si una cadena es un palíndromo
* */

// 1
fun ej1(): Int{
    println("ej 1: ")
    val array = arrayListOf<Int>()
    array.addAll(1 .. readln().toInt())
    return array.sum()
}

//2
fun ej2(): Int{
    println("ej 2: ")
    val array = arrayListOf<Int>()
    array.addAll(1 .. readln().toInt())
    return array.filter{ element -> element % 3 == 0 || element % 5 == 0 }.sum()
}

//3
fun ej3(): Int{
    println("ej 3: ")
    val array = arrayListOf<Int>()
    var limit :Int
    var suma = 0
    println("Introduce un número para opción de programa:\n\t0 - Suma de 1 a límite\n\t1 - Suma de productos de 1 a limite\nCualquier otra opción cerrará el programa")
    when (readln().toInt()) {
        0 -> {
            println("Introduce el límite de la suma:")
            limit = readln().toInt()
            array.addAll(1 .. limit)
            return array.sum()
        }
        1 -> {
            println("Introduce el límite de la suma de productos: ")
            limit = readln().toInt()
            for (i in 1 .. limit)
                suma += i * limit

            array.addAll(1 .. limit)
            array.forEach{ element -> element * limit}
            return array.sum()
        }
        else -> exitProcess(0)
    }
}

//4
fun ej4(){
    println("ej 4: ")
    listOf(1,2,3,4,5,6).forEach { element -> for (i in 1 .. 10) println("$element x $i = ${element*i}") }
}

//5
fun ej5(list:ArrayList<Int>) :Int{
    println("ej 5: ")
    return list.max()
}

//6
fun ej6(list:ArrayList<*>):ArrayList<*>{
    println("ej 6: ")
    return list.asReversed() as ArrayList<*>
}

//7
fun ej7(list:ArrayList<String>,element:String) :Boolean{
    println("ej 7: ")
    return list.contains(element)
}

//8
fun ej8(list: ArrayList<Int>) :Double{
    println("ej 8: ")
    return list.filter {element:Int -> element %2 != 0}.average()
}

//9
fun ej9(list:ArrayList<Int>) :Int{
    println("ej 9: ")
    return list.sum()
}

//10
fun ej10(input:String):Boolean{
    println("ej 10: ")
    return input.replace(" ","").reversed() == input.replace(" ","")
}
data class Telefono (var modelo: String, var marca: String, var precio :Int)

fun main(args: Array<String>) {
    println( Cancion("prayer","metal",2002,100000))
}


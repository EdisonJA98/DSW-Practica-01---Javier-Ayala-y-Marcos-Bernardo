package Ejercicios

/* Ejercicio 01
Realizar un algoritmo en que me permita hallar la suma de los n números consecutivos.
*/

fun sumaHastaN(n: Int): Long {
    var i = 1
    var suma = 0L
    while (i <= n) {
        suma += i.toLong()
        i++
    }
    return suma
}

fun main () {
    print("Ingresar n: ")
    val n = readln().toInt()
    println("la suma desde 1 hasta $n es ${sumaHastaN(n)}")
}
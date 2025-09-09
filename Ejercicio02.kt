package Ejercicios

fun sumaHastaN(n: Int): Long {
    var i = 1                    // variable primitiva
    var suma = 0L                // acumulador (Long para mayor rango)
    while (i <= n) {
        suma += i.toLong()
        i++
    }
    return suma
}

fun main () {
    println("Resolviendo pregunta 2...")
    print("Ingresar n: ")
    val n = readln().toInt()
    println("la suma desde 1 hasta $n es ${sumaHastaN(n)}")
}
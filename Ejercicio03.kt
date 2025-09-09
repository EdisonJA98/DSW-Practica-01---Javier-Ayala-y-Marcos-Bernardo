package Ejercicios

import kotlin.math.sqrt

/* Ejercicio 03
Diseñar un algoritmo que permita calcular la suma de los primeros N términos de la siguiente serie:

    1 - (1/raiz(3)) + (1/raiz(5)) - (1/raiz(7)) + ...

*/

fun main()
{
    val cant_Terminos: Int
    var suma_Terminos: Double = 0.0


    println("-----> Calculo de una serie de N terminos <-----")
    print("Ingrese el valor de N: ")
    cant_Terminos = readln().toInt()

    for(i in 1..cant_Terminos)
    {
        val denominador = 2*i-1
        val termino = 1/ sqrt(denominador.toDouble())

        // Alternacion de signos
        if(i%2 == 0)
        {
            suma_Terminos = suma_Terminos - termino
        }
        else
        {
            suma_Terminos = suma_Terminos + termino
        }
    }

    println("\n-----> RESULTADOS <-----")
    println("La suma de los $cant_Terminos primeros terminos de la serie es $suma_Terminos")

}



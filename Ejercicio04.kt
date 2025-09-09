package Ejercicios

/* Ejercicio 04
Dos trenes salen al mismo tiempo de dos estaciones A y B, situadas a 400 kilómetros una de la otra.
Si la velocidad del tren que sale de A es de 80 km/h y la velocidad del tren que sale de B es de 70 km/h,
¿cuánto tiempo tardaran en encontrarse si están en dirección opuesta y asumimos que en algún momento se cruzaran?
*/

fun main () {
    
    val distanciaKm = 400.0
    val velocidad_A = 80.0
    val velocidad_B = 70.0

    val velocidadRelativa = velocidad_A + velocidad_B
    val tiempoHorasDecimal = distanciaKm / velocidadRelativa

    val horas = tiempoHorasDecimal.toInt()
    val minutos = ((tiempoHorasDecimal - horas) * 60).toInt()
    val segundos = ((((tiempoHorasDecimal - horas) * 60) - minutos) * 60).toInt()

    println("Los dos trenes se encontrarán en: $horas horas, $minutos minutos y $segundos segundos")
}
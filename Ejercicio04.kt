package Ejercicios

fun pregunta_4() {
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

fun main () {
    println("\nResolviendo pregunta 4...")
    pregunta_4()
}
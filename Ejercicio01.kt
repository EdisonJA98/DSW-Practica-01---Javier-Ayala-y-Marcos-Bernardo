package Ejercicios

/* Ejercicio 01
Al final de un curso se desea saber cuál ha sido el alumno con la mejor nota promedio y cuantos suspendidos hay.
Se sabe que este año entraron 20 alumnos y que todos tienen 3 asignaturas.
Desarrolla un algoritmo que pueda dar el nombre y el promedio del mejor alumno, y el número de suspendidos.
Nota: se aprueba con 12 de nota.
*/

fun main()
{

    val CANT_ALUMNOS: Int = 20
    val CANT_ASIGNATURAS: Int = 3

    var mejorAlumno: String = ""
    var mejorPromedio: Double = 0.0
    var cant_AlumnosSupendidos: Int = 0

    // Ingresamos a los alumnos y sus notas
    println("-----> Ingrese 20 alumnos y sus 3 notas <-----")

    for(alumno in 1..CANT_ALUMNOS)
    {
        print("Nombre del alumno $alumno: ")
        val nombreAlumno = readln();

        var sumaNotas: Double = 0.0

        for(asignatura in 1..CANT_ASIGNATURAS)
        {
            print("Nota $asignatura: ")
            val notaAlumno = readln().toDouble()
            sumaNotas += notaAlumno
        }

        println()

        val promedio = sumaNotas / CANT_ASIGNATURAS

        // Comparamos las notas ingresas
        if(alumno == 1 || promedio > mejorPromedio)
        {
            mejorPromedio = promedio
            mejorAlumno = nombreAlumno
        }

        // Contamos a los alumnos suspendidos
        if(promedio < 12)
        {
            cant_AlumnosSupendidos++
        }
    }

    println("\n-----> RESULTADOS <------")
    println("Mejor alumno: $mejorAlumno")
    println("Mejor promedio del mejor alumno: $mejorPromedio")
    println("Cantidad de alumnos suspendidos: $cant_AlumnosSupendidos")
}





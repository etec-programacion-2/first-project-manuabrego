package org.example 

fun main() {
    println("pepe hongo leproso")
}

/*
val nombre= "Manuel Abrego"
var dia="22 de abril, 2025 años después de Cristo"
fun main() {
    println(nombre)
    println(dia)
}


fun mostrarTiposDeDatos() {
    val nombre: String = "Juan"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}


fun main() {
    val base: Double = 2.82
    val alt: Double = 1.2
    val area: Double = base*alt

    println ("El area es: $area")

}

fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par" 
        else -> "Impar"
    }
}

fun esParOImpar(numero: Int): String {
    return if (numero != 0) {
        if (numero % 2 == 0) {
            "Par"
        } else {
            "Impar"
        }
    } else {
        "Es 0"
    }
}

fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}
*/

fun mostrarNumerosConLoops() {
    
    println("Usando for ")
    for (i in 2..20) {
        println(i)
    }
    
    
    println("Usando while ")
    var j = 2
    while (j <= 20) {
        println(j)
        j++ 
    }
    
    
    println("Usando do-while ")
    var k = 2
    do {
        println(k)
        k++
    } while (k <= 20)
}

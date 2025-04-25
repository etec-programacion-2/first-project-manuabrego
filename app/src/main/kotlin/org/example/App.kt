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

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tienes $edad años")
}


fun potencia(base: Double, exponente: Int): Double {
    return Math.pow(base, exponente.toDouble())

}


fun demostrarAlcanceVariables() {
    // Variable local en el ámbito de la función
    val variableGlobal = "Soy global en esta función"
    
    // Bloque if con su propio ámbito
    if (true) {
        val variableIf = "Soy local del if"
        println("Dentro del if: $variableIf")
        println("Puedo acceder a: $variableGlobal")
    }
    
    // Bloque for con su propio ámbito
    for (i in 1..3) {
        val variableFor = "Soy local del for - iteración $i"
        println("Dentro del for: $variableFor")
        println("Puedo acceder a: $variableGlobal")
    }
    
    // Intentar acceder a variables locales fuera de su ámbito
    // println(variableIf)  // Esto daría error
    // println(variableFor) // Esto daría error
}

fun calcularPromedio(numeros: List<Int>): Double {
    var suma = 0  // Variable local mutable
    var contador = 0  // Variable local mutable
    
    for (numero in numeros) {
        suma += numero
        contador++
    }
    
    return if (contador > 0) suma.toDouble() / contador else 0.0
}
*/
un numerosSos() {
    // Creamos una lista para guardar los números
    val numeros = mutableListOf<Int>()
    
    // Llenamos la lista con números del 1 al 10
    for (i in 1..10) {
        numeros.add(i)
    }
    
    // Mostramos la lista creada
    println("Lista de números: $numeros")
    
    // Si la lista está vacía, terminamos
    if (numeros.isEmpty()) {
        println("La lista está vacía")
        return
    }
    
    // Inicializamos las variables locales con el primer elemento
    var menor = numeros[0]
    var mayor = numeros[0]
    
    // Recorremos la lista para encontrar el menor y el mayor
    for (numero in numeros) {
        // Si encontramos un número menor, actualizamos la variable
        if (numero < menor) {
            menor = numero
        }
        
        // Si encontramos un número mayor, actualizamos la variable
        if (numero > mayor) {
            mayor = numero
        }
    }
    
    // Mostramos los resultados
    println("El número menor es: $menor")
    println("El número mayor es: $mayor")
}

fun main() {
    // Llamamos a la función
    numerosSos()
}
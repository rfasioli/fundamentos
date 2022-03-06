package br.com.rfasioli.fundamentos

fun main() {
    printaComWhen(5)
    printaComWhen(-5)
    printaComWhen(-8)
    printaComWhen(10)
    printaComWhen(14)
    printaComWhen(1)

    when {
        comecaComOi("5") -> println("5")
        comecaComOi("Oi! Tudo bem?") -> println("Oi")
    }
}

fun printaComWhen(x: Int) {
    when (x) {
        5, -5 -> println("x == 5")
        8, -8 -> println("x == 8")
        10, -10 -> {
            println("x == +-10")
            println("É uma dezena")
        }
        in 11..20 -> println("x está entre 11 e 20")
        else -> println("Numero nao mapeado")
    }
}

fun comecaComOi(texto: String): Boolean {
    return when(texto) {
        is String -> texto.startsWith("Oi")
        else -> false
    }
}
package br.com.rfasioli.fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))

    println(resultadoDaNota(10))
    println(resultadoDaNota(5))
    println(resultadoDaNota(2))
}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "par"
    } else {
        "impar"
    }
}

fun resultadoDaNota(nota: Int): String {
    return if (nota >= 6) {
        "Passou"
    } else if (nota >= 4) {
        "Recuperação"
    } else {
        "Reprovou"
    }
}
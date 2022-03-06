package br.com.rfasioli.fundamentos

fun main() {
    printa1a10()
    printa10a1()
    printaParAte0()
    printaRange(1, 9)
    printa1a10ComWhile()
    printa1a10ComDoWhile()
}

fun printa1a10() {
    for (numero in 1 .. 10)
        println(numero)
}

fun printa1a10ComWhile() {
    var numero = 1
    while (numero <= 10) {
        println(numero)
        numero++
    }
}

fun printa1a10ComDoWhile() {
    var numero = 1
    do {
        println(numero)
        numero++
    } while (numero <= 10)
}

fun printa10a1() {
    for (numero in 10 downTo 1)
        println(numero)
}

fun printaParAte0() {
    for (numero in 2 .. 10 step 2)
        println(numero)
}

fun printaRange(inicio: Int, fim: Int) {
    for (numero in inicio .. fim)
        println(numero)
}

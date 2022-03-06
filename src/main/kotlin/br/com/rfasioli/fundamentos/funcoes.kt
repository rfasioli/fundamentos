package br.com.rfasioli.fundamentos

fun main() {
    println("Hello ${retornaNome()}!")
    dizOi(retornaNome(), 79)
    dizOi(idade=375, nome = "Matuzalem")
    dizOi("Coxinha")
}

fun retornaNome(): String =
    "Joaquim"

fun dizOi(nome: String, idade: Int = 38) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}
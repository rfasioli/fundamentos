package br.com.rfasioli.fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String =
        "Pessoa(nome=${nome}, idade=${idade})"
}

fun main() {
    var joaquim = Pessoa("Joaquim", 79)
    println(joaquim)
}
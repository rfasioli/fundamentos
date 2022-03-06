package br.com.rfasioli.fundamentos

class Carro(var cor: String, val anoFabricacao: Int, var dono: Dono) {
}

data class Dono(var nome: String, var idade: Int) {
}

fun main() {
    var carro = Carro("Verde", 2021, Dono("Joaquim", 79))
    println(carro.cor)

    carro.cor = "Roxo Fosco"
    println(carro.cor)

    println(carro.dono)
    println(carro.dono.nome)

}
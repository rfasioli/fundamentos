package br.com.rfasioli.fundamentos

fun main() {
    var nomeVolatil = "Zequinha"
    val nomeImutavel = "Maria"

    println(nomeVolatil)
    println(nomeImutavel)

    nomeVolatil = "Zéquinha"
    // nomeImutavel = "Chiquinha"  // Gera erro pois val é imutável

    println(nomeVolatil)
    println(nomeImutavel)

    val variaveis = Variaveis("Teste2")
    variaveis.iniciaVariavel()
    println("v1=${variaveis.teste} v2=${variaveis.teste2}")
}

class Variaveis(val teste2: String) {
    lateinit var teste: String

    fun iniciaVariavel() {
        teste = "Teste"
    }
}

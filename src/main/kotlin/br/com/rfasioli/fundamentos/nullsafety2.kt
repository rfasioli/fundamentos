package br.com.rfasioli.fundamentos

fun main() {
    val pessoa: Pessoa? = null // = Pessoa("Jeremias", 98)

    println(pessoa!!.nome) // Vai estourar NullPointerException
    println("final do código") //Não vai executar
}

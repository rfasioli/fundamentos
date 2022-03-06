package br.com.rfasioli.fundamentos

fun main() {
    val nome = "Tiburcio"
    // nome = null //Não aceita, pois String não pode receber null
    // var nome2: String = null //Também não aceita pelo mesmo motivo

    var nomeNullable: String? = null

    println("O nome $nome tem ${nome.length} caracteres")
    println("O nome $nomeNullable tem ${nomeNullable?.length} caracteres")

    val toShort: Short? = nomeNullable?.length?.toShort()
    println(toShort)

    nomeNullable = "Tiburcio Jr"
    val toShort2: Short = nomeNullable!!.length.toShort()
    println(toShort2)

    nomeNullable = null
    val tamanho: Int = nomeNullable?.length ?: 0
    println(tamanho)

    val lista: List<Int?> = listOf(1, 2, null, 3)
    var listaNullable: List<Int?>? = null

    println(lista)
    println(listaNullable)

    listaNullable = listOf(1, 2, null, 3)
    println(listaNullable)
}
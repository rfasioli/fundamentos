fun main() {
    lista()
    mutableLista()
    sets()
    maps()
}

fun lista() {
    val lista = listOf(1, 2, 3, 4, 6)
    val pares = lista.filter { it % 2 == 0 }
    println(pares)

    println(pares.first())
    println(pares.last())

    lista.forEach {
        println(it)
    }

    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(3))
}

fun mutableLista() {
    val lista = mutableListOf(1, 2, 3, 4, 6)
    println(lista)

    lista.add(8)
    lista.removeAt(0)
    lista.remove(3)
    println(lista)

    lista[0] = 20
    println(lista)

    lista.add(1)
    lista.add(13)
    lista.add(1000)
    lista.add(5)

    lista.sort()
    println(lista)

    lista.shuffle()
    println(lista)
}

fun sets() {
    val setNumeros = setOf(1, 2, 3, 2)
    println(setNumeros)

    val setNumerosMutavel = mutableSetOf(1, 2, 3, 2)
    setNumerosMutavel.add(2)
    setNumerosMutavel.add(4)
    println(setNumerosMutavel)
}

fun maps() {
    val mapNomeIdade = mapOf("Joaquim" to 57, "Tiburcio" to 59, "Jeremias" to 98)
    println(mapNomeIdade)
    println(mapNomeIdade.get("Jeremias"))

    val mutableMapNomeIdade = mutableMapOf("Joaquim" to 57, "Tiburcio" to 59, "Jeremias" to 98)
    mutableMapNomeIdade["Braulio"] = 154
    println(mutableMapNomeIdade)
}

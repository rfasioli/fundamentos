package br.com.rfasioli.fundamentos

class MinhaClasse {
    companion object {
        fun criaClasse() = MinhaClasse()
    }
}

class SegundaClasse {
    fun criaClasse() = SegundaClasse()
}

fun main() {
    MinhaClasse.criaClasse() // Static
    SegundaClasse().criaClasse() // Precisa de instancia
}
class GeneradorSecuencias {

    private lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {
        sec = lineSequence(num)
        getSec()
    }

    fun fraseFinal(num: Int) {
        sec = lineSequence(num)
        mostrarSec()
    }

    private fun getSec() {
        var frase = ""
        for (palabra in sec) {
            frase += "$palabra "
            println(frase)
        }
    }

    private fun mostrarSec() {
        var frase = ""
        for (palabra in sec) {
            frase += "$palabra "
        }
        println(frase)
    }
}
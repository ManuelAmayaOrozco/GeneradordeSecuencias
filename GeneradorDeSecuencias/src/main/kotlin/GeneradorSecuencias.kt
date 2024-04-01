class GeneradorSecuencias() {

    private lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {
        var count = num
        while (count > 0) {
            sec = lineSequence()
            count--
        }
    }



    fun mostrarSec(): Sequence<String> {
        return sec
    }
}
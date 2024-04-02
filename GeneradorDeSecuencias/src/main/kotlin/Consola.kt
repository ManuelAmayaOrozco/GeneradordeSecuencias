class Consola: IEntradaSalida {

    fun proceso() {
        val num1 = obtenerInt("Introduce el número de palabras que quieres introducir (Incremental): ")
        GeneradorSecuencias().fraseIncremental(num1)

        val num2 = obtenerInt("Introduce el número de palabras que quieres introducir (Final): ")
        GeneradorSecuencias().fraseFinal(num2)
    }

    override fun mostrar(message: String, saltoLinea: Boolean) {
        println(message)
        if (saltoLinea) {
            println()
        }
    }

    override fun obtenerInt(message: String): Int {
        println(message)
        var verify = false
        var num: Int? = null
        while (!verify) {
            num = readln().toIntOrNull()
            if (num == null) {
                println("Número no válido, vuelve a intentarlo")
            }
            else {
                verify = true
            }
        }
        return num!!
    }
}
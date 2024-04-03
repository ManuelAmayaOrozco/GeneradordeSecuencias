class Menu: IEntradaSalida {
    fun mostrarMenu() {

        var inmenu = true

        while (inmenu) {
            mostrar("Elige una de las siguientes opciones:",true)
            mostrar("1. Frase Incremental",false)
            mostrar("2. Frase Final",false)
            mostrar("3. Salir",true)

            var opt: Int

            do {
                opt = obtenerInt("Elige una opción: ")
                if (opt <= 0 || opt >= 4) {
                    println("No es una opción válida, vuelve a intentarlo.")
                }
            } while (opt <= 0 || opt >= 4)

            when (opt) {
                1 -> Consola().procesoFrasInc()
                2 -> Consola().procesoFrasFin()
                3 -> {mostrar("Saliendo...",true)
                      inmenu = false}
            }
        }
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
class Luar{
    val varLuar = 2

    fun cetakLuar(){
        println("cetak luar...")
    }

    inner class Dalam{
        val varDalam = 1

        fun cetakDalam(){
            println("cetak dalam...")
            println("cetak luar dari dalam: $varLuar")
        }
    }
}

fun main(args: Array<String>) {
    val a = Luar()
    val b = Luar().Dalam()

    println("varLuar: ${a.varLuar}")
    println("varDalam: ${b.varDalam}")

    b.cetakDalam()
}
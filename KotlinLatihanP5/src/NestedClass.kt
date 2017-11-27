class Luar2{
    val valLuar = 1
    fun cetakLuar(){
        println("cetak luar...")
    }

    class Dalam{
        val varDalam = 2
        fun cetakDalam(){
            println("cetak dalam...")
        }
        class Terdalam{
            val varTerdalam = 3
            fun cetakTerdalam(){
                println("cetak terdalam...")
            }
        }
    }
}

fun main(args: Array<String>) {
    val l = Luar2()
    val d = Luar2.Dalam()
    val t = Luar2.Dalam.Terdalam()

    l.cetakLuar()
    d.cetakDalam()
    t.cetakTerdalam()
}
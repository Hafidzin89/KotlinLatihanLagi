class Gajah{
    fun makan(){
        println("Gajah makan...")
    }
    fun tidur(){
        println("Gajah tidur...")
    }
}

class kerbau{
    fun makan(){
        println("Kerbau makan...")
    }
    fun tidur(){
        println("Kerbau tidur...")
    }
}

class bonbin{
    companion object{
        fun test(x: Gajah){
            x.makan()
            x.tidur()
        }
        fun test(x: Kerbau){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g = Gajah()
    val k = Kerbau()

    test(g)
    test(k)
}
class Mobil44(val mesin: Int, val roda: Int, val body: Int){
    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }
    //val mesin = mesin
    //val roda = roda
    //val body = body
}

fun main(args: Array<String>) {
    val mobilku = Mobil44(1,8,1)

    println("Mesinku: ${mobilku.mesin}")
    println("Rodaku: ${mobilku.roda}")
    println("Bodyku: ${mobilku.body}")
}
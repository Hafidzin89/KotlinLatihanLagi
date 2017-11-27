class Mobil4(mesin: Int, roda: Int, body: Int){
    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }
    val mesin = mesin
    val roda = roda
    val body = body
}

fun main(args: Array<String>) {
    val mobilku = Mobil4(1,8,1)

    println("Mesinku: ${mobilku.mesin}")
    println("Rodaku: ${mobilku.roda}")
    println("Bodyku: ${mobilku.body}")
}
enum class Arah{
    UTARA, BARAT, TIMUR, SELATAN
}

fun main(args: Array<String>) {
    var arahToni = Arah.UTARA
    if (arahToni == Arah.UTARA){
        println("Toni pergi ke arah utara")
    } else {
        println("Aku tidak tahu Toni pergi ke arah mana")
    }
}
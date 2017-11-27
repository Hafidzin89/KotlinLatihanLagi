class Mobil5(val mesin: Int){
    constructor(roda:Int,body:Int):this(1){
        println("dicetak dari secondary construktor")
        println("Mesin: ${this.mesin}, Roda: $roda, Body: $body")
    }
}
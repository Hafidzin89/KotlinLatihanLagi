class Orang{

    fun makan(){
        println("makan")
    }
    fun minum(){
        println("minum")
    }
    fun bekerja(){
        println("")
    }
}

fun main(args: Array<String>) {
    val aku = Orang()
    aku.makan()
    aku.minum()
    aku.bekerja()

    print("Masukkan Nama: ")
    var nama = readLine()
    print("Masukkan Alamat: ")
    var alamat = readLine()
    print("Masukkan TTL: ")
    var ttl:Int = readLine()!!.toInt()

    println("Nama: " + nama)
    println("Alamat: " + alamat)
}
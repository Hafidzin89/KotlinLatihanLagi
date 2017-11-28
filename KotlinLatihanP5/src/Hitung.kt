import kotlin.system.exitProcess

class Hitung(val angka1:Double, val angka2:Double){
    var hasil=0.0

    fun penjumlahan(){
        hasil=angka1 + angka2
        println("hasil : $hasil")
    }

    fun pengurangan(){
        hasil=angka1 - angka2
        println("hasil : $hasil")
    }

    fun pembagian(){
        try {
            hasil=angka1 / angka2
            println("hasil : $hasil")
        }catch (err:Exception){
            println(err.message)
        }
    }

    fun perkalian(){
        hasil=angka1 * angka2
        println("hasil : $hasil")
    }
}

fun main(args: Array<String>) {
    do {

        println("Pilihan Operasi")
        println("1 Penjumalahan")
        println("2 Pengurangan")
        println("3 Pembagian")
        println("4 Perkalian")
        println("5 Keluar")

        print("Operasi: ")
        val op = readLine()!!.toInt()
        if (op<5){
            print("Masukkan Angka Pertama: ")
            var n1= readLine()!!.toDouble()
            print("Masukkan Angka kedua: ")
            var n2= readLine()!!.toDouble()
            val hitung=Hitung(n1,n2)
            when(op){
                1->hitung.penjumlahan()
                2->hitung.pengurangan()
                3->hitung.pembagian()
                4->hitung.perkalian()
            }
        }else if (op==5){
            println("Terimakasih Telah menggunakan Program ini")
            exitProcess(0)
        } else{
            println("Pilihan input hanya 1-5")
        }
    }while (true)
}
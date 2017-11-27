import java.util.*

fun main(args:Array<String>){
    //input
    print("Masukkan tahun lahir Anda: ")
    var DOB:Int= readLine()!!.toInt()

    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=year-DOB

    //output
    println("Usia Anda adalah $Age tahun")
}
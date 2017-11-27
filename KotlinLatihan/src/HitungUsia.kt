fun main(args:Array<String>){
    //input
    print("Masukkan tahun lahir Anda: ")
    var DOB:Int= readLine()!!.toInt()

    //process
    var year=2017
    var Age:Int?
    Age=year-DOB

    //output
    println("Usia Anda adalah $Age tahun")
}
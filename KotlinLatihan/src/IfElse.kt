fun main(args:Array<String>){
    print("Masukkan nilai: ")
    var nilai= readLine()!!.toDouble()
    if (nilai>=90){
        //block of code
        println("Anda dapat nilai A")
    }
    else {
        //block of code
        println("Anda tidak termasuk kategori nilai A")
    }
    println("Anda memasukkan nilai $nilai")
}
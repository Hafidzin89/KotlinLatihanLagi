fun main(args:Array<String>){
    print("Masukkan nilai: ")
    var nilai= readLine()!!.toDouble()

    if (nilai>=90){
        //block of code
        println("Anda dapat nilai A")
    }
    else if (nilai>=80 && nilai<90){
        println("Anda dapat nilai B")
    }
    else if (nilai>=70 && nilai<80){
        println("Anda dapat nilai C")
    }
    else {
        println("Anda tidak lulus")
    }
    println("Anda memasukkan nilai $nilai")
}
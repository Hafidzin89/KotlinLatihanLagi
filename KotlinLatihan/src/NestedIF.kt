fun main(args:Array<String>){
    print("Masukkan nilai: ")
    var nilai= readLine()!!.toDouble()
    if (nilai>=90){
        if (nilai>=95)
            println("Anda dapat nilai A+")
        else
            println("Anda dapat nilai A-")
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
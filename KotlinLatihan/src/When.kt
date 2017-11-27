fun main(args:Array<String>){
    print("Masukkan nilai: ")
    var nilai= readLine()!!.toInt()
    when (nilai) {
        100->println("Anda dapat nilai sempurna!")
        98,99->println("Anda dapat nilai nyaris sempurna! yaitu 98 atau 99")
        in 95..98->println("Anda dapat nilai A+")
        in 90..94->println("Anda dapat nilai A-")
        in 80..89->println("Anda dapat nilai B")
        in 70..79->println("Anda dapat nilai C")
        in 0..69->println("Anda tidak lulus")
        //!in 0..100->println("Diluar range nilai, perhatikan nilai yang Anda masukkan!")
        else->println("Diluar range nilai, perhatikan nilai yang Anda masukkan!")
    }
}
import java.io.FileReader
import java.io.FileWriter
import kotlin.system.exitProcess


class TulisFile(){

    fun writeFile(str: String) {
        try {
            var fo = FileWriter("src/test.txt",true)
            fo.write(str)
            fo.close()
        }catch (err: Exception){
            println(err.message)
        }
    }

    fun readFile() {
        try {
            var fin=FileReader("src/test.txt")
            var c:Int
            do {
                c= fin.read()
                print(c.toChar())
            }while (c!=-1)
        }catch (err:Exception){
            println(err.message)
        }
    }
}

fun main(args: Array<String>) {
    println("Program Read-Write")
    do {
        println("pilih salah satu action dibawah: ")
        println("1 Write File")
        println("2 Read File")
        println("3 Keluar")

        print("Pilih: ")
        val pilih = readLine()!!.toInt()
        var tulis = TulisFile()
        if (pilih == 1) {
            print("Masukkan Teks: ")
            var isidata = readLine()!!.toString()
            tulis.writeFile(isidata)
        }else if (pilih==2) {
            tulis.readFile()
            println("")
        }else if (pilih==3){
            print("Terimakasih telah menggunakan aplikasi ini")
            exitProcess(0)
        }else{
            println("Pilihan input hanya 1-3")
        }
    }while (true)
}
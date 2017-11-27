fun main(args:Array<String>){
    print("Masukkan nama : ")
    var name = readLine()
    print("Masukkan umur : ")
    var age:Int = readLine()!!.toInt()
    print("Masukkan department : ")
    var department:String?
    department= readLine()
    println("name:"+ name)
    println("age:"+ age)
    println("department:"+ department)
    val pi:Double=3.14
    println("pi:"+ pi)
}
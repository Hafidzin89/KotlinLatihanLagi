class Person<T>(nama: T){
    init{
        println(nama)
    }
}
fun <T> display(process: T){
    println(process)
}

fun main(args: Array<String>) {
    var Agus = Person<String>("Agus")
    var Budi = Person<Int>(12)
    var Cici = Person<Double>(123.5)

    display<Int>(123)
    display<String>("process user")
}


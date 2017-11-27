fun main(args:Array<String>){
    var x=10
    var y=11
    var z= --x+y // (++x) = (x=x+1), (--x) = (x=x-1)/
    println("z:$z")
    println("before x:$x")
    //x=9 y=11

    var m=x+++y
    println("m:$m")
    println("After x:$x")
}
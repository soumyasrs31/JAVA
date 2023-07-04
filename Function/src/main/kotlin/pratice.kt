fun main(){
    var result = add1(3,5)
    println(result)

    printHellos()
}

fun add1(num1:Int, num2:Int):Int{
    val sum = num1 + num2
    return sum
}

fun addNumber1(num3:Int, num4:Int) = num3 + num4

fun checkNum(num:Int){
    val result = if(num % 2 == 0) "even" else "odd"
    println(result)
}

fun printHellos(count:Int = 3){
    for(i in 1..count){
        println("hello $i")
    }
}
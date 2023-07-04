fun main(){
   val result = add(3,4)
    println(result)

    println(addNumber(5,4))

    checkEven(4)
    checkEven(5)

    printHello(4)
    printHello()

    println(sub(3,2))
    println(sub(3.0,2.0))

    //we can assign function to any variable as like this

    var fn = ::mul
    println(fn(3,1))

    //we reassign the value to fn var but that returntype must be same as previous (Int,Int):Int == (Int,Int):Int

    fn = ::add
    println(fn(2,3))
}

//create a simple function

fun add(num1:Int,num2:Int):Int{
    val sum = num1 + num2
    return sum
}

//inline block function

fun addNumber(num3:Int ,num4:Int) = num3 + num4

//default function return type "Unit"
fun checkEven(num:Int){
    val result = if(num%2 == 0) "even" else "odd"
    println(result)

}

//default value assign to parameter
//if we donot pass any arrgument to function in function call then it return the by default value

fun printHello(count:Int = 2){
    for(i in 1..count){
        println("Hello $i")
    }
}

//function overloading

fun sub(a:Int,b:Int):Int{
    return a-b
}

fun sub(a:Double,b:Double):Double{
    return a-b
}

fun mul(a:Int,b:Int):Int{
    return a*b
}
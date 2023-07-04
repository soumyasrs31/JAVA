fun main(args: Array<String>){
    /*//var variable can be reassign..
    var name : String
    name = "soumua"
    println(name)
    */

    /*// val variable donot reassigned value..
    val myName = "soumya"
    myName = "arup"
    println(myName)*/

    //Data types number,character, String, boolean, Array..
    val myNum = 34
    val myDouble : Double = 34.34
    val myFloat : Float = 32.5f
    val myChar : Char = 's'
    //you cannot use ASCII values to display certain characters. The value 66 would output a "B" in Java, but will generate an error in Kotlin
    //val myCharAscii :Char = 66
    val myString : String = "soumya"

    //Type conversion
    val a = 34
    val b : Long = a.toLong()
    println(b)

    //Range

    var df =5
    println(df in 1..5)//1,2,3,4,5

    println(df in 1 until 5)//1,2,3,4

    //When keyword using

    var animal = "Dog"
    when(animal){
        "Horse" -> println("animal is horse")
        "Cat" -> println("animal is cat")
        "Dog" -> println("animal is dog")
        else-> println("animal is not found")
    }



    var dfsd = 13
    var resultt = when(dfsd){
        12 -> "value is less"
        15 -> "value is more"
        in 6..13 -> "value is found"
        else-> "value is not found"

    }
        println(resultt)

    //for loop

    for(ii in 1..5){
        println(ii)
    }

    for (i in 1 until 5){
        println(i)
    }

    for(i in 1..5 step 2){ //"step 2" means i = i+2
       println(i)//1,3,5
    }

    for(i in 1 until 10 step 3){//i = i+3
        println(i)
    }

    var number = 2
    for(i in 1..10 ){
        println(number *i)
    }

    for(i in 1..10){
        println(number.toString()+" * "+i+" = "+number*i)
    }

    for(i in 1..10){
        println("$number * $i = ${number * i}")
    }
}

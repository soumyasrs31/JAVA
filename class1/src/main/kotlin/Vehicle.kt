/*fun main(){
    val auto = Vehicle("black", "petrol", 3000)
    println(auto.kmRan)
    auto.isDrive()
}

class Vehicle (val color:String, val type:String, var kmRan:Int) {
    fun isDrive(){
        println("$type car is Driving")
    }
}*/

fun main(){
    var i:Int = 20 //properties
    println(i.plus(39))  //methods
    println(i.toFloat())

    //create object

    val s1 = Students("soumya", 16, "CSA")
    println(s1.isEligible())
        //due to secondary constructor we can remove CSA
    val s2 = Students("arup",22)
    println(s2.isEligible())

    val a1 = Animal("tiger",true)
    println(a1.isRunning)
}

//primary constructor..
class Students(val name:String, var age:Int, var course:String){
    //initializer statement
    init {
        println("all are good students")

    }
    fun isEligible():Boolean{
        return age>=18
    }
    //secondary constructor :this(primary constructor)
    constructor(paramName:String,paramAge:Int):
            this(paramName,paramAge,"CSA")
    init{
        println("students are learn cs")
    }
}

//if we want to pass parameter then we can do it as fellow

class Animal(name:String, type:Boolean){
    init{
        println("Animal class")
    }
    val name = name
    val isRunning = type
}
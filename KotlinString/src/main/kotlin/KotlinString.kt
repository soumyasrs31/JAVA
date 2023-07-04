fun main(args:Array<String>){
    val a:String
    a = "soumya"
    println(a)
    //Accessing a string
    println(a[0])
    println(a[2])
    //String length
    println(a.length)

    //String convert to toUpperCase and toLowerCase
    println(a.toUpperCase())
    println(a.toLowerCase())
    //two string compare using comareTo()
    val str1:String = "arup"
    val str2:String = "arup"
    if(str1.compareTo(str2) == 0){
        System.out.println("two strings are equal")

    }else{
        System.out.println("two strings are npt equal")
    }

    //find index of first letter of word out of line
    val sent : String = "this is our new world"
    println(sent.indexOf("new")) //output is 12 because first letter occurance index


    //Quotes Inside a String
    val c :String = "tony\'s"
    println(c)

    //String concatenation using plus()
    println(a.plus(" "+c))

    //String Templates or Interpolation

    var firstName = "soumya"
    var lastName = "sahoo"
    println("full name is $firstName $lastName")

}
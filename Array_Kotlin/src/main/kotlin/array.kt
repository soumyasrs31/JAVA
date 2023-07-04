fun main(){
    //implicit
    var arr = arrayOf("soumya","soumya2","soumya3")

    //explicit
    var arr1 = arrayOf<Int>(1,2,3)

    //access array elements
    for(i in arr){
        println(i)
    }

    //access array elements using index
    //e stands for element

    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    //size of array

    println(arr.size)
    //array access throw index
    println(arr[0])
    println(arr.get(1))

    // set the value by indx
    arr.set(2,"pari")
    println(arr.get(2))

    var arr3 = arrayOf<String>("puja","radhika","priyanka");
    for(i in arr3){
        println(i)

    }
    println(arr3.size)
    println(arr3.get(1))
    println(arr3[1])
    arr3.set(1,"pari")

    for((i,e) in arr3.withIndex()){
        println("$i - $e")
    }

}
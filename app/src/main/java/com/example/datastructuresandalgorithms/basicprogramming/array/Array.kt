package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
    var arr = arrayOf(1,2,3,4,5,1,11,1110,22,-1)
    var target = 11
    var s = linearS(arr , target)
    println(s)
//    val a = linearSearch(arr ,target)
//    println(a)
//   reverseArray(arr)
//    println("Original array: ${arr.joinToString(", ")}")
//    println(arr.indices)
//    for (i in arr){
//        print(i)
//    }

//
//    var person = person("Saurabh")
//    renamePerson(person)
//    println("outside function name ${person.name}")
//    // find smallest and largest value with index
//    var array = arrayOf(-2000,30000,4,5,100,200,-298,2,40)
//    var max = array[0]
//    var min = array[0]
//    var maxIndex = 0
//    var minIndex =0
//    for (num  in array.withIndex()){
//        if (num.value>max){
//            max =num.value
//            maxIndex = num.index
//        }
//        if (num.value<min){
//            min = num.value
//            minIndex = num.index
//        }
//
//    }
//    println("the largest Index and value in array = $maxIndex = $max")
//
//    println("the smallest Index and value in array = $minIndex = $min")


}
////find smallest number in array
//    var array = arrayOf(20, 30, 40, 10,1000 -5, -100)
//    var min = array[0]  // Start by assuming the first element is the minimum
//
//    for (num in array) {
////        if (num < min) {
////            min = num
////        }
//        if (num>min){
//            min =num
//        }
//
//    }
//
//    println("The smallest value in the array is: $min")
//    println("the greter vaue in array is ${array.maxOrNull()}")
//}


//    print("Enter the size of array : = ")
//    val size = readLine()?.toIntOrNull()?: return
//   var array = IntArray(size)
//    for (i in array.indices){
//        println("Enter value for index $i")
//        array[i] = readLine()?.toIntOrNull()?:0
//    }
//println("Your enter")
//    for (i in array){
//        print(i)
//    }


data class person(var name :String)
    fun renamePerson(person: person){
        person.name = "Ganeshi"
        println("inside function ${person.name}")
    }
fun linearSearch(arr: Array<Int>, target:Int): Int {
    var array = arr
    for (i in array) {
        if (i == target) {
            return i
        }
    }
        return -1
}

//fun reverseArray(arr: Array<Int>){
//    var array = arr
//    var start = 0
//    var end = array.size-1
//    while (start<end){
//        val tem = array[start]
//        array[start]= array[end]
//        array[end] = tem
//        start++
//        end--
//    }
//}

fun linearS(num: Array<Int>, target:Int):Int{
    var nums = 0
    for (i in num.withIndex()){
        if (i.value==target){
          return  i.index
        }
    }
    return -1
}
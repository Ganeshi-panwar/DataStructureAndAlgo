package com.example.datastructuresandalgorithms.basicprogramming.array

fun main() {
    var arr = arrayOf(2,3,4,5 ,1)
    val sumOfArray = sumArray(arr)
    println(sumOfArray)
    val pro = productOfArray(arr)
    println(pro)
//    for (i in arr){
//        println(i)
//    }
}
fun sumArray(array: Array<Int>):Int{
    var sum = 0
    for (i in array){
        sum +=i
    }
    return sum
}
fun productOfArray(array:Array<Int>):Int{
    var pro = 1
    for (i in array){
        pro *=i
    }
    return pro
}
package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
    // linear search in array
    val arr = arrayOf(2,2,3,4,5,6,7,2,5,10,-11)
    val target = 10
    val arrIndex = linearSearchs(arr , target)
    println(arrIndex)
}
fun linearSearchs(arr:Array<Int> , target:Int):Int{
    for (num in arr.withIndex()){
        if (num.value==target){
            return num.index
        }
    }
    return -1
}
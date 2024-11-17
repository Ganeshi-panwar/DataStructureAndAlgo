package com.example.datastructuresandalgorithms.basicprogramming.vector

import kotlin.math.max

fun main(){
       val arr = arrayOf(3,-4,5,4,-1,7,-8)
    singleNumber(arr)
    for (i in arr) {
        println(i)
    }

}
fun singleNumber(array: Array<Int>):Int{
//    var set =  array.toSet()
//    println(set)
    var value = 0
    for (i in array){
        value = i xor value

    }
    println(value)
    return value

}



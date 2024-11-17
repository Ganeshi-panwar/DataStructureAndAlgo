package com.example.datastructuresandalgorithms.basicprogramming.array

import kotlin.math.max
fun main() {
    val arr = arrayOf(3, -4, 5, 4, -1, 7, -8)
    allSubArraySum(arr)
}

fun allSubArraySum(arr:Array<Int>){
    var mxaSum = 0
    for (star in arr.indices){
        var currentSum = 0
        for (end in star until arr.size){
            currentSum += arr[end]
            mxaSum = max(currentSum , mxaSum)
        }
    }
    println("Max subArray sum = $mxaSum")

}
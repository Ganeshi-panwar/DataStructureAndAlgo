package com.example.datastructuresandalgorithms.basicprogramming.array

import kotlin.math.max
fun main() {
    val arr = arrayOf(3, -4, 5, 4, -1, 7, -8)
    allSubArraySum(arr)
    maxSubArraySum(arr)
}
// fins maximum sum of array using brute force algorithm
fun allSubArraySum(arr:Array<Int>){
    var mxaSum = 0
    for (star in arr.indices){
        var currentSum = 0
        for (end in star until arr.size){
            currentSum += arr[end]
            mxaSum = max(currentSum , mxaSum)
        }
    }
    println("max sub array sum using brute force algo  = $mxaSum")

}

// find the maximum array sum using kadane's algorithm
fun maxSubArraySum(nums: Array<Int>):Int{
    var maxSum = Int.MIN_VALUE
    var currentSum = 0
    for (num in nums){
        currentSum +=num
        maxSum = max(currentSum , maxSum)
        if (currentSum<0){
            currentSum = 0
        }
    }
    println("max sub array sum using kadane's algo = $maxSum")
    return maxSum
}
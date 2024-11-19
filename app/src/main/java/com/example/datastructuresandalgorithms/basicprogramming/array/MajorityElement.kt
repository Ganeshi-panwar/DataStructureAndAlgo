package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
    val arr = arrayOf(1,2,2,2,2,1,1)
    val majorityElement =majorityElementArrayUsingBruteForce(arr)
    println("majority element sing brute force algo = $majorityElement")
    val majorityElementSort = majorityElementInArrayUsingSorting(arr)
    println("majority element using sorting = $majorityElementSort")
    val majorityElementMoore= majorityElementUsingMooreVotingAlgo(arr)
    println("majority element using Boyer-Moore Voting Algorithm = $majorityElementMoore")
}
fun majorityElementArrayUsingBruteForce(array: Array<Int>): Int {
    val n = array.size

    for (value in array) {
        var freq = 0
        for (element in array) { // Compare value with every element
            if (value == element) {
                freq++
            }
        }
        if (freq > n / 2) { // Check if it exceeds n/2
            return value
        }
    }

    return -1 // Return -1 if no majority element is found
}



fun majorityElementInArrayUsingSorting(array: Array<Int>):Int{
 var freq = 1
    var n = array.size
   val sortedArray = array.sortedArray()
    var ans =array[0]
    for (i in 1 until  n){
        if (sortedArray[i] == sortedArray[i-1]){
            freq ++
        }else{
            freq = 1
            ans = array[i]
        }
    }
    if (freq>n/2){
        return ans
    }

return -1
}
fun majorityElementUsingMooreVotingAlgo(nums: Array<Int>):Int{
    var freq = 0
    var ans = 0

    // First pass to find the candidate
    for (num in nums) {
        if (freq == 0) {
            ans = num
        }
        if (ans == num) {
            freq++
        } else {
            freq--
        }
    }

    // Second pass to verify the candidate
    freq = 0
    for (num in nums) {
        if (num == ans) {
            freq++
        }
    }

    // Check if the candidate is a majority element
    return if (freq > nums.size / 2) ans else -1
}



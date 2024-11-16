package com.example.datastructuresandalgorithms.basicprogramming.array

import kotlinx.coroutines.handleCoroutineException

fun main(){
    var array = arrayOf(2,2,3,4,5,6,7,7)
    allTheUniqueValuesInArray(array)
  //  print("${array.joinToString  (", ")}")

}
//fun allTheUniqueValuesInArray(array: Array<Int>) {
//    var uniqueValues = arrayOf<Int>() // To store unique values
//
//    for (i in array.indices) {
//        var isDistinct = true
//        for (j in array.indices) {
//            if (i != j && array[i] == array[j]) {
//                isDistinct = false
//                break
//            }
//        }
//        if (isDistinct) {
//            uniqueValues += (array[i])
//        }
//    }
//
//    print("Unique values in the array are: ")
//    uniqueValues.forEach { print("$it ") }
//}

fun allTheUniqueValuesInArray(array: Array<Int>) {
    var uniqueValue = arrayOf<Int>()

    for (num in array.indices) {
        var isDistinct = true
        for (value in array.indices) {
            if (array[num] == array[value] && num != value) {
                isDistinct = false
                break
            }
        }
            if (isDistinct) {
                uniqueValue += array[num]
            }
        }
    uniqueValue.forEach { print("$it") }
    }


fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) { // Start `j` from `i + 1` to avoid duplicate pairs
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j) // Return indices as soon as the pair is found
            }
        }

    }

    throw IllegalArgumentException("No two sum solution")
}

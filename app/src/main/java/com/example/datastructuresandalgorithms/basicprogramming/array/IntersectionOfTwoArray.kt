package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
val arr1 = arrayOf(1,2,3,4,5)
    val  arr2 = arrayOf(2,3,4,8,6)
    println(intersectionOfTwoArray(arr1, arr2))
    val result = intersectionOfTwoArray(arr1, arr2)
    println(result.joinToString { it.joinToString(prefix = "[", postfix = "]", separator = ", ") })
}


fun intersectionOfTwoArray(arr1: Array<Int>, arr2: Array<Int>): List<IntArray> {
    val result = mutableListOf<IntArray>()

    for (i in arr1.indices) {
        for (j in arr2.indices) {
            if (arr1[i] == arr2[j]) {
                result.add(intArrayOf(i, j))
            }
        }
    }

    if (result.isEmpty()) {
        throw IllegalArgumentException("No matching elements found")
    }

    return result
}

//fun intersectionOfTwoArray(arr1:Array<Int> , arr2:Array<Int>): Any {
//  var commonElement = arrayOf<Int>()
//    for (i in arr1.indices){
//        for (j in arr2.indices){
//            if (arr1[i]==arr2[j]){
//               return intArrayOf(i ,j)
//            }
//        }
//    }
//    throw IllegalArgumentException("Some error")
////    return commonElement
//}
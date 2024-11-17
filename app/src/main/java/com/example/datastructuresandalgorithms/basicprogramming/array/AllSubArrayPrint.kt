package com.example.datastructuresandalgorithms.basicprogramming.array
fun main() {
    val arr = arrayOf(3, -4, 5, 4, -1, 7, -8)
    allSubArrayInArray(arr)
}
fun allSubArrayInArray(arr:Array<Int>){
    var mxa = 0
    for (star in arr.indices){
        for (end in star until arr.size){

            for (i in star..end){
                print(arr[i])
            }
            print(" ")
        }
        println()
    }
}
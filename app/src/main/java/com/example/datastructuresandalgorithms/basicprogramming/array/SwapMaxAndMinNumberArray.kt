package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
    var arr = arrayOf(2,3,4,1,5,8)
    swapMaxAndMin(arr)
    println("${arr.joinToString  (",, ")}")

}
fun swapMaxAndMin(arr:Array<Int>){
    var max = 0
    var min = 0
    var temp = 0
    for (num in arr){
        if (arr[num]>arr[max]){
           max = num
        }
        if (arr[num]<arr[min]){
           min = num
        }
        temp =arr[max]
        arr[max]  = arr[min]
        arr[min]  = temp
    }
}
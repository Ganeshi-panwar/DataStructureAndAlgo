package com.example.datastructuresandalgorithms.basicprogramming.array

fun main(){
    var arr = arrayOf(2,3,4,5,6,7,8,9,10,11,111,1111)
    val revArray = reverseArray(arr)
    println(revArray)
    print("${arr.joinToString ("," )}")

    for (i in arr){
        println("$i")
    }

}
fun reverseArray(arr:Array<Int>){
    var first = 0
    var last = arr.size-1
    while (first<last){
        val tem = arr[first]
        arr[first]=arr[last]
        arr[last]= tem
        first++
        last--
    }
}
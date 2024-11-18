package com.example.datastructuresandalgorithms.basicprogramming.array


import java.text.Normalizer.Form

fun main(){
    var arr = arrayOf(2,7,11,15)
    var target = 13
    pairSum(arr , target)
  var result =  pairSums(arr , target)
    println("Extracted pairs of indices:")
    for (i in result.indices step 2) {
        println("(${result[i]}, ${result[i + 1]})")
    }

}
// using brute fORce ALGO
fun pairSum(arr:Array<Int> , target:Int): Array<Int> {
    var pairSum = arrayOf<Int>()
   // var pairSum = mutableListOf<Pair<Int, Int>>()
    for (first in arr.indices){
        for (second in first+1 until arr.size){
            if (arr[first] + arr[second] == target){
//                pairSum.add(Pair(first , second))
                pairSum +=first
                pairSum +=second
            }
        }
    }
    println("The indices whose values sum to $target are: ${pairSum.contentToString()}")
    return pairSum
}

fun pairSums(arr:Array<Int> , target: Int):Array<Int>{
    var first = 0
    var last = arr.size-1
    var pairsum = 0
    var ans = arrayOf<Int>()
    while (first< last){
        pairsum = arr[first] + arr[last]
        if (pairsum > target){
            last --
        }else if (pairsum< target){
            first ++
        }else{
            ans +=first
            ans +=last
            first++ // Move both pointers to continue checking for other pairs
            last--

        }
    }
    println("pair sum using optimisze also $target = ${ans.contentToString()}")
    return ans

}
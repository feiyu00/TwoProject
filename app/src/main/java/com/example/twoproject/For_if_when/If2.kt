package com.example.twoproject.For_if_when

fun main(){
   val a= largerNumber21(50, 70)
    println(a)
    val b = largerNumber31(50, 70)
    println(b)
    val c = largerNumber41(50, 70)
    println(c)
    println("000")
}
fun largerNumber21(num1: Int,num2: Int): Int{
    var value =0
    if (num1>num2){
        value =num1
    }else{
        value =num2
    }
    return value
}
//if简化
fun largerNumber31(num1: Int,num2: Int):Int{
    //Kotlin 直接判断如果num1大于num2就value直接等于num1否则等于num2
    val value = if (num1>num2){
        num1
    }else{
        num2
    }
    return value
}
//简化
fun largerNumber41(num1: Int,num2: Int):Int{
    //Kotlin 直接判断如果num1大于num2就value直接等于num1否则等于num2
   return if (num1>num2){
        num1
    }else{
        num2
    }
}
//简化
fun largerNumber51(num1: Int,num2: Int):Int=if (num1>num2){
    num1
}else{
    num2
}
//简化
fun largerNumber61(num1: Int,num2: Int)=if (num1>num2)num1 else num2





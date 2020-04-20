package com.example.twoproject.For_if_when

import kotlin.math.max

fun main(){
   val a =10
    println("a = $a")
    var  b = a*10
    println("b = $b")
    println(methodName(2, 3))
    println(largerNumber(5, 6))
}
//fun 方法名(参数1:类型，参数2:类型):返回类型{
// return 返回值    Kotlin不需要加;
// }
fun methodName(param1:Int,param2: Int):Int{
    return param1+param2
}
//max方法返回最大值
/*fun largerNumber(num1 :Int,num2:Int):Int{
    return max(num1,num2)
}*/
//如果只有一行的话可以简化
/*fun largerNumber(num1 :Int,num2:Int):Int= max(num1,num2)*/
//Kotlin推导机制可以不用返回值
fun largerNumber(num1 :Int,num2:Int)= max(num1,num2)


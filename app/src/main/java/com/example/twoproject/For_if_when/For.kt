package com.example.twoproject.For_if_when

fun main() {
    //for循环..是双端闭的关键字
    for (i in 0..10) {
        println(i)
    }
    println("================================")
    //升序 val range = 0 until 10 单端闭区间 until  左闭右开关键词 [0,10) 左端必须小于右端
    //步长 step
    for (i in 0 until 10 step 2) {
        println(i)
    }
    println("================================")
    //降序
    for (i in 10 downTo 0) {
        //10 9 8 7 6 5 4 3 2 1 0
        println(i)
    }
    println("================================")
    var i = 10
    while (i<10){
        println("i:$i")
        i++
    }
    println("================================")
    //先执行一次
    do {
        println("i:$i")
    }while (i<10)

}

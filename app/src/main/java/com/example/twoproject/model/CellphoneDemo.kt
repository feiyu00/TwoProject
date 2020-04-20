package com.example.twoproject.model

fun main(){
    val cellphone1 = Cellphone("Samsung",1299.99)
    val cellphone2 = Cellphone("Samsung",1299.99)
    println(cellphone1)
    //如果Cellphone没加data关键词的话会打印为false，因为不是同一个地址
    println("cellphone1 equals cellphone2 "+(cellphone1 == cellphone2))
    //单例
    val singleton = Singleton.singletonTest();
}
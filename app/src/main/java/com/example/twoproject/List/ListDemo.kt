package com.example.twoproject.List

fun main(){
    println("============不可变list集合==============")
    //不可变，不能添加和删除
    val list = listOf("Apple","Banana","Orange","Pear")
    for (fruit in list){
        println(fruit)
    }
    println("===========可变list集合===============")
    //可变
    val list2 = mutableListOf("Apple","Banana","Orange","Pear")
    list2.add("Grape")
    for (fruit in list2){
        println(fruit)
    }
    println("===========不可变set集合===============")
    val set = setOf("Apple","Banana","Orange","Pear")
    for (fruit in set){
        println(fruit)
    }
    println("===========可变set集合===============")
    val set2 = mutableSetOf("Apple","Banana","Orange","Pear")
    set2.add("Grape")
    for (fruit in set2){
        println(fruit)
    }
    println("==========传统map集合================")
    val  map = HashMap<String,Int>()
    //写入
    map["Apple"]=1
    map["Banana"]=2
    map["Pear"]=3
    //读取一条数据
    val number = map["Apple"]
    //打印的是key
    println(number)
    println("==========不可变map集合================")
    val  map2 = mapOf("Apple" to 1,"Banana" to 2,"Pear" to 3,"Grape" to 4)
    for ((fruit,number2)in map2){
        println("fruit is $fruit,number is $number2")
    }

}
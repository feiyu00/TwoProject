package com.example.twoproject.ListAPI
fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear")
    var maxLengthFruit = ""
    for (fruit in list) {
        //找长度最长的单词
        if (fruit.length>maxLengthFruit.length){
            maxLengthFruit = fruit
        }
    }
    println("max length fruit is "+maxLengthFruit)

    println("=========================================")

    val list2 = listOf("Apple", "Banana", "Orange", "Pear")
    /*val lambda ={fruit:String->fruit.length}
    var maxLengthFruit2 = list2.maxBy(lambda)*/
    //简写
//    var maxLengthFruit2 = list2.maxBy({fruit:String->fruit.length})
/*    var maxLengthFruit2 = list2.maxBy(){fruit:String->fruit.length}
    var maxLengthFruit2 = list2.maxBy{fruit:String->fruit.length}
    var maxLengthFruit2 = list2.maxBy{fruit->fruit.length}*/
    //如果是唯一一个参数可以使用it代替
    var maxLengthFruit2 = list2.maxBy{it.length}
    println(maxLengthFruit2)

    println("==================================")

    //所有水果变为大写
    val list3 = listOf("Apple", "Banana", "Orange", "Pear")
    val newList = list3.map { it.toUpperCase() }
    for (fruit in newList){
        println(fruit)
    }
    println("================过滤5个单词以下的变为大写========================")
    //过滤
    val list4 = listOf("Apple", "Banana", "Orange", "Pear")
    val newList2 = list4.filter { it.length<=5 }.map { it.toUpperCase() }
    for (fruit in newList2){
        println(fruit)
    }



}
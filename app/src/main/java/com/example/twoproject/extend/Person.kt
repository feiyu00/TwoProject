package com.example.twoproject.extend
//默认无法被继承 如果要被继承加open关键词
open class Person(val name:String ,val age :Int){

    //有参class Student(val sno :String ,var grade :Int )
    //无参构造方法
 /*   var name ="";
    var age =0;*/
    fun eat(){
        println(name +" is eating . He is "+age +"years old.")
    }
}
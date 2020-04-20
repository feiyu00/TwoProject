package com.example.twoproject.extend

import com.example.twoproject.extend.Person

//默认无法被继承 如果要被继承加open关键词
//继承需要加()
//类后面加括号为有参，为主构造函数
//定义在类里面为无参
//有参(val sno :String ,var grade :Int )
//如果Student没有主构造函数的话，继承Person无需加括号，而且会自动调用父类的构造函数
class Student(val sno :String ,var grade :Int,name :String,age:Int ): Person(name,age){
    //无参构造方法
  /*  var sno:String = ""
    var grade:Int = 0;*/


    //次构造函数
    constructor(name: String,age: Int):this("",0,name,age){
    }
    constructor():this("",0){

    }
    //如果没有主构造函数
   /* constructor(name: String,age: Int):super(name, age){

    }*/

    /*init {
        print("sno is "+sno)
        print("grade is "+grade)
    }*/
}
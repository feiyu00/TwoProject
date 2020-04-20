package com.example.twoproject.interfaces

import com.example.twoproject.extend.Person
import com.example.twoproject.interfaces.Study

class StudyImpl(name:String ,age:Int) : Person(name,age), Study {
    override fun readBooks() {
        println(name +" is reading")
    }
    //如果接口之中的方法定义了函数体的话，去实现这个接口的话那个有函数体的方法会默认实现
    //如果重写函数的话就不会默认实现，如果不重写函数的话会默认实现
    override fun doHomework() {
        println(name +" is doing homework.")
    }

}
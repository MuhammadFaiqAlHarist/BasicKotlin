package com.example.basickotlin.tipedata

fun main(){

    var enemy : Array<Any> = arrayOf("dzakwan", "makan ", "lukman")
     for (dzakwan in enemy) {
         println(dzakwan)
     }
var makan : Array<String> = arrayOf("lukman", "makan", "Babi")
    println(makan[0])
    println(makan.get(1))
    makan.set(1,"minum")
    println(makan[2])

    var name : Array<String?> = arrayOfNulls(2)
    name.set(0 , null)
    name.set(1 , null)

    for (a in name)
        println(a)

}



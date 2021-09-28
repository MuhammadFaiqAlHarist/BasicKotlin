package com.example.basickotlin.controlFlow

fun main(){
    var makan = 0
    var i = 1
    while (i <= 100 ){
         i++
        if (i%2 != 0){
            continue
        }
    }
    println(makan)
}

package com.example.basickotlin.controlFlow

fun main(){
    var sum = 0
    var i = 1
    //while = Kondisi
    while (i <= 100){
        sum += i
        i++
        if (sum > 1000){
            break
        }

    }
    println(sum)
    }

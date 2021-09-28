package com.example.basickotlin.collection

fun main() {
    val nilaimatematika = 88
    val nilaiinggris = 93
    val nilaisejarah = 75
    if (nilaimatematika < 89) {
        println("predikat B dengan nilai $nilaimatematika")
    } else {
        println("predikat A dengan nilai $nilaiinggris")
    }
    if (nilaiinggris > 88) {
            println("predikat A dengan nilai $nilaiinggris")
        } else {
            println("predikat C dengan nilai $nilaisejarah")
        }
    if (nilaisejarah < 78){
        println("predikat C dengan nilai $nilaisejarah")
    }else{
        println("predikat A dengan nilai $nilaiinggris")

    }


    }




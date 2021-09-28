package com.example.basickotlin.controlFlow

fun main(){
    var x = 10
    when (x){
        1 -> println("x = 1")
        2 -> println("x = 2")
        else -> {
            println("x tidak memiliki nilai")
        }
        // When exprexsion with multiple option
        }
    var nilaiAkhir = 'C'
    when(nilaiAkhir){
        'A','B','C' -> println("kamu lulus ujian dengan nilai akhir $nilaiAkhir")
        else ->{
            println("mantap sekali bor")
        }
    }
    var ujianakhir = 'A'
    var ujianlulus = arrayOf('A','B','C')
    when (ujianakhir){
        in ujianlulus -> println("lu lulus")
        !in ujianlulus -> println("coba lagi ya")
    }
    val ujiantengah = 85
    when{
        ujiantengah >= 80 -> println("lu pelajar terbaik")
        ujiantengah >= 90 -> println("Nilai lu cukup")
        else -> println("belajar yg bnr ngapa")

    }
}
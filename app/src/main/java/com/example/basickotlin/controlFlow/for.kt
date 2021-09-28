package com.example.basickotlin.controlFlow

fun main(){
    for (value in 'z' downTo 'A' step  1)
        println(value)
    //downTo gunanya untuk turun sampai kemana
    //kalau step jarak longkap angka ke angka
    val name = "Faiq Al Harist"
    for (name in name)(
            println("\"$name\"")
    )
    for (number in 1..100){
        println("Nomor$number")
    }
    for (i in 1.rangeTo(80)){
        println(i)
    }
    for (index in (19 downTo (1)step 1)){
        println(index)
    }
    val range = 1.rangeTo(50)
    range.forEachIndexed { index, value ->
    println("index $index ya $value")
}

}

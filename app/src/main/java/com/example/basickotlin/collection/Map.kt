package com.example.basickotlin.collection

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
    "London" to "england",
    "Newdelhi" to "India",
    )
    println(capital["Newdelhi"])
    println(capital.getValue("Jakarta"))
    //->->->->->->->->->->->->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    val mapKeys = capital.keys
    val mapValues = capital.values
    println(mapKeys)
    println(mapValues)

    //->->->->->->->->->->->->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Bekasi" , "Tegal")
    mutableCapital.put("Belanda" , "Bogor")
    println(mutableCapital)
}
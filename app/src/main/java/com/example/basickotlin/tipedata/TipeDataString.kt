package com.example.basickotlin.tipedata

fun main() {
    var fName = "Muhammad "
     var mName = "Faiq "
      var lName = "Al Harist"
    var fullname = fName + mName + lName
    println(fullname)
       var alamatRumah = """
        |Bekasi Regensi 2 
       |Blok DD 9 No 36
      |RT 017
     |RW 018
     """.trimIndent()
       println(fName)
        println(mName)
         println(lName)
          println(alamatRumah)

      var nomor = """
        |No.Telephone
         081298419634
       """.trimMargin()
    println(nomor)

    var makan = "kurang"
    var makan1 = "luqman"
    var vallname = "$makan ${makan1.length}"
    println(vallname)




}

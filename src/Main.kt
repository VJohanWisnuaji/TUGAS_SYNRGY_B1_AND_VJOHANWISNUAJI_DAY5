import valuepackage.*

fun main(){
    var valueInteger = ValueInteger()
    var valueLong = ValueLong()
    val valueFloat = ValueFloat()
    val valueDouble = ValueDouble()
    var valueString = ValueString()
    var spasi:String = ""

    println("Nilai maksimum dari integer adalah ${valueInteger.maks}")
    println("Nilai minimum dari integer adalah ${valueInteger.min}")
    println(spasi)
    println("Nilai maksimum dari Long adalah ${valueLong.maks}")
    println("Nilai minimum dari Long adalah ${valueLong.min}")
    println(spasi)
    println("Nilai maksimum dari Float adalah ${valueFloat.maks}")
    println("Nilai minimum dari Float adalah ${valueFloat.min}")
    println(spasi)
    println("Nilai maksimum dari Double adalah ${valueDouble.maks}")
    println("Nilai minimum dari Double adalah ${valueDouble.min}")
    println(spasi)
    valueString.string()
}

class ValueString{
    private val maks = Int.MAX_VALUE
    protected val min = 0

    fun string(){
        println("Panjang maksimum karakter dari string adalah ${maks}")
        println("Panjang minimum karakter dari string adalah ${min}")
    }
}


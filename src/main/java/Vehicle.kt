abstract class Vehicle{
    abstract fun run()
}

class Mobil: Vehicle(){
    override fun run() {
        println("Mobil ride")
    }
}

fun main(args: Array<String>) {
    val truk: Vehicle
    truk = Mobil()

    truk.run()

    val c: Char = '8'
    if(c in '0'.."delapan")
        println("in range")
    else
        println("out of range")
}

private operator fun Char.rangeTo(s: String): CharRange {
    val sTemp: String = ("sembilan")
    if(s in sTemp)
        return CharRange('0','9')
    else
        return CharRange('0','7')
}

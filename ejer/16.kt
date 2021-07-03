// 100a + 50b + 20c + 10d = 130

fun main() {
    var dinero = 160.0
    val cant_100 = Math.floor(dinero / 100)
    dinero -= cant_100 * 100
    val cant_50 = Math.floor(dinero / 50)
    dinero -= cant_50 * 50
    val cant_20 = Math.floor(dinero / 20)
    dinero -= cant_20 * 20
    val cant_10 = Math.floor(dinero / 10)
    dinero -= cant_10 * 10
    println("""
        Billetes:
        de 100  $cant_100
        de 50   $cant_50
        de 20   $cant_20
        de 10   $cant_10
    """)
}
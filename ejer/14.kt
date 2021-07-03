fun main() {
    val x = 2016
    val a = x % 19
    val b = x % 4
    val c = x % 7
    val d = ((19 * a) + 24) % 30
    val e = (2 * b + 4 * c + 6 * d + 5) % 7
    println("Marzo ${22 + d + e}")
}

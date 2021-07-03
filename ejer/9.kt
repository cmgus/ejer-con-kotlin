fun main() {
    val a = 7
    val b = 7
    val c = 2
    val d = 5
    val e = 3
    val f = 9
    val x = ((c * e) - (b * f)) / ((a * e) - (b * d))
    val y = ((a * f) - (c * d)) / ((a * e) - (b * d))

    println(
            """
        x($x) ; y($y)
        ${(a * x) + (b * x)} = c($c) 
        ${(d * x) + (e * y)} = f($f)
    """)
}

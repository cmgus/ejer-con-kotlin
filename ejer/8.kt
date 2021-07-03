fun main() {
    val (x, y) = Pair(12.0, 5.0)
    val (r, theta) = Pair(Math.sqrt((x * x) + (y * y)), Math.atan(y / x))
    println("(${x}, ${y}) cartesian = (${r},${theta}) polar")
}
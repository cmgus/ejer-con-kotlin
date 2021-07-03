fun main() {
    val PI = 3.141592653589793
    val vueltas = 2
    val vel = 15 // m/s
    val rad = 100 // m
    val circunferencia = ((2 * rad) * PI) * vueltas
    val tiempo: Double = (circunferencia / vel)
    val descanso: Double = if (circunferencia > 1000) (Math.floor(circunferencia / 1000)) * 60 else 0.0
    println("""
        Tiempo ${tiempo + descanso}\tsegundos
        Descanso\t${descanso}\tsegundos
        Distancia ${circunferencia}\tmetros
    """)
}

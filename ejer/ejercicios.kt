fun main() {
    println("/////////////// Ejer1 ///////////////")
    ejer1()
    println("/////////////// Ejer2 ///////////////")
    ejer2()
    println("/////////////// Ejer3 ///////////////")
    ejer3()
    println("/////////////// Ejer4 ///////////////")
    ejer4()
    println("/////////////// Ejer5 ///////////////")
    ejer5()
    println("/////////////// Ejer6 ///////////////")
    ejer6()
    println("/////////////// Ejer7 ///////////////")
    ejer7()
    println("/////////////// Ejer8 ///////////////")
    ejer8()
    println("/////////////// Ejer9 ///////////////")
    ejer9()
    println("/////////////// Ejer10 ///////////////")
    ejer10()
    println("/////////////// Ejer11 ///////////////")
    ejer11()
    println("/////////////// Ejer12 ///////////////")
    ejer12()
    println("/////////////// Ejer13 ///////////////")
    ejer13()
    println("/////////////// Ejer14 ///////////////")
    ejer14()
    println("/////////////// Ejer15 ///////////////")
    ejer15()
    println("/////////////// Ejer16 ///////////////")
    ejer16()
    println("/////////////// Ejer17 ///////////////")
    ejer17()
}

fun ejer1() {
    val PI = 3.1415926535

    val degree = 37

    val radian = degree * (PI / 180)

    println("$degree° -> " + radian / PI + " π rad ~ $radian rad")
}

fun ejer2() {
    val vel = 100 // m/S
    println("${vel} m/s ~ ${vel * 3.6} k/h")
}

fun ejer3() {
    val PI = 3.141592653589793
    val vueltas = 2
    val vel = 15 // m/s
    val rad = 100 // m
    val circunferencia = ((2 * rad) * PI) * vueltas
    val tiempo: Double = (circunferencia / vel)
    val descanso: Double =
            if (circunferencia > 1000) (Math.floor(circunferencia / 1000)) * 60 else 0.0
    println(
            """
        Tiempo ${tiempo + descanso}\tsegundos
        Descanso\t${descanso}\tsegundos
        Distancia ${circunferencia}\tmetros
    """)
}

fun ejer4() {
    val num = 1
    println("Suma ${(num * (num + 1))/2}")
}

fun ejer5() {
    val cambio = 3.88
    val soles = 3
    println("${soles} PEN = ${soles * cambio} USD")
}

fun ejer6() {
    val F = 100
    val C = 1.8 * (F - 32)
    println("${F} F° = ${C} C°")
}

fun ejer7() {
    val age = 20
    val pulses = (220 - age) / 10
    println("""Age: ${age}
Pulses: ${pulses}""")
}

fun ejer8() {
    val (x, y) = Pair(12.0, 5.0)
    val (r, theta) = Pair(Math.sqrt((x * x) + (y * y)), Math.atan(y / x))
    println("(${x}, ${y}) cartesian = (${r},${theta}) polar")
}

fun ejer9() {
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

fun ejer10() {
    val sueldo_base = 1200

    val venta1 = 300
    val venta2 = 400
    val venta3 = 500

    val comision1 = venta1 * 0.1
    val comision2 = venta2 * 0.1
    val comision3 = venta3 * 0.3

    val venta_mes = venta1 + comision1 + venta2 + comision2 + venta3 + comision3
    val meses = 3
    val total = venta_mes * meses * sueldo_base * meses
    println("($meses) Comisión por mes ${comision1 + comision2 + comision3}\tTotal $total")
}

fun ejer11() {
    val total_compra = 100
    val descuento = total_compra * 0.15
    println("Total ${total_compra - descuento}")
}

fun ejer12() {
    val nota1 = 11
    val nota2 = 11
    val nota3 = 11
    val promedio = nota1 * 0.55 + nota2 * 0.3 + nota3 * 0.15
    println("Promedio final $promedio")
}

fun ejer13() {
    val hombres = 15.0
    val mujeres = 10.0
    val total = hombres + mujeres
    println("Hombres ${hombres / total}%; Mujeres ${mujeres / total}%")
}

fun ejer14() {
    val x = 2016
    val a = x % 19
    val b = x % 4
    val c = x % 7
    val d = ((19 * a) + 24) % 30
    val e = (2 * b + 4 * c + 6 * d + 5) % 7
    println("Marzo ${22 + d + e}")
}

fun ejer15() {
    val dinero = 10
    println(
            """
        Billetes:
        de 100  ~ ${Math.floor(dinero / 100.0)}
        de 50   ~ ${Math.floor(dinero / 50.0)}
        de 20   ~ ${Math.floor(dinero / 20.0)}
        de 10   ~ ${Math.floor(dinero / 10.0)}
    """)
}

fun ejer16() {
    var dinero = 160.0
    val cant_100 = Math.floor(dinero / 100)
    dinero -= cant_100 * 100
    val cant_50 = Math.floor(dinero / 50)
    dinero -= cant_50 * 50
    val cant_20 = Math.floor(dinero / 20)
    dinero -= cant_20 * 20
    val cant_10 = Math.floor(dinero / 10)
    dinero -= cant_10 * 10
    println(
            """
        Billetes:
        de 100  $cant_100
        de 50   $cant_50
        de 20   $cant_20
        de 10   $cant_10
    """)
}

fun ejer17() {
    var dinero = 123.4
    val cant_100 = Math.floor(dinero / 100)
    dinero -= cant_100 * 100
    val cant_50 = Math.floor(dinero / 50)
    dinero -= cant_50 * 50
    val cant_20 = Math.floor(dinero / 20)
    dinero -= cant_20 * 20
    val cant_10 = Math.floor(dinero / 10)
    dinero -= cant_10 * 10
    val cant_5 = Math.floor(dinero / 5)
    dinero -= cant_5 * 5
    val cant_2 = Math.floor(dinero / 2)
    dinero -= cant_2 * 2
    val cant_1 = Math.floor(dinero / 1)
    dinero -= cant_1 * 1
    // val e = 0.0e7
    val cant_0_5 = Math.floor(dinero / 0.5)
    dinero -= cant_0_5 * 0.5
    val cant_0_2 = Math.floor(dinero / 0.2)
    dinero -= cant_0_2 * 0.2
    val cant_0_1 = Math.floor(dinero / 0.1)
    dinero -= cant_0_1 * 0.1
    println(
            """
        Billetes:
        de 100  $cant_100   ${cant_100 * 100}  
        de 50   $cant_50    ${cant_50 * 50}   
        de 20   $cant_20    ${cant_20 * 20}   
        de 10   $cant_10    ${cant_10 * 10}   
        de 5    $cant_5     ${cant_5 * 5}
        de 2    $cant_2     ${cant_2 * 2}
        de 1    $cant_1     ${cant_1 * 1}
        de 0.5  $cant_0_5   ${cant_0_5 * 0.5}  
        de 0.2  $cant_0_2   ${cant_0_2 * 0.2}  
        de 0.1  $cant_0_1   ${cant_0_1 * 0.1}  
    """)
}

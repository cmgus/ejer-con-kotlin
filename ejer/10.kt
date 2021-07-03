fun main() {
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
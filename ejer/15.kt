fun main() {
    val dinero = 10
    println("""
        Billetes:
        de 100  ~ ${Math.floor(dinero / 100.0)}
        de 50   ~ ${Math.floor(dinero / 50.0)}
        de 20   ~ ${Math.floor(dinero / 20.0)}
        de 10   ~ ${Math.floor(dinero / 10.0)}
    """)

}
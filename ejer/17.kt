fun main() {
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
    println("""
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
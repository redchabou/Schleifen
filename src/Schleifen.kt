fun main() {

    /* TODO: Gib die Zahlen von 1 bis 30 mit einer schleife aus. */
    for (i in 1..30) {
        println(i)
    }
    /* TODO: Gib jede dritte Zahl von 1 bis 30 mit einer schleife aus. */
    for (i in 1..30 step 3) {
        println(i)
    }

    /* TODO: Gib die Zahlen von 1 bis 30 mit einer schleife rückwärts aus. */
    for (i in 30 downTo 1) {
        println(i)
    }

    /* TODO: Gib jede 7. Zahl von 1 bis 30 mit einer schleife rückwärts aus. */
    for (i in 30 downTo 1 step 7) {
        println(i)
    }

//    /* TODO: Verwende eine Schleife, um alle Elemente der Liste auszugeben. */
//    val liste1 = listOf("Ich ", "bin ", "ein ", "kleiner ", "Kaktus.")
//    val list = listOf(1, 2, 3, 4, 5)
//    for (item in list) {
//        println(item)
//    }


    /* TODO: Verwende eine Schleife, um alle Elemente der Liste rückwärts auszugeben. */
    val liste2 = listOf("Kaktus.", "kleiner ", "ein ", "bin ", "Ich ")
    val list = listOf(1, 2, 3, 4, 5)
    for (item in list.reversed()) {
        println(item)
    }

//    /* TODO: Verwende eine Schleife, um die Anzahl der Elemente einer Liste zu zählen. */
//    val liste3 = listOf(
//        "Mein", "kleiner", "grüner", "Kaktus", "Steht", "draußen", "am", "Balkon",
//        "Hollari", "hollari", "hollaro", "Was", "brauch'", "ich", "rote", "Rosen?",
//        "Was", "brauch'", "ich", "roten", "Mohn?", "Hollari", "hollari", "hollaro",
//    )
//    var count = 0
//    for (item in liste3) {
//        count++
//    }
//    println("Anzahl der Elemente: $count")


    /* TODO: Verwende eine Schleife, um die Zahlen in einer Liste zu summieren. */
    val liste4 = listOf(23, 465, 456, 24, 46, 2, 7, 79, 2435, 1, 564, 4, 46, 568, 5, 234, 23, 5)
    var sum = 0
    for (item in liste4) {
        sum += item
    }
    println("Summe der Elemente: $sum")



    /* TODO: Verwende eine Schleife, um die Anzahl der Zahl 42 in der Liste zu zählen. */
    val liste5 = listOf(23, 465, 42, 456, 24, 42, 46, 2, 7, 79, 2435, 1, 564, 42, 4, 46, 568, 5, 42, 234, 23, 5)
    var count = 0
    for (item in liste5) {
        if (item == 42) {
            count++
        }
    }
    println("Anzahl von 42 in der Liste: $count")


    /* TODO: Verwende eine Schleife, um die Position (= den Index) eines Elements einer Liste zu finden
    * Gesucht wird der Index des Strings "Balkon".
    * */

    val liste6 = listOf(
        "Mein", "kleiner", "grüner", "Kaktus", "Steht", "draußen", "am", "Balkon",
        "Hollari", "hollari", "hollaro", "Was", "brauch'", "ich", "rote", "Rosen?"
    )
    var index = -1
    for (i in liste6.indices) {
        if (liste6[i] == "Balkon") {
            index = i
            break
        }
    }
    println("Index des Elements 'Balkon': $index")



    /* TODO: Verwende eine Schleife, um alle Schlüssel für einen gegebenen Wert in einer Map zu finden
    * Gesucht werden alle Schlüssel, die auf "Hallo" zeigen.
    * */

    val map = mapOf(
        42.23 to "Hallo",
        32.53 to "Welt",
        23.43 to "Hallo",
        62.28 to "Haus",
        16.96 to "Hallo"
    )
    val keys = mutableListOf<Double>()
    for ((key, value) in map) {
        if (value == "Hallo") {
            keys.add(key)
        }
    }
    println("Schlüssel für den Wert 'Hallo': $keys")

}

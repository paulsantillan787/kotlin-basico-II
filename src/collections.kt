fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets


    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"

    println(solarSystem[3])

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

    println(newSolarSystem[8])

    val solarSystemList = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemList.size)
    println(solarSystemList[2])
    println(solarSystemList.get(3))
    println(solarSystemList.indexOf("Earth"))
    println(solarSystemList.indexOf("Pluto"))

    for (planet in solarSystemList) {
        println(planet)
    }

    val solarSystemMutable = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystemMutable.add("Pluto")
    solarSystemMutable.add(3, "Theia")
    solarSystemMutable[3] = "Future Moon"
    println(solarSystemMutable[3])
    println(solarSystemMutable[9])

    solarSystemMutable.removeAt(9)
    solarSystemMutable.remove("Future Moon")
    println(solarSystemMutable.contains("Pluto"))
    println("Future Moon" in solarSystemMutable)

    val solarSystemSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemSet.size)
    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)
    println(solarSystemSet.contains("Pluto"))
    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)
    solarSystemSet.remove("Pluto")
    println(solarSystemSet.size)
    println(solarSystemSet.contains("Pluto"))

    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystemMap.size)

    solarSystemMap["Pluto"] = 5

    println(solarSystemMap.size)

    println(solarSystemMap["Pluto"])

    println(solarSystemMap.get("Theia"))

    solarSystemMap.remove("Pluto")

    println(solarSystemMap.size)

    solarSystemMap["Jupiter"] = 78
    println(solarSystemMap["Jupiter"])
}
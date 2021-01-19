package Tomtebossen

class Tomtar {

    //I varje par är tomten key och hans chef value.
    // En chef kan ha flera underordnade men varje tomte har bara en överordnade.

    val hierarchy = mapOf("Glader" to "Tomten",
            "Butter" to "Tomten",
            "Tröger" to "Glader",
            "Trötter" to "Glader",
            "Blyger" to "Glader",
            "Rådjuret" to "Butter",
            "Nyckelpigan" to "Butter",
            "Haren" to "Butter",
            "Räven" to "Butter",
            "Skumtomten" to "Trötter",
            "Gråsuggan" to "Räven",
            "Myran" to "Räven",
            "Dammråttan" to "Skumtomten",
            "Bladlusen" to "Myran")

}

fun Tomtar.getSuperiors(namn: String): List<String> {
    if (hierarchy.containsKey(namn))
        return getSuperiors(hierarchy.getValue(namn)).plus(hierarchy.getValue(namn))
    else
        return listOf()
}

fun main() {
    val t = Tomtar()
    println(t.getSuperiors("Dammråttan"))
}


Kotlin లో for loop ని వాడటం చాలా సులభం. ఇది collections, arrays, ranges లలో ఉన్న items మీద iterate చేయడానికి వాడతారు.

Kotlin for loop basic syntax
kotlin
for (item in collection) {
    // loop body
    // item: ప్రస్తుత iteration లో ఉన్న element
}
For loop రేంజ్ (range) తో ఉదాహరణ
kotlin
fun main() {
    for (i in 1..5) {
        println(i)
    }
}
అవుట్‌పుట్:

text
1
2
3
4
5
Array లో iterate:
kotlin
fun main() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println(fruit)
    }
}
అవుట్‌పుట్:

text
Apple
Banana
Cherry
Step, DownTo తో for loop:
kotlin
fun main() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}
అవుట్‌పుట్:

text
10
8
6
4
2

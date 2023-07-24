fun main() {
    val array = (1..100).toList()
    val employees = array.map { "employee $it" }

    val first30 = employees.take(30) // выборка первых 30 элементов
    val last30 = employees.takeLast(30) // выборка последних 30 элементов
    val withoutFirst30 = employees.drop(30) // отбрасывание первых 30 элементов
    val withoutLast30 = employees.dropLast(30) // отбрасывание последних 30 элементов
    println("$first30\n$last30\n$withoutFirst30\n$withoutLast30")

    // бесконечные последовательности
    val evens = generateSequence(0) { it + 2 } /* четные числа (сама последовательность работает
                                                        по принципу "ленивой инициализации", таким образом изначально
                                                        никакая бесконечная последовательность не создается) */
    println(evens.take(10).toList()) // если вызвать метод drop, то при выводе будет бесконечный цикл

    // домашнее задание
    var first = 0
    val employeesSequence = generateSequence("employee $first") { "employee ${++first}" }
    println(employeesSequence.take(10).toList())

    // альтернативный вариант красивого решения
    val employeesSequence2 = generateSequence(0) { it + 1 }.map { "employee $it" }
    println(employeesSequence2.take(10).toList())
}
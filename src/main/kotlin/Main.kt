fun main() {
    print(solution(2, 3, 5))
}

fun solution(a: Int, b: Int, c: Int): Boolean {
    return when (c.toFloat()) {
        (a + b).toFloat() -> true
        (a - b).toFloat() -> true
        (a / b.toFloat()) -> true
        (a * b).toFloat() -> true
        else -> false
    }
}
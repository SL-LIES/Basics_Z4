fun main() {
    println("Введите число1: ")
    val num1 = readln().toDouble();
    println("Введите число2: ")
    val num2 = readln().toDouble();
    println("Введите действие: ")
    val act = readln();
    var res = 1.0
    if (act == "/"){
        res = num1 / num2
    } else if (act == "*"){
        res = num1 * num2
    } else if (act == "+"){
        res = num1 + num2
    } else if (act == "-") {
        res = num1 - num2
    } else {
        println("Ошибка, этого действия нет")
        return;
    }
    println("$num1 $act $num2 = $res")
}
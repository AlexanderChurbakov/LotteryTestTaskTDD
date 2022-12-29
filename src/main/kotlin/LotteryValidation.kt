/*
вход:
    Функция должна принимать число количество цифр которого от 2 до 8\
условия:
    Выигрышный билет - сумма левой половины номера равна сумме правой половины
результат:
    Тру если победа фолс если поражение
 */
interface LotteryValidation {

    fun valid(number: Long): Boolean

    class Base() : LotteryValidation {
        override fun valid(number: Long): Boolean {
            val numberString = number.toString()
            val length = numberString.length
            if (length == 1 || length == 9) {
                throw IllegalArgumentException("number must be from 2 to 8 length")
            }
            val list = mutableListOf<Int>(length)
            var sum = 0
            for (num in numberString) {
                list.add(num.toString().toInt())
            }
            // TODO: do algorithm

        }
    }
}
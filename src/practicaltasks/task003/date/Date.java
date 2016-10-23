package practicaltasks.task003.date;

/**
 * Класс Date помогающий работать с датами
 *
 * @author Стесик Анатолий
 */
public class Date {

    private final int MIN_NUMBER_YEAR = 0;
    private final int MAX_NUMBER_YEAR = 5000;

    private final int numberYear;
    private String valueStrNumber;

    /**
     * Конструктор с параметрами
     *
     * @param numberYear число
     */
    public Date(int numberYear) {
        this.numberYear = numberYear;
    }

//+----------------------------------------------------------------------------+
//| Public methods (Публичные методы)                                          |
//+----------------------------------------------------------------------------+
    /**
     * Преобразует числа в строку
     */
    public void convertsNumberToString() {

        int digits = countDigits(numberYear);

        switch (digits) {

            case 0:
                valueStrNumber = "";
                break;

            case 1:
                valueStrNumber = oneDigit(numberYear);
                break;

            case 2:
                valueStrNumber = twoDigits(numberYear);
                break;

            case 3:
                valueStrNumber = threeDigits(numberYear);
                break;

            case 4:
                valueStrNumber = fourDigits(numberYear);
                break;

            default:
                valueStrNumber = "Нет данных";

        }

    }

    /**
     * Получить дату
     *
     * @return дата
     */
    public String getDate() {
        return valueStrNumber;
    }

//+----------------------------------------------------------------------------+
//| Private methods (Закрытые методы)                                          |
//+----------------------------------------------------------------------------+
    /**
     * Подсчет количество цифр в числе.
     *
     * @param number число
     * @return количество цифр
     */
    private int countDigits(int number) {

        int i = 0;

        if (number >= MIN_NUMBER_YEAR && number <= MAX_NUMBER_YEAR) {
            do {
                number /= 10;
                i++;
            } while (number != 0);
        } else {
            return -1;
        }
        return i;
    }

    /**
     * Возвращает однозначное число в строку
     *
     * @param number число
     * @return значение
     */
    private String oneDigit(int number) {

        String str = "no data";

        if (number >= 0 && number <= 9) {

            String[] strArrayStrings = {
                "нулевой", "первый", "второй", "третий", "четвертый", "пятый",
                "шестой", "седьмой", "восьмой", "девятый"
            };

            str = strArrayStrings[number];
        }
        return str;
    }

    /**
     * Возвращает двухзначное число в строку
     *
     * @param number число
     * @return значение
     */
    private String twoDigits(int number) {

        String str = "no data";

        if (number >= 10 && number <= 20) {

            String[] strArrayStrings = {
                "десятый", "одиннадцатый", "двенадцатый", "тринадцатый",
                "четырнадцатый", "пятнадцатый", "шестнадцатый", "семнадцатый",
                "восемнадцатый", "девятнадцатый", "двадцатый"
            };

            if (number >= 10 && number <= 19) {
                int buff = number % 10;
                str = strArrayStrings[buff];
            } else if (number == 20) {
                str = strArrayStrings[10];
            }

        } else if (number > 20 && number <= 99) {

            String[] strArrayStrings = {
                "двадцать", "тридцать", "сорок", "педисят", "шестьдесят",
                "семьдесят", "восемьдесят", "девяносто"
            };

            int buff1 = number / 10;
            int buff2 = number % 10;

            str = strArrayStrings[buff1 - 2] + " " + oneDigit(buff2);
        }
        return str;
    }

    /**
     * Возвращает трехзначное число в строку
     *
     * @param number число
     * @return значение
     */
    private String threeDigits(int number) {

        String str = "no data";

        if (number >= 100 && number <= 999) {
            String[] strArrayStrings = {
                "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                "семьсот", "восемьсот", "девятьсот"
            };

            int buff1 = number / 100;
            int buff2 = number % 100;

            str = strArrayStrings[buff1 - 1] + " " + twoDigits(buff2);
        }
        return str;
    }

    /**
     * Возвращает четырехзначное число в строку
     *
     * @param number число
     * @return значение
     */
    private String fourDigits(int number) {

        String str = "no data";

        if (number >= 1000 && number <= 5000) {
            String[] strArrayStrings = {
                "одна тысяча", "две тысячи", "три тысячи", "четыре тысячи",
                "пять тысяч"
            };

            int buff1 = number / 1000;
            int buff2 = number % 1000;

            str = strArrayStrings[buff1 - 1] + " " + threeDigits(buff2);
        }
        return str;
    }
}

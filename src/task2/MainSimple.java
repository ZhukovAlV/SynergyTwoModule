package task2;

public class MainSimple {

    // задание полей
    static double TelescopePrice = 14_000; // стоимость телескопа
    static double account = 1000; // счёт пользователя
    static double stipend = 2500; // стипендия
    static double percentBank = 5; // годовая процентная ставка на счету
    static double procentMonth = 5.0 / 12.0; // месячная процентная ставка на счету

    static double countMonth = 0;

    static String result = "";


    public static void main(String[] args) {
        System.out.println("Потребовалось " + countMonth() + " месяцев ");
        System.out.println("Осталось " + (account - TelescopePrice) + " монет ");
        System.out.println(result);
    }


    /**
     * Метод расчета количества месяцев
     * @return количество месяцев
     */
    static double countMonth() {

        while (TelescopePrice > account) {
            countMonth = countMonth + 1; // countMonth++;

            account = account + (account * procentMonth) / 100 + stipend;

            result = result + account + " монет ";
        }

/*        for (; TelescopePrice > account; ) {

            countMonth = countMonth + 1; // countMonth++;

            account = account + stipend;
        }*/


        return countMonth;
    }

}
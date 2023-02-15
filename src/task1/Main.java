package task1;

public class Main {

    public static void main(String[] args) {

        // запонение экрана
        if (possibility()) { // если имеется возможность купить серверный комплект
            System.out.println("Имеется достаточно средств для покупки серверного комплекта");
            System.out.println("Остаток от покупки " + balance() + " серебрянных монет");
        } else { // иначе
            System.out.println("Недостаточно средств для покупки серверного комплекта");
            System.out.println(" - ");
        }
    }

    // задание полей
    static float matPlat = 100; // материнская плата с процессором
    static byte matPlatDiscount = 45; // скидка (в процентах)
    static float ram = 41; // оперативная память
    static byte ramDiscount = 55;
    static float rom = 39; // SSD (постоянная память)
    static byte romDiscount = 30;
    static float cooler = 12; // башенный кулер
    static byte coolerDiscount = 25;
    static float caseAndPower = 21; // корпус и блок питания
    static byte caseAndPowerDiscount = 32;
    static float account = 160; // счёт пользователя

    // метод подсчёта стоимости серверного комплекта
    private static float calculation() {
        // создание и инициализация переменной подсчёта стоимости
        float count = (matPlat * (100 - matPlatDiscount) + ram * (100 - ramDiscount)
                + rom * (100 - romDiscount) + cooler * (100 - coolerDiscount)
                + caseAndPower * (100 - caseAndPowerDiscount)) / 100;
        return count; // возврат подсчитанного значения
    }

    // метод определения возможностей бюджета покупки серверного комплекта
    private static boolean possibility() {
        if (calculation() <= account) { // если стоимость комплекта меньше имеющихся средств
            return true; // то возврат истинного значения
        } else { // иначе
            return false; // возврат ложного значения
        }
    }

    // метод определения возможной сдачи
    private static float balance() {
        if(possibility()) { // если имеется возможность купить серверный комплект
            return account - calculation(); // то возвращается остаток от покупки
        } else { // иначе
            return -1; // возвращается маркер недостатка денежных средств
        }
    }


}

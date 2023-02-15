package task4;

public class Main {

    public static void main(String[] args) {

        // Номер билета
        int numTicket = 123456;

        if (Algorithm.checkTicket(numTicket)) System.out.println("Билет счастливый");
            else {
                System.out.println("Билет НЕ счастливый");

                System.out.println("Ближайший счастливый билет: " + Algorithm.getLuckyTicket(numTicket));
        }
    }

}
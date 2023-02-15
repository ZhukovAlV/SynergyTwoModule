package task3;

public class Main {

    public static void main(String[] args) {

        Bill bill1 = new Bill();
        bill1.count = 9;
        bill1.discount = Discount.DEFAULT_TICKET;
        bill1.ticket = new Ticket(70);

        Bill bill2 = new Bill();
        bill2.count = 11;
        bill2.discount = Discount.CHILD_TICKET;
        bill2.ticket = new Ticket(70);


        Bill bill3 = new Bill();
        bill3.count = 5;
        bill3.discount = Discount.OLDER_TICKET;
        bill3.ticket = new Ticket(70);


        System.out.println("Общая стоимоть билетов: " + (Calculation.getAllSumm(bill1) + Calculation.getAllSumm(bill2) + Calculation.getAllSumm(bill3)));
    }
}
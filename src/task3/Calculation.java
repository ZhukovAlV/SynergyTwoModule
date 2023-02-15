package task3;

public class Calculation {

    /**
     * Возращает стоимость всех билетов из счет
     * @param bill счет
     * @return сумма
     */
    public static double getAllSumm(Bill bill) {
       return bill.count * (bill.ticket.ticketPrice - (bill.ticket.ticketPrice * bill.discount.persent / 100));
    }
}

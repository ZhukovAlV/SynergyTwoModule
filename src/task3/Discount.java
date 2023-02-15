package task3;

public enum Discount {

    DEFAULT_TICKET(0),
    CHILD_TICKET(50),
    OLDER_TICKET(30);

    int persent;

    Discount(int persent) {
        this.persent = persent;
    }

}

package awards_package;

public class Award {

    private final int value;

    static {
        System.out.println("Award is initialized");
    }

    public Award(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

}

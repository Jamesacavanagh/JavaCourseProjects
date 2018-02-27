package awards_package;

public class Award {

    private final int value;

    private Float soli;

    public Award(int value) {
        this.value = value;
    }

    public Award(int value, Float soli) {
        this.value = value;
        this.soli = soli;
    }

    public int getValue() {
        return this.value;
    }

    public Float getSoli() {
        return soli;
    }

    public void setSoli(Float soli) {
        this.soli = soli;
    }
}

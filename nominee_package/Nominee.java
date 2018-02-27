package nominee_package;

import awards_package.Award;

public class Nominee {

    private String name;

    static {
        System.out.println("Nominee is initialized");
    }

    public Nominee (String name) {
        this.name = name;
    }

    public void recieveAward(Award award) {
        System.out.println(award.getValue());
    }

    public String getName() {
        return name;
    }
}
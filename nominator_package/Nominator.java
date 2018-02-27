package nominator_package;

import awards_package.Award;
import nominee_package.Nominee;

public class Nominator {
    private String name;

    static {
        System.out.println("Nominator is initialized");
    }

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Award award, Nominee nominee){
        System.out.println(nominee.getName() + award.getValue());
        nominee.recieveAward(award);
    }
}

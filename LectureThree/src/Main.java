import awards_package.Award;
import nominee_package.Nominee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Award award1 = new Award(100, 1f);
        Award award2 = new Award(200);
        Award award3 = new Award(300, 3f);
        Award award4 = new Award(400);
        Award award5 = new Award(500, 5f);
        Award award6 = new Award(600);

        Nominee nominee = new Nominee("James");

        List<Award> awards = new ArrayList<Award>();
        awards.add(award1);
        awards.add(award2);
        awards.add(award3);
        awards.add(award4);
        awards.add(award5);
        awards.add(award6);

        List<Float> awardQuantity = nominee.receiveAward(awards);
        nominee.compareAwardsQuantity(awardQuantity);

    }
}

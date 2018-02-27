import awards_package.Award;
import nominator_package.Nominator;
import nominee_package.Nominee;

public class Main {

    public static void main(String[] args) {

        Award award = new Award(100);
        Nominee nominee = new Nominee("James");
        nominee.setAwardAmountLimit(500f);
        nominee.setAwardQuantityLimit(1);
        Nominator nominator = new Nominator("Vinod");
        nominator.setAwardAmountLimit(500f);
        nominator.setAwardQuantityLimit(5);

        for (int i = 0; i< 6; i++){ // no of iteration is a user input and can be changed.
            if(!nominator.nominate(award,nominee) || !nominee.receiveAward(award)){
                break;
            }
        }
    }
}

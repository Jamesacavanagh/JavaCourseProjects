import awards_package.Award;
import nominator_package.Nominator;
import nominee_package.Nominee;

public class Main {

    public static void main(String[] args) {

        Award award = new Award(50);
        Nominee nominee = new Nominee("James");
        Nominator nominator = new Nominator("Vinod");

        nominator.nominate(award,nominee);

    }
}

package nominee_package;

import awards_package.Award;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nominee {

    private String name;
    private float amountOfAwardsReceivedWithoutSoli;
    private List<Float> awardsQuantity = new ArrayList<Float>();

    public Nominee(String name) {
        this.name = name;
    }

    public List<Float> receiveAward(List<Award> awards) {
        for (Award award :
                awards) {
            if(award.getSoli()!=null){
                float newAwardValue = award.getValue()*award.getSoli()/100;
                float differenceBetweenAwardValue = newAwardValue-award.getValue();
                float percentageDifferenceAwardValue = differenceBetweenAwardValue/award.getValue()*100;
                System.out.println(percentageDifferenceAwardValue + "% difference from applying SOLI = " + award.getSoli());

                Random generator = new Random();
                int P = award.getValue();
                int C = generator.nextInt() / 100;
                int Z = generator.nextInt();
                awardsQuantity.add(((Z ^ 2 * (P) * (1 - P)) / (C ^ 2)) / (1 + ((((Z ^ 2 * (P) * (1 - P)) / (C ^ 2)) - 1) / amountOfAwardsReceivedWithoutSoli)));
            }else{
                System.out.println("No SOLI provided, so showing the original award Value = " + award.getValue());
                amountOfAwardsReceivedWithoutSoli += 1;
            }
        }
        return awardsQuantity;
    }

    public void compareAwardsQuantity(List<Float> awardsQuantity){
        for (int i = 0; i<awardsQuantity.size()-1;i++){
            System.out.println("Quantity for award = " + awardsQuantity.get(i));
            if(awardsQuantity.get(i) < awardsQuantity.get(i+1)){
                System.out.println("quantity of " + this.getName() + "'s award " + i + " is less than the quantity of " + this.getName() + "'s award " + (i+1));
            } else if (awardsQuantity.get(i) > awardsQuantity.get(i+1)){
                System.out.println("quantity of " + this.getName() + "'s award " + i + " is greater than the quantity of " + this.getName() + "'s award " + (i+1));
            } else if (awardsQuantity.get(i) == awardsQuantity.get(i+1)){
                System.out.println("quantity of " + this.getName() + "'s award " + i + " is equal to the quantity of " + this.getName() + "'s award " + (i+1));
            }
        }
    }

    public String getName() {
        return name;
    }

    public float getAmountOfAwardsReceivedWithoutSoli() {
        return amountOfAwardsReceivedWithoutSoli;
    }

}
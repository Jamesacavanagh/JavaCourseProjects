package nominator_package;

import awards_package.Award;
import nominee_package.Nominee;
import util.NominationHelper;

public class Nominator {
    private String name;
    private int awardQuantityLimit;
    private float awardAmountLimit;
    private float amountOfAwardsGiven;

    public Nominator(String name) {
        this.name = name;
    }

    public boolean nominate(Award award, Nominee nominee) {
        if (NominationHelper.checkQuantityLimit(this.getAwardQuantityLimit())) {
            if (NominationHelper.checkAmountLimit(this.getAwardAmountLimit(), this.getAmountOfAwardsGiven(), award.getValue())) {
                this.setAwardQuantityLimit(this.getAwardQuantityLimit() - 1);
                this.setAmountOfAwardsGiven(this.getAmountOfAwardsGiven() + award.getValue());
                return true;
            } else {
                System.out.println("Nominator amount Limit failed");
            }
        } else {
            System.out.println("Nominator quantity Limit failed");
        }
        System.out.println(nominee.getName() + " has received total amount of award for " + nominee.getAmountOfAwardsReceived());
        return false;
    }

    public int getAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    public void setAwardQuantityLimit(int awardQuantityLimit) {
        this.awardQuantityLimit = awardQuantityLimit;
    }

    public float getAwardAmountLimit() {
        return awardAmountLimit;
    }

    public void setAwardAmountLimit(float awardAmountLimit) {
        this.awardAmountLimit = awardAmountLimit;
    }

    public float getAmountOfAwardsGiven() {
        return amountOfAwardsGiven;
    }

    public void setAmountOfAwardsGiven(float amountOfAwardsGiven) {
        this.amountOfAwardsGiven = amountOfAwardsGiven;
    }
}

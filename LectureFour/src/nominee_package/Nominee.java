package nominee_package;

import awards_package.Award;
import util.NominationHelper;

public class Nominee {

    private String name;
    private int awardQuantityLimit;
    private float awardAmountLimit;
    private float amountOfAwardsReceived;

    public Nominee(String name) {
        this.name = name;
    }

    public boolean receiveAward(Award award) {
        if (NominationHelper.checkQuantityLimit(this.getAwardQuantityLimit())) {
            if (NominationHelper.checkAmountLimit(this.getAwardAmountLimit(), this.getAmountOfAwardsReceived(), award.getValue())) {
                this.setAwardQuantityLimit(this.getAwardQuantityLimit() - 1);
                this.setAmountOfAwardsReceived(this.getAmountOfAwardsReceived() + award.getValue());
                return true;
            } else {
                System.out.println("Nominator amount Limit failed");
            }
        } else {
            System.out.println("Nominator quantity Limit failed");
        }
        System.out.println(this.getName() + " has received total amount of award for " + this.getAmountOfAwardsReceived());
        return false;
    }

    public String getName() {
        return name;
    }

    public float getAmountOfAwardsReceived() {
        return amountOfAwardsReceived;
    }

    public void setAmountOfAwardsReceived(float amountOfAwardsReceived) {
        this.amountOfAwardsReceived = amountOfAwardsReceived;
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
}
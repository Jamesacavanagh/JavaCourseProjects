package util;

public class NominationHelper {

    public static boolean checkQuantityLimit(int quantityLimit){
        return quantityLimit > 0;
    }

    public static boolean checkAmountLimit(float amountLimit,float amountOfAward, int awardValue){
        return amountOfAward < amountLimit && awardValue <= amountLimit;
    }

}

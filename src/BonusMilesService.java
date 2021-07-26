public class BonusMilesService {
    public int calculate(int price) {
        int milesAmount = price / 20;
        System.out.println(milesAmount);
        return milesAmount;
    }
}

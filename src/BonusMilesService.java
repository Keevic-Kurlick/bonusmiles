public class BonusMilesService {
    public static int calculate (int cost) {
        int miles = 0;

        if (cost >= 20) {
            miles = cost / 20;
        }

        return miles;
    }
}
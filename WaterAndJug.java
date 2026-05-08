public class WaterAndJug {

    public static boolean canMeasureWater(int x, int y, int target) {
        if (target > x + y) return false;
        if (target == 0) return true;
        return target % gcd(x, y) == 0;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(canMeasureWater(3, 5, 4));  // true
        System.out.println(canMeasureWater(2, 6, 5));  // false
        System.out.println(canMeasureWater(1, 2, 3));  // true
    }
}

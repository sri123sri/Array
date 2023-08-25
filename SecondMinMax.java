import java.util.*;

public class SecondMinMax {
    public static int[] findSecondMinMax(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        return new int[] { secondMax, secondMin };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 6, 3, 8, 9 };

        int[] result = findSecondMinMax(arr);
        System.out.println(Arrays.toString(result));
    }
}

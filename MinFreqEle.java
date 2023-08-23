import java.util.Scanner;

public class MinFreqEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] visited = new int[size];
        int minFreq = Integer.MAX_VALUE; // to store the minimum frequency
        int minFreqElement = array[0]; // to store the element with minimum frequency

        for (int i = 0; i < size; i++) {
            if (visited[i] == 1) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    visited[j] = 1;
                    count++;
                }
            }

            if (count < minFreq) {
                minFreq = count;
                minFreqElement = array[i];
            }
        }

        System.out.println("Element " + minFreqElement + " occurs minimum times: " + minFreq + " times");
    }
}

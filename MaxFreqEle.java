import java.util.Scanner;

public class MaxFreqEle {
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
        int maxFreq = -1; // to store the maximum frequency
        int maxFreqElement = array[0]; // to store the element with maximum frequency

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

            if (count > maxFreq) {
                maxFreq = count;
                maxFreqElement = array[i];
            }
        }

        System.out.println("Element " + maxFreqElement + " occurs maximum times: " + maxFreq + " times");
    }
}

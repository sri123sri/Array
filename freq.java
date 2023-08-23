import java.util.Scanner;

public class freq5 {
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
            
            System.out.println(array[i] + ":" + count);
        }
    }
}

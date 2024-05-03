import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Array[] = new int[6];
        System.out.println("Enter the Array");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        System.out.println("Input Array is ---");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("\nEnter the key to search: ");
        int key = sc.nextInt();

        String search_result = "Key not found";
        int match_index = -1;
        int start = 0;
        int end = Array.length - 1;
        while (start <= end) { // Changed condition to <=
            int mid = (start + end) / 2; // Corrected calculation of mid
            if (Array[mid] == key) {
                match_index = mid; // Update match_index when key is found
                break; // Exit the loop when key is found
            } else if (key < Array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(match_index < 0 ? search_result : "Key found at index " + match_index);
    }
}

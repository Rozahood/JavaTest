import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter multiple numbers: ");
        String[] numArray = input.nextLine().split(" ");


        int[] numList = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numList[i] = Integer.parseInt(numArray[i]);
        }

        int largest = numList[0];
        int secondLargest = numList[0];

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > largest) {
                secondLargest = largest;
                largest = numList[i];
            } else if (numList[i] > secondLargest && numList[i] != largest) {
                secondLargest = numList[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}

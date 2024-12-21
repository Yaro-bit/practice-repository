//Rating: 9/10 points
//    -0.5: Loops should iterate from 100 to 999 for efficiency.
//    -0.5: Minor readability issues (e.g., rename prod to product, use {} for clarity).


package FirstStepsRecoding;

public class Palindrome {
    public static void main(String[] args) {
        int largestPalindrome = 0;  // To keep track of the largest palindrome found

        for (int x = 1; x < 999; x++) {
            for (int y = 1; y < 999; y++) {
                int prod = x * y;

                // Calculate the reverse of the product
                int reversedNum = 0;
                int num = prod;

                while (num != 0) {
                    reversedNum = reversedNum * 10 + num % 10;
                    num = num / 10;
                }

                // Check if the product is a palindrome
                if (prod == reversedNum) {
                    if (prod > largestPalindrome) {
                        largestPalindrome = prod;  // Update largest palindrome
                    }
                }
            }
        }
        
        System.out.println("The largest palindrome is: " + largestPalindrome);
    }
}

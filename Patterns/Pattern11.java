/* Program for printing this pattern 
  1
  01
  101
  0101
  10101
  */
class Main {
    public static void main(String[] args) {
    int n =5;
    int temp =1;
    for(int i=0; i<n; i++) {
        if (i % 2 == 0)  {
            temp=1;
        } else temp = 0;
        for (int j =0; j<=i;j++) {
            System.out.print(temp);
            temp = 1-temp;   //stores temp value for each loop
        }
        System.out.println();
    }
    }
}
//Another code it also does the same thing
/* class Main {
    public static void main(String[] args) {
        int n = 5;  // Total number of rows

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for characters in the current row
            for (int j = 0; j <= i; j++) {
                // Determine the character to print based on row and column indices
                if ((i + j) % 2 == 0) {
                    System.out.print("1");  // Print '1' for even sum of indices
                } else {
                    System.out.print("0");  // Print '0' for odd sum of indices
                }
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}
*/

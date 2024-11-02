/* Program for printing this pattern 
*
**
***
****
*****
****
***
**
*
*/
class Pattern10 {
    public static void main(String[] args) {
        int n = 9;
        for (int i =0; i<n; i++) {
            if (i<=4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if (i>4) {
                for (int j = 0; j<n-i; j++) {
                    System.out.print("*");
                }
             }
            System.out.println();
        }
    }
}


/* Program for printing th patten
    *    
   ***   
  *****  
 ******* 
*********
  */
class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i =0; i<5; i++) {
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0;k<2*i+1; k++){
                System.out.print("*");
            }
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
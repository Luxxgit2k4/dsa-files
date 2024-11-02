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

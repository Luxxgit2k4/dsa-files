class Bubblesort {
    public static void main(String[] args) {
        int kumar[] = {27,33,77,2,234,0,4};
        int temp;
        System.out.println("Before sorting");
        for (int num : kumar)  {
            System.out.print(num + " ");
        }

        for (int i=0; i< kumar.length; i++) {
            for (int j=0; j< kumar.length-i-1; j++) {
                if(kumar[j] > kumar[j+1]) {
                    temp = kumar[j];
                    kumar[j] = kumar[j+1];
                    kumar[j+1] = temp;
                }
                }
            }
        System.out.println(" \n" + "After sorting");
          for (int num : kumar)  {
            System.out.print(num + " ");
          } }
}


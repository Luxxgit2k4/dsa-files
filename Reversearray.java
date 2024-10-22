class Reversearray {
    public static void main(String[] args) {
        int arr[] ={2,12,45,6,7};
        int temp = 0;
        int j= arr.length-1;
System.out.println("Before reversing");
        for (int num : arr)  {
            System.out.print(num + " ");
        }
        for(int i=0;i<j;i++) {
            temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j--;
        }
        System.out.println("\nAfter reversing");
        for (int num : arr)  {
            System.out.print(num + " ");
        }
        }
}

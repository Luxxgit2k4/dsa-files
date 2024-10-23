class Binarysearch {
    public static void main(String[] args) {
        int arr[] ={2,12,15,46,77,88,98,112};
        int target = 12, low=0, high= arr.length-1;
        System.out.println(high);
        while(low<=high)  {
            int mid = (low+high)/2; // mid=46
            if(arr[mid] == target) {
                System.out.println("Element found " +mid);
                break;
            } else if (arr[mid] < target) {
                low = mid+1; //low=1
            } else {
                high = mid -1; //high=1
            }
        }
          for (int i=arr.length-1; i>=0; i--) {
              System.out.print(" " + arr[i]);
          }
    }
}

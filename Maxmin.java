//program to find maximum and minimum element in an array
public class Maxmin {
    public void kumar() {
        int arr[] = {12899, 46, 59, 3455, 24};
        int maximum = arr[0];
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i]; }
        }
        System.out.println("Largest number is " + maximum);
        System.out.println("Smallest number is " + minimum);
    }
    public static void main(String[] args) {
     Main myobj = new Main();
     myobj.kumar();
    }
}

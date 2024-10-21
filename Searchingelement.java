// This is an example of linear search in an array to search an element and return its index
public class Searchingelement {
    public static void main(String[] args) {
        int[] kumar = {1, 5, 7, 8, 4, 9};
        int search = 9;
        int result = linearsearch(kumar, search);
        if(result != -1)
            System.out.println("Gotha element found at Index: " + result);
        else
            System.out.println("Element not found");
    }
public static int linearsearch(int[] kumar, int search) {
        for(int i=0;i< kumar.length; i++) {
            if(kumar[i] == search)
                return i;
    }
        return -1;
}
}

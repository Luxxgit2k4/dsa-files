//Program to find no of times an element occuring in an array using hashmap
import java.util.*;
import java.lang.*;
import java.io.*;

class Frequencycount
{
    public static void count(String arr[]) {
        LinkedHashMap<String, Integer> kumar = new LinkedHashMap<>();
        for (int i=0; i< arr.length; i++) {
            if (kumar.containsKey(arr[i])) {
                kumar.put(arr[i], kumar.get(arr[i]) +1);
            } else {
                kumar.put(arr[i],1);
            }
        }
        for (Map.Entry<String, Integer> entry : kumar.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main (String[] args)
    {
        // your code goes here
        String arr[] = {"Apple", "Grapes", "Apple", "Orange", "Grapes"};
        count(arr);

    }
}

// program to check whether an array is sorted or not 
class Checksortedarray {
    static boolean kumar() {
        int koomar[] = {2, 12, 68, 45, 12};
        for (int i = 1; i < koomar.length; i++) {
            if (koomar[i] < koomar[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(kumar());
    }
}

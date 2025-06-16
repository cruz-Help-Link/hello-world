public class ArrayLoop {   //CLASS
    public static void main(String[] args){  //MAIN METHOD
        int[] age = {23, 34, 71, 12, 17};  //--?
        int size = age.length();   //5
        int[] arr = new int[5];  // ONLY 5 VALUES
        arr[0] = 23;
        arr[1] = 31;
        arr[2] = 12;
        arr[3] = 41;
        arr[4] = 22;
        // FOR LOOP
        for (int i = 0; i <= 4 ; i++) {
            System.out.println(arr[i]);
        }
        String[] values = {"names", "first", "image", "dolphins", "sharks", "water"};


        // FOR EACH
        for (String n : values) {
            System.out.println(n);
            
        }
    }
}

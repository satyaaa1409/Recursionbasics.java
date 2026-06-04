public class recursion {

    static void printNum(int n) {
        // printing number from 9 to 1 using recursion i.e. from N to 1.

        if (n ==0) {  
            return;
        }

        System.out.println(n);

        printNum(n - 1);  
    }

    public static void main(String[] args) {
        printNum(9);
    }
}
    


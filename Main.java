public class Main {

    static void printNum(int n) {
         //printing number from 1 to 14 using recursion i.e. from 1 to N.
        if (n > 14) {  
            return;
        }

        System.out.println(n);

        printNum(n + 1);  
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
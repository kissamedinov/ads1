import java.util.Scanner;
public class main {
    public static Scanner sc = new Scanner(System.in);

    public static int printMin(int n , int z) {// complexity O(n)
        if(n == 0){
            return z;
        }
        int a = sc.nextInt();
        if(a < z){
            z = a;
        }
        return printMin(n-1, z);
    }

    private static double printAverage(int n , double sum , int sz) {// complexity O(n)
        if(n == 0){
            return sum / sz;
        }
        int a = sc.nextInt();
        sum += a;
        return printAverage(n-1, sum , sz);

    }


    public static double printAverage(int n) {// complexity O(n)
        int sum = 0;
        int sz = n;
        return printAverage(n, sum , sz);
    }

    private static boolean isPrime(int n , int lim , int i) {// complexity O(sqrt(n))
        if(n == 1){
            return false;
        }
        if(i > lim){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        return isPrime(n, lim, i+1);
    }

    public static String isPrime(int n) {
        if(n == 1){
            return "Composite";
        }
        return isPrime(n, (int)Math.sqrt(n), 2)? "Prime" : "Composite";
    }

    public static int factorialOfN(int n) {// complexity O(n)
        if(n == 1){
            return 1;
        }

        return n * factorialOfN(n-1);
    }


    public static int fibonacci(int number) {// complexity O(2^n)
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number - 2) + fibonacci(number - 1);
    }


    private static int nPowerM(int n , int k , int answer) {// complexity O(m)
        if(k == 0){
            return answer;
        }
        answer *= n;

        return nPowerM(n, k-1, answer);
    }

    public static int nPowerM(int n , int m){// complexity O(m)
        int ans = 1;
        return nPowerM(n, m, ans);
    }


    public static String swap(String str, int i, int k) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(k));
        sb.setCharAt(k, str.charAt(i));
        return sb.toString();
    }
    private static void allPermOfString(String s , int i) {// complexity O(n!)
        if(i == s.length()){
            System.out.println(s);
            return;
        }

        for(int j=i;j<s.length();j++){
            s = swap(s, i, j);
            allPermOfString(s, i+1);
            s = swap(s, i, j);
        }

    }

    public static void allPermOfString(String s) {// complexity O(n!)
        allPermOfString(s, 0);
    }


    private static boolean isOnlyDigit(String s , int i){
        if(i == s.length()){
            return true;
        }

        if(s.charAt(i) < '0' || s.charAt(i) > '9'){
            return false;
        }

        return isOnlyDigit(s, i+1);

    }

    public static String isOnlyDigit(String s) {
        return isOnlyDigit(s, 0)? "Yes" : "No";
    }


    public static int binomCoefficient(int n ,  int m) {// complexity O(n)
        if(m == 0 || m == n){
            return 1;
        }

        return binomCoefficient(n-1, m-1) + binomCoefficient(n-1, m);
    }

    public static int GCDrec(int n , int m) {// complexity O(log(n))
        if(m == 0){
            return n;
        }

        return GCDrec(m, n % m);
    }




    public static void task1() {
        int n = sc.nextInt();
        System.out.println(printMin(n, Integer.MAX_VALUE));
    }

    public static void task2() {
        int n = sc.nextInt();
        System.out.println(printAverage(n));
    }

    public static void task3() {
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static void task4() {
        int n = sc.nextInt();
        System.out.println(factorialOfN(n));
    }

    public static void task5() {
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }


    public static void task6() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(nPowerM(n, m));
    }

    public static void task7() {
        String s = sc.next();
        allPermOfString(s);
    }

    public static void task8() {
        String s = sc.next();
        System.out.println(isOnlyDigit(s));
    }

    public static void task9() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomCoefficient(n, k));
    }

    public static void task10() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(GCDrec(n, m));
    }

    public static void main(String[] args) {

        task5();

    }

}
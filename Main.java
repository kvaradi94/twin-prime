public class Main {

    public static boolean isPrime(int number) {
        //for (int i = 2; i <= Math.sqrt(number); i++) { //much faster
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //long startTime = System.nanoTime();
        //twin primes under 100
        //long counter = 0;
        for (int i = 3; i < 1000000; i++) {
            //checking two prime numbers, B-A = 2
            if(isPrime(i) && isPrime(i+2)) {
                int k = i+2;
                System.out.println(i + "-" + k);
                //counter++;
            }
        }
        //long endTime = System.nanoTime();
        //long duration = (endTime - startTime);
        //System.out.println(counter);
        //System.out.println(duration/1000000000d);
    }
}

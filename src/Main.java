public class Main {
    public static int find_minimum(int[] m, int i) {
        if (i == m.length - 1) {
            return m[i];
        }
        return Math.min(m[i], find_minimum(m, i + 1));
    }
    public static double find_average(int[] m, int i, int sum) {
        if (i == m.length) {
            return (double) sum / m.length;
        }

        return find_average(m, i + 1, sum + m[i]);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            return isPrimeHelper(n, 5);
        }
    }

        private static boolean isPrimeHelper(int n, int divisor) {
            if (divisor * divisor > n) {
                return true;
            } else if (n % divisor == 0) {
                return false;
            } else {
                return isPrimeHelper(n, divisor + 2);
            }
        }

    public static void main(String[] args) {
        int[] m = {10,1,32,3,45};
        int min = find_minimum(m, 0);
        double avg = find_average(m, 0, 0);
        System.out.println("1 task " + min);
        System.out.println("2 task" + avg);
        int number = 11;
        boolean isPrime = isPrime(number);
        System.out.print("3 task");
        System.out.println(isPrime ? "Prime" : "Composite");
    }
}

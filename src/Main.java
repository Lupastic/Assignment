public class Main {
    public static int find_minimum(int[] m, int index) {
        if (index == m.length - 1) {
            return m[index];
        }
        return Math.min(m[index], find_minimum(m, index + 1));
    }
    public static double find_average(int[] m, int index, int sum) {
        if (index == m.length) {
            return (double) sum / m.length;
        }

        return find_average(m, index + 1, sum + m[index]);
    }
    public static boolean is_prime(int n){
        if (n%2==1){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] m = {10,1,32,3,45};
        int min = find_minimum(m, 0);
        double avg = find_average(m, 0, 0);
        System.out.println("1 task " + min);
        System.out.println("2 task" + avg);

    }
}

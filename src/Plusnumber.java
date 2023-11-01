public class Plusnumber {
    public static void main(String[] args) {

        int num = 10, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum 1-10 = " + sum);
    }
}
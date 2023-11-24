package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        int temp = Math.abs(t);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(sum);
    }
}

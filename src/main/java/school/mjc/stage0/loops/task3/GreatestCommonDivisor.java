package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
            return;
        } else if (second == 0) {
            System.out.println(first);
            return;
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        System.out.println(first);
    }
}

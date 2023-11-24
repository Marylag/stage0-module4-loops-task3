package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = Math.min(firstBoarder, secondBoarder); i <= Math.max(firstBoarder, secondBoarder); i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

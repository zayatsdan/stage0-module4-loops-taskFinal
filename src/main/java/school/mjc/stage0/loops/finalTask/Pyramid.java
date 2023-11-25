package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int counterClock = 1;
        for (int counterY = 1; counterY <= cathetusLength; counterY++) {
            for (int empty1 = 2 * cathetusLength - 1 - counterClock; empty1 > 0; empty1--, empty1--) {
                System.out.print(" ");
            }
            for (int numberA = counterY; numberA > 0; numberA--) {
                System.out.print(numberA);
            }
            for (int numberB = 2; numberB <= counterY; numberB++) {
                System.out.print(numberB);
            }

            for (int empty1 = 2 * cathetusLength - 1 - counterClock; empty1 > 0; empty1--, empty1--) {
                System.out.print(" ");
            }
            System.out.println();
            counterClock++;
            counterClock++;
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

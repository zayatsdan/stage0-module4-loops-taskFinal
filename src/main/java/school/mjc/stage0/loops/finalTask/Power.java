package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int printed=numberToPrint;
        if(power==0){
            System.out.println(0);
        }else {
            while (power > 1) {
                printed = printed * numberToPrint;
                power--;
            }
            System.out.println(printed);
        }
        }

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for( int counterY=0;counterY<cathetusLength;counterY++){
            for(int empty=0;empty<cathetusLength-counterY-1;empty++){
                System.out.print(" ");
            }
            for (int counterX=0;counterX<counterY+1;counterX++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

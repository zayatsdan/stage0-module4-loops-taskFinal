package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        
             for (int counter=0;counter<10;counter++){
                 System.out.println((counter+1)+" x "+numberTableToPrint+" = "+numberTableToPrint*(counter+1));
             }
         
    }
}

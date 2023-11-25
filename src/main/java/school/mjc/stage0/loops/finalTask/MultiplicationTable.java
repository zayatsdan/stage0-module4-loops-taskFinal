package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if(numberTableToPrint<=0){
         }else {
             for (int counter=0;counter<10;counter++){
                 System.out.println(numberTableToPrint+"*"+(counter+1)+"="+numberTableToPrint*(counter+1));
             }
         }
    }
}

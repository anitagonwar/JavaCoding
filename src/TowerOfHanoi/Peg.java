package TowerOfHanoi;

import java.util.Stack;
import java.util.*;

public class Peg {
	 Stack<Disk> disks = new Stack<Disk>();
     private int pegOrder;
     private int maxNumOfDisks = 0;
     private int currentNumOfDisks = 0;
     private String pegName;

     /**
      * Constractor of Peg
      * @param pegOrder indicates ordinal of the Peg
      * @param maxNumOfDisks indicates max number of disks in this game
      *
      */
     public Peg(int pegOrder, int maxNumOfDisks ){

         // Set peg's order
         this.pegOrder = pegOrder;

         // Set num of Disks
         this.maxNumOfDisks = maxNumOfDisks; 

         // Set peg's name
         TOHConstants.PegName [] pegNameValues = TOHConstants.PegName.values();
         for(int i=0; i<TowerOfHanoi.getNumberOfDisks(); i++){  
             if(pegNameValues[i].ordinal() == pegOrder){
                 pegName = pegNameValues[i].toString();
             }
         }

     }

     /**
      * 
      * push Disk into this Peg
      * @param disk push this disk
      * @throws Exception
      */
     public void pushDisk(Disk disk) throws Exception {
         if(currentNumOfDisks >= maxNumOfDisks){
             throw new Exception("Incorrect Number of Disks pushed");
         }
         currentNumOfDisks++;
         disks.push(disk);
     }

     /**
      * pop the disk
      * 
      * @return Disk
      * @throws Exception
      */
     public Disk popDisk() throws Exception {
         if(disks.empty()){
             throw new Exception("Incorrect Number of Disks poped");
         }
         currentNumOfDisks--;
         return disks.pop();
     }

     /**
      * get Peg name
      * 
      * @return string name of Peg
      * @throws Exception
      */
     public String getPegName() {
         return pegName;
     }

     /**
      * print Peg Information
      * @return string of the Peg informaion
      * @throws Exception
      */
     public String printPeg() throws Exception {

         int diskSize;
         String strDisks = "";
         Disk oneDisk;
         Stack<Disk> tempDisk = new Stack<Disk>();

         // print out disks of the peg 
         while(!disks.empty()){
             oneDisk = popDisk();
             diskSize = oneDisk.getSize() + 1;
             tempDisk.push(oneDisk);
             strDisks = diskSize + " " + strDisks;
         }
         System.out.printf("%-20s", strDisks);

         // restore disk of the peg 
         while(!tempDisk.empty()){
             pushDisk(tempDisk.pop());
         }
         return strDisks;
     }
}

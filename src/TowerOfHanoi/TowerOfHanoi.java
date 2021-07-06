package TowerOfHanoi;

public class TowerOfHanoi {

    private int numOfDisk = Integer.MIN_VALUE;
    private Peg [] pegs;
    /**
     *
     * Constructor of TowerofHanoi Class 
     *  @param takes number of disks by int less than equal to 9
     *  @throws Exception
     *
     */
    public TowerOfHanoi(int numOfDisk) throws Exception {

        this.numOfDisk = numOfDisk; // set Class variable

        pegs  = new Peg[TOHConstants.NUM_OF_PEG]; // make Peg
        for(int i=0; i<TOHConstants.NUM_OF_PEG; i++){  
            pegs[i] = new Peg(i, numOfDisk);
        }

        for(int i=numOfDisk-1; i>=0; i--){  // set size of each disks
            pegs[TOHConstants.PegName.A.ordinal()].pushDisk( new Disk(i) );
        }

    }

    /**
     *
     * Move all disks from source to target peg, this is a interface, wrapper method
     * of doPerform, which actually takes arguments needed.
     *  @throws Exception
     *
     */
    public void perform() throws Exception {
        System.out.printf("%-15s        %-60s\n", "Move", "Peg Configuration");
        System.out.printf("        %-15s%-20s%-20s%-20s\n", "", "A", "B", "C");
        printTower("init");

        // process all disks
        doPerform(numOfDisk, TOHConstants.PegName.A.ordinal(),   // From
        					TOHConstants.PegName.C.ordinal(),   // To 
        					TOHConstants.PegName.B.ordinal());  // Util
    }

    /**
     *
     * Move all disks from source to target peg.
     * @param diskNum indicates number to disks
     * @param fromPeg indicates source peg
     * @param toPeg   indicates target peg
     * @param tempPeg indicates utility peg
     * @throws Exception
     *
     */
    public void doPerform(int diskNum, int fromPeg, int toPeg, int tempPeg)
                                                             throws Exception {
        Disk tempDisk;
        // Move disks recursively
        if(diskNum > 0){

            // Move disks from first disk to n-1 th disk of original Peg into 
            // utility Peg
            doPerform(diskNum-1,fromPeg,tempPeg,toPeg);

            // Move a disk, and print out the status of Tower
            tempDisk = pegs[fromPeg].popDisk();
            pegs[toPeg].pushDisk( tempDisk );
            printTower((tempDisk.getSize() + 1) + " from " + 
                                   pegs[fromPeg].getPegName() + 
                                       " to " + pegs[toPeg].getPegName());

            // Move disks from first disk to n-1 th disk of utility Peg 
            // into target Peg
            doPerform(diskNum-1,tempPeg,toPeg,fromPeg);
        }
    }

    /**
     * 
     * Print the status of Tower
     * @param str is string to print
     * @throws Exception
     *
     */
    private void printTower(String str) throws Exception {

        // print out the status of tower
        printTowerMove(str);

        // print out the Peg Configuration
        printTowerPeg();

    }
    
    /**
     *
     * Print the move of tower
     * @param str is movement informaiton 
     *
     */
    private void printTowerMove(String str){
        System.out.printf("%-15s        ", str);
    }

    /**
     *
     * Print the Peg configuration of tower
     * @throws Exception
     */
    private void printTowerPeg() throws Exception {
        for(int i=0; i<TOHConstants.NUM_OF_PEG; i++){  
            pegs[i].printPeg();
        }
        System.out.println("");
    }

    /**
     *
     * Print the help info
     */
    public static void printHelp(){
        System.out.println(
                "#####################################################\n\n" +
                "Usage: TowerofHanoi num\n number must be less than 10\n\n" +
                "#####################################################\n");
    }
    
    public static int getNumberOfDisks() {
    	return TOHConstants.NUM_OF_PEG;
    }
}

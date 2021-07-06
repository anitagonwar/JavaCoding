package TowerOfHanoi;

/**
* Disk class is a inner class of TowerofHanoi class,
* indicates each disk
*/
public class Disk {
	 private int diskSize;

     /**
      * Constructor of Disk class
      * @param diskSize indicates size of each disk by integer
      *
      */
     public Disk(int diskSize){
         this.diskSize = diskSize;
     }

     /**
      * 
      * Returns the size of this disk
      * @return size of the disk
      *
      */
     public int getSize(){
         return diskSize;
     }
}

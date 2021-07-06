package TowerOfHanoi;

import java.util.Scanner;

public class TowerOfHanoiTest {
	public static void main(String[] args) {
		int paramdisk = 0;
		TowerOfHanoi towerofhanoi;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of disks:");
		paramdisk = in.nextInt();
	    
		try {
			if (paramdisk == 0) {
				throw new IncorrectInputException("Incorrect Argment");
			}
			if (paramdisk > TOHConstants.MAX_OF_DISC) {
				throw new IncorrectInputException("Incorrect Number of Disk");
			}
			towerofhanoi = new TowerOfHanoi(paramdisk);
			towerofhanoi.perform();

		} catch (IncorrectInputException e) {
			System.out.println(e.toString());
			TowerOfHanoi.printHelp();
			System.exit(-1);

		} catch (NumberFormatException e) {
			System.out.println(e.toString());
			TowerOfHanoi.printHelp();
			System.exit(-1);

		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}

	}
}

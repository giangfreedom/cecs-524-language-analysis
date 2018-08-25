import java.util.Scanner;


public class Microwave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    MicrowaveDoor mdoor = new MicrowaveDoor();
	    mytimer mt = new mytimer();
		while(true){
		    System.out.println("Input d,c or p : ");
		    String command = sc.nextLine();
		    myinput(command, mdoor, mt);
		}
	}
	
	public static void myinput(String in, MicrowaveDoor mdoor, mytimer mt) {
		if(in.equalsIgnoreCase("d")){
			// door is closed and microwave is not running (time is inactive)
			if(mdoor.getDoor() == false && mt.getActive() == false){
				// it is now open set value to true.
				mdoor.setDoor(true);
				System.out.println("Door is open");
			}
			// door is closed and microwave is running (timer is active)
			// stop cooking and clear time
			else if (mdoor.getDoor() == false && mt.getActive() == true){
				mt.stop();
				System.out.println("Cooking is interupted");
			}
			else {
				// it is open now close it
				mdoor.setDoor(false);
				System.out.println("Door is closed");
			}
		}
		else if(in.equalsIgnoreCase("c")){
			// timer is not already running, no cooking activity
			// single beep
			if(mt.getActive() == false){
				System.out.println("Beep");
			}
			// timer is already running, cooking in activity
			// single beep
			else if (mt.getActive() == true){
				mt.stop();
				System.out.println("Cooking is canceled");
				System.out.println("Light is off");
				System.out.println("Beep");
			}

		}
		else if(in.equalsIgnoreCase("p")){
			// door is open nothing happen just beep
			if(mdoor.getDoor() == true){
				System.out.println("cant cook when Door is open");
				System.out.println("Beep");
			}
			// door is close we can start the cook and timer.
			else{
				// timer is not already running
				if(mt.getActive() == false){
					System.out.println("light is on");
					System.out.println("Add 1 minute to cook time");
					System.out.println("Power tube is on...");
					System.out.println("Beep");
					// set active to true
					mt.setActive(true);
					// involve timer
					mt.start();
					//System.out.println("check1");
					//System.out.println(mt.getActive());
				}								
				// timer is already running add 60 more sec to the count
				else{
					// add 60 sec to time count
					mt.addtime();
				}
			}
		}
		else{
			System.out.println("invalid choice");
		}
	}

}

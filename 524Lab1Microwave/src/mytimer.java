import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class mytimer {
	static int countdown = 60;
	static Timer timer;
	private boolean active;
	private int delay = 100;
    private int period = 100;
    private int retNum;
    
    public mytimer (){
    	setActive(false);
    }
    
    public void start(){
    	timer = new Timer();
    	countdown = 60;
    	timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() {
	        	retNum = setcountdown();
	        	if(retNum >= 0){
	        		System.out.println(retNum);
	        	}
	        }
	    }, delay, period);
    }
    
    public void stop(){
    	timer.cancel();
    	setActive(false);
    	countdown = 60;
    }
    
    public int setcountdown() {
	    if (countdown == 0){
	    	timer.cancel();
	    	setActive(false);
	    	System.out.println("Light is off");
	    	System.out.println("Beep!");
	    	System.out.println("Beep!");
	    	System.out.println("Beep!");
	    }
	    return --countdown;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public void addtime(){
		countdown = countdown +60;
	}
}

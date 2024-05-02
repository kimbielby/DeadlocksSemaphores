import java.util.concurrent.Semaphore;
public class Philosopher extends Thread{
    Semaphore chopLeft;
    Semaphore chopRight;
    private PhilActions philActions;

    /**
     * Constructor
     */
    public Philosopher(PhilActions philActions, Semaphore chopLeft, Semaphore chopRight) {
        this.chopLeft=chopLeft;
        this.chopRight=chopRight;
        this.philActions=philActions;
    }

    /**
     * Actions carried out from class PhilActions or from Semaphore class.
     * Same for each philosopher
     */
    public void run(){
        try {
            philActions.thinkAction();
            chopRight.acquire();
            philActions.grabRight();
            chopLeft.acquire();
            philActions.grabLeft();
            philActions.eatAction();
            chopLeft.release();
            philActions.releaseLeft();
            chopRight.release();
            philActions.releaseRight();
            philActions.thinkAction();
        }
        catch(Exception e){}
    }
}

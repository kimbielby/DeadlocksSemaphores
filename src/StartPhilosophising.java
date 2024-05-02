import java.util.concurrent.Semaphore;

public class StartPhilosophising {

    public static Semaphore chop1;
    public static Semaphore chop2;
    public static Semaphore chop3;

    /**
     * Constructor
     * Initialises and starts instances of Semaphore, PhilActions and Philosopher
     */
    public StartPhilosophising(){
        // Initialise new instances of Semaphore to represent a chopstick each
        chop1 = new Semaphore(1);
        chop2 = new Semaphore(1);
        chop3 = new Semaphore(1);

        // Initialise a new instance of PhilActions
        PhilActions philActions = new PhilActions();
        // Initialise a new instance of Philosopher for each philosopher
        Philosopher philosopherAThread = new Philosopher(philActions,chop1,chop3);
        Philosopher philosopherBThread = new Philosopher(philActions,chop2,chop1);
        Philosopher philosopherCThread = new Philosopher(philActions,chop3,chop2);

        // Start each instance running
        philosopherAThread.start();
        philosopherBThread.start();
        philosopherCThread.start();
    }

    static public void main(String[] args){
        StartPhilosophising startPhilInst = new StartPhilosophising();
    }
}

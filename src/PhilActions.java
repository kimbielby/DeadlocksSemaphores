public class PhilActions {

    // Think: Sleep with print-line
    // Grab right: acquire a semaphore with print-line
    // Grab left: acquire a semaphore with print-line
    // Eat: sleep with print-line
    // Release left: release with print-line
    // Release right: release with print-line

    // String of phrases that will be printed as actions
    String[] printLines = {"Thinking","Eating", "Got left chopstick","Released left chopstick","Got right chopstick", "Released right chopstick"};

    public PhilActions(){

    }

    /**
     * Each action below prints the appropriate message from the printLines array above,
     *      and also prints the name of the Thread that called the method
     */

    public void thinkAction(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[0]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void eatAction(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[1]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void grabLeft(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[2]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void grabRight(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[4]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void releaseLeft(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[3]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }

    public void releaseRight(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + printLines[5]);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
    }
}

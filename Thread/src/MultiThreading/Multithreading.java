package MultiThreading;

public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create first thread
        Thread1 t1 = new Thread1();
        t1.start();
        
        Thread2 t2 = new Thread2();
        t2.start();
    }
    
}


package practiceProjects;
public class ThreadsCreation{
 
    public static int myCount = 0;
    public MyThreadsCreation(){
         
    }
    public void run() {
        while(MyThreadsCreation.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyThreadsCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyThreadsCreation mrt = new MyThreadsCreation();
        Thread t = new Thread(mrt);
        t.start();
        while(MyThreadsCreation.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyThreadsCreation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

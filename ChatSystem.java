class ChatUser extends Thread
{
    String name;
    boolean pause = false;

    ChatUser(String name)
    {
        this.name = name;
    }
    synchronized void SendMessage(String msg)
    {
        System.out.println(name+" Sends"+msg);
    } 

    synchronized void SuspendedThread()
    {
        pause = true;
        System.out.println(name+" Suspended Thread");
    }
    synchronized void ResumedThread()
    {
        pause = false;
        notify();
        System.out.println(name+"Resumed Thread");
    }

    void StopThread()
    {
        pause = false;
        ResumedThread();
        interrupt();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5 ; i++)
            {

                SendMessage("Message :  "+i);

                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name+"Was Interrupted:");
        }
    }
}
public class ChatSystem
{
    public static void main(String args[]) throws InterruptedException
    {
        ChatUser t1 = new ChatUser("Akshay");
        ChatUser t2 = new ChatUser("Varun");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("Thread is Alive :"+t1.isAlive());

        Thread.sleep(2000);
        t1.SuspendedThread();

        Thread.sleep(1000);
        t1.ResumedThread();

        t1.StopThread();

        t1.join();
        t2.join();

        System.out.println("Thread is Alive :"+t1.isAlive());

        System.out.println("Thread id Ended....!!!");
    }
}
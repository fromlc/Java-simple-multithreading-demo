/** 
 * This class exists to perform a task.
 * The task must be able to run independently.
 * If  that can run on its own
 */
public class RunnableTask1 implements Runnable {
   private String myThreadName;
   private String displayMe;
   int sleepTime;
   long loopCount;
   
   /**
    * constructor
    * @param myThreadName String identifier for this thread
    * @param displayMe String
    */
   RunnableTask1(String myThreadName, String displayMe, int sleepTime) {
      this.myThreadName = myThreadName;
      this.displayMe = displayMe;
      this.sleepTime = sleepTime;
      loopCount = 0;
      System.out.printf("Created %s instance\n", myThreadName );
   }
   
   /** 
    * call to run() results when test driver code calls start()
    */
   public void run() {
      System.out.println("Running " +  myThreadName);
      try {
         // display passed data then pause this thread's execution
         for (loopCount = 0; loopCount < 5; loopCount++) {
            System.out.printf("%s loopcount=%d sleeptime=%d: %s\n",
               myThreadName, loopCount, sleepTime, displayMe);
            
            Thread.sleep(sleepTime);
         }

      } catch (InterruptedException e) {
         System.out.println("Thread " +  myThreadName + " interrupted.");
      }
      System.out.println("Thread " +  myThreadName + " exiting.");
   }
}
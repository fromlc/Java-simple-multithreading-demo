public class TestDriver {

   public static void main(String[] args) {

      // create two tasks that will run in separate threads, specify sleep time
      RunnableTask1 task1 = new RunnableTask1("thread1", "Hello Dolly", 500);
      RunnableTask2 task2 = new RunnableTask2("thread2", "Goodbye Elvis", 1000);

      // create a thread for each task
      Thread thread1 = new Thread(task1);
      Thread thread2 = new Thread(task2);

      // start both threads running independently
      thread1.start();
      thread2.start();

      // app code below will continue executing while the threads run
   }
}
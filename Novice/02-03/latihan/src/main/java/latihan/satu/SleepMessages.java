package latihan.satu;

/**
 * SleepMessages
 */
public class SleepMessages {

    public static void mulai()

        throws InterruptedException{
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            for(int i = 0; i < importantInfo.length; i++){
                //Pause for 4 seconds
                Thread.sleep(4000);
                //Print a message
                System.out.println(importantInfo[i]);
            }

            // Catch InterruptedException 1
            for (int i = 0; i < importantInfo.length; i++){
                // Pause for 4 seconds
                try{
                    Thread.sleep(4000);
                    //Print a message
    
                }catch (InterruptedException e){
                    return;

                  }  // print a message
                    System.out.println(importantInfo[i]);
                }
            }}
        
    

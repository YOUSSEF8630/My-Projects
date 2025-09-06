import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count from: ");
        int response = sc.nextInt();
        int count = response;

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}

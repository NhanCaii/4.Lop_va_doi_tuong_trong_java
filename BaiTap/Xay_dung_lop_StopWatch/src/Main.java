import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[100000]; // Tạo mảng với 100,000 số nguyên

        // Đo thời gian bắt đầu
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        int num=1;
        Scanner sc= new Scanner(System.in);
        while (num!=0){
            System.out.println("Press 0 to stop");
            num=sc.nextInt();
        }

        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Thời gian thực thi: " + elapsedTime + " milliseconds");
    }
}
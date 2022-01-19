import java.util.Scanner;

public class SMA {
    public static void main(String[] args) {
        CalculationSMA calcSMA = new CalculationSMA();
        calcSMA.calc();
        MedianFilter calcMedian = new MedianFilter();
        calcMedian.calc();
    }
    public static int MAwindow(){
        System.out.println("Введите окно: ");
        Scanner scanner = new Scanner(System.in);
        int window = scanner.nextInt();
        return window;
    }
}
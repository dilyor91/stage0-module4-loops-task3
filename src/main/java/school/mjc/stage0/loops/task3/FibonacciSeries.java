package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public  void printFibonacci(int lastFibonacci) {
        int cnt = 1, fib, fib_1=0, fib_2=0;
        while(cnt <= lastFibonacci) {
            if(cnt==1) {
                fib_1 = 0;
                System.out.println(0);
            } else if(cnt==2) {
                fib_2 = 1;
                System.out.println(1);
            } else {
                fib = fib_1+fib_2;
                System.out.println(fib);
                fib_1 = fib_2;
                fib_2 = fib;
            }
            cnt++;
        }
    }
}

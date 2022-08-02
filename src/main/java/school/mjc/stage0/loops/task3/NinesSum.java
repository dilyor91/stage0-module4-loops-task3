package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if(lengthOfLastNumber<=0)
            System.out.println(0);
        else {
            int sum = 0, p = 0;
            for(int i=1;i<=lengthOfLastNumber;i++){
                p = p*10+9;
                sum+=p;
            }
            System.out.println(sum);
        }
    }
}

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sunday=sc.nextInt();
        int monday= sc.nextInt();
        int tuesday=sc.nextInt();
        int wednesday= sc.nextInt();
        int thursday=sc.nextInt();
        int friday= sc.nextInt();
        int saturday=sc.nextInt();
        int sal=0,sum=0;
        int week[]={sunday,monday,tuesday,wednesday,thursday,friday,saturday};

        for(int i=0;i<week.length;i++)
        {
            sum+=week[i];
        }
        sal=sum*100;
        for(int i=0;i<week.length;i++)
        {
            if(week[i]>8)
            {
                sal+=(week[i]-8)*15;
            }
        }

        if(sum>40)
        {
            sal+=(sum-40)*25;
        }
        else if(week[6]>0)
        {
            sal+=(week[6]*100)*25/100;
        }
        else if(week[0]>0)
        {
            sal+=(week[0]*100)*50/100;
        }
        System.out.println(sal);

    }
}

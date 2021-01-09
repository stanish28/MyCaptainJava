import java.util.*;
public class MinutesToDaysAndYears{

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int min;
        System.out.print("Input the Number of Minutes: ");
        min = sc.nextInt();
        int years = min / 525600; // Number of Minutes in a year is 525600.
        int MinRem = min % 525600;
        int days = MinRem / 1440;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");
        
    
    }
}

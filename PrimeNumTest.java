import java.util.Scanner;
class PrimeNumTest{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        Boolean isPrime = true;
        for (int i = 2; i<a ; i++){
            if(a%i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(a + " is a prime number.");
        }
        else{
            System.out.println(a + " is a not prime number.");
        }
    }
}
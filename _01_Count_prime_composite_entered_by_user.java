import java.util.*;
public class _01_Count_prime_composite_entered_by_user {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n= sc.nextInt();
        System.out.println("\nEnter numbers:");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        /*System.out.print("Entered elements are:");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }*/
        int pc=0,cc=0;
        System.out.println("Prime numbers:");
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=1; j<=a[i];j++){
                if(a[i]%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.print(a[i]+" ");
                pc++;
            }
        }
        System.out.println("\nPrime count:"+pc);
        System.out.println("composite numbers:");
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=1; j<=a[i]; j++){
                if(a[i]%j==0){
                    c++;
                }
            }
            if(c>2){
                System.out.print(a[i]+" ");
                cc++;
            }
        }
        System.out.println("\nComposite count:"+cc);
    }  
}

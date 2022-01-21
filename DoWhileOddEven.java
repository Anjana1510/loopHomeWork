package loophomework;

public class DoWhileOddEven {

    public static void main(String[] args) {

        System.out.println("Even Numbers");
        int i = 1;
        do{
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }while(i<=20);

        System.out.println("\nOdd Numbers");
        int j=1;
        do{
            if(j%2==1){
                System.out.print(j + " ");
            }
            j++;
        }while(j<=20);
    }
}

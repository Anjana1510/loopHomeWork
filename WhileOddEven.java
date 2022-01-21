package loophomework;

public class WhileOddEven {

    public static void main(String[] args) {

        int i=1;

        System.out.println("Even Numbers");
        while(i<=20){
            if(i%2==0) {
                System.out.print(i + " ");
            }
                i++;
        }

        System.out.println("\nOdd Numbers");
        int j=1;
        while(j<=20){

            if(j%2==1) {
                System.out.print(j + " ");
            }
            j++;
        }
    }
}

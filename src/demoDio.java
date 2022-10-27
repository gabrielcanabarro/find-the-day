import java.util.Scanner;

public class demoDio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     

        int number = sc.nextInt();
        int id = sc.nextInt();

        int count = 0;
        while(count < number) {

           int id1,num;

           id1 = sc.nextInt();
           num  = sc.nextInt();

           if(id == id1 &&  num == 0 ){
		 count++;
	    }
             
         }
         System.out.println(count);
         sc.close();
   }
}


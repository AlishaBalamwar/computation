import java.util.*;
import java.lang.Math.*;
public class uc2{
	public static void main(String arg[]){
             	 int x1,x2,y1,y2,a2,a1,b2,b1;
	         double dis;
                 double dis1;
	         Scanner sc=new Scanner(System.in);
	         System.out.println("enter x1 point");
                 x1=sc.nextInt();
                 System.out.println("enter y1 point");
                 y1=sc.nextInt();
	         System.out.println("enter x2point");
                 x2=sc.nextInt();
	         System.out.println("enter y2 point");
                 y2=sc.nextInt();
		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));   
                 System.out.println("enter a1 point");
                 a1=sc.nextInt();
                 System.out.println("enter b1 point");
                 b1=sc.nextInt();
                 System.out.println("enter a2point");
                 a2=sc.nextInt();
                 System.out.println("enter b2 point");
                 b2=sc.nextInt();
                 dis1=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
                 if(dis==dis1) {
                  System.out.println("Both are equal");
                     }
                else{
                     System.out.println("Not equal"); 
                 }
	}
 
}

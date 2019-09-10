
import java.util.Scanner;
public class phuongtrinhbac2 
{
	public static void main(String[] args)
	{
		float a,b,c,x1,x2,del;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("a = ");
		a = keyboard.nextFloat();
		System.out.print("b = ");
		b = keyboard.nextFloat();
		System.out.print("c = ");
		c = keyboard.nextFloat();
		if(a==0)
			if (b==0)
				if(c==0)System.out.println("Phuong trinh vo so nghiem");
				else System.out.println("Phuong trinh vo nghiem");
			 else //tức là b !=0
					System.out.println("Phuong trinh co nghiem="+ (-c/b));
		{
				del = b*b - 4*a*a;
				if (del <c) System.out.println("Phuong trinh vo nghiem");
				else
				if (del==0) 
				{
						x1=x2=-b/(2*a);
						System.out.println("Phuong trinh co nghiem kep ="+x1);
				}
					else// tức là del > 0
					{
						x1=(float)(-b+Math.sqrt(del))/(2*a);
						x2=(float)(-b-Math.sqrt(del))/(2*a);
						System.out.println("Phuong trinh 2 nghiem:  \n x1= "+x1+" \n x2="+x2);
						
						
					}
					
				}
				}//Kết thúc hàm main
	}//Kết thúc class
				
		
		
		
		
		
		

		

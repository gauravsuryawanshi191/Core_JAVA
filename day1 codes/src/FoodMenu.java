/*
4.1 Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill )
Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/
import java.util.Scanner;
class FoodMenu{
	public static void main(String[] args){
		System.out.println("Welcome to our Restaurent!");
		int choice,quant,totalprice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu \n1.Dosa-30\n2.Samosa-10\n3.Idli-20\n4.Vadapav-15\n5.Poha-20\n6.Upma-20\n7.Tea-10\n8.Coffee=15\n9.Jalebi-20\n10.Generate Bill");
		boolean exit=false;
		while(!exit){
			System.out.print("Enter Choice: ");
			choice=sc.nextInt();
			switch (choice){
				case 1:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(30*quant);
					break;
				case 2:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(10*quant);
					break;
				case 3:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(20*quant);
					break;
				case 4:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(15*quant);
					break;
				case 5:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(20*quant);
					break;
				case 6:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(20*quant);
					break;
				case 7:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(10*quant);
					break;
				case 8:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(15*quant);
					break;
				case 9:
					System.out.print("Enter Quantity: ");
					quant= sc.nextInt();
					totalprice=totalprice+(20*quant);
					break;
				case 10:
					System.out.println("===================================================================");
					System.out.println("Generating Bill.");
					System.out.println("Total Bill="+ totalprice);
					sc.close();
					exit=true;
					System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
					break;
				default:
					System.out.println("Invalid Choice.Please Try Again");
			}
		}
	}
}
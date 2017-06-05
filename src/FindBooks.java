import java.util.Scanner;

public class FindBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicBookDB b= new BasicBookDB();
		
		System.out.println("Please input the SKU of the desired book:");
		Scanner user=new Scanner(System.in);
		
		String sku=user.nextLine();
		b.findBook(sku);
		user.close();
		

	}

}

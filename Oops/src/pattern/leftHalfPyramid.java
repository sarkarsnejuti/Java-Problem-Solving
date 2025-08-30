package pattern;
import java.util.Scanner;
public class leftHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = i;j<=(n-1);j++) {
				System.out.print(" ");
			}
			for(int k =i ;k>= 1;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

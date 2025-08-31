package pattern;
import java.util.Scanner;
public class numberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();
for(int i=1;i<=n;i++) {
	if(i==1) {
	for(int j=1;j<=n;j++) {
		System.out.print(j+" ");
	}
	}else if (i!= 1) {
		for(int j=1;j<=((n-i)+1);j++) {
			System.out.print(j+" ");
		}
	}
	System.out.println("");
}
	}

}

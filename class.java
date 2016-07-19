# bubalooo
public class sample3 {
	public static void main(String[] args) {
		int n,temp,m,sum=0;
		n=Integer.parseInt(args[0]);
		temp=n;
		while(n>0)
		{
			m=n%10;
			sum=(sum*10)+m;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is  not a palindrome");
		}
	}
	}

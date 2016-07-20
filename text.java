# bubaloooimport java.util.Scanner;

public class text {

	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter ur characters : ");
        char num = sc.nextLine().charAt(0);
        if((num >='A' && num<='Z')||(num>='a'&& num<='z'))
        {
            System.out.println("an alphabets ");
            {
 
 
                if(num=='a'|| num=='e'|| num=='i'|| num=='o'|| num=='u'|| num=='A'|| num=='E'|| num=='I'|| num=='O'|| num=='U')
                {
                    System.out.println(" vowel");
 
                }
                else
                {
                    System.out.println(" consonants");
 
                }
            }
        }
    }
}

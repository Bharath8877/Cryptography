import java.util.Scanner;

public class Caesar_Cipher 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the string to encrypt:");
		Scanner s=new Scanner(System.in);
		String enc=s.nextLine();
		enc=enc.toLowerCase();
		String dec="";
		char c;
		for(int i=0;i<enc.length();i++)
		{
			c=enc.charAt(i);
			if(Character.isLetter(c))
			{	
				if(c=='x')dec=dec+'A';
				else if(c=='y')dec=dec+'B';
				else if(c=='z')dec=dec+'C';
				else if(c==' ')dec=dec+' ';
				else dec=dec+(char)((c+3));
			}
			else
				dec=dec+c;
		}
		dec=dec.toUpperCase();
		System.out.print(dec);
	}
}

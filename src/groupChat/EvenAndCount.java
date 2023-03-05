package groupChat;

public class EvenAndCount {

	public static void main(String[] args) {
		
		int num = 1234;
		int even = 0;
		int odd =  0;
		while(num>0)
		{
			int reminder = num%10;
			
			if(reminder%2==0)
				
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		
	System.out.println(even);	
	System.out.println(odd);	
		
		

		
		
	}

}

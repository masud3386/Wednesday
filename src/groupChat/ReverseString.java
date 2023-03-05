package groupChat;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "louisa";
		String reverse = "";
		int joy = s.length();
		
		/*for(int i=joy-1;i>=0;i--)  s 
		{
			reverse = reverse + s.charAt(i);
		}
		
		System.out.println(reverse);*/
		
		
		StringBuffer e= new StringBuffer(s);
		System.out.println(e.reverse());
		
		
		
	}

}

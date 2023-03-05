package groupChat;

public class TwoDimetionalArray {

	public static void main(String[] args) {
		
		int a [][] = new int [3][2];//rows and colomun
		a [0][0] = 100;				   
		a [0][1] = 200;	
		
		a [1][0] = 300;				   
		a [1][1] = 400;	
		
		a [2][0] = 500;				   
		a [2][1] = 600;				   
				   
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		for(int i=0;i<a.length;i++)  // outer loop for rows
		{
			for(int j=0;j<a[1].length ;j++)  // Inner loop for colomun
			{
				System.out.println(a[i][j]);
			}
			
		}
		
		
		
		
		
		
		
	}

}

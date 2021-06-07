package program;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int num=1234,rev=0,dr;
		
		while(num!=0) {
			dr=num%10;
			
			rev =rev*10+dr;
			
			 num=num/10;
		}
		
		System.out.println(rev);
	}

}

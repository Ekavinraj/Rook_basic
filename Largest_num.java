 public class Largest_num {
		public static void main(String [] args)
		{
		int num [] ={10,20,35,60,100,76,95,105};
		int maxone=0,maxtwo=0;
		for(int i=0;i<num.length;i++)
		{
		if(maxone<num[i])
				{
		maxtwo=maxone;
		maxone=num[i];
		}
		else if(maxtwo<num[i])
		{
		maxtwo=num[i];
		}}
		System.out.println("Largest Number: "+maxone);
		System.out.println("Second Largest Number: "+maxtwo);
		}

}

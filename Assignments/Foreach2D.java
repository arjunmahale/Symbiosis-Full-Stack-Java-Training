package Java;

public class Foreach2D {

	public static void main(String[] args) {
		int sum=0;
		int[][] array=new int[3][5];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				array[i][j]=(i+1)*(j+1);
			}
		}
		
		System.out.println("array using for loop -->");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
			System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array using for each loop -->");
		for(int x[] : array)
		{
			for(int y : x)
			{
			System.out.print(" "+y);
			sum+=y;
			}
			System.out.println();
		}
		System.out.println("------------------\nsum of array is = "+sum);
	}

}

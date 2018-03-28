
public class Pythogoras {

	public static void main(String[] args) 
	{
		int i ; int j=0 ; int k=0 ;
		for( i = 0 ; i<1000 ; i++)
		{
			for( j=i ; j<=1000 ; j++)
			{
				for( k=j ; k<1000 ; k++)
				{
					if ((i*i)+(j*j)==(k*k) && i+j+k==1000)
					{
						System.out.println(i+"\t"+j+"\t"+k);
						break;
					}
				}
			}
		}
		System.out.println(i*j*k);

	}

}

import org.junit.Test;


public class LoopPracticeTest 
{
	@Test
	public void m1()
	{
		for(int i=0;i<10;i++)//to get all number
		{
			System.out.println("The result of " + i);
			
		}
	}
		@Test
		public void m2()
		{
			for(int i=2;i<10;i=i+2)//to get even number
			{
				System.out.println("The result of even " +i);
			}
	}
		@Test
		public void m3()
		{
			for(int i=1;i<10;i=i+2)//to get odd number
			{
				System.out.println("The result of odd number "+i);
			}
		}
		@Test
		public void m4()
		{
			for(int i=1;i<3;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println("hi");
				}
				System.out.println("hello");
			}
		}
		@Test
		public void m5()
		{
			for(int i=1;i<3;i++)
			{
				for(int j=0;j<2;j++)
				{
					for(int k=0;k<2;k++)
					{
						System.out.println("hi");
					}
					System.out.println("hi1");
				}
				System.out.println("hello");
			}
		}
}

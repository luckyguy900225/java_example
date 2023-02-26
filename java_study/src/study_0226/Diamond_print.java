package study_0226;

public class Diamond_print {

	static void diamond_print_even(int line_count)
	{
		String str1 = "*";
		String str2 = " ";
		for(int i = 0; i < (line_count / 2) + 1; i++) // line 을 위한 for 문.
		{	
			if(i == 0)
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 0)
					{
						if(j == line_count)
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			else
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j >= (line_count - i * 2) && j <= (line_count + i * 2))
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			System.out.println("");
		}
		for(int i = (line_count / 2) -1; i >= 0; i--) // line 을 위한 for 문.
		{	
			if(i == 0)
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 0)
					{
						if(j == line_count)
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			else
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j >= (line_count - i * 2) && j <= (line_count + i * 2))
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			System.out.println("");
		}
	}
	
	static void diamond_print_odd(int line_count)
	{
		String str1 = "*";
		String str2 = " ";
		for(int i = 0; i < (line_count / 2) + 1; i++) // line 을 위한 for 문.
		{	
			if(i == 0)
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j == line_count)
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			else
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j >= (line_count - i * 2) && j <= (line_count + i * 2))
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			System.out.println("");
		}
		for(int i = (line_count / 2) -1; i >= 0; i--) // line 을 위한 for 문.
		{	
			if(i == 0)
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j == line_count)
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			else
			{
				for(int j = 0 ; j < line_count * 2; j++)
				{
					if((j % 2 ) == 1)
					{
						if(j >= (line_count - i * 2) && j <= (line_count + i * 2))
							System.out.print(str1);
						else
							System.out.print(str2);
					}
					else
						System.out.print(str2);
				}
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int select_value = 15;
		if(select_value % 2 == 0)
			diamond_print_even(select_value);
		else
			diamond_print_odd(select_value);
	}

}

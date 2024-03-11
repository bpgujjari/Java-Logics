class Test 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3};
		try
		{
			System.out.println(10/4);
			System.out.println("Gujjari Bhavaniprasad");
			System.out.println("Hello World!".charAt(15));
		}
		catch (ArithmeticException e)
		{System.out.println("Hello World!");
		}
		catch(StringIndexOutOfBoundsException e )
			{
			System.out.println("Gujjari Bhavaniprasad");

			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("King is not Born");

		}

		}
	}

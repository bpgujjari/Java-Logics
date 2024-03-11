class Test1 
{
	public static void main(String[] args) 
	{
		int [] arr1={1,2,3,4,5};
		int [] arr2={1,2,3,4,5};
		boolean flag=true;
		if (arr1.length==arr2.length)
		{
			for (int i=0;i<=arr1.length-1;i++ )
			{
				if(arr1[i]!=arr2[i]){
					flag=false;
					break;
				}
			}
		}
		else{flag=false;}
		if(flag==true)
		System.out.println("both arrays are equal");
		else
			System.out.println("both arrays are not equal");
		}
	}


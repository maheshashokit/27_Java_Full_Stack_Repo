class SimpleArrayDemo 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50,60,70,80};

		System.out.println("First Element::::" + a[0]);
		System.out.println("Second Element::::" + a[1]);
		System.out.println("Third Element::::" + a[2]);
		System.out.println("Fourth Element::::" + a[3]);
		System.out.println("Fifth Element::::" + a[4]);
		System.out.println("Array Length::::" + a.length);

		//traditional for loop for displaying array values
		for(int i = 0 ; i<a.length ; i++){		  
		   System.out.println("a["+i+"]="+ a[i]);
		}

		//Enhanced for loop
		int i = 0;
		
		for(int temp: a){
			System.out.println("a["+i+"]=" + temp);
			i++;
		}
	}
}

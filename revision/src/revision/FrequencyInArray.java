package revision;

class FrequencyInArray{

	public static void main(String[] args){

	int[] a={1, 2,4,5,7,8,9,4, 2,5,5};

	int max=0;

	int val=0;

	for(int i=0;i<a.length; i++){

	int count=0;

	for(int j=0;j<a.length; j++)

	{
	 if(a[i]==a[j]){

	count++;
	}
	}
	if(count>max){
	max=count;
	val=a[i];
	}
	}
System.out.println("most frequecy element:"+val);
System.out.println("frequency:"+max);
	}
	}




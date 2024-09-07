
public class Chapter06 {
	public static void main(String[] args) {
		long long1= 10000000000L;
		System.out.println(long1);
		
		double double1= 3.14D;
		System.out.println(double1);
		
		boolean boolean1=true;
		System.out.println(boolean1);
		
		Integer integer1= 100;
		System.out.println(integer1);
		
		Float float1=Float.valueOf(1.4142F);
		System.out.println(float1);
		
		Character char1='う';
		System.out.println(char1);
		
		Character char2=Character.valueOf('え');
		System.out.println(char2);
		
		int[] array1=new int[5];
		array1[0]=0;
		array1[1]=10;
		array1[2]=20;
		array1[3]=30;
		array1[4]=40;
		int int2=array1[3];
		System.out.println(int2);
		
		int [] array2= {60,70,80,90,100};
		System.out.println(array2[3]);
		System.out.println(array2.length);
		
	}
}

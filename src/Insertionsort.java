import java.util.Scanner;

public class Insertionsort {
	public static void Isort(int[] arr) {

		int current;
		for(int i=0;i<5;i++) {
		 current=arr[i];
		 int j=i-1;
		 while(j>0 && current<arr[j]) {
			 arr[j+1]=arr[j];
			 j--;
		 }
	      arr[j+1]=current;
		 
		}
		
		System.out.println("after sort:");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void  main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter array");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sort:");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
	
			Isort(arr);
	}

}

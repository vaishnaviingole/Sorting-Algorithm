import java.util.*;
public class bubblesort {
	
	
	public static void bbsort(int[] arr) {
		int temp=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		
	
		bbsort(arr);
	}
}
import java.util.Scanner;

public class Selectionsort {
	
	public static void Ssort(int[] arr) {
		int temp=0;
		int smallest;
		for(int i=0;i<5-1;i++) {
			smallest=i;
			for(int j=i+1;j<5;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			temp=arr[smallest];
			arr[smallest]=arr[i];
		    arr[i]=temp;
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
		
	
		Ssort(arr);
	}
}

package deneme;

import java.util.Scanner;

public class ebob_ekok {

	public static void main(String[] args) {
		// Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
		//Ekok(s1,s2) * ebob(s1,s2) =  (s1*s2); buna uygun olacak şekilde bulunuz
		// ekok : en küçük ortak kat
		// ebob : en büyük ortak bölen

		Scanner sc = new Scanner(System.in);
		System.out.print("entry a value :");
		int x = sc.nextInt();
		System.out.print("entry a value : ");
		int y = sc.nextInt();
		int ebob=0;
		//  x=10 ve y=15
		
		if(y>x) {
			for(int i=1;i<y;i++) {
				if( x%i==0 && y%i==0) {
					ebob=i;
				}
			}
		}else {
			for(int i=1;i<x;i++) {
				if( x%i==0 && y%i==0) {
					ebob=i;
				}
			}
		}
		
		System.out.println("result is :" +ebob);
		int my = x*y;
		int ekok = my/ebob;
		System.out.println("result is :" +ekok);
			
		
	}

}

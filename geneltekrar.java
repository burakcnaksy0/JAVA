package deneme;

import java.util.Iterator;
import java.util.Scanner;

public class geneltekrar {

	public static void main(String[] args) {

//      faktorıyel hesaplamaa 
//		int sum=0;
//		
//		for(int i=0;i<=100;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//		
//		
//		Scanner tara = new Scanner(System.in);
//        System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz :");
//        int sayi = tara.nextInt();
//
//        int sayac = 1;
//        long faktoriyel = 1;
//        while (sayac <= sayi){
//
//            faktoriyel = faktoriyel * sayac;
//            sayac ++ ;
//
//        }
//        System.out.println("Girdiğiniz "+sayi+" sayısının faktoriyeli : " + faktoriyel);

		// carpım tablosu
//		for(int i = 1; i<=10; i++){
//            for(int j = 1 ; j <= 10 ; j++){
//                System.out.print(i +"*"+ j + "=" + (i*j) + "\t");
//            }
//            System.out.println();
//            System.out.println();
//        }

//		# sayı tahmin etme oyunu
//		Scanner tara = new Scanner(System.in);
//
//        int uretilenSayi = (int) (Math.random() * 101);//0 ile 100 arası sayı üretilir 100 dahil.
//        int tahmin = -1 ;
//        int tahminEtmeSayisi = 0;
//
//        while (tahmin != uretilenSayi){
//
//            System.out.println("Tahmininizi giriniz :");
//            tahmin = tara.nextInt();
//            tahminEtmeSayisi++;
//
//            if(tahmin == uretilenSayi){
//                System.out.println("Tebrikler ! "+tahminEtmeSayisi + " seferde sayıyı buldunuz");
//            }else if(tahmin > uretilenSayi){
//                System.out.println("Tahmin ettiğiniz sayı yüksek, DÜŞÜRÜN");
//            }else{
//                System.out.println("Tahmin ettiğiniz sayı çok düşük, YÜKSELTİN");
//            }
//        }
//		

//		int[] numbers = new int[10];
//		for(int i=0;i<10;i++) {
//			numbers[i]= (int)(Math.pow(i, 2));
//		}
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(i+" .eleman : "+ numbers[i]);
//		}

//     
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many numbers do you want to enter? : ");
//		int n = sc.nextInt();
//		
//		int[] numbers = new int[n];
//		
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println("values : ");
//			numbers[i] = sc.nextInt();
//		}
//		int sum=0;
//		int average=0;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//			sum+=numbers[i];
//			average=(sum/numbers.length);
//		}
//		System.out.println("your average is : " +average);

//		100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele olacak şekilde üretin. 
//		Bu işlemden sonra dizideki elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç tane eleman olduğunu yazdırın.
//
//		int[] numbers = new int[100];
//		int average = 0;
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//
//			numbers[i] = (int) (Math.random() * 101);
//			sum += numbers[i];
//			average = (sum / numbers.length);
//		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(i + ". value :" + numbers[i]);
//
//		}
//		int count=0;
//		int ount=0;
//		for (int i = 0; i < numbers.length; i++) {
//			if(average>numbers[i]) {
//				count++;
//			}else {
//				ount++;
//			}
//		}
//		System.out.println(count);
//		System.out.println(ount);
//
//	

//		Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan sayıların toplamını yazdıran program yazınız.
//		Ayrıca bu matriste yer alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.

//		int[][] numbers = new int[3][2];
//		int min=100;
//		int max=0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				int randomNumber=(int) (Math.random() * 101);
//				numbers[i][j] = randomNumber;
//				
//				
//				if(min>randomNumber) {
//					min=randomNumber;
//				}
//				if(max<randomNumber) {
//					max=randomNumber;
//				}
//			}
//
//		}
//		System.out.println("dizideki en büyük değer " +max+" ve en küçük değer "+min+ " dir.");
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.println(numbers[i][j]);
//			}
//
//		}
		
		 Scanner tara = new Scanner(System.in);
	        System.out.println("Toplam öğrenci sayısını giriniz");
	        int ogrenciSayisi = tara.nextInt();

	        System.out.println("Toplam soru sayısını giriniz");
	        int soruSayisi = tara.nextInt();

	        //5,10  ==> 5 x 10 matris
	        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
	        char[] cevapAnahtari = new char[soruSayisi];

	        cevapAnahtariOlustur(cevapAnahtari);
	        ogrenciCevaplariniYerlestir(tumCevaplar);

	        ogrenciCevaplariniGoruntule(tumCevaplar);
	        cevapAnahtariniGoruntule(cevapAnahtari);

	        ogrencileriDegerlendir(cevapAnahtari, tumCevaplar);

	    }

	    private static void cevapAnahtariniGoruntule(char[] cevapAnahtari) {
	        for (char secenek : cevapAnahtari){
	            System.out.print(secenek+",");
	        }
	        System.out.println();
	    }

	    private static void ogrenciCevaplariniGoruntule(char[][] tumCevaplar) {
	        for (int satir = 0; satir < tumCevaplar.length; satir++) {
	            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
	                System.out.print(tumCevaplar[satir][sutun]+ ",");
	            }
	            System.out.println();
	        }
	    }

	    private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {

	        for (int satir = 0; satir < tumCevaplar.length; satir++) {

	            int dogruCevapSayisi = 0;
	            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
	                if (tumCevaplar[satir][sutun] == cevapAnahtari[sutun]) {
	                    dogruCevapSayisi++;
	                }
	            }

	            System.out.println(satir+" indexsindeki öğrencinin dogru cevap sayısı : " +dogruCevapSayisi);
	        }
	    }

	    private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
	        for (int i = 0; i < cevapAnahtari.length; i++) {
	            cevapAnahtari[i] = cevapOlustur();
	        }
	    }

	    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
	        for (int satir = 0; satir < tumCevaplar.length; satir++) {
	            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
	                tumCevaplar[satir][sutun] = cevapOlustur();
	            }
	        }
	    }

	    public static char cevapOlustur() {
	        int rastgeleSayi = 65 + (int) (Math.random() * 5);//0 1 2 3 4
	        char uretilenSecenek = (char) rastgeleSayi;
	        return uretilenSecenek;
	    }
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



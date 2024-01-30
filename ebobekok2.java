package deneme;

public class ebobekok2 {

	public static void main(String[] args) {
		int birinciSayi = 40 , ikinciSayi = 21;

        //int ekok = klasikEkokBul(birinciSayi, ikinciSayi);

        //System.out.println(birinciSayi+" ile "+ikinciSayi+" ekoku :"+ekok);



        //int ebob = ebobBul(15, 45);
        //System.out.println("ebob : "+ebob);

        int ekok = ekokBul(birinciSayi, ikinciSayi);
        System.out.println("ekok : "+ekok);

    }

    private static int ekokBul(int birinciSayi, int ikinciSayi) {

        //ebob * ekok = s1 * s2 ;

        int ekok = (birinciSayi * ikinciSayi) / ebobBul(birinciSayi,ikinciSayi);

        return ekok;

    }

    private static int ebobBul(int birinciSayi, int ikinciSayi){
        int ebob = 1;
        int kontrol = 2;

        while(kontrol <= birinciSayi && kontrol <= ikinciSayi){
            if(birinciSayi % kontrol == 0 && ikinciSayi % kontrol ==0){
                ebob = kontrol;
            }

            kontrol++;
        }

        if(ebob==1){
            System.out.println(birinciSayi +" ve " + ikinciSayi+ " aralarında asaldır");
        }else{
            System.out.println(birinciSayi +" ve " + ikinciSayi+ " sayılarının en büyük ortak böleni : "+ebob);
        }

        return ebob;

    }

    private static int klasikEkokBul(int birinciSayi, int ikinciSayi) {

        int buyuk = Math.max(birinciSayi,ikinciSayi);
        int ekok =0;

        for(int i = buyuk; i<= birinciSayi*ikinciSayi; i++){
            if(i % birinciSayi == 0 && i% ikinciSayi ==0){
                ekok = i;
                break;
            }
        }

        return ekok;


    }


}
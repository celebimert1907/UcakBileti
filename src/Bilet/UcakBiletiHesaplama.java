package Bilet;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kM, age, money, sale;
        int travelType;


        System.out.print("Yolculugunuz kac kilometredir: ");
        kM = input.nextInt();

        if (kM > 0){
            System.out.println("Kilometre basina 0.10 tl alinmaktadir.");
        } else {
            System.out.println("Hatali veri girdiniz!");
        }

        System.out.print("Biletinizi tek yonlu istersiniz 1 i, gidis-donus isterseniz 2 yi giriniz: ");
        travelType = input.nextInt();

        if(travelType == 1){
            System.out.println("Yolculugunuz icin tek yonlu bilet aliyorsunuz");
        } else if (travelType == 2){
            System.out.println("Gidis donus bilet istediginiz icin odeme esnasinda %20 indirim uygulanacaktir.");
        } else{
            System.out.println("Hatali veri girdiniz !");
        }

        System.out.print("Yasinizi giriniz: ");
        age = input.nextInt();

        if (age<12){
            System.out.println("Yasiniz 12 den kucuk oldugu icin odeme esnasinda %50 indirim uygulanacaktir.");
        } else if (age >=12 && age <=24) {
            System.out.println("Yasiniz 12-24 araliginda oldugu icin odeme esnasinda %10 indirim uygulanacaktir.");
        } else if (age > 24 && age < 65){
            System.out.println("Yasinizdan dolayi herhangi bir indirim uygulanmamaktadir.");
        } else if (age >= 65){
            System.out.println("Yasiniz 65 den buyuk oldugu icin odeme esnasinda %30 indirim uygulanacaktir.");
        } else{
            System.out.println("Hatali veri girdiniz !");
        }

        if(travelType == 1){
            if (age <12){
                money = (kM * 0.1);
                System.out.println("Ucusunuzun indirimsiz hali: " + money);
                sale = (money - ((money*50) /100));
                System.out.print("Ucusunuzun indirimli hali ise: " + sale + "dir.");
            } else if (age >=12 && age <=24) {
                money = (kM * 0.1);
                System.out.println("Ucusunuzun indirimsiz hali: " + money);
                sale = (money - ((money * 10) / 100));
                System.out.print("12-24 yas araliginda oldugunuz icin ucusunuzun indirimli hali ise: " + sale + "dir.");
            } else if (age > 24 && age < 65){
                money = (kM * 0.1);
                System.out.println("Ucusunuzda herhangi bir indirim bulunmamaktadir. Ucretiniz: " + money);
            } else {
                money = (kM * 0.1);
                System.out.println("Ucusunuzun indirimsiz hali: " + money);
                sale = (money - ((money * 30) / 100));
                System.out.print("65 yas ustu oldugunuz icin ucusunuzun indirimli hali ise: " + sale + "dir.");
            }
        } else if (travelType== 2){
            if(age<12){
                money = (kM *0.1);
                money = ((money - ((money*20)/100)));
                System.out.println("Gidis donus bilet aldiginiz icin %20 indirim uygulanmistir." + money +
                        "\nyasinizdan dolayi ekstra %50 daha uygulanacaktir.");
                money = (money- ((money*50)/100));
                System.out.println("Ekstra yasinizdan dolayi indirimli hali ise: " + money + "dir.");
            } else if (age >=12 && age <=24) {
                money = (kM *0.1);
                money = ((money - ((money*20)/100)));
                System.out.println("Gidis-donus bilet aldiginiz icin %20 indirim uygulanmistir." + money +
                        "\nyasinizdan dolayi ekstra %10 daha uygulanacaktir.");
                money = (money- ((money*10)/100));
                System.out.println("Ekstra yasinizdan dola indirimli hali ise: " + money + "dir.");
            } else if (age > 24 && age < 65) {
                money = (kM *0.1);
                money = ((money - ((money*20)/100)));
                System.out.println("Gidis-donus bilet aldiginiz icin %20 indirim uygulanmistir." + money +
                        "\nyasinizdan dolayi ekstra indirim uygulanamayacaktir.");
            } else {
                money = (kM *0.1);
                money = ((money - ((money*20)/100)));
                System.out.println("Gidis-donus bilet aldiginiz icin %20 indirim uygulanmistir." + money +
                        "\nyasinizdan dolayi ekstra %30 daha uygulanacaktir.");
                money = (money- ((money*30)/100));
                System.out.println("Ekstra yasinizdan dolayi indirimli hali ise: " + money + "dir.");
            }
        }
    }
}

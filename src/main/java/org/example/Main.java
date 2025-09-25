package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(numberToWords(90));

    }

    public static boolean isPalindrome(int sayi){
        sayi=Math.abs(sayi);

    String sayiStr=String.valueOf(sayi);

        char[] karakterler = sayiStr.toCharArray();
        int son = karakterler.length-1;
        int ilk=0;
       boolean sonuc=true;

       while(ilk<son)
       {
         if(karakterler[ilk]!=karakterler[son]){
             ilk=son;
         sonuc=false;}

        ilk++;
         son--;
       }
         return sonuc;

    }
    public static boolean isPerfectNumber(int sayi){
       boolean sonuc=false;
        int carpan=1,toplam=0;

        if(sayi>1)
        while(carpan<=sayi/2)
        {
          if(sayi%carpan==0) toplam+=carpan;

          carpan++;


        }
        if(toplam==sayi) sonuc=true;
        return sonuc;
    }


    public static String numberToWords(int sayi){
           if(sayi<0) return "Invalid Value";

        String[] numbers={"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"

        };
         String str=String.valueOf(sayi);
        int uzunluk=str.length();
         int [] sayiDizisi=new int[uzunluk];

         for(int i=0;i<uzunluk;i++){
             sayiDizisi[i]=sayi%10;
             sayi/=10;

         }

            String[] rakamlar=new String[uzunluk];
          for(int i=0;i<uzunluk;i++){

              rakamlar[uzunluk-i-1]=numbers[sayiDizisi[i]];

          }
        String sonuc=String.join(" ",rakamlar);
        return sonuc;

    }

}

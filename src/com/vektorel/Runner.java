package com.vektorel;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// 1- OLUSTURMA
		List<Integer> sayiList = new ArrayList<Integer>();
		List<String> isimList = new ArrayList<String>();
		List<Musteri> musteriList = new ArrayList<Musteri>();
		
		// 2- EKLEME
		sayiList.add(12);
		isimList.add("Ibrahim");
		isimList.add("Evren");
		isimList.add("Ipek");
		
		Musteri mst = new Musteri();
		mst.id=1903;
		musteriList.add(mst);
		
		// 3- OKUMA
		isimList.get(1); //"get" isim listesinin icindeki degere erisimi saglar. Diziler gibi 0. indexten baslar.
		
		for (int i = 0; i < isimList.size(); i++) { //normal for ile yapilan ve get methodu kullanilarak yapilan dongu.
			System.out.println(i+1+"-"+isimList.get(i));
		}
		
		for (String item : isimList) { //foreach ile yapilan dongu.
			System.out.println(item);
		}
		//------
		for (Musteri item : musteriList) {
			System.out.println("id....: "+item.id);
		}
		
//		Musteri secilenMusteri = musteriList.get(1);
//		secilenMusteri.ad = "Yeni Musteri";
//		secilenMusteri.soyad = "SOYAD";
//		musteriList.set(1, secilenMusteri); //Guncelleme islemi
//		
		// 4- GUNCELLEME
		
//		isimList.set(1, "Yeni String");
//		for (String item : isimList) { 
//			System.out.println(item);
//		}
		
		// 5- NESNE ESLESTIRME - ICERIYOR MU? "contains"
		
		System.out.println(isimList.contains("Ipek")); //true
		
		Musteri mst1 = new Musteri();
		mst1.id = 1212;
		mst1.ad = "Yeni Musteri";
		mst1.soyad = "SOYAD";
		System.out.println(musteriList.contains(mst1));
		System.out.println(musteriList.contains("SOYAD")); //false
		
		// 6- VERILEN NESNENIN INDEX DEGERINI VERIR. BULAMAZSA HER ZAMAN "-1" DONER.
		
		int bulunanIndex = isimList.indexOf("Evren"); //1. index
		System.out.println(bulunanIndex);
		int bulunanIndex1 = isimList.indexOf("Evren2"); // -1
		System.out.println(bulunanIndex1);
		
		// 7- ILGILI LISTE BOS MU -> true/false
		
		List<String> listeBos = new ArrayList<String>();
		boolean durum = listeBos.isEmpty();
		System.out.println(durum);
		listeBos.add("Veli");
		System.out.println(listeBos.isEmpty());
		
		//8- ARAMA ICIN SON DEGERI BULUR
		
		isimList.add("Ipek");
		int indexNo = isimList.lastIndexOf("Ipek");
		System.out.println(indexNo);
		
		// 9- ILGILI KAYDI SILME ISLEMI
		
		isimList.remove(3);
		isimList.remove("Ibrahim");
		
		// 10- BELLI INDISLER ARASINDA BULUNAN KAYILARDAN YENI BIR ALT LIST OLUSTURUR.
		
		List<String> subList = isimList.subList(1, 3);
		
		// 11- TUM BILGILERI SILME - SIFIRLAMA
		
		isimList.clear();
		
		
		
		
		
	}

}

package ba.edu.ibu.ds.week2;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		DinoListV3<String> dls = new DinoListV3<String>();
		dls.add("ado");
		dls.add("dino");
		dls.add("hasan");
		
		for(String el : dls) {
			System.out.println(el);
		}
	}
}

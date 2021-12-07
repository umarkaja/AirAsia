package org.computer;

public class Desktop implements Software,Hardware {
	public void desktopModel() {
		// TODO Auto-generated method stub
		System.out.println("Desktop model Name Is Acer");

System.out.println("Mani edit 7th");

System.out.println("Umar edit 7th");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resourecs Offer in 5%");
		
	}

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources Offer in 3%");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	}

}

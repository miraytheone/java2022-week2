package methods;

public class Methods {

	public static void main(String[] args) {
		findNumber();

	}
	
	public static void findNumber() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean isFind = false;
		for(int number :sayilar) {
			if(number == aranacak) {
				isFind = true;
				break;
			}
			
		}
		
		String message ="";
		if(isFind) {
			message = "Sayi mevcut.";
			giveMessage(message);
		}
		else {
			message = "Sayi mevcut değildir.";
			giveMessage(message);
		}
	}
	
	public static void giveMessage(String message) {
		System.out.println(message);
	}

}

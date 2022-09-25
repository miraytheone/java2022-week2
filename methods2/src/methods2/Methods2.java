package methods2;

public class Methods2 {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = city();
		System.out.println(newMessage);
		
		int number = topla(8,9);
		System.out.println(number);
		
		int sum = topla2(6,9,5,3,6,7);
		System.out.println(sum);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int sum =0;
		for(int sayi: sayilar) {
			sum = sum + sayi;
		}
		
		return sum;
	}
	
	public static String city() {
		return "Ankara";
	}
}

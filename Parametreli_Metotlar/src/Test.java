
public class Test {
			public static void main(String[] args) {
				
				Car car1 = new Car("Dark blue","Mercedes","2022 Model",2,13224.24); // car1 referans değişkenine sahip bir nesne oluşturdum.
								// Bu oluşturduğum objemin class'ının constructor'ı 5 parametre alıyor.
				
				

			String araba_bilgileri =car1.araba_renk_model_modelyılı("Bright Yellow","Audi","2024 Model");
			// Araba rengi , modeli ve model-yılını paramatere olarak girdim ve girdiğim değerleri return ile geri döndürüp değişkenime atadım
			System.out.println(araba_bilgileri);	
				System.out.println(ikisayiyicarp(5, 10)); // İki sayıyı çarptık ve sonucu bir değişkene atadık . O int değişkenide return ile döndürüp ekrana yazdırdık
				System.out.println(isim_soyisim("Ali Osman","Uzun"));
				
				System.out.println(sayilariBol(58, 4));
			}
			
			
	// Metotlar parametreli veya parametresiz olabilir 
	// Parametreli metod demek değer alabilen bir girdi verebildiğimiz metot.
	// Parametresiz metod ise değer verilmeyen bir girdi verilmeyen metottur.
			
			
	// Ayrıca metodlar geriye değer döndürebilirde döndürmeyebilirde.
	// Bir metot geriye değer döndürmüyor ise void ile bunu metodun başında belirtiyoruz.
	// Eğer bir değer döndürüyorsa döndürdüğü değerin veri tipini metodun başında belirtiyoruz.

// Parametreli bir metod tanımı 
public static int ikisayiyicarp(int number1 , int number2) {
	
	int result =(number1*number2);
	 return result; }

// Parametreli ve geriye değer döndüren bir metot 

public static String  isim_soyisim(String name, String surname) {
	
	return name+" "+surname; // geriye name boşluk ve surname parametrelerini döndüren bir metot yazdık.
	
	
}

public static int sayilariBol(int number1, int number2) {
	 return (number1/number2);
}

// return anahtar kelimesi ile geriye metodumun olduğu yere bir değer döndürüyorum
// metot'dan dışarı bir veri , değer aktarmak istiyorsak return kullanırız kısaca .



}


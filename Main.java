

public class Main {

	public static void main(String[] args) {
	 double[] myList = {1.2, 6.3, 4.3, 5.6};
	 double total = 0;
	 double max = myList[0];
	
	 
	 for(double number: myList) {
		 if (max<number) {
			max=number;
		}
		 
		 total = total + number;
		 System.out.println(number);
	 }
	 System.out.println("Toplam=" + total);
	 System.out.println("En Büyük=" + max); 
	 System.out.println("--------------------------------------------");
	 
	 
	 //ÇOK BOYUTLU DİZİLER(MULTI DİMENSİONAL ARRAY)
	 
	 String[][] sehirler = new String [3][3];
	 
	 sehirler [0][0] = "İstanbul" ;
	 sehirler [0][1] = "Bursa" ;
	 sehirler [0][2] = "İzmir" ;
	 sehirler [1][0] = "Ankara" ;
	 sehirler [1][1] = "Düzce" ;
	 sehirler [1][2] = "Konya" ;
	 sehirler [2][0] = "Kocaeli" ;
	 sehirler [2][1] = "Sakarya" ;
	 sehirler [2][2] = "Trabzon" ;
	 
	 for(int i=0; i<=2; i++) {
		 System.out.println("------------");
		 for(int j=0; j<=2; j++) {
			 System.out.println(sehirler[i][j]);
		 }
	  } 
	}
}
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class belajarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		belajarArray ar = new belajarArray();
		ar.latihanSiang();
	}
	public void array() {
	//cara mendeklarasikan
	int[] array;
	int array1[];
	
	array = new int [8];//hanya menambahkan jumlah penampung
	array[0] = 1;
	array[4] = 1;
	int array2[]= {3,4,5,2,5,6,4};// langsung menambahkan dengan isinya
	//array = array2; // MENYAMAKAN ALAMAT,  BUKAN VALUE
	//array[2]=array2[3]; //MENYAMAKAN VALUE, JADI ALAMAT TETAP BERBEDA
	System.out.println("PRINT ARRAY MANUAL :");
	for (int i = 0; i < array2.length ; i++) {
		System.out.print(array2[i]+ " ");
	}
	System.out.println();
	for (int angka : array2 ) { //(penampung : array)
		System.out.print(angka+" ");
		
	}
	
	}
	public void latihanArray() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Masukkan jumlah barang : ");
		int jumlah = scan.nextInt();
		String[] barang = new String[jumlah];
		for (int i = 0; i < jumlah; i++) {
			System.out.print("Masukkan barang ke "+(i+1)+" ");
			barang[i]=scan.next();
		}
		System.out.println("Hasilnya adalah : ");
		System.out.println(Arrays.toString(barang));
		System.out.println();
		for (int i = 0; i < barang.length; i++) {
			System.out.println((i+1)+". "+barang[i]);
		}
	}
	public void latihanSiang() { //INPUT NILAI DAN NAMA , LALU OUTPUTNYA NAMA NILAI DAN GRADE
		Scanner scan = new Scanner (System.in);
		System.out.print("Masukkan jumlah maksimal data : ");
		Integer jumlah = scan.nextInt();
		String[] nama = new String[jumlah];
		Integer[] nilai = new Integer[jumlah];
		String[] rank = new String[jumlah];
		for (int i = 0; i < jumlah; i++) {
			System.out.print("Nama :  ");
			nama[i]=scan.next();
			System.out.print("Nilai : ");
			nilai[i]=scan.nextInt();
			if (nilai[i]>=80) {
				rank[i]="A";
			}
			else if (nilai[i]>65) {
				rank[i]="B";
			}
			else {
				rank[i]="C";
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < jumlah; i++) {
			System.out.println("Nama : "+nama[i]);
			System.out.println("Nilai : "+nilai[i]);
			System.out.println("Rank : "+rank[i]);
			System.out.println();
		}
	}
}

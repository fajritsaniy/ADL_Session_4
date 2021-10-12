import java.util.Scanner;

public class ArrayObjek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayObjek main = new ArrayObjek();
		main.nilaiSemester();
		
	}

	private void insertData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan banyaknya data : ");
		int jmlData = scan.nextInt();
		
		ModelData[] data = new ModelData[jmlData];
		
		for (int i = 0; i < jmlData; i++) {
			data[i]= new ModelData();
			System.out.print("Masukkan nama anda : ");
			String nama = scan.next();
			
			data[i].setNama(nama);
			
			System.out.print("Masukkan alamat anda");
			String alamat = scan.next();
			data[i].setAlamat(alamat);
		}
		
		for (int i = 0; i < jmlData; i++) {
			System.out.println("==============================");
			System.out.println("Nama : "+data[i].getNama());
			System.out.println("Alamat : "+data[i].getAlamat());
			System.out.println("==============================");
		}
		
	}
	private void nilaiSemester() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan banyaknya data : ");
		int jmlData = scan.nextInt();
		
		ModelData[] data = new ModelData[jmlData];
		
		for (int i = 0; i < jmlData; i++) {
			data[i]= new ModelData();
			System.out.print("Masukkan nama anda : ");
			String nama = scan.next();
			
			data[i].setNama(nama);
			
			System.out.print("NIK : ");
			String alamat = scan.next();
			data[i].setAlamat(alamat);
			
			System.out.print("Masukkan nilai semester 1 : ");
			Integer nilai1 = scan.nextInt();
			data[i].setNilai1(nilai1);
			
			System.out.print("Masukkan nilai semester 2 : ");
			Integer nilai2 = scan.nextInt();
			data[i].setNilai2(nilai2);
			
			System.out.print("Masukkan nilai semester 3 : ");
			Integer nilai3 = scan.nextInt();
			data[i].setNilai3(nilai3);
			
		}
		System.out.println("Nama      NIK      Rata-rata");
		for (int i = 0; i < jmlData; i++) {
		
			System.out.println(data[i].getNama()+"  |  "+data[i].getAlamat()+"   |   "+data[i].getRatarata());
		}
		
	}	
}

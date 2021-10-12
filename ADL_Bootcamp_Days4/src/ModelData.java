
public class ModelData {

	private String nama;
	private String alamat;
	private Integer nilai1,nilai2,nilai3;
	private Double ratarata;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public Integer getNilai1() {
		return nilai1;
	}
	public void setNilai1(Integer nilai1) {
		this.nilai1 = nilai1;
	}
	public Integer getNilai2() {
		return nilai2;
	}
	public void setNilai2(Integer nilai2) {
		this.nilai2 = nilai2;
	}
	public Integer getNilai3() {
		return nilai3;
	}
	public void setNilai3(Integer nilai3) {
		this.nilai3 = nilai3;
	}
	public Double getRatarata() {
		return (double) ((nilai1+nilai2+nilai3)/3);
	}


}
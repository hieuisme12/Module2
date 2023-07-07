package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList extends SinhVien {

	public static void main(String[] args) {
	List<SinhVien> students = new ArrayList<>();
	students.add(new SinhVien ("SV003", "Lam Trung Hieu", 2003));
	students.add(new SinhVien ("SV004", "Nguyen Thi To Ly", 2005));
	students.add(new SinhVien ("SV005", "Bui Minh Nhut", 2003));
	students.add(new SinhVien ("SV006", "Phan Thanh Dat", 2003));
	students.add(new SinhVien ("SV007", "Ming Xiao", 2003));
	System.out.println("Danh sach sinh vien:");
	System.out.println("+------+-------------+----+");
	System.out.println("|  Ma  |  Ho va ten  | NS |");
	System.out.println("+------+-------------+----+");
	for (SinhVien sv : students) {
		System.out.format("| %-4s | %-16s | %-8d |\n", sv.getMaSV(), sv.getHoTen(), sv.getNamSinh());
	}
	//them mot sinh vien moi 
	SinhVien sv6 = new SinhVien("SV007", "Nguyen Thi A", 1999);
	students.add(sv6);
	//Xoa mot sinh vien khi biet ma 
	String maSVXoa = "SV003";
	for (SinhVien sv : students) {
		if(sv.getMaSV().equals(maSVXoa)) {
			students.remove(sv);
			break;
		}
	}
	//Sua thong tin cua mot sinh vien
	String maSVSua = "SV005";
	for (SinhVien sv : students) {
		if(sv.getMaSV().equals(maSVSua)) {
			sv.setHoTen("Dang Thi E");
			sv.setNamSinh(2006);
			break;
		}
	}
	//tim kiem sinh vien theo ma
	String maTimKiem = "SV001";
	for (SinhVien sv : students) {
		if(sv.getMaSV().equals(maTimKiem)) {
			System.out.println("tim thay sinh vien co ma"+maTimKiem+":"+sv.getHoTen()+","+sv.getNamSinh());
			break;
		}
	}
	//Sap xep sinh vien theo ma tang dan
	Collections.sort(students, new Comparator<SinhVien>() {
		public int compare(SinhVien sv1, SinhVien sv2) {
			// TODO Auto-generated method stub
			return sv1.getMaSV().compareTo(sv2.getMaSV());
		}
	});
	//in ra man hinh danh sach sau khi sap xep
	System.out.println("Danh sach sinh vien khi sap xep tang dan la : ");
	System.out.println("+-------+------------------+----------+");
	System.out.println("|   Ma  |    Ho va ten     | NS       |");
	System.out.println("+-------+------------------+----------+");
	for (SinhVien sv : students) {
		System.out.format("| %-4s | %-16s | %-8d |\n", sv.getMaSV(), sv.getHoTen(), sv.getNamSinh());
	}
		}
	public StudentList(String maSV, String hoTen, int namSinh) {
	super(maSV, hoTen, namSinh);
}
}

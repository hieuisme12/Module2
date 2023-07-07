package Module2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class SinhVien {
		private String maSV;
		private String hoTen;
		private int namSinh;
		
		public SinhVien(String maSV, String hoTen, int namSinh) {
			super();
			setMaSV(maSV);
			setHoTen(hoTen);
			setNamSinh (namSinh);
		}
		public String getMaSV() {
			return maSV;
		}
		public void setMaSV(String maSV) {
			if(maSV.equals(""))
				this.maSV = "XXXX";
			else
				this.maSV = maSV;
		}
		public String getHoTen() {
			return hoTen;
		}
		public void setHoTen(String hoTen) {
			if(hoTen.equals(""))
			this.hoTen = "XXX";
			else
				this.hoTen = hoTen;
		}
		public int getNamSinh() {
			return namSinh;
		}
		public void setNamSinh(int namSinh) {
			if(namSinh>0)
			this.namSinh = namSinh;
			else 
				this.namSinh = 0;
		}
		
		
}

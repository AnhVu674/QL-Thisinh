package Project_SV;

import java.sql.Date;
import java.util.Objects;

public class thiSinh {
	private int maThiSinh;
	private String tenThiSinh;
	private Tinh queQuan;
	private Date ngaySinh;
	private boolean gioiTinh;
	private float diemToan, diemLy, diemHoa;

	public thiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float toan,
			float ly, float hoa) {
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemHoa, diemLy, diemToan, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		thiSinh other = (thiSinh) obj;
		return Float.floatToIntBits(diemHoa) == Float.floatToIntBits(other.diemHoa)
				&& Float.floatToIntBits(diemLy) == Float.floatToIntBits(other.diemLy)
				&& Float.floatToIntBits(diemToan) == Float.floatToIntBits(other.diemToan) && gioiTinh == other.gioiTinh
				&& maThiSinh == other.maThiSinh && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(queQuan, other.queQuan) && Objects.equals(tenThiSinh, other.tenThiSinh);
	}

	@Override
	public String toString() {
		return "thiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
				+ ngaySinh + ", gioiTinh=" + gioiTinh + ", Toan=" + diemToan + ", Ly=" + diemLy + ", Hoa=" + diemHoa + "]";
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}

	public Tinh getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(Tinh queQuan) {
		this.queQuan = queQuan;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public float getToan() {
		return diemToan;
	}

	public void setToan(float toan) {
		this.diemToan = diemToan;
	}

	public float getLy() {
		return diemLy;
	}

	public void setLy(float ly) {
		this.diemLy = diemLy;
	}

	public float getHoa() {
		return diemHoa;
	}

	public void setHoa(float hoa) {
		this.diemHoa = diemHoa;
	}

	public thiSinh() {

	}
}

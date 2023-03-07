package Project_SV;

import java.util.ArrayList;

public class QLThiSinh {
	private ArrayList<thiSinh> dsthiSinh;
	String luaChon;

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public ArrayList<thiSinh> getDsthiSinh() {
		return dsthiSinh;
	}

	public void setDsthiSinh(ArrayList<thiSinh> dsthiSinh) {
		this.dsthiSinh = dsthiSinh;
	}

	public QLThiSinh() {
		this.dsthiSinh = new ArrayList<thiSinh>();
	}

	public QLThiSinh(ArrayList<thiSinh> dsthiSinh) {
		this.dsthiSinh = dsthiSinh;
	}

	public void insertThiSinh(thiSinh thiSinh) {
		this.dsthiSinh.add(thiSinh);
	}

	public void updateThiSinh(thiSinh thiSinh) {
		this.dsthiSinh.remove(thiSinh);
		this.dsthiSinh.add(thiSinh);
	}

	public void deleteThiSinh(thiSinh thiSinh) {
		this.dsthiSinh.remove(thiSinh);
	}

	public boolean kiemTraTonTai(thiSinh ts) {
			for(thiSinh thiSinh: dsthiSinh) {
				if(thiSinh.getMaThiSinh() == ts.getMaThiSinh())
					return true;
			}
			return false;
	}
}


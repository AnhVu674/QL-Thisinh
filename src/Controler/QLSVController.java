package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Project_SV.Tinh;
import Project_SV.thiSinh;
import View.QLSVView;

public class QLSVController implements ActionListener {
	public QLSVView view;
	private JComboBox table;

	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn: " + cm);
		if (cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (cm.equals("Lưu")) {
			try {
//				int maThiSinh = Integer.valueOf(this.view.textField_1.getText());
//				String tenThiSinh = this.view.textField_3.getText();
//				int queQuan = this.view.comboBox_1.getSelectedIndex();
//				Tinh tinh = Tinh.getByID(queQuan);
//				Date ngaySinh = new Date(this.view.textField_4.getText());
//				boolean gioiTinh = true;
//				String chonGioiTinh = this.view.btn_gioiTinh.getSelection() + "";
//				if (chonGioiTinh.equals("Nam")) {
//					gioiTinh = true;
//				} else if (chonGioiTinh.equals("Nữ")) {
//					gioiTinh = false;
//				}
//				Float diemToan = Float.valueOf(this.view.textField_5.getText());
//				Float diemLy = Float.valueOf(this.view.textField_6.getText());
//				Float diemHoa = Float.valueOf(this.view.textField_7.getText());
//				thiSinh ts = new thiSinh(maThiSinh, tenThiSinh, tinh, (java.sql.Date) ngaySinh, gioiTinh, diemToan,
//						diemLy, diemHoa);
//				if (this.view.model.getLuaChon().equals("") || this.view.model.getLuaChon().equals("Lưu")) {
//					this.view.themThiSinh(ts);
//					DefaultTableModel model = (DefaultTableModel) table.getModel();
//					model.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh(),
//							ts.getQueQuan().getTenTinh(), (ts.isGioiTinh() ? "Nam" : "Nữ"), ts.getToan() + "",
//							ts.getLy() + "", ts.getHoa() + "", ts.getNgaySinh().toString() });
//				} else if (this.view.model.getLuaChon().equals("Cập nhật")) {
//
//					this.view.capNhatThiSinh();
//				}
				this.view.thucHienThemThiSinh();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import Controler.QLSVController;
import Project_SV.QLThiSinh;
import Project_SV.Tinh;
import Project_SV.thiSinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;

public class QLSVView extends JFrame {
	public QLThiSinh model;
	public JTextField textField;
	public JTable table;
	public JTextField textField_1;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JComboBox comboBox_1;
	public ButtonGroup btn_gioiTinh;
	public ButtonGroup rdbtnNewRadioButton;
	public Object rdbtnN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLThiSinh();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 673);

		ActionListener action = new QLSVController(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setForeground(new Color(255, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);

		JMenuItem MenuOpen = new JMenuItem("Open");
		MenuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(MenuOpen);

		JMenuItem MenuClose = new JMenuItem("Close");
		MenuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(MenuClose);

		JMenuItem MenuExit = new JMenuItem("Exit");
		MenuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(MenuExit);

		JMenu MenuAbout = new JMenu("About");
		MenuAbout.setForeground(new Color(255, 0, 0));
		MenuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(MenuAbout);

		JMenuItem mntmNewMenuItem = new JMenuItem("About me");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		MenuAbout.add(mntmNewMenuItem);
		getContentPane().setLayout(null);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(1188, -5, -1191, 181);
		getContentPane().add(verticalBox);

		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBounds(10, 118, 877, 202);
		getContentPane().add(verticalBox_1);

		JLabel lblDanhSchSinh = new JLabel("Danh sách sinh viên");
		lblDanhSchSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		verticalBox_1.add(lblDanhSchSinh);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 SV", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m to\u00E1n", "\u0110i\u1EC3m l\u00FD", "\u0110i\u1EC3m h\u00F3a", "Ng\u00E0y sinh"
			}
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 2, 2);
		verticalBox_1.add(scrollPane);

		JLabel lblNewLabel = new JLabel("Quê quán");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(96, 10, 86, 39);
		getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox.addItem(tinh);
		}
		comboBox.setBounds(193, 10, 359, 39);
		getContentPane().add(comboBox);

		JLabel lblMSinhVien = new JLabel("Mã sinh viên");
		lblMSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMSinhVien.setBounds(554, 10, 119, 39);
		getContentPane().add(lblMSinhVien);

		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(812, 10, 85, 45);
		getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(683, 10, 119, 45);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblMSinhVien_1 = new JLabel("Mã sinh viên");
		lblMSinhVien_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMSinhVien_1.setBounds(64, 367, 110, 25);
		getContentPane().add(lblMSinhVien_1);

		JLabel lblThngTinTh = new JLabel("Thông tin thí sinh");
		lblThngTinTh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThngTinTh.setBounds(20, 330, 157, 25);
		getContentPane().add(lblThngTinTh);

		JLabel lblMacThSinh = new JLabel("Quê quán");
		lblMacThSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMacThSinh.setBounds(64, 402, 97, 25);
		getContentPane().add(lblMacThSinh);

		JLabel lblGiiTnh = new JLabel("Giới tính");
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiiTnh.setBounds(516, 367, 74, 25);
		getContentPane().add(lblGiiTnh);

		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHVTn.setBounds(74, 437, 86, 25);
		getContentPane().add(lblHVTn);

		JLabel lblNgySinh = new JLabel("Ngày sinh");
		lblNgySinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgySinh.setBounds(64, 477, 87, 25);
		getContentPane().add(lblNgySinh);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(219, 367, 129, 25);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(219, 444, 129, 25);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(219, 484, 129, 25);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(609, 369, 103, 21);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnN = new JRadioButton("Nữ");
		rdbtnN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnN.setBounds(710, 369, 103, 21);
		getContentPane().add(rdbtnN);
		
		ButtonGroup btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(rdbtnNewRadioButton);
		btn_gioiTinh.add(rdbtnN);

		JLabel lblimTon = new JLabel("Điểm toán");
		lblimTon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblimTon.setBounds(516, 412, 110, 25);
		getContentPane().add(lblimTon);

		JLabel lblimL = new JLabel("Điểm lý");
		lblimL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblimL.setBounds(516, 447, 74, 25);
		getContentPane().add(lblimL);

		JLabel lblimHa = new JLabel("Điểm hóa");
		lblimHa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblimHa.setBounds(516, 477, 97, 25);
		getContentPane().add(lblimHa);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(627, 409, 129, 25);
		getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(627, 447, 129, 25);
		getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(627, 484, 129, 25);
		getContentPane().add(textField_7);

		JButton btnNewButton_1 = new JButton("Lưu");
		btnNewButton_1.addActionListener(action);
		btnNewButton_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(74, 535, 111, 39);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.addActionListener(action);
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1_1.setBounds(219, 535, 111, 39);
		getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Cập nhật");
		btnNewButton_1_2.addActionListener(action);
		btnNewButton_1_2.setForeground(Color.RED);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(new Color(0, 255, 64));
		btnNewButton_1_2.setBounds(367, 535, 111, 39);
		getContentPane().add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("Thêm");
		btnNewButton_1_3.addActionListener(action);
		btnNewButton_1_3.setForeground(Color.RED);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3.setBackground(new Color(0, 255, 64));
		btnNewButton_1_3.setBounds(526, 535, 111, 39);
		getContentPane().add(btnNewButton_1_3);

		JButton btnNewButton_1_4 = new JButton("Thoát");
		btnNewButton_1_4.addActionListener(action);
		btnNewButton_1_4.setForeground(Color.RED);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_4.setBackground(new Color(0, 255, 64));
		btnNewButton_1_4.setBounds(698, 535, 111, 39);
		getContentPane().add(btnNewButton_1_4);

		comboBox_1 = new JComboBox();
		ArrayList<Tinh> listTinh1 = Tinh.getDSTinh();
		comboBox_1.addItem("");
		for (Tinh tinh : listTinh1) {
			comboBox_1.addItem(tinh);
		}
		comboBox_1.setBounds(219, 408, 129, 25);
		getContentPane().add(comboBox_1);
		this.setVisible(true);
	}

	public void xoaForm() {
		textField.setText("");
		textField_1.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		comboBox_1.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
		rdbtnNewRadioButton.clearSelection();
		//btn_gioiTinh.remove((AbstractButton) rdbtnNewRadioButton);
//rdbtnN.clearSelection();
	}

	public void themThiSinh(thiSinh ts) {
		this.model.insertThiSinh(ts);
	}
	public void themThiSinhVaoTable(thiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh(), ts.getQueQuan().getTenTinh(),
				ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
						+ (ts.getNgaySinh().getYear() + 1900),
				(ts.isGioiTinh() ? "Nam" : "Nữ"), ts.getToan() + "", ts.getLy() + "",
				ts.getHoa() + "", });
	}
	
	public void thucHienThemThiSinh() {
		// Get du lieu
		int maThiSinh = Integer.valueOf(this.textField_1.getText());
		String tenThiSinh = this.textField_3.getText();
		int queQuan = this.comboBox_1.getSelectedIndex();
		Tinh tinh = Tinh.getByID(queQuan);
		Date ngaySinh = new Date(this.textField_4.getText());
		boolean gioiTinh = true;
		String chonGioiTinh = this.btn_gioiTinh.getSelection() + "";
		if (chonGioiTinh.equals("Nam")) {
			gioiTinh = true;
		} else if (chonGioiTinh.equals("Nữ")) {
			gioiTinh = false;
		}
		Float diemToan = Float.valueOf(this.textField_5.getText());
		Float diemLy = Float.valueOf(this.textField_6.getText());
		Float diemHoa = Float.valueOf(this.textField_7.getText());
		thiSinh ts = new thiSinh(maThiSinh, tenThiSinh, tinh, (java.sql.Date) ngaySinh, gioiTinh, diemToan,
				diemLy, diemHoa);
		this.themHoacCapNhatThiSinh(ts);
	}


	public void themHoacCapNhatThiSinh(thiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.kiemTraTonTai(ts)) {
			this.model.insertThiSinh(ts);
			this.themThiSinhVaoTable(ts);
		} else {
			this.model.updateThiSinh(ts);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(ts.getMaThiSinh() + "")) {
					model_table.setValueAt(ts.getMaThiSinh() + "", i, 0);
					model_table.setValueAt(ts.getTenThiSinh() + "", i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh() + "", i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
							+ (ts.getNgaySinh().getYear() + 1900) + "", i, 3);
					model_table.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ"), i, 4);
					model_table.setValueAt(ts.getToan() + "", i, 5);
					model_table.setValueAt(ts.getLy() + "", i, 6);
					model_table.setValueAt(ts.getHoa() + "", i, 7);
				}
			}
		}
	}
	public void capNhatThiSinh() {
		
	}
}

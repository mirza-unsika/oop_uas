package Pkg;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {
    private JFrame frmBusSystemBy;
    private ImageIcon imageIcon;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu window = new MainMenu();
                    window.frmBusSystemBy.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainMenu() {
        initialize();
    }
    public JFrame getFrame() {
        return frmBusSystemBy;
    }
    private void initialize() {
        frmBusSystemBy = new JFrame();
        frmBusSystemBy.setTitle("Bus System By Kelompok 5");
        frmBusSystemBy.setBounds(100, 100, 777, 463);
        frmBusSystemBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ganti path gambar sesuai dengan lokasi gambar Anda
        String imagePath = "D:\\Download\\aINmBZ.png";
        imageIcon = new ImageIcon(imagePath);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setBackground(new Color(0, 0, 0));
        frmBusSystemBy.getContentPane().add(panel, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255, 100));
        
        JButton btnCekSaldo = new JButton("Cek Saldo");
        
        JButton btnDepostio = new JButton("Deposito");
        btnDepostio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        JButton btnRiwayat = new JButton("Riwayat");
        
        JButton btnRuteDanJadwal = new JButton("Rute dan jadwal");
        
        JButton btnDepostio_1 = new JButton("Beli Tiket");
        
        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnDepostio, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(btnRuteDanJadwal, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(btnKeluar, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(btnRiwayat, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(btnCekSaldo, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(btnDepostio_1, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnRuteDanJadwal, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addComponent(btnDepostio, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(39)
        			.addComponent(btnDepostio_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addComponent(btnCekSaldo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addGap(39)
        			.addComponent(btnRiwayat, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addGap(37)
        			.addComponent(btnKeluar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255, 100));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        		.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        			.addGap(392))
        );
        panel_2.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Welcome, mirza");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(34, 10, 97, 13);
        panel_2.add(lblNewLabel);
        panel.setLayout(gl_panel);
    }
}

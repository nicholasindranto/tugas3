package tugas3;

import javax.swing.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener {

    JLabel luas = new JLabel();
    JLabel keliling = new JLabel();
    JLabel luasPermukaan = new JLabel();
    JLabel volume = new JLabel();
    JLabel judul = new JLabel("KALKULATOR BALOK");

    final JTextField p = new JTextField(10);
    JLabel panjang = new JLabel("Panjang");
    final JTextField l = new JTextField(10);
    JLabel lebar = new JLabel("Lebar");
    final JTextField t = new JTextField(10);
    JLabel tinggi = new JLabel("Tinggi");

    JLabel hasil = new JLabel("Hasil  :");

    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");

    public GUI() {
        setTitle("Kalkulator Balok");
        setSize(400, 400);

        hitung.addActionListener(this);
        reset.addActionListener(this);

        setLayout(null);
        add(judul);
        add(p);
        add(panjang);
        add(l);
        add(lebar);
        add(t);
        add(tinggi);
        add(hasil);
        add(hitung);
        add(reset);

        judul.setBounds(135, 20, 200, 20);
        p.setBounds(130, 65, 200, 20);
        panjang.setBounds(50, 65, 150, 20);
        l.setBounds(130, 95, 200, 20);
        lebar.setBounds(50, 95, 150, 20);
        t.setBounds(130, 125, 200, 20);
        tinggi.setBounds(50, 125, 150, 20);
        hasil.setBounds(150,160,120,20);
        hitung.setBounds(95, 320, 100, 20);
        reset.setBounds(205, 320, 100, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitung) {
            try {
                remove(luas);
                remove(keliling);
                remove(volume);
                remove(luasPermukaan);

                if (p.getText().isEmpty() || l.getText().isEmpty() || t.getText().isEmpty()){
                    throw new RuntimeException("empty String");
                }

                double panjang = Double.parseDouble(p.getText());
                double lebar = Double.parseDouble(l.getText());
                double tinggi = Double.parseDouble(t.getText());
                Balok balok = new Balok(panjang, lebar, tinggi);
                luas = new JLabel("Luas Persegi                    :   " + balok.luas());
                keliling = new JLabel("Keliling Persegi                :   " + balok.keliling());
                volume = new JLabel("Volume Balok                   :   " + balok.volume());
                luasPermukaan = new JLabel("Luas Permukaan Balok :   " + balok.luasPermukaan());

                add(luas);
                add(keliling);
                add(volume);
                add(luasPermukaan);

                luas.setBounds(50, 190, 350, 20);
                keliling.setBounds(50, 220, 350, 20);
                volume.setBounds(50, 250, 350, 20);
                luasPermukaan.setBounds(50, 280, 350, 20);

            } catch (Exception E) {
                JOptionPane optionPane = new JOptionPane(E.getMessage(), JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Inputan Error!");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);

            }

        }
        
        if (e.getSource() == reset) {
            p.setText("");
            l.setText("");
            t.setText("");
            luas.setText("");
            keliling.setText("");
            volume.setText("");
            luasPermukaan.setText("");
        }
    }
}
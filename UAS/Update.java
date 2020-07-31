/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lintang Dwi
 */
public class Update {

    Koneksi konek = new Koneksi();

    public void update(int nomor, String nama, String namabuku, String jenis, int nomorbuku) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_nama = "update dataperpus set nama ='" + nama + "' where nomor= '" + nomor + "'";
            String sql_namabuku = "update dataperpus set namabuku ='" + namabuku + "' where nomor= '" + nomor + "'";

            String sql_jenis = "update dataperpus set jenis ='" + jenis + "' where nomor= '" + nomor + "'";
            String sql_nomorbuku = "update dataperpus set nomorbuku ='" + nomorbuku + "' where nomor= '" + nomor + "'";
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_namabuku);
            statement.executeUpdate(sql_jenis);

            statement.executeUpdate(sql_nomorbuku);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

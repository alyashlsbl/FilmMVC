
package MVC;

import java.sql.Statement;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class FilmView extends JFrame{
    
    JLabel ljudul, ltipe, lstatus, lepisode, lrating, lgenre;
    JTextField txjudul, txtipe, txepisode, txrating, txgenre, txsearch;
    JComboBox status;
    JButton search, refresh, create, update, delete, exit;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"#", "ID", "Judul", "Tipe", "Episode", "Genre", "Status", "Rating"};
    Statement statement;
    
    public FilmView(){
        
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        ljudul = new JLabel("Judul");
        ltipe = new JLabel("Tipe");
        lepisode = new JLabel("Episode");
        lrating = new JLabel("Rating");
        lgenre = new JLabel("Genre");
        
        txjudul = new JTextField("");
        txtipe = new JTextField("");
        txepisode = new JTextField("");
        txrating = new JTextField("");
        txgenre = new JTextField("");
        txsearch = new JTextField("");
        
        String[] stat = {"Completed","On Going"};
        status = new JComboBox(stat);
        
        search = new JButton("Search");
        refresh = new JButton("Refresh");
        create = new JButton("Create");
        update = new JButton("Update");
        delete = new JButton("Delete");
        exit = new JButton("Exit");
        
        setLayout(null);
        add(ljudul);
        add(ltipe);
        add(lstatus);
        add(lepisode);
        add(lgenre);
        add(lrating);
        add(txjudul);
        add(txtipe);
        add(txepisode);
        add(txgenre);
        add(txrating);
        add(txsearch);
        add(status);
        add(search);
        add(refresh);
        add(create);
        add(update);
        add(delete);
        add(exit);
        add(scrollPane);
        
        ljudul.setBounds(50, 220, 50, 20);
        ltipe.setBounds(50, 270, 50, 20);
        lstatus.setBounds(180, 270, 50, 20);
        lepisode.setBounds(50, 320, 70, 20);
        lrating.setBounds(180, 320, 70, 20);
        lgenre.setBounds(50, 370, 50, 20);
        txjudul.setBounds(50, 240, 200, 20);
        txtipe.setBounds(50, 290, 100, 20);
        status.setBounds(180, 290, 70, 20);
        txepisode.setBounds(50, 340, 100, 20);
        txrating.setBounds(180, 340, 100, 20);
        txgenre.setBounds(50, 390, 200, 20);
        txsearch.setBounds(350, 240, 100, 20);
        search.setBounds(470, 240, 70, 20);
        refresh.setBounds(300, 390, 70, 20);
        update.setBounds(390, 390, 70, 20);
        delete.setBounds(480, 390, 70, 20);
        exit.setBounds(590, 390, 70, 20);
        scrollPane.setBounds(50, 20, 1000, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        setSize(1100,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public String getJudul(){
        return txjudul.getText();
    }
    public String getTipe(){
        return txtipe.getText();
    }
    public String getEpisode(){
        return txepisode.getText();
    }
    public String getGenre(){
        return txgenre.getText();
    }
    public String getRating(){
        return txrating.getText();
    }
    public String getStatus(){
        return status.getSelectedItem().toString();
    }
    public String getSearch(){
        return txsearch.getText();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Ditya RA
 */
public class FXMLKesehatanController implements Initializable {

    @FXML
    private TextArea hasil;
    @FXML
    private RadioButton laki;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton perempuan;
    @FXML
    private TextField nama;
    @FXML
    private TextField bb;
    @FXML
    private TextField tb;
    @FXML
    private TextField editbb;
    @FXML
    private Button ok;
    @FXML
    private Button res;
    @FXML
    private TextArea saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String jk;
        String asaran = null;
        int berat = 0;
        String analisa = null;
        String editnama=nama.getText();
        int ediitbb = Integer.parseInt(bb.getText());
        int edittb = Integer.parseInt(tb.getText());
        
        if (laki.isSelected()){
            jk ="Laki - laki";
            berat = edittb - 110;
            if(berat == ediitbb){
                analisa="ideal";
                asaran="ok sip";
            }
            else if (berat > ediitbb){
                analisa="Under";
                asaran="maakan banyak minum susu boi";
            }
            else if (berat < ediitbb){
                analisa="Over";
                asaran="maakan sedikit jangan minum susu boi";
            }
        }
        else if (perempuan.isSelected()){
            jk="perempuan";
            berat = edittb - 100;
            if(berat == ediitbb){
                analisa="ideal";
                asaran="ok sip";
            }
            else if (berat > ediitbb){
                analisa="Under";
                asaran="maakan banyak minum susu boi";
            }
            else if (berat < ediitbb){
                analisa="Over";
                asaran="maakan sedikit jangan minum susu boi";
            }
        }
        editbb.setText("" +berat);
        hasil.setText("Berat badan : "+ediitbb+"\n Tinggi badan : "+edittb+"\n Analisa : "+analisa);
        saran.setText("" +asaran);
    }

    @FXML
    private void reset(ActionEvent event) {
        editbb.setText("");
        hasil.setText("");
        saran.setText("");
        nama.setText("");
        bb.setText("");
        tb.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
    }
    
}

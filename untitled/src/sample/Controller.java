package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller
{
    @FXML
    VBox po;
    @FXML
    HBox spr;
    @FXML
    ChoiceBox godzina, minuty, dzien, tydzien, glosnosc;
    @FXML
    TextField nazwa;
    @FXML
    Label wyswietlanie;
    int cos = 0;
    public void dodawanie(ActionEvent actionEvent) {
       po.setVisible(false);

       if(cos == 0)
       {
           godzina.getItems().addAll("1", "2", "3","4", "5", "6","7", "8", "9","10", "11", "12","13", "14", "15","16", "17", "18","19", "20", "21","22", "23", "00");
           minuty.getItems().addAll("00","05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55");
           dzien.getItems().addAll("pon", "wt", "sr", "czw", "pt", "sb", "nd");
           tydzien.getItems().addAll("tak", "nie");
           glosnosc.getItems().addAll("1", "2", "3","4", "5", "6");
           cos = 1;
       }
       spr.setVisible(true);
    }

    public void zakoncz(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void anuluj(ActionEvent actionEvent) {
        spr.setVisible(false);
        po.setVisible(true);
    }

    public void zatwierdzenie(ActionEvent actionEvent)
    {
        spr.setVisible(false);
        po.setVisible(true);
        wyswietlanie.setText(wyswietlanie.getText() + "\n" + nazwa.getText() + "   " + godzina.getValue() + ":" + minuty.getValue() + "  dzien tygodnia:  " + dzien.getValue() + ",  glosnosc:  " + glosnosc.getValue() + ",  czy powtarzac: " + tydzien.getValue());
    }
}

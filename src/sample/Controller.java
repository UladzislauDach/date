package sample;

import java.net.URL;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField day;

    @FXML
    private TextField month;

    @FXML
    private TextField year;

    @FXML
    private Button ok;

    @FXML
    private Text text;

    @FXML
    void initialize() {
        assert day != null : "fx:id=\"day\" was not injected: check your FXML file 'sample.fxml'.";
        assert month != null : "fx:id=\"month\" was not injected: check your FXML file 'sample.fxml'.";
        assert year != null : "fx:id=\"year\" was not injected: check your FXML file 'sample.fxml'.";
        assert ok != null : "fx:id=\"ok\" was not injected: check your FXML file 'sample.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'sample.fxml'.";
        ok.setOnAction(event -> {

            int aYear = Integer.parseInt(year.getText());
            int aMonth = Integer.parseInt(month.getText());
            int aDay = Integer.parseInt(day.getText());

            Calendar cal1 = new GregorianCalendar();
            Calendar cal2 = new GregorianCalendar();


            cal1.set(aYear, aMonth - 1, aDay);
            int res = daysBetween(cal1.getTime(), cal2.getTime());
            text.setText("Вы живёте " + res + " дней");


        });


    }

    private int daysBetween(java.util.Date d1, java.util.Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }


}
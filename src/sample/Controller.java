package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField vahaTextField;
    public TextField vyskaTextField;
    public Label vysledekLabel;
    public Label vysledekBMILabel;

    public void vypocitejBMI(ActionEvent actionEvent) {
        float vaha = Float.parseFloat(vahaTextField.getText());
        float vyska = Float.parseFloat(vyskaTextField.getText());

        float bmi = vaha / (vyska * vyska);

        vysledekBMILabel.setText("Vase BMI je: " + String.valueOf(bmi));

        if(bmi <= 16.5){
            vysledekLabel.setText("Tezka podvyziva");
        } else if (bmi <= 18.5){
            vysledekLabel.setText("Podvaha");
        } else if (bmi <= 25){
            vysledekLabel.setText("Idealni (zdrava) vaha");
        } else if (bmi <= 30){
            vysledekLabel.setText("Nadvaha");
        } else if (bmi <= 35){
            vysledekLabel.setText("Obezita 1. stupne");
        } else if (bmi <= 40){
            vysledekLabel.setText("Obezita 2. stupne");
        } else {
            vysledekLabel.setText("Obezita 3. stupne");
        }

    }
}

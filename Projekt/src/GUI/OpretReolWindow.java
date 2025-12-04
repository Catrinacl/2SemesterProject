package GUI;


import Model.Hylde;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OpretReolWindow extends Stage {
    private Hylde hylde;

    private TextField txfReolId;
    private TextField txfReolType;
    private TextField txfLager;

    private final ListView<Hylde> lvwHylde = new ListView<>();
    private final ListView<Hylde> lvwIndhold = new ListView<>();

    private Button btnOpret = new Button("Opret Fad");

   /* public OpretHyldeWindow() {
       // this.initMoality(Modality.APPLICATION_MODAL);
        this.setTitle("Opret Fad");

    } */

}

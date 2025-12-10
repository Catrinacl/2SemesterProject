package GUI;

import Controller.Controller;
import Model.LagerMedarbejder;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OpretMedarbejderWindow extends Stage {
    private TextField txfMedarbejderID = new TextField();
    private TextField txfNavn = new TextField();
    private Button btnOpretMedarbejder = new Button("Opret Medarbejder");

    public OpretMedarbejderWindow() {
        this.initModality(Modality.APPLICATION_MODAL);
        this.setTitle("Opret Medarbejder");

        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblHeader = new Label("Opret Ny Medarbejder");
        pane.add(lblHeader, 0, 0, 2, 1);
        lblHeader.setFont(new Font(20));

        pane.add(new Label("Medarbejder ID:"), 0, 1);
        pane.add(txfMedarbejderID, 0, 2);
        pane.add(new Label("Navn:"), 0, 3);
        pane.add(txfNavn, 0, 4);
        pane.add(btnOpretMedarbejder, 0, 5);
        btnOpretMedarbejder.setOnAction(event -> this.opretMedarbejderAction());

    }

    private void opretMedarbejderAction() {
        if (txfMedarbejderID.getText().isEmpty() || txfNavn.getText().isEmpty()) {
            System.out.println("Alle felter skal udfyldes!");
            return;
        }
        LagerMedarbejder lagerMedarbejder = Controller.createLagerMedarbejder(txfMedarbejderID.getText(), txfNavn.getText());
        this.close();

    }

}

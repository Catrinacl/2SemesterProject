package GUI;

import Controller.Controller;
import Model.Destillat;
import Model.Destillering;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OpretDestillatWindow extends Stage {
    private Destillat destillat;

    private TextField txfDestillatId = new TextField();
    private TextField txfNewMakeId = new TextField();
    private TextField txfMængde = new TextField();
    private TextField txfAlkoholPc = new TextField();
    private TextField txfTotalMængde = new TextField();

    private final ListView<Destillering> lvwDestillering = new ListView<>();
    private final ListView<Destillering> lvwIndhold = new ListView<>();

    public OpretDestillatWindow() {
        this.initModality(Modality.APPLICATION_MODAL);
        this.setTitle("Opret Destillat");

        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblHeader = new Label("Opret Nyt Destillat");
        pane.add(lblHeader, 0, 0, 2, 1);

        Label lblDestillinger = new Label("Vælg Destillering(er)");
        pane.add(lblDestillinger, 0, 1);
        pane.add(lvwDestillering, 0, 2, 1, 1);
        lvwDestillering.setPrefHeight(40);
        lvwDestillering.setPrefWidth(10);
        lvwDestillering.getItems().setAll(Controller.getDestilleringer());
        pane.add(new Label("Vælg Mængde:"), 0, 3);
        pane.add(txfMængde, 1, 3);

        pane.add(new Label("Destillat ID:"), 0, 5);
        pane.add(new Label("New Make Nr:"), 0, 6);
        pane.add(new Label("Alkohol %:"), 0, 7);

        pane.add(txfDestillatId, 1, 5);
        pane.add(txfNewMakeId, 1, 6);
        pane.add(txfAlkoholPc, 1, 7);


        Label lblIndhold = new Label("Valgt indhold:");
        pane.add(lblIndhold, 0, 9);
        pane.add(lvwIndhold, 0, 10);
        lvwIndhold.setPrefHeight(15);
        lvwIndhold.setPrefWidth(10);
        pane.add(txfTotalMængde, 1, 10);
        pane.add(new Label("Liter"), 2, 10);


    }
}

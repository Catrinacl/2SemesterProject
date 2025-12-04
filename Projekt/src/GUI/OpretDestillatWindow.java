package GUI;

import Controller.Controller;
import Model.Destillat;
import Model.Destillering;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;

public class OpretDestillatWindow extends Stage {
    private Destillat destillat;
    private Destillering destillering;

    private TextField txfDestillatId = new TextField();
    private TextField txfNewMakeId = new TextField();
    private TextField txfMængde = new TextField();
    private TextField txfAlkoholPc = new TextField();
    private TextField txfTotalMængde = new TextField();

    private final ListView<Destillering> lvwDestillering = new ListView<>();
    private final ListView<String> lvwIndhold = new ListView<>();

    private Button btnOpret = new Button("Opret Destillat");

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
        lblHeader.setFont(new Font(20));

        Label lblDestillinger = new Label("Vælg Destillering(er):");
        pane.add(lblDestillinger, 0, 1);
        pane.add(lvwDestillering, 0, 2);
        lvwDestillering.setPrefHeight(40);
        lvwDestillering.setPrefWidth(10);
        lvwDestillering.getItems().setAll(Controller.getDestilleringer());
        pane.add(new Label("Vælg Mængde:"), 1, 1);
        pane.add(txfMængde, 1, 2);
        txfMængde.setPrefHeight(10);
        txfMængde.setPrefWidth(10);

        pane.add(new Label("Destillat ID:"), 0, 5);
        pane.add(new Label("New Make Nr:"), 0, 6);
        pane.add(new Label("Alkohol %:"), 0, 7);

        pane.add(txfDestillatId, 1, 5);
        pane.add(txfNewMakeId, 1, 6);
        pane.add(txfAlkoholPc, 1, 7);


        Label lblIndhold = new Label("Valgt indhold:");
        pane.add(lblIndhold, 0, 10);
        pane.add(lvwIndhold, 0, 11);
        lvwIndhold.setPrefHeight(15);
        lvwIndhold.setPrefWidth(10);
        lvwIndhold.setDisable(true);
        pane.add(txfTotalMængde, 1, 11);
        txfTotalMængde.setEditable(false);
        txfTotalMængde.setDisable(true);
        pane.add(new Label("Liter"), 2, 11);

        pane.add(btnOpret, 0, 12);
        btnOpret.setOnAction(event -> this.opretDestillatAction());




        lvwDestillering.getItems().setAll(Controller.getDestilleringer());
        lvwDestillering.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //når destillering vælges popper ID'et op i lvwIndhold i bunden
        lvwDestillering.getSelectionModel().getSelectedItems().addListener((ListChangeListener<Destillering>) change -> {
            lvwIndhold.getItems().clear();

            for (Destillering d : lvwDestillering.getSelectionModel().getSelectedItems()) {
                lvwIndhold.getItems().add(d.getDistilleringsID());
            }
        });

        txfMængde.textProperty().addListener((obs, oldVal, newVal) -> {
            beregnTotalMaengde();
        });

    }

    private void beregnTotalMaengde() {
        try {
            double total = Double.parseDouble(txfMængde.getText());
            txfTotalMængde.setText(total + "");
        } catch (NumberFormatException e) {
            txfTotalMængde.clear();
        }
    }

    private void opretDestillatAction() {
        ArrayList<Destillering> valgte = new ArrayList<>(lvwDestillering.getSelectionModel().getSelectedItems());

        double totalMængde = Double.parseDouble(txfTotalMængde.getText());
        double alkoholPct = Double.parseDouble(txfAlkoholPc.getText());

        String selectedDestillering = lvwIndhold.getSelectionModel().getSelectedItem();
   //     Destillat destillat1 = Controller.createDestillat(txfDestillatId.getText(),txfNewMakeId.getText(), totalMængde, alkoholPct, valgte);
    }
}

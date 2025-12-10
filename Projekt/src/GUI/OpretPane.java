package GUI;

import Controller.Controller;
import Model.Destillat;
import Model.Destillering;
import Model.Fad;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class OpretPane extends GridPane {


    private TableView<Fad> tableViewFad = new TableView<>();
    private TableView<Destillat> tableViewDestillat = new TableView<>();
    private TableView<Destillering> tableViewDestillering = new TableView<>();


    public OpretPane() {
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(15);

        Label lblOverskrift = new Label("Hvad skal oprettes?");
        this.add(lblOverskrift, 0, 0);
        lblOverskrift.setFont(new Font(30));

        this.add(new Label("Opret Lagermedarbejder"), 0, 1);
        Button btnOpretMedarbejder = new Button("Opret");
        this.add(btnOpretMedarbejder, 0, 2);
        btnOpretMedarbejder.setOnAction(event -> {
            OpretMedarbejderWindow opretMedarbejderWindow = new OpretMedarbejderWindow();
            opretMedarbejderWindow.showAndWait();
        });

        this.add(new Label("Opret Destillering"), 0, 3);
        Button btnOpretDestillering = new Button("Opret");
        this.add(btnOpretDestillering, 0, 4);
        btnOpretDestillering.setOnAction(event -> {
            OpretDestilleringWindow opretDestilleringWindow = new OpretDestilleringWindow();
            opretDestilleringWindow.showAndWait();
            tableViewDestillering.getItems().setAll(Controller.getDestilleringer());
        });

        this.add(new Label("Opret Destillat"), 0, 5);
        Button btnOpretDestillat = new Button("Opret");
        this.add(btnOpretDestillat, 0, 6);
        btnOpretDestillat.setOnAction(event -> {
            OpretDestillatWindow opretDestillatWindow = new OpretDestillatWindow();
            opretDestillatWindow.showAndWait();
            tableViewDestillat.getItems().setAll(Controller.getDestillater());
        });

        this.add(new Label("Opret Påfyldning"),0, 7);
        Button btnOpretPaafyldning = new Button("Opret");
        this.add(btnOpretPaafyldning, 0, 8);
        btnOpretPaafyldning.setOnAction(event ->{
            OpretPaafyldningWindow opretPaafyldningWindow = new OpretPaafyldningWindow();
            opretPaafyldningWindow.showAndWait();
        });

        this.add(new Label("Opret Fad"), 1, 1);
        Button btnOpretFad = new Button("Opret");
        this.add(btnOpretFad, 1, 2);
        btnOpretFad.setOnAction(event -> {
            OpretFadWindow opretFadWindow = new OpretFadWindow();
            opretFadWindow.showAndWait();
            tableViewFad.getItems().setAll(Controller.getFade());
        });

        this.add(new Label("Opret Aftapning"),1, 3);
        Button btnOpretAftapning = new Button("Opret");
        this.add(btnOpretAftapning,1, 4);
        btnOpretAftapning.setOnAction(event ->{
            OpretAftapningWindow opretAftapningWindow = new OpretAftapningWindow();
            opretAftapningWindow.showAndWait();
        });

        this.add(new Label("Opret Whisky Produkt"),1, 5);
        Button btnOpretWhiskyProdukt = new Button("Opret");
        this.add(btnOpretWhiskyProdukt,1, 6);

            btnOpretWhiskyProdukt.setOnAction(event -> {
            OpretWhiskyProduktWindow opretWhiskyProduktWindow = new OpretWhiskyProduktWindow();
            opretWhiskyProduktWindow.showAndWait();
        });

        this.add(new Label("Tilføj Vandtilsætning"), 1, 7);
        Button btnTilføjVandtilsaetning = new Button("Tilføj");
        this.add(btnTilføjVandtilsaetning, 1, 8);
        btnTilføjVandtilsaetning.setOnAction(event -> {
            OpretVandtilsaetningWindow opretVandtilsaetningWindow = new OpretVandtilsaetningWindow();
            opretVandtilsaetningWindow.showAndWait();
        });

        this.add(new Label("Opret Lager"), 2, 1);
        Button btnOpretLager = new Button("Opret");
        this.add(btnOpretLager, 2, 2);

        btnOpretLager.setOnAction(event -> {
            OpretLagerWindow opretLagerWindow = new OpretLagerWindow();
            opretLagerWindow.showAndWait();
        });

        this.add(new Label("Opret og tilføj en reol til lager"), 2, 3);
        Button btnOpretReol = new Button("Opret");
        this.add(btnOpretReol, 2, 4);

        btnOpretReol.setOnAction(event -> {
            OpretReolWindow opretReolWindow = new OpretReolWindow();
            opretReolWindow.showAndWait();
        });
        this.add(new Label("Opret og tilføj en hylde til reol"), 2, 5);
        Button btnOpretHylde = new Button("Opret");
        this.add(btnOpretHylde, 2, 6);

        btnOpretHylde.setOnAction(event ->{
            OpretHyldeWindow opretHyldeWindow = new OpretHyldeWindow();
            opretHyldeWindow.showAndWait();
        });

    }
}

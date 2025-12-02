package GUI;

import Controller.Controller;
import Model.Destillat;
import Model.Fad;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import java.util.List;
import static javafx.collections.FXCollections.observableArrayList;


public class FadOversigtPane extends GridPane {

    private TableView<Fad> tableView;

    public FadOversigtPane() {
        this.initContent();
        this.add(tableView, 0, 0);
        this.updateFadOversigt();
    }

    private void initContent() {
        tableView = new TableView<>();

        //Kolonne 1
        TableColumn<Fad, String> columnFadId = new TableColumn<>("Fad ID");
        columnFadId.setCellValueFactory(new PropertyValueFactory<>("fadId"));
        columnFadId.setPrefWidth(50);

        //Kolonne 2
        TableColumn<Fad, String> columnDestillatIndhold = new TableColumn<>("Indhold (Destillat ID)");
        columnDestillatIndhold.setCellValueFactory(new PropertyValueFactory<>("destilatID"));
        columnDestillatIndhold.setPrefWidth(150);

        //Kolonne 3
        TableColumn<Fad, Integer> columnStørrelse = new TableColumn<>("Størrelse (Liter)");
        columnStørrelse.setCellValueFactory(new PropertyValueFactory<>("stoerrelseL"));
        columnStørrelse.setPrefWidth(150);

        tableView.getColumns().add(columnFadId);
        tableView.getColumns().add(columnDestillatIndhold);
        tableView.getColumns().add(columnStørrelse);

        tableView.setMaxHeight(Double.MAX_VALUE);
        tableView.setMaxWidth(Double.MAX_VALUE);
    }

    public void updateFadOversigt() {
        //List<Fad> alleFade = Controller.getFade();

        //tableView.setItems(observableArrayList(alleFade));
    }
}

package GUI;

import Model.Destillat;
import Model.Fad;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

public class DestillatOversigtPane extends GridPane {

    private TableView<Destillat> tableView;

    public DestillatOversigtPane() {
        this.initContent();
        this.add(tableView, 0, 0);
        this.updateDestillatOversigt();
    }

    private void initContent() {
        tableView = new TableView<Destillat>();

        //Kolonne 1
        TableColumn<Destillat, String> columnNewMakeNr = new TableColumn<>("New Make Nr");
        columnNewMakeNr.setCellValueFactory(new PropertyValueFactory<>("newMakeID"));
        columnNewMakeNr.setPrefWidth(100);

        //Kolonne 2
        TableColumn<Destillat, Integer> columnMængde = new TableColumn<>("Total Mængde(Liter)");
        columnMængde.setCellValueFactory(new PropertyValueFactory<>("totalmaengeL"));
        columnMængde.setPrefWidth(150);

        tableView.getColumns().add(columnNewMakeNr);
        tableView.getColumns().add(columnMængde);

        tableView.setMaxHeight(Double.MAX_VALUE);
        tableView.setMaxWidth(Double.MAX_VALUE);
    }

    public void updateDestillatOversigt() {
        //List<Destillat> alleDestillater = Controller.getDestillater();

        //tableView.setItems(observableArrayList(alleDestillater));
    }
}

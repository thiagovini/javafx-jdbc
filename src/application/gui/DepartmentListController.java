package application.gui;

import application.Main;
import application.model.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private Button btNew;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    public void onBtNewAction(){
        System.out.println("onBtNewAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        InitializableNodes();
    }

    private void InitializableNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        /*Adjust list window size*/
        Stage stage = (Stage) Main.getMainScene().getWindow();
        tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
    }
}

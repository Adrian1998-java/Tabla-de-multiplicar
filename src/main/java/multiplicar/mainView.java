package multiplicar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.GridPane;

public class mainView implements Initializable{

	// Value of spinner total
	SpinnerValueFactory<Integer> totalNumberSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, Integer.MAX_VALUE);
	
    @FXML
    private GridPane view;

    @FXML
    private Spinner<Integer> numberSpinner;

    @FXML
    private ListView<String> numberStringList;

	public void initialize(URL location, ResourceBundle resources) {
		numberSpinner.setValueFactory(totalNumberSpinner);
		numberSpinner.setEditable(true);
		
		añadirList();
		numberSpinner.valueProperty().addListener((o, ov, nv) -> {
			System.out.println("Old Value : "+ ov + "/ New value : "+ nv);
			añadirList();
		});
		
		
	}
	
	public mainView() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void añadirList() {
		int i = 1;
		
		numberStringList.getItems().clear();
		while(i <= 10) {
			numberStringList.getItems().add(numberSpinner.getValue().toString() + " * " + i + " = " + (numberSpinner.getValue() * i));
			i++;
		}
		
	}
	
	public GridPane getView() {
		return view;
	}
	
}

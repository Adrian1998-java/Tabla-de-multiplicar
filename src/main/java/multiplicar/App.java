package multiplicar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	private mainView mainController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		mainController = new mainView();
		
		Scene scene = new Scene(mainController.getView());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tabla de Multiplicar");
		primaryStage.setResizable(false);
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

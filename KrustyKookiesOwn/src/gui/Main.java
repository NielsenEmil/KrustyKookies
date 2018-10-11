package gui;

import model.Database;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Database db = new Database();
	public int width = 800, height = 600;

	@Override
	public void start(Stage primaryStage) {
		MenuCreator mc = new MenuCreator();
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, width, height);
		root.setTop(mc.addMenu(root, primaryStage, width, height));
		

		primaryStage.setTitle("Krusty Kookies");
		primaryStage.setScene(scene);
		primaryStage.show();

		// opening database connection
		/* --- TODO: change xxx to your user name, yyy to your passowrd --- */
		// if(!db.openConnection("hbg54", "dpx934gw")) {
		// Alert alert = new Alert(AlertType.ERROR);
		// alert.setTitle("Database error");
		// alert.setHeaderText(null);
		// alert.setContentText("Could not connect to the database! Check console for
		// details.");
		// alert.showAndWait();
		// }
		
		
		//MenuController
		mc.prodMenuItem.setOnAction(actionEvent -> {
			root.setCenter(ProductionTab.getScene());
		});

		mc.palletMenuItem.setOnAction(actionEvent -> {
			root.setCenter(PalletsTab.getScene());
		});
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void stop() {
		// close the database here
		db.closeConnection();
		try {
			super.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

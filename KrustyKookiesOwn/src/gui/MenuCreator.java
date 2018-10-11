package gui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuCreator {
	public MenuItem prodMenuItem, palletMenuItem, searchMenuItem;
	public MenuBar addMenu(BorderPane root, Stage primaryStage, int width, int height) {
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
		root.setTop(menuBar);

		// Create MenuBar
		Menu fileMenu = new Menu("Menu");
		prodMenuItem = new MenuItem("Production");
		palletMenuItem = new MenuItem("Pallets");
		fileMenu.getItems().addAll(prodMenuItem, palletMenuItem);
		menuBar.getMenus().addAll(fileMenu);

		
		
		return menuBar;
	}
	
}

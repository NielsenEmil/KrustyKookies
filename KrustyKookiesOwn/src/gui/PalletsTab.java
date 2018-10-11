package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PalletsTab {
	public static GridPane getScene() {
		GridPane s = new GridPane();
		s.setPadding(new Insets(10, 10, 10, 10));
		s.setVgap(8);
		s.setHgap(10);
		
		ListView<String> list = new ListView<String>();
		ObservableList<String> items = FXCollections.observableArrayList("Kladdkaka", "Äpplekaka");
		list.setItems(items);
		list.setPrefHeight(500);
		
		Label l = new Label("Search by:  ");
		
		ObservableList<String> options = FXCollections.observableArrayList("ID", "Name", "PalletID");
		ComboBox<String> comboBox = new ComboBox<String>(options);
		
		TextField searchText = new TextField();
		Button searchBtn = new Button("Search");
		
		PalletInfo info = new PalletInfo();
		Text text = new Text("blablabla");
		
		StackPane stack = new StackPane();
		stack.setPadding(new Insets(10, 10, 10, 10));
		stack.getChildren().addAll(info, text);
		
		Button blockBtn = new Button("Block pallet");
		blockBtn.setPadding(new Insets(20, 20, 20, 20));
		blockBtn.setTranslateX(200);
		blockBtn.setTranslateY(10);
		
		HBox hBox = new HBox();
		VBox vBox = new VBox();
		hBox.getChildren().addAll(l, comboBox, searchText, searchBtn);
		vBox.getChildren().addAll(hBox, stack, blockBtn);
		
		
		
		
		GridPane.setConstraints(list, 1, 1);
		GridPane.setConstraints(vBox, 2, 1);
		
		s.getChildren().addAll(list, vBox);
		
		return s;
	}
}

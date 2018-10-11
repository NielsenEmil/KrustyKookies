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
import javafx.scene.layout.VBox;

public class ProductionTab {
	public static GridPane getScene() {
		GridPane s = new GridPane();
		s.setPadding(new Insets(10, 10, 10, 10));
		s.setVgap(8);
		s.setHgap(10);
		
		ListView<String> list = new ListView<String>();
		ObservableList<String> items = FXCollections.observableArrayList();
		list.setItems(items);
		list.setPrefHeight(300);
		list.setTranslateX(200);
		
		Label a = new Label("Cookie:  ");
		Label b = new Label("Amount:  ");
		
		Button addBtn = new Button("Add");
		addBtn.setTranslateX(200);
		addBtn.setTranslateY(100);
		addBtn.setPadding(new Insets(20, 20, 20, 20));
		Button createBtn = new Button("Create pallets");
		createBtn.setTranslateX(450);
		createBtn.setTranslateY(100);
		createBtn.setPadding(new Insets(20, 20, 20, 20));
		
		ObservableList<String> options = FXCollections.observableArrayList("ID", "Name", "PalletID");
		ComboBox<String> comboBox = new ComboBox<String>(options);
		
		TextField amountTxt = new TextField();
		
		VBox input = new VBox();
		VBox vBox = new VBox();
		HBox hBox = new HBox();
		HBox buttons = new HBox();
		HBox input1 = new HBox();
		HBox input2 = new HBox();
		input1.setTranslateX(50);
		input1.setTranslateY(100);
		input2.setTranslateX(50);
		input2.setTranslateY(100);
		input1.setPadding(new Insets(10, 10, 10, 10));
		input2.setPadding(new Insets(10, 10, 10, 10));
		input1.getChildren().addAll(a, comboBox);
		input2.getChildren().addAll(b, amountTxt);
		input.getChildren().addAll(input1, input2);
		hBox.getChildren().addAll(input, list);
		buttons.getChildren().addAll(addBtn, createBtn);
		vBox.getChildren().addAll(hBox, buttons);
		
		
		
		GridPane.setConstraints(vBox, 1, 1);
		
		
		s.getChildren().addAll(vBox);
		
		return s;
	}
}

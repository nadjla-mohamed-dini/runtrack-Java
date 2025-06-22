package com.exemple;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPanel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création des composants
        Label nameLabel = new Label("Nom :");
        TextField nameField = new TextField();
        Button sendButton = new Button("Envoyer");

        
        sendButton.setOnAction(e -> {
            String nom = nameField.getText();
            System.out.println("Nom saisi : " + nom);
        });

        
        FlowPane flowPane = new FlowPane(10, 10); 
        flowPane.getChildren().addAll(nameLabel, nameField, sendButton);

        
        Scene scene = new Scene(flowPane, 300, 100);

        
        primaryStage.setTitle("Exemple FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

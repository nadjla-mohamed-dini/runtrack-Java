package com.exemple;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        BorderPane borderPane = new BorderPane();

        
        Button quitButton = new Button("Quitter");

        
        quitButton.setOnAction(e -> {
            System.out.println("Fermeture de l'application...");
            primaryStage.close();
        });

        
        borderPane.setBottom(quitButton);

        
        Scene scene = new Scene(borderPane, 400, 300);

        
        primaryStage.setTitle("Exemple BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); 
    }
}

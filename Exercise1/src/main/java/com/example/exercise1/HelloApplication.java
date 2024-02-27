package com.example.exercise1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // instantiate the layout classes(Button & HBox Pane)
        HBox root = new HBox();

        // images
        FileInputStream path = new FileInputStream("src/main/resources/com/example/exercise1/Lesotho.jpg");
        Image jpg = new Image(path);
        ImageView img = new ImageView(jpg);

        // creating shapes
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle();

        // creating buttons
        Button btnLs = new Button("Lesotho");
        Button btnSa = new Button("South Africa");
        Button btnBz = new Button("Brazil");

        // size of the scene
        Scene scene = new Scene(root,800, 500);

        // linking the css
        scene.getStylesheets().add(getClass().getResource("Styles.css").toExternalForm());

        // adding nodes to the layout object
        //root.getChildren().addAll(img);
        root.getChildren().addAll(btnLs,btnSa,btnBz);


        // Button Actions(Events) handler
        btnLs.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(event.getSource() == btnLs)
                {
                    rec1.setX(50);
                    rec1.setY(25);
                    rec1.setWidth(20);
                    rec1.setHeight(50);
                    rec1.setFill(Color.BLUE);

                    rec2.setX(50);
                    rec2.setY(25);
                    rec2.setWidth(20);
                    rec2.setHeight(50);
                    rec2.setFill(Color.WHITE);

                    rec3.setX(50);
                    rec3.setY(25);
                    rec3.setWidth(20);
                    rec3.setHeight(50);
                    rec3.setFill(Color.GREEN);

                    root.getChildren().addAll(rec1,rec2,rec3);
                }
                event.consume();
            }
        });
        btnSa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(event.getSource() == btnSa)
                {
                    rec1.setX(50);
                    rec1.setY(25);
                    rec1.setWidth(20);
                    rec1.setHeight(50);
                    rec1.setFill(Color.RED);

                    rec2.setX(50);
                    rec2.setY(25);
                    rec2.setWidth(20);
                    rec2.setHeight(50);
                    rec2.setFill(Color.BLUE);

                    rec3.setX(50);
                    rec3.setY(25);
                    rec3.setWidth(20);
                    rec3.setHeight(50);
                    rec3.setFill(Color.GREEN);

                    root.getChildren().addAll(rec1,rec2,rec3);
                }
                event.consume();
            }
        });
        btnBz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(event.getSource() == btnBz)
                {
                    rec1.setX(50);
                    rec1.setY(25);
                    rec1.setWidth(20);
                    rec1.setHeight(50);
                    rec1.setFill(Color.YELLOW);

                    rec2.setX(50);
                    rec2.setY(25);
                    rec2.setWidth(20);
                    rec2.setHeight(50);
                    rec2.setFill(Color.BLUE);

                    rec3.setX(50);
                    rec3.setY(25);
                    rec3.setWidth(20);
                    rec3.setHeight(50);
                    rec3.setFill(Color.GREEN);

                    root.getChildren().addAll(rec1,rec2,rec3);
                }
                event.consume();
            }
        });


        stage.setTitle("Countries Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
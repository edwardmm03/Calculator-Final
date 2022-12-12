package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFx extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setMinSize(350,400);
        grid.setVgap(5);
        grid.setHgap(5);

        TextField txtBox = new TextField();
        txtBox.setText("0");
        grid.add(txtBox, 12,0);

        Button num1 = new Button("1");
        grid.add(num1,5,5);

        Button num2 = new Button ("2");
        grid.add(num2, 12,5);

        Button opPlus = new Button ("+");
        grid.add(opPlus, 21,5);

        Button num3 = new Button("3");
        grid.add(num3,5,10);

        Button num4 = new Button ("4");
        grid.add(num4, 12,10);

        Button opMinus = new Button ("-");
        grid.add(opMinus, 21,10);

        Button num5 = new Button("5");
        grid.add(num5,5,15);

        Button num6 = new Button ("6");
        grid.add(num6, 12,15);

        Button opDiv = new Button ("/");
        grid.add(opDiv, 21,15);

        Button num7 = new Button("7");
        grid.add(num7,5,20);

        Button num8 = new Button ("8");
        grid.add(num8, 12,20);

        Button opMulti = new Button ("*");
        grid.add(opMulti, 21, 20);

        Button num9 = new Button("9");
        grid.add(num9,5,25);

        Button num0 = new Button ("0");
        grid.add(num0, 12,25);

        Button opEq = new Button ("=");
        grid.add(opEq, 21,25);

        grid.setStyle("-fx-background-color: #D8BFD8;");
        Scene scene = new Scene(grid, 350,400);
        primaryStage.setTitle("Calculator Part B");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String [] args)
    {
        launch(args);
    }
}

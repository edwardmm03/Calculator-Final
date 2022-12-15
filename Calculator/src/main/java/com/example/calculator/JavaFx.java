package com.example.calculator;

import javafx.application.Application;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFx extends Application
{
    private boolean operator = false;
    private boolean solved = false;
    private char op = '+';
    private float n1 = 0;
    private float n2 = 0;
    private int length = 0;
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
        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("1");}
                else { txtBox.setText(txtBox.getText() + "1"); }
            }
        });

        Button num2 = new Button ("2");
        grid.add(num2, 12,5);
        num2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("2");}
                else { txtBox.setText(txtBox.getText() + "2"); }
            }
        });

        Button opPlus = new Button ("+");
        grid.add(opPlus, 21,5);
        opPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!solved) {
                    if (operator == false) {
                        operator = true;
                        n1 = Float.parseFloat(txtBox.getText());
                        op = '+';
                        txtBox.setText(txtBox.getText() + op);
                        length = txtBox.getLength();
                    }
                }
            }
        });
        Button num3 = new Button("3");
        grid.add(num3,5,10);
        num3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("3");}
                else { txtBox.setText(txtBox.getText() + "3"); }
            }
        });
        Button num4 = new Button ("4");
        grid.add(num4, 12,10);
        num4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("4");}
                else { txtBox.setText(txtBox.getText() + "4"); }
            }
        });
        Button opMinus = new Button ("-");
        grid.add(opMinus, 21,10);
        opMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!solved) {
                    if (operator == false) {
                        operator = true;
                        n1 = Float.parseFloat(txtBox.getText());
                        op = '-';
                        txtBox.setText(txtBox.getText() + op);
                        length = txtBox.getLength();
                    }
                }
            }
        });

        Button num5 = new Button("5");
        grid.add(num5,5,15);
        num5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("5");}
                else { txtBox.setText(txtBox.getText() + "5"); }
            }
        });
        Button num6 = new Button ("6");
        grid.add(num6, 12,15);
        num6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("6");}
                else { txtBox.setText(txtBox.getText() + "6"); }
            }
        });
        Button opDiv = new Button ("÷");
        grid.add(opDiv, 21,15);
        opDiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!solved) {
                    if (operator == false) {
                        operator = true;
                        n1 = Float.parseFloat(txtBox.getText());
                        op = '/';
                        txtBox.setText(txtBox.getText() + op);
                        length = txtBox.getLength();
                    }
                }
            }
        });
        Button num7 = new Button("7");
        grid.add(num7,5,20);
        num7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("7");}
                else { txtBox.setText(txtBox.getText() + "7"); }
            }
        });
        Button num8 = new Button ("8");
        grid.add(num8, 12,20);
        num8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("8");}
                else { txtBox.setText(txtBox.getText() + "8"); }
            }
        });
        Button opMulti = new Button ("*");
        grid.add(opMulti, 21, 20);
        opMulti.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!solved) {
                    if (operator == false) {
                        operator = true;
                        n1 = Float.parseFloat(txtBox.getText());
                        op = '*';
                        txtBox.setText(txtBox.getText() + op);
                        length = txtBox.getLength();
                    }
                }
            }
        });
        Button num9 = new Button("9");
        grid.add(num9,5,25);
        num9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (txtBox.getText().equals("0")) { txtBox.setText("9");}
                else { txtBox.setText(txtBox.getText() + "9"); }
            }
        });
        Button num0 = new Button ("0");
        grid.add(num0, 12,25);
        num0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (solved == true) {txtBox.setText("0"); solved = false;}
                if (!txtBox.getText().equals("0")) { txtBox.setText(txtBox.getText() + "0"); }
            }
        });
        Button opEq = new Button ("=");
        grid.add(opEq, 21,25);
        opEq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (txtBox.getLength() != length) {
                    if (operator == true) {
                        operator = false;
                        n2 = Float.parseFloat(txtBox.getText().substring(length));
                        txtBox.setText(calc(n1, n2, op));
                        solved = true;
                    }
                }
            }
        });
        grid.setStyle("-fx-background-color: #D8BFD8;");
        Scene scene = new Scene(grid, 350,400);
        primaryStage.setTitle("Calculator Part B");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public String calc(float n1, float n2, char op) {
        float prod = 0;
        if (op == '+') {
            prod = n1 + n2;
        } else if (op == '-') {
            prod = n1 - n2;
        } else if (op == '*') {
            prod = n1 * n2;
        } else if (op == '/') {
            prod = n1 / n2;
        }
        if (prod % 1 == 0) {
            int round = (int) prod;
            return String.valueOf(round);
        } else {return String.valueOf(prod);}
    }
    public static void main (String [] args) {
        launch(args);
    }
}
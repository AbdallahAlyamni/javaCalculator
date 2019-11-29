import javax.script.ScriptException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class CalculatorScene extends Pane {

    public Pane pane;
    public Button btn_close;
    public Label label;
    public Pane pane0;
    public TextField tf;
    public Button btn_bck;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn_div;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn_ce;
    public Button btn0;
    public Button btn_equ;
    public Button btn_sum;
    public Button btn_sub;
    public Button btn_mul;

    public MathString mathString;

    public CalculatorScene() {

        mathString = new MathString();

        pane = new Pane();
        btn_close = new Button();
        label = new Label();
        pane0 = new Pane();
        tf = new TextField();
        btn_bck = new Button();
        btn1 = new Button();
        btn2 = new Button();
        btn3 = new Button();
        btn_div = new Button();
        btn4 = new Button();
        btn5 = new Button();
        btn6 = new Button();
        btn7 = new Button();
        btn8 = new Button();
        btn9 = new Button();
        btn_ce = new Button();
        btn0 = new Button();
        btn_equ = new Button();
        btn_sum = new Button();
        btn_sub = new Button();
        btn_mul = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOnKeyTyped(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {

            }
        });
        setPrefHeight(458.0);
        setPrefWidth(324.0);
        setStyle("-fx-background-color: #1E1E1E;");

        pane.setPrefHeight(41.0);
        pane.setPrefWidth(324.0);
        pane.setStyle("-fx-background-color: #333333;");

        btn_close.setGraphicTextGap(0.0);
        btn_close.setLayoutX(272.0);
        btn_close.setMnemonicParsing(false);
        btn_close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
                System.exit(0);
            }
        });
        btn_close.setPickOnBounds(false);
        btn_close.setPrefHeight(41.0);
        btn_close.setPrefWidth(52.0);
        btn_close.setStyle("-fx-background-color: #770000; -fx-border-radius: 0; -fx-background-radius: 0;");
        btn_close.setText("X");
        btn_close.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_close.setCursor(Cursor.HAND);
        btn_close.setFont(new Font("System Bold", 15.0));

        label.setLayoutX(29.0);
        label.setLayoutY(3.0);
        label.setPrefHeight(36.0);
        label.setPrefWidth(141.0);
        label.setText("Calculator");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#c2c2c2"));
        label.setFont(new Font("Open Sans Regular", 18.0));

        pane0.setLayoutX(21.0);
        pane0.setLayoutY(59.0);
        pane0.setPrefHeight(90.0);
        pane0.setPrefWidth(282.0);
        pane0.setStyle("-fx-background-color: #252526;");

        tf.setLayoutX(12.0);
        tf.setLayoutY(11.0);
        tf.setPrefHeight(69.0);
        tf.setPrefWidth(259.0);
        tf.setPromptText("0");
        tf.setStyle("-fx-background-color: #252526;-fx-text-fill: #ffffff;");
        tf.setFont(new Font(24.0));

        btn_bck.setGraphicTextGap(0.0);
        btn_bck.setLayoutX(230.0);
        btn_bck.setLayoutY(20.0);
        btn_bck.setMnemonicParsing(false);
        ImageView iv = new ImageView();
        iv.setImage(new Image(getClass().getResource("imgs/backspace.png").toExternalForm()));
        btn_bck.setGraphic(iv);
        btn_bck.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.backspace();
                tf.setText(mathString.math_text);
            }
        });
        btn_bck.setPrefHeight(51.0);
        btn_bck.setPrefWidth(52.0);
        btn_bck.setStyle("-fx-background-color: #383838; -fx-background-radius: 0;");
        //btn_bck.setText("<");
        btn_bck.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_bck.setCursor(Cursor.HAND);
        btn_bck.setFont(new Font("Montserrat Bold", 24.0));

        btn1.setLayoutX(14.0);
        btn1.setLayoutY(166.0);
        btn1.setMnemonicParsing(false);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("1");
                tf.setText(mathString.math_text);
            }
        });
        btn1.setPrefHeight(69.0);
        btn1.setPrefWidth(74.0);
        btn1.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn1.setText("1");
        btn1.setTextFill(javafx.scene.paint.Color.WHITE);
        btn1.setCursor(Cursor.HAND);
        btn1.setFont(new Font("SquareFont", 24.0));

        btn2.setLayoutX(88.0);
        btn2.setLayoutY(166.0);
        btn2.setMnemonicParsing(false);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("2");
                tf.setText(mathString.math_text);
            }
        });
        btn2.setPrefHeight(69.0);
        btn2.setPrefWidth(74.0);
        btn2.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn2.setText("2");
        btn2.setTextFill(javafx.scene.paint.Color.WHITE);
        btn2.setCursor(Cursor.HAND);
        btn2.setFont(new Font("SquareFont", 24.0));

        btn3.setLayoutX(162.0);
        btn3.setLayoutY(166.0);
        btn3.setMnemonicParsing(false);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("3");
                tf.setText(mathString.math_text);
            }
        });
        btn3.setPrefHeight(69.0);
        btn3.setPrefWidth(74.0);
        btn3.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn3.setText("3");
        btn3.setTextFill(javafx.scene.paint.Color.WHITE);
        btn3.setCursor(Cursor.HAND);
        btn3.setFont(new Font("SquareFont", 24.0));

        btn_div.setLayoutX(236.0);
        btn_div.setLayoutY(166.0);
        btn_div.setMnemonicParsing(false);
        btn_div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("/");
                tf.setText(mathString.math_text);
            }
        });
        btn_div.setPrefHeight(69.0);
        btn_div.setPrefWidth(74.0);
        btn_div.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn_div.setText("/");
        btn_div.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_div.setCursor(Cursor.HAND);
        btn_div.setFont(new Font("Montserrat Bold", 24.0));

        btn4.setLayoutX(14.0);
        btn4.setLayoutY(235.0);
        btn4.setMnemonicParsing(false);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("4");
                tf.setText(mathString.math_text);
            }
        });
        btn4.setPrefHeight(69.0);
        btn4.setPrefWidth(74.0);
        btn4.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn4.setText("4");
        btn4.setTextFill(javafx.scene.paint.Color.WHITE);
        btn4.setCursor(Cursor.HAND);
        btn4.setFont(new Font("SquareFont", 24.0));

        btn5.setLayoutX(88.0);
        btn5.setLayoutY(235.0);
        btn5.setMnemonicParsing(false);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("5");
                tf.setText(mathString.math_text);
            }
        });
        btn5.setPrefHeight(69.0);
        btn5.setPrefWidth(74.0);
        btn5.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn5.setText("5");
        btn5.setTextFill(javafx.scene.paint.Color.WHITE);
        btn5.setCursor(Cursor.HAND);
        btn5.setFont(new Font("SquareFont", 24.0));

        btn6.setLayoutX(162.0);
        btn6.setLayoutY(235.0);
        btn6.setMnemonicParsing(false);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("6");
                tf.setText(mathString.math_text);
            }
        });
        btn6.setPrefHeight(69.0);
        btn6.setPrefWidth(74.0);
        btn6.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn6.setText("6");
        btn6.setTextFill(javafx.scene.paint.Color.WHITE);
        btn6.setCursor(Cursor.HAND);
        btn6.setFont(new Font("SquareFont", 24.0));

        btn7.setLayoutX(14.0);
        btn7.setLayoutY(304.0);
        btn7.setMnemonicParsing(false);
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("7");
                tf.setText(mathString.math_text);
            }
        });
        btn7.setPrefHeight(69.0);
        btn7.setPrefWidth(74.0);
        btn7.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn7.setText("7");
        btn7.setTextFill(javafx.scene.paint.Color.WHITE);
        btn7.setCursor(Cursor.HAND);
        btn7.setFont(new Font("SquareFont", 24.0));

        btn8.setLayoutX(88.0);
        btn8.setLayoutY(304.0);
        btn8.setMnemonicParsing(false);
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("8");
                tf.setText(mathString.math_text);
            }
        });
        btn8.setPrefHeight(69.0);
        btn8.setPrefWidth(74.0);
        btn8.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn8.setText("8");
        btn8.setTextFill(javafx.scene.paint.Color.WHITE);
        btn8.setCursor(Cursor.HAND);
        btn8.setFont(new Font("SquareFont", 24.0));

        btn9.setLayoutX(162.0);
        btn9.setLayoutY(304.0);
        btn9.setMnemonicParsing(false);
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("9");
                tf.setText(mathString.math_text);
            }
        });
        btn9.setPrefHeight(69.0);
        btn9.setPrefWidth(74.0);
        btn9.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn9.setText("9");
        btn9.setTextFill(javafx.scene.paint.Color.WHITE);
        btn9.setCursor(Cursor.HAND);
        btn9.setFont(new Font("SquareFont", 24.0));

        btn_ce.setLayoutX(14.0);
        btn_ce.setLayoutY(373.0);
        btn_ce.setMnemonicParsing(false);
        btn_ce.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.clear();
                tf.setText(mathString.math_text);
            }
        });
        btn_ce.setPrefHeight(69.0);
        btn_ce.setPrefWidth(74.0);
        btn_ce.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn_ce.setText("CE");
        btn_ce.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_ce.setCursor(Cursor.HAND);
        btn_ce.setFont(new Font("SquareFont", 24.0));

        btn0.setLayoutX(88.0);
        btn0.setLayoutY(373.0);
        btn0.setMnemonicParsing(false);
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mathString.add("0");
                tf.setText(mathString.math_text);
            }
        });
        btn0.setPrefHeight(69.0);
        btn0.setPrefWidth(74.0);
        btn0.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn0.setText("0");
        btn0.setTextFill(javafx.scene.paint.Color.WHITE);
        btn0.setCursor(Cursor.HAND);
        btn0.setFont(new Font("System Bold", 24.0));

        btn_equ.setLayoutX(162.0);
        btn_equ.setLayoutY(373.0);
        btn_equ.setMnemonicParsing(false);
        btn_equ.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    mathString.equal();
                    tf.setText(mathString.math_text);

                } catch (ScriptException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
         }});
        btn_equ.setPrefHeight(69.0);
        btn_equ.setPrefWidth(74.0);
        btn_equ.setStyle("-fx-background-color: #68217A; -fx-background-radius: 0;");
        btn_equ.setText("=");
        btn_equ.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_equ.setCursor(Cursor.HAND);
        btn_equ.setFont(new Font("Montserrat Bold", 24.0));

        btn_sum.setLayoutX(236.0);
        btn_sum.setLayoutY(235.0);
        btn_sum.setMnemonicParsing(false);
        btn_sum.setOnAction(new EventHandler<ActionEvent>() {
           @Override
         public void handle(ActionEvent event) {
            mathString.add("+");
            tf.setText(mathString.math_text);
         }});
        btn_sum.setPrefHeight(69.0);
        btn_sum.setPrefWidth(74.0);
        btn_sum.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn_sum.setText("+");
        btn_sum.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_sum.setCursor(Cursor.HAND);
        btn_sum.setFont(new Font("Montserrat Bold", 24.0));

        btn_sub.setLayoutX(236.0);
        btn_sub.setLayoutY(304.0);
        btn_sub.setMnemonicParsing(false);
        btn_sub.setOnAction(new EventHandler<ActionEvent>() {
           @Override
         public void handle(ActionEvent event) {
            mathString.add("-");
            tf.setText(mathString.math_text);
         }});
        btn_sub.setPrefHeight(69.0);
        btn_sub.setPrefWidth(74.0);
        btn_sub.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn_sub.setText("-");
        btn_sub.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_sub.setCursor(Cursor.HAND);
        btn_sub.setFont(new Font("Montserrat Bold", 24.0));

        btn_mul.setLayoutX(236.0);
        btn_mul.setLayoutY(373.0);
        btn_mul.setMnemonicParsing(false);
        btn_mul.setOnAction(new EventHandler<ActionEvent>() {
           @Override
         public void handle(ActionEvent event) {
            mathString.add("*");
            tf.setText(mathString.math_text);
         }});
        btn_mul.setPrefHeight(69.0);
        btn_mul.setPrefWidth(74.0);
        btn_mul.setStyle("-fx-background-color: #0E639C; -fx-background-radius: 0;");
        btn_mul.setText("*");
        btn_mul.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_mul.setCursor(Cursor.HAND);
        btn_mul.setFont(new Font("Montserrat Bold", 24.0));

        pane.getChildren().add(btn_close);
        pane.getChildren().add(label);
        getChildren().add(pane);
        pane0.getChildren().add(tf);
        pane0.getChildren().add(btn_bck);
        getChildren().add(pane0);
        getChildren().add(btn1);
        getChildren().add(btn2);
        getChildren().add(btn3);
        getChildren().add(btn_div);
        getChildren().add(btn4);
        getChildren().add(btn5);
        getChildren().add(btn6);
        getChildren().add(btn7);
        getChildren().add(btn8);
        getChildren().add(btn9);
        getChildren().add(btn_ce);
        getChildren().add(btn0);
        getChildren().add(btn_equ);
        getChildren().add(btn_sum);
        getChildren().add(btn_sub);
        getChildren().add(btn_mul);

    }

}

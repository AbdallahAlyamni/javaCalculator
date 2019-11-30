/*
*project name : Basic java GUI Calculator.
*/
import javafx.application.Application;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Calculator extends Application{
	public static void main(String args[]){

        launch(args);
	
	}//End main function

    @Override
    public void start(Stage primaryStage){
        primaryStage.initStyle(StageStyle.UNDECORATED);
        CalculatorScene pane = new CalculatorScene();
        Scene sc = new Scene(pane);

        primaryStage.setScene(sc);
        primaryStage.show();

    }
    
}//End of Calculator class
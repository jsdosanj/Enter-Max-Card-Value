package hw2_jasvant_dosanjh;
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HW2_Jasvant_Dosanjh extends Application {

    public static Object card1, card2, card3, card4;
    private static Object guess;
    private static Object header;
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Enter Max Card Value'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Enter Max Card Value");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Enter Max Card Value");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public void gridExample(Stage primaryStage) { 
        GridPane grid = new GridPane();
        //alignment property changes the default position of //the grid from the top left of the scene to the center.
        grid.setAlignment(Pos.CENTER);
        //The gap properties manage the spacing between the rows and columns,
        grid.setHgap(10); grid.setVgap(10);
        //padding property manages the space around the edges of the grid pane. 
        //The insets are in the order of top, right, bottom, and left. grid.setPadding(new Insets(30, 30, 30, 30));
        Text scenetitle = new Text("Title of GridPane");
        //The grid.add() method adds the scenetitle variable to the layout grid. 
        //The numbering for columns and rows in the grid starts at zero,
        //and scenetitle is added in column 0, row 0.
        //The last two arguments of the grid.add() method set
        //the column span to 2 and the row span to 1.
        grid.add(scenetitle, 0, 0, 2, 1);
        //This line will center the scenetitle grid.setHalignment(scenetitle, HPos.CENTER);
        //add to column 0, row 1
        Label userName = new Label("Label1:"); grid.add(userName, 0, 1);
        //add to column 1, row 1 userTextField = new TextField(); grid.add(userTextField, 1, 1);
        //Add the grid to a Scene
        Scene scene = new Scene(grid, 500, 275); primaryStage.setScene(scene); primaryStage.setTitle("Login");
    }

    public static void main(String[] args) {
        launch(args);
        Label nextToGuess = new Label("Select a number");
        Label sumOfCards = new Label("Sum of Cards");
        Label winLoss = new Label("Win / Loss");
        Label numOfWins = new Label(" Number of Wins: ");
        Button flipCards = new Button("Flip Cards");
        Button hideCards = new Button("Hide Cards");
        
        //Flip Card Button
        flipCards.setLayoutX(400);
        flipCards.setLayoutY(400);
        
        //Hide Card Button
        hideCards.setLayoutX(800);
        hideCards.setLayoutY(400);
        
//        //Card Label Size
//        card1.setLayoutX(400);
//        card1.setLayoutY(100);
//        card2.setLayoutX(800);
//        card2.setLayoutY(100);
//        card3.setLayoutX(400);
//        card3.setLayoutY(200);
//        card4.setLayoutX(800);
//        card4.setLayoutY(200);
//        
//        //Header Size
//        header.setLayoutX(500);
//        header.setLayoutY(0);
//        
//        //Guess Box Size
//        guess.setLayoutX(550);
//        guess.setLayoutY(300);
        
        //Label next to Guess Button
        nextToGuess.setLayoutX(400);
        nextToGuess.setLayoutY(500);
        
        //Sum of Cards Box
        sumOfCards.setLayoutX(400);
        sumOfCards.setLayoutY(500);
        
        //Win Loss Box
        winLoss.setLayoutX(800);
        winLoss.setLayoutY(500);
        
        //Number of Wins box
        numOfWins.setLayoutX(600);
        numOfWins.setLayoutY(600);   
    }  
}

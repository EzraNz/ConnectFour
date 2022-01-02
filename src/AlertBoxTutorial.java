//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class AlertBoxTutorial extends Application {
//    Button button;
//    Stage window;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        window = stage;
//        window.setTitle("Ezra");
//
//        button = new Button("Click me");
//        button.setOnAction(e -> AlertBox.display("Alert Window", "Wow this alert box is awesome", window));
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();
//    }
//}

//for(int row = 0; row < grid.length - 3; row++){
//        for(int col = 0; col < grid[0].length - 3; col++){
//        if (grid[row][col] == player   &&
//        grid[row+1][col+1] == player &&
//        grid[row+2][col+2] == player &&
//        grid[row+3][col+3] == player){
//        return true;
//        }


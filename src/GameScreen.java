import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class GameScreen extends Application {
    public static final int[][] twoDimensionalButtons = new int[6][7];
    public static Player playerOne;
    public static Player playerTwo;
    public static HashMap<Integer, GameButton> gameButtonHashMap;
    private final ArrayList<Integer> gameMoves = new ArrayList<>();
    Stage gameWindow;
    private MenuBar menuBar;
    private TextArea textArea;
    private GridPane gameLayout;

    @Override
    public void start(Stage stage) throws Exception {
        gameWindow = stage;
        gameWindow.setTitle("Connect Four");

        playerOne = new Player(true);
        playerTwo = new Player(false);

        VBox root = new VBox();

        buildGameBoard();
        buildMenuBar();
        buildTextArea();

        root.getChildren().addAll(menuBar, gameLayout);

        Scene gameScene = new Scene(root, 360, 310);
        gameWindow.setScene(gameScene);
        gameWindow.getIcons().add(new Image("file:src/gameIcons/icon2.png"));
        gameWindow.show();

        for (int buttonID : gameButtonHashMap.keySet()) {
            GameButton button = gameButtonHashMap.get(buttonID);
            button.setOnAction(e -> {
                gameMoves.add(buttonID);
                button.click();
                gameLoop();
            });
        }
    }

    private void buildMenuBar() {
        final Menu gamePlay = new Menu("Game Play");
        final Menu themes = new Menu("Themes");
        final Menu options = new Menu("Options");

        menuBar = new MenuBar();
        menuBar.getMenus().addAll(gamePlay, themes, options);

        //Defining the Reverse Move menu item
        MenuItem reverseMove = new MenuItem("Reverse Move");
        gamePlay.getItems().add(reverseMove);

        //Defining the Original Theme menu item
        MenuItem originalTheme = new MenuItem("Original Theme");
        themes.getItems().add(originalTheme);

        //Defining the Theme One menu item
        MenuItem themeOne = new MenuItem("Theme One");
        themes.getItems().add(themeOne);

        //Defining the Theme Two button
        MenuItem themeTwo = new MenuItem("Theme Two");
        themes.getItems().add(themeTwo);

        //Defining the How to Play menu item
        MenuItem howToPlay = new MenuItem("How to Play");
        options.getItems().add(howToPlay);

        //Defining the New Game menu item
        MenuItem newGame = new MenuItem("New Game");
        options.getItems().add(newGame);

        //Defining the exit button
        MenuItem exit = new MenuItem("Exit");
        options.getItems().add(exit);

        //Setting an action for the Reverse Move menu item
        reverseMove.setOnAction(e -> {
            int index = gameMoves.size() - 1;
            if (!(index < 0)) {
                GameButton buttonToReverse = gameButtonHashMap.get(gameMoves.get(index));
                buttonToReverse.reverseMove();
                gameMoves.remove(index);
            }
        });

        //Setting an action for the Exit menu item
        exit.setOnAction(e -> gameWindow.close());

        //Setting an action for the New Game menu item
        newGame.setOnAction(e -> {
            for (GameButton button : gameButtonHashMap.values()) {
                button.newGame();
            }
        });
    }

    private void buildGameBoard() {
        gameLayout = new GridPane();
        gameButtonHashMap = new HashMap<>();

        gameLayout.setPadding(new Insets(5, 5, 5, 5));
        gameLayout.setHgap(2.5);
        gameLayout.setVgap(2.5);

        int count = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                gameButtonHashMap.put(count, new GameButton());
                gameLayout.add(gameButtonHashMap.get(count), j, i);
                twoDimensionalButtons[i][j] = count;
                count++;
            }
        }
    }

    private void buildTextArea() {

    }

    public void gameLoop() {
        if (new WinConditions().playerOneWinConditions()) {
            System.out.println("Player One wins");
        }
        if (new WinConditions().playerTwoWinConditions()) {
            System.out.println("Player Two wins");
        }
    }
}


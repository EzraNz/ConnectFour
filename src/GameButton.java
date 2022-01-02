import javafx.scene.control.Button;

public class GameButton extends Button {
    boolean isClicked;
    boolean belongsToP1 = false;
    boolean belongsToP2 = false;

    public GameButton() {
        this.setPrefSize(50, 50);
        setColor("#808080");
        isClicked = false;
    }

    public void click() {
        if (!isClicked && GameScreen.playerOne.turn) {
            setColor("#ADD8E6");
            setClicked(true);
            setBelongsToP1(true);
            GameScreen.playerOne.setTurn(!GameScreen.playerOne.turn);
            GameScreen.playerTwo.setTurn(!GameScreen.playerTwo.turn);
        } else if (!isClicked && GameScreen.playerTwo.turn) {
            setColor("#FFCCCB");
            setClicked(true);
            setBelongsToP2(true);
            GameScreen.playerOne.setTurn(!GameScreen.playerOne.turn);
            GameScreen.playerTwo.setTurn(!GameScreen.playerTwo.turn);
        }
    }

    public void setColor(String color) {
        this.setStyle("-fx-background-color: " + color + "; ");
    }

    public void reverseMove() {
        setColor("#808080");
        setClicked(false);
        setBelongsToP2(false);
        setBelongsToP1(false);
        GameScreen.playerOne.setTurn(!GameScreen.playerOne.turn);
        GameScreen.playerTwo.setTurn(!GameScreen.playerTwo.turn);
    }

    public void setClicked(Boolean clicked) {
        isClicked = clicked;
    }

    public boolean isBelongsToP1() {
        return belongsToP1;
    }

    public void setBelongsToP1(boolean belongsToP1) {
        this.belongsToP1 = belongsToP1;
    }

    public boolean isBelongsToP2() {
        return belongsToP2;
    }

    public void setBelongsToP2(boolean belongsToP2) {
        this.belongsToP2 = belongsToP2;
    }

    public void newGame() {
        this.setPrefSize(50, 50);
        setColor("#808080");
        isClicked = false;
        GameScreen.playerOne.setTurn(true);
        GameScreen.playerTwo.setTurn(false);
        setBelongsToP1(false);
        setBelongsToP2(false);
    }
}
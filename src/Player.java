public class Player {
    boolean turn;

    public Player(boolean turn) {
        this.turn = turn;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}

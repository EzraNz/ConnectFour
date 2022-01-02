public class WinConditions {
    int[][] grid = GameScreen.twoDimensionalButtons;

    public boolean playerOneWinConditions() {
        return playerOneDownwardDiagonalWinConditions() || playerOneUpwardDiagonalWinConditions()
                || playerOneAcrossWinConditions() || playerOneUpAndDownWinConditions();
    }

    public boolean playerTwoWinConditions() {
        return playerTwoDownwardDiagonalWinConditions() || playerTwoUpwardDiagonalWinConditions() ||
                playerTwoAcrossWinConditions() || playerTwoUpAndDownWinConditions();
    }

    private boolean playerOneDownwardDiagonalWinConditions() {
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 1][col + 1]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 2][col + 2]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 3][col + 3]).belongsToP1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerOneUpwardDiagonalWinConditions() {
        for (int row = 3; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 1][col + 1]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 2][col + 2]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 3][col + 3]).belongsToP1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerOneAcrossWinConditions() {
        for (int[] ints : grid) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(ints[col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 1]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 2]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 3]).belongsToP1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerOneUpAndDownWinConditions() {
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 1][col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 2][col]).belongsToP1 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 3][col]).belongsToP1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerTwoDownwardDiagonalWinConditions() {
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 1][col + 1]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 2][col + 2]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 3][col + 3]).belongsToP2) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerTwoUpwardDiagonalWinConditions() {
        for (int row = 3; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 1][col + 1]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 2][col + 2]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row - 3][col + 3]).belongsToP2) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerTwoAcrossWinConditions() {
        for (int[] ints : grid) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (GameScreen.gameButtonHashMap.get(ints[col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 1]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 2]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(ints[col + 3]).belongsToP2) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean playerTwoUpAndDownWinConditions() {
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (GameScreen.gameButtonHashMap.get(grid[row][col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 1][col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 2][col]).belongsToP2 &&
                        GameScreen.gameButtonHashMap.get(grid[row + 3][col]).belongsToP2) {
                    return true;
                }
            }
        }
        return false;
    }
}
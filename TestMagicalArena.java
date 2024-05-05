public class TestMagicalArena {
    public static void main(String[] args) {
        testPlayerWins();
        testDraw();
    }
    
    private static void testPlayerWins() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);

        String result = arena.playGame();
        System.out.println(result); // Output should be "Player A wins!"
    }

    private static void testDraw() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(50, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);

        String result = arena.playGame();
        System.out.println(result); // Output should be "Game ended in a draw!"
    }
    
}

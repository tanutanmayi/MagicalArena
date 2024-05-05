public class MagicalArena {
    private Player playerA;
    private Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String playGame() {
        while (playerA.isAlive() && playerB.isAlive()) {
            playRound(playerA, playerB);
            if (!playerB.isAlive()) {
                return "Player A wins!";
            }
            playRound(playerB, playerA);
            if (!playerA.isAlive()) {
                return "Player B wins!";
            }
        }
        return "Game ended in a draw!";
    }

    private void playRound(Player attacker, Player defender) {
        int attackerDamage = attacker.getAttack() * Dice.roll();
        int defenderStrength = defender.getStrength() * Dice.roll();
        int actualDamage = Math.max(attackerDamage - defenderStrength, 0);
        defender.reduceHealth(actualDamage);
    }
}

package contestants;

public class Rogue extends BattleContestant {

    public Rogue(int healthPoints, int attackPower) {
        super(healthPoints, attackPower);
    }

    public String soundBattleCry() {
        return "sneak sneak";
    }
}

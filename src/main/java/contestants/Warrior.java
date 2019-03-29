package contestants;

public class Warrior extends BattleContestant {

    public Warrior(int healthPoints, int attackPower) {
        super(healthPoints, attackPower);
    }

    @Override
    public String soundBattleCry() {
        return "ROAR";
    }

}

package contestants;

public class Magician extends BattleContestant {

    public Magician(int healthPoints, int attackPower) {
        super(healthPoints, attackPower);
    }

    public String soundBattleCry() {
        return "abracadabra";
    }
}

package contestants;

public abstract class BattleContestant {

    private int healthPoints;
    private int attackPower;

    public BattleContestant(int healthPoints, int attackPower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }

    public void sufferDamage(int damage) {
        this.healthPoints -= damage;
    }


    public int getAttackPower() {
        return this.attackPower;
    }

    abstract public String soundBattleCry();

}

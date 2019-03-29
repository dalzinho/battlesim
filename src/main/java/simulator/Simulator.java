package simulator;

import contestants.BattleContestant;
import output.Output;

public class Simulator {

    private Output output;

    public Simulator(Output output) {
        this.output = output;
    }

    public BattleContestant fight(BattleContestant bc1, BattleContestant bc2) {
        while (bc1.isAlive() && bc2.isAlive()) {

            output.write(bc1.soundBattleCry());
            bc2.sufferDamage(bc1.getAttackPower());

            output.write(bc2.soundBattleCry());
            bc1.sufferDamage(bc2.getAttackPower());
        }

        if (!bc2.isAlive() && !bc1.isAlive()) {
            output.write("both are deid");
            return null;
        } else if (!bc1.isAlive()) {
            output.write("contestant 2 wins");
            return bc2;
        } else {
            output.write("contestant 1 wins");
            return bc1;
        }
    }

}

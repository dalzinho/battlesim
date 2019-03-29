import contestants.Magician;
import contestants.Rogue;
import contestants.Warrior;
import output.ConsoleOutput;
import output.ErrorOutput;
import simulator.Simulator;

public class Run {

    public static void main(String[] args) {
        Simulator simulator = new Simulator(new ConsoleOutput());
        simulator.fight(new Warrior(100, 10), new Magician(80, 10));

        Simulator anotherSimulator = new Simulator(new ErrorOutput());
        anotherSimulator.fight(new Rogue(20, 30), new Magician(80, 10));
    }
}

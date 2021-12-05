package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
    Player player = new HumanPlayer();
    Simulation simulation = new Simulation(player);

    SecureRandom random = new SecureRandom();
    long randomNumber = random.nextInt(100);

    simulation.initialize(randomNumber);
    simulation.loopUntilPlayerSucceed(randomNumber);

    }
}



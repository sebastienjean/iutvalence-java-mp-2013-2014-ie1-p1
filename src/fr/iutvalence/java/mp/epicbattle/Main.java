package fr.iutvalence.java.mp.epicbattle;

/**
 * The class main, for test the game
 * 
 * @author GERLAND, KAYRAK
 * 
 */
public class Main
{

    /**
     * In this main ,we create some heroes,warriors and spell to test the game.
     *
     */
    public static void main(@SuppressWarnings("javadoc") String[] args)
    {
        String J1 = "J1";
        String J2 = "J2";
        Battle game;
        OutputASCII OutGame = new OutputASCII();
        OutputASCII OutP1 = new OutputASCII();
        OutputASCII OutP2 = new OutputASCII();
        InputASCII InP1 = new InputASCII();
        InputASCII InP2 = new InputASCII();
        
        
         Warrior[] listWarriors1;
         listWarriors1 = new Warrior[2];
         listWarriors1[0] = Warrior.AXEMAN1;
         listWarriors1[1] = Warrior.BUSINESSMAN;
         
         Warrior[] listWarriors2;
         listWarriors2 = new Warrior[2];
         listWarriors2[0] = Warrior.AXEMAN2;
         listWarriors2[1] = Warrior.SPEARMAN1;
         
        game = new Battle(J1, Hero.CONAN, listWarriors1, J2, Hero.CONAN, listWarriors2, OutGame, OutP1,OutP2,InP1,InP2); 
        game.play();

    }

}

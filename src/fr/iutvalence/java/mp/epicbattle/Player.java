package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The class player defines one of the two opponents of
 *         the battle. It is compounded of the name of the player and the heros
 *         chosen. It could be one of the two sub-class : Human or IA.
 */
public class Player
{
    /**
     * The name of the player.
     */
    private String name;

    // TODO (fix) this field should not be declared as public
    /**
     * The heros which was chosen by the player.
     */
    public Heros heroChosen;

    // TODO (fix) this field should not be declared as public
    /**
     * The warrior which was chosen by the player.
     */
    public Warrior warriorChosen;

    // TODO (fix) finish writing comment
    /** At first, we will use just one heros to test the program
     * This constructor creates the player with the hero chosen 
     * @param name The name of the player
     * @param heroChosen The hero which the player chose.
     */
    public Player(String name, Heros heroChosen, Warrior warriorChosen)
    {
        this.name = name;
        this.heroChosen = heroChosen;
        this.warriorChosen = warriorChosen;
    }

    
}

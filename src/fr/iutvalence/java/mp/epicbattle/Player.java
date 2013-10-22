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

    /**
     * The heros which was chosen by the player.
     */
    private Heros heroChosen;

    /**
     * The warrior which was chosen by the player.
     */
    private Warrior warriorChosen;

    /**
     * This constructor creates the player with the hero chosen
     * 
     * @param name
     *            The name of the player
     * @param heroChosen
     *            The hero which the player chose.
     * @param warriorChosen
     *            The warrior chosen by the player
     */
    public Player(String name, Heros heroChosen, Warrior warriorChosen)
    {
        this.name = name;
        this.heroChosen = heroChosen;
        this.warriorChosen = warriorChosen;
    }

    /**
     * The warrior chosen by the player
     * 
     * @return the warrior chosen by the player
     */
    public Warrior getWarrior()
    {
        return this.warriorChosen;
    }

    /**
     * The hero of the player
     * 
     * @return the hero of the player
     */
    public Heros getHero()
    {
        return this.heroChosen;
    }

}

package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The heros will be chosen in a list of pre-create
 *         heros. They will be defined in sub-class The class heros is
 *         compounded of his name, his spells, (a picture) and a passive power
 *         which will impact warriors' characteristics.
 */

public class Heros
{
    /**
     * The name of the Heros
     */
    private String name;

    // TODO (fixed) fix comment
    /**
     * The spell of the hero
     */
    private Effect spell;

    /**
     * The Heros' passive
     */
    private Effect passivePower;

    /**
     * This constructor creates a hero with a name, a spell and a passive. For
     * example Conan, with his passive power and one spell
     * 
     * @param name
     *            His name
     * @param spell
     *            His spell
     * @param passivePower
     *            His passive
     */
    public Heros(String name, Effect spell, Effect passivePower)
    {
        this.name = name;
        this.passivePower = passivePower;
        this.spell = spell;
    }

    // TODO (think bout it) the way you manage spells is somewhat strange
    /**
     * Use a spell against a warrior
     * 
     * @param target
     *            the warrior focused
     */
    public void useSpell(Warrior target)
    {
        this.spell.application(0, target);
    }

    /**
     * It applies the passive of the hero
     * 
     * @param target
     *            the warrior who receives the passive
     */
    public void applyPassive(Warrior target)
    {
        this.passivePower.application(0, target);
    }

    /**
     * the spell of the hero
     * 
     * @return The spell of the hero
     */
    public Effect getSpell()
    {
        return this.spell;
    }

    /**
     * the passive of the hero
     * 
     * @return the passive of the hero
     */
    public Effect getPassive()
    {
        return this.passivePower;
    }

}

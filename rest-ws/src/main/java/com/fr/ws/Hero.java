package com.fr.ws;

/**
 * The Class Hero.
 */
public class Hero {

    /** The id. */
    private final long id;

    /** The name. */
    private final String name;

    /**
     * Instantiates a new hero.
     *
     * @param id the id
     * @param name the name
     */
    public Hero(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}

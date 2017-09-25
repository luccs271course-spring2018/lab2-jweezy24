package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    //Checks for a null value then throws a error if that is true
    if(headcoach == null)
    {
      throw new IllegalArgumentException("headcoach is null");
    }
    //Checks if funding is less than zero because a team cannont have a negative funding
    if(funding < 0)
    {
      throw new IllegalArgumentException("Funding is negative");
    }
    // TODO validity checking for headcoach
    // TODO validity checking for funding
    this.name = name;
    this.headcoach = headcoach;
    this.funding = funding;
    // TODO complete this constructor
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // TODO complete this method
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // TODO complete this method
    return this.funding;
  }
  public String toString()
  {
    String returnstatment = "Name: " + this.getName() + "\n" +"Head coach: " + this.getHeadcoach()
            + "\n" + "Funding: " + this.getFunding() + "\n ";
    return returnstatment;
  }

}

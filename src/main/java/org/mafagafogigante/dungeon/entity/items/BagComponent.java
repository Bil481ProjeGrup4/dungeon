package org.mafagafogigante.dungeon.entity.items;

import org.mafagafogigante.dungeon.io.Version;
import org.mafagafogigante.dungeon.util.Percentage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class BagComponent implements Serializable {

  private static final long serialVersionUID = Version.MAJOR;
  private final Weight weightIncrease;
  /**
   * Constructs a new BagComponent.
   */
  BagComponent(Weight weightIncrease) {
    this.weightIncrease = weightIncrease;
	CreatureInvenory.setWeightLimit(this.weightIncrease);
  }

  /**
   * Returns the total damage dealt by this weapon.
   */
  public Weight getWeightIncrease() {
    return weightIncrease;
  }
}

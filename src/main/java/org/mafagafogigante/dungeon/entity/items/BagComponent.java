package org.mafagafogigante.dungeon.entity.items;


import org.mafagafogigante.dungeon.entity.Integrity;
import org.mafagafogigante.dungeon.entity.Luminosity;
import org.mafagafogigante.dungeon.entity.Preset;
import org.mafagafogigante.dungeon.entity.TagSet;
import org.mafagafogigante.dungeon.entity.Weight;
import org.mafagafogigante.dungeon.entity.creatures.Effect;
import org.mafagafogigante.dungeon.entity.creatures.EffectFactory;
import org.mafagafogigante.dungeon.entity.items.Item.Tag;
import org.mafagafogigante.dungeon.game.Id;
import org.mafagafogigante.dungeon.game.Name;
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
  }

  /**
   * Returns the total damage dealt by this weapon.
   */
  public Weight getWeightIncrease() {
    return weightIncrease;
  }
}

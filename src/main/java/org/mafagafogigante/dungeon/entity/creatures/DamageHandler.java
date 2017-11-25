package org.mafagafogigante.dungeon.entity.creatures;

/**
 * The class responsible for inflicting damage from one creature onto another.
 */
class DamageHandler {

  private DamageHandler() {
  }

  static void inflictDamage(Creature attacker, Creature defender, int damage) {
    if ((defender instanceof Hero)) {
      if (((Hero)defender).isImmortal()) { 
        defender.getHealth().decrementBy(0);
        attacker.getBattleLog().incrementInflicted(0);
        defender.getBattleLog().incrementTaken(0); }
      else {
        defender.getHealth().decrementBy(damage);
        attacker.getBattleLog().incrementInflicted(damage);
        defender.getBattleLog().incrementTaken(damage); }}
    else {
        defender.getHealth().decrementBy(damage);
        attacker.getBattleLog().incrementInflicted(damage);
        defender.getBattleLog().incrementTaken(damage); }
  }
}

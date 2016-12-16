package org.mafagafogigante.dungeon.schema.rules;

import org.mafagafogigante.dungeon.schema.JsonRule;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonValue;
import org.junit.Before;
import org.junit.Test;

public class StringJsonRuleTest {

  private JsonRule stringJsonRule;

  @Before
  public void setUp() {
    stringJsonRule = new StringJsonRule();
  }

  @Test(expected = IllegalArgumentException.class)
  public void stringJsonRuleShouldFailNonStringType() {
    JsonValue jsonValue = Json.value(true);
    stringJsonRule.validate(jsonValue);
  }

  @Test
  public void stringJsonRuleShouldPassStringType() {
    JsonValue jsonValue = Json.value("string");
    stringJsonRule.validate(jsonValue);
  }

}

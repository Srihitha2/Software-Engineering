import java.util.HashMap;
import java.util.Map;

public class SmartFridgeContents {
  public static Map<String, Integer> pantry = new HashMap<>() {
    {
      put("chicken", 500);
      put("lemon", 2);
      put("cumin", 24);
      put("paprika", 18);
      put("chilli powder", 7);
      put("yogurt", 300);
      put("oil", 450);
      put("onion", 5);
      put("garlic", 9);
      put("ginger", 2);
      put("tomato puree", 125);
      put("almonds", 75);
      put("rice", 500);
      put("coriander", 20);
      put("lime", 3);
      put("pepper", 8);
      put("egg", 6);
      put("pizza", 2);
      put("spam", 1);
    }
  };

  public static Map<String, Map<String, Integer>> recipes = new HashMap<>() {
    {
      put("Butter chicken", new HashMap<>() {
        {
          put("chicken", 750);
          put("lemon", 1);
          put("cumin", 1);
          put("paprika", 1);
          put("chilli powder", 2);
          put("yogurt", 250);
          put("oil", 50);
          put("onion", 1);
          put("garlic", 2);
          put("ginger", 3);
          put("tomato puree", 240);
          put("almonds", 25);
          put("rice", 360);
          put("coriander", 1);
          put("lime", 1);
        }
      });
      put("Chicken and chips", new HashMap<>() {
        {
          put("chicken", 100);
          put("potatoes", 3);
          put("salt", 1);
          put("malt vinegar", 5);
        }
      });
      put("Pizza", new HashMap<>() {
        {
          put("pizza", 1);
        }
      });
      put("Egg sandwich", new HashMap<>() {
        {
          put("egg", 2);
          put("bread", 80);
          put("butter", 10);
        }
      });
      put("Beans on toast", new HashMap<>() {
        {
          put("beans", 1);
          put("bread", 40);
        }
      });
      put("Spam a la tin", new HashMap<>() {
        {
          put("spam", 1);
          put("tin opener", 1);
          put("spoon", 1);
        }
      });

    }
  };
}

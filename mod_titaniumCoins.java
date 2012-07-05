package net.minecraft.src;
import java.util.Random;

public class mod_titaniumCoins extends BaseMod
{  

  //Declare Coin1
  public static final Item m_Coin1 = new Coin1(999)
    .setItemName("m_Coin1"); 
  
  //Declare Coin2
  public static final Item m_Coin2 = new Coin2(998)
    .setItemName("m_Coin2"); 
  
  //Declare Coin3
  public static final Item m_Coin3 = new Coin3(997)
    .setItemName("m_Coin3"); 
  
  //Declare Coin4
  public static final Item m_Coin4 = new Coin4(996)
    .setItemName("m_Coin4"); 
  
  public String getVersion()
  {
    return "titaniumCoins 1.0.0";
  }  
  public void load() {  }
    
  public mod_titaniumCoins()
  {

    //Add Tooltips
      //Blocks
     //Items
    ModLoader.addName(m_Coin1, "1 Coin"); //Coin1
    ModLoader.addName(m_Coin2, "2 dollars"); //Coin2
    ModLoader.addName(m_Coin3, "5 dollar coin"); //Coin3
    ModLoader.addName(m_Coin4, "10 Dollar Coin"); //Coin4
     //Armor Sets
     //ToolSets

    //Textures
     //Blocks
     //Items
    m_Coin1.iconIndex = ModLoader.addOverride("/gui/items.png", "dollar.png");
    m_Coin2.iconIndex = ModLoader.addOverride("/gui/items.png", "2dollar.png");
    m_Coin3.iconIndex = ModLoader.addOverride("/gui/items.png", "fivedollar.png");
    m_Coin4.iconIndex = ModLoader.addOverride("/gui/items.png", "10dollar.png");
     //ToolSets

    //Recipes
     //Coin1 Recipe    
     ModLoader.addRecipe(new ItemStack(m_Coin1, 1), new Object []{" C " , "CIC" , " C " ,
       Character.valueOf('I'), Item.ingotIron
       , Character.valueOf('C'), Block.cobblestone });
     //Coin2 Recipe    
     ModLoader.addRecipe(new ItemStack(m_Coin2, 1), new Object []{" I " , "IGI" , " I " ,
       Character.valueOf('G'), Item.ingotGold
       , Character.valueOf('I'), Item.ingotIron });
     //Coin3 Recipe    
     ModLoader.addRecipe(new ItemStack(m_Coin3, 1), new Object []{" G " , "GGG" , " G " ,
       Character.valueOf('G'), Item.ingotGold
     });
     //Coin4 Recipe    
     ModLoader.addRecipe(new ItemStack(m_Coin4, 1), new Object []{" G " , "GDG" , " G " ,
       Character.valueOf('D'), Item.diamond
       , Character.valueOf('G'), Item.ingotGold });

    //Furnace Recipes
  }

  public void GenerateSurface(World worldMod, Random rand, int i, int j)
  {
  }
}

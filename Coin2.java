
package net.minecraft.src;

public class Coin2 extends Item
{private int healAmount;
  public Coin2(int i)
  {
    super(i);
    maxStackSize = 64;     
    healAmount = 4;
  }  
     
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
  {
    itemstack.stackSize--;
    entityplayer.heal(healAmount);
    return itemstack;
  }
  
}
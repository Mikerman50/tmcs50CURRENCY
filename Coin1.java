
package net.minecraft.src;

public class Coin1 extends Item
{private int healAmount;
  public Coin1(int i)
  {
    super(i);
    maxStackSize = 64;     
    healAmount = 2;
  }  
     
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
  {
    itemstack.stackSize--;
    entityplayer.heal(healAmount);
    return itemstack;
  }
  
}
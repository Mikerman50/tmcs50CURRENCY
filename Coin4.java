
package net.minecraft.src;

public class Coin4 extends Item
{private int healAmount;
  public Coin4(int i)
  {
    super(i);
    maxStackSize = 64;     
    healAmount = 20;
  }  
     
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
  {
    itemstack.stackSize--;
    entityplayer.heal(healAmount);
    return itemstack;
  }
  
}
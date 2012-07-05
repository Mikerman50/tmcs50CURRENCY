
package net.minecraft.src;

public class Coin3 extends Item
{private int healAmount;
  public Coin3(int i)
  {
    super(i);
    maxStackSize = 64;     
    healAmount = 10;
  }  
     
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
  {
    itemstack.stackSize--;
    entityplayer.heal(healAmount);
    return itemstack;
  }
  
}
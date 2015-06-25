package com.YunusKayne.PetRock.client.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.reference.Key;
import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{	
	private static Key getPressedKeyBinding(EntityPlayer player)
	{
		if(Keybindings.Hello.isPressed())
		{
			ChatHelper.ChatMessage("Hi " + player.getCommandSenderName() + "!", player);
			LogHelper.info("Working!");
			return Key.Hello;
		}
		LogHelper.info("Key");
		
		//Make "else if" if you want to add more
		
		return Key.Unkown;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		//Every time a key gets pressed this will be initialized
	}
}

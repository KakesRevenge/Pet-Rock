package com.YunusKayne.PetRock.client.handler;

import com.YunusKayne.PetRock.client.settings.KeyBindings;
import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.entity.player.EntityPlayer;

public class KeyInputHandler
{	
	@SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
        if(KeyBindings.Hello.isPressed())
        {
            ChatHelper.ChatMessageString("Hi " + player.getCommandSenderName() + "!");
        }
    }
}

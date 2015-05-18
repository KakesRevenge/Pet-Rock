package com.YunusKayne.PetRock.proxy;

import com.YunusKayne.PetRock.client.settings.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(Keybindings.Hello);
	}

}

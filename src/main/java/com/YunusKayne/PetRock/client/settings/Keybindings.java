package com.YunusKayne.PetRock.client.settings;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings
{
    public static KeyBinding Hello;

    public static void init()
    {
        Hello = new KeyBinding("key.Hello", Keyboard.KEY_H, "key.Category");

        //Register KeyBindings
        ClientRegistry.registerKeyBinding(Hello);
    }
}

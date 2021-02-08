package com.grillo78.littlecritters.common.items;

import com.google.common.collect.Lists;
import com.grillo78.littlecritters.LittleCritters;
import com.grillo78.littlecritters.client.entities.renderers.AnimalItemStackTileEntityRenderer;
import com.grillo78.littlecritters.common.entities.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LittleCritters.MOD_ID);

    public static final Item FIREFLY_SPAWN_EGG = register("firefly_spawn_egg", new SpawnEggItem(ModEntities.FIRE_FLY_ENTITY, 16737280, 9843200, new Item.Properties().group(ItemGroup.MISC)));
    public static final Item BUG_NET = register("bug_net", new BugNetItem(new Item.Properties().group(ItemGroup.TOOLS), Lists.newArrayList(ModEntities.FIRE_FLY_ENTITY, EntityType.BEE, EntityType.SILVERFISH)));
    public static final Item ANIMAL = register("animal", new AnimalItem(new Item.Properties().setISTER(()->AnimalItemStackTileEntityRenderer::new)));

    private static <T extends Item> T register(String name, T item) {
        ITEMS.register(name, () -> item);
        return item;
    }

}

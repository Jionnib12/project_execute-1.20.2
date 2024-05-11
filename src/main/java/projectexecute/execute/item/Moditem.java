package projectexecute.execute.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import projectexecute.execute.ProjectExecute;

public class Moditem {
        public static final Item UPGRADETEMPLATE = registerItem("upgradetemplate", new Item(new FabricItemSettings()));

    private static void addItemtoIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(UPGRADETEMPLATE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ProjectExecute.MOD_ID, name), item);
    }

    public static void registerModItem(){
        ProjectExecute.LOGGER.info("Register Mod Items for " + ProjectExecute.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(Moditem::addItemtoIngredientItemGroup);
    }
}

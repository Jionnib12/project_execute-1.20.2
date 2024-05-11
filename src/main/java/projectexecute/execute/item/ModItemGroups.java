package projectexecute.execute.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import projectexecute.execute.ProjectExecute;

public class ModItemGroups {
    public static final ItemGroup UPGRADETEAMPLATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProjectExecute.MOD_ID, "upgradetemplate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.upgradetemplate"))
                    .icon(() -> new ItemStack(Moditem.UPGRADETEMPLATE)).entries((displayContext, entries) -> {
                        entries.add(Moditem.UPGRADETEMPLATE);
                        entries.add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);

                    }).build());


    public static void registerItemGroups() {
        ProjectExecute.LOGGER.info("Registering Item Groups for "+ ProjectExecute.MOD_ID);
    }
}

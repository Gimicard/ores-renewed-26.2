package com.gimicard.oresrenewed.item;

import com.gimicard.oresrenewed.tags.ModTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public  static final ToolMaterial LEAD = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_LEAD_TOOL,
            200, 5f, 2.0f,12, ModTags.Items.LEAD_REPAIR);

    public  static final ToolMaterial VULKANIT = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_VULKANIT_TOOL,
            2500, 5f, 10.0f,12, ModTags.Items.LEAD_REPAIR);
}

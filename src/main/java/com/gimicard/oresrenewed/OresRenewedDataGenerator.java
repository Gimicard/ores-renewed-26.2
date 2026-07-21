package com.gimicard.oresrenewed;

import com.gimicard.tutorialmod.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OresRenewedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// Registriert deinen Modell-Provider für Block- und Item-Modelle
		pack.addProvider(ModModelProvider::new);
	}
}
package io.github.cottonmc.libcd.api;

import io.github.cottonmc.libcd.api.condition.ConditionManager;
import io.github.cottonmc.libcd.api.tweaker.TweakerManager;

public interface LibCDInitializer {

	/**
	 * Register tweakers and assistant scripts.
	 * @param manager The tweaker manager to register in.
	 */
	void initTweakers(TweakerManager manager);

	/**
	 * Register conditions for conditional data.
	 * @param manager The condition manager to register in.
	 */
	void initConditions(ConditionManager manager);

}

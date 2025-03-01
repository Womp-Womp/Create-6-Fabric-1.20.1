package com.simibubi.create.foundation.utility.fabric;

import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ReachUtil {
	public static double reach(LivingEntity entity) {
		boolean creative = entity instanceof Player p && p.isCreative();
		return ReachEntityAttributes.getReachDistance(entity, creative ? 5 : 4.5);
	}
}

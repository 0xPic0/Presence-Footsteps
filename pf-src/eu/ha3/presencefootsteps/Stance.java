package eu.ha3.presencefootsteps;

import net.minecraft.entity.player.EntityPlayer;

public enum Stance {
	QUAD,
	BIPED,
	QUAD_PEG;
	
	
	public boolean isMLP() {
		return this != BIPED;
	}
	
	public boolean isPeg() {
		return this == QUAD_PEG;
	}
	
	public static Stance getStance(EntityPlayer ply, int stanceId) {
		if (stanceId < 0 || stanceId > values().length) stanceId = 0;

		if (stanceId == 0) {
			return BIPED;
		}

		return values()[stanceId - 1];
	}
}

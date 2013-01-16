package com.javaking.clanteam.scouting.scoring;

public class AutonomousScore extends TeleopScore {

	private static final long serialVersionUID = -2749780377433074208L;

	@Override
	public int score(Enum<?> type) {
		return super.score(type)*2;
	}

}

package com.javaking.clanteam.scouting.scoring;

public class TeleopScore extends Score {

	private static final long serialVersionUID = 1677855904861215146L;
	
	public enum Type {
		LOW,
		MEDIUM,
		HIGH
	}

	@Override
	public int score(Enum<?> type) {
		if (!(type instanceof Type)) {
			throw new IllegalArgumentException("type Must be of a TeleopScore.Type enum");
		}
		return mScore+=(type.ordinal()+1); 
	}

}

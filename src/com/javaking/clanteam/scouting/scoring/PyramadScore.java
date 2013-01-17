package com.javaking.clanteam.scouting.scoring;



public class PyramadScore extends Score {

	public enum Type {
		DISK,
		LEVEL_1,
		LEVEL_2,
		LEVEL_3
	}

	private static final long serialVersionUID = 7036772723411028296L;
	
	@Override
	public int score(Enum<?> type) {
		if (!(type instanceof Type)) {
			throw new IllegalArgumentException("type Must be of a PyramadScore.Type enum");
		}
		if (type.name().equals(Type.DISK.name()))
			return (mScore+=5);
		
		return (mScore+=type.ordinal()*10);
	}

}

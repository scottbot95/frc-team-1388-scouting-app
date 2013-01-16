package com.javaking.clanteam.scouting.scoring;



public class PyramaidScore extends Score {

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
			throw new IllegalArgumentException("type Must be of a PyramaidScore.Type enum");
		}
		if (type.name().equals(Type.DISK.name()))
			return 5;
		
		return (type.ordinal()*10);
	}

}

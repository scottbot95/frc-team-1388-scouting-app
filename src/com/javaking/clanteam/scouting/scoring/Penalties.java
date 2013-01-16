package com.javaking.clanteam.scouting.scoring;

public class Penalties extends Score {


	private static final long serialVersionUID = -2713810131809802314L;

	enum Type {
		Bad,
		VeryBad
	}
	
	@Override
	public int score(Enum<?> type) {
		if (!(type instanceof Type)) {
			throw new IllegalArgumentException("type Must be of a Penalty.Type enum");
		}
		mScore += type.ordinal()*3; // TODO ask recon about the exact point here.
		return mScore;
	}

}

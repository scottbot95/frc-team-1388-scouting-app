package com.javaking.clanteam.scouting.scoring;

public class Penalties extends Score {

	private static final long serialVersionUID = -2713810131809802314L;

	enum Type { // TODO This isn't right
		Bad,
		VeryBad
	}
	
	@Override
	public int score(Enum<?> type) {
		if (!(type instanceof Type)) {
			throw new IllegalArgumentException("type Must be of a Penalty.Type enum");
		}
		return (mScore+=type.ordinal()*3); // TODO ask recon about the exact point here.

	}

}

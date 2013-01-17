package com.javaking.clanteam.scouting.scoring;


/**
 * The Score by one team for one phase of a match (auto, teleop)
 * @author scott
 *
 */
public abstract class Score extends Number {
	
	private static final long serialVersionUID = 4096532298254153554L;
	
	protected int mScore;
	
	public enum Type {
		AUTONOMOUS,
		TELEOP,
		PYRAMAID
	}
	
	public static Score getInstance(Type type) {
		Score newScore;
		switch (type) {
		case AUTONOMOUS:
			newScore= new PyramadScore();
			break;
		case TELEOP:
			newScore = new PyramadScore();
			break;
		case PYRAMAID:
			newScore = new PyramadScore();
			break;
		default:
			newScore = null;
		}
		return newScore;
	}
	
//	public Score(MatchData.Period period) {
//		mPeriod = period;
//	}
//	
//	public Score(MatchData.Period period, int score) {
//		mPeriod = period;
//		mScore = score;
//	}
	
	/**
	 * Add score of type <tt>type</tt> then return the current score. 
	 * (eg Teleop.score(Teleop.Type.LOW) adds one to the score and then outputs
	 * whatever the current score is.
	 * @param type The type of score to add.
	 * @return The new score
	 */
	public abstract int score(Enum<?> type);

	@Override
	public double doubleValue() {
		return mScore;
	}

	@Override
	public float floatValue() {
		return mScore;
	}

	@Override
	public int intValue() {
		return mScore;
	}

	@Override
	public long longValue() {
		return mScore;
	}

}

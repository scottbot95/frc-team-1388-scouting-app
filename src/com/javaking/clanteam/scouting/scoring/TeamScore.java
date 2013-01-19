package com.javaking.clanteam.scouting.scoring;


/**
 * Point break-down of a single team's score in a single match.
 * @author scott
 *
 */
public class TeamScore {
	
	/**
	 * Just for reference, the team number this is representing.
	 */
	private int teamNumber;
	
	/**
	 * The points scored in Autonomous.
	 */
	private Score mAutoScore;
	
	/**
	 * The points scored in Teleop.
	 */
	private Score mTeleopScore;
	
	/**
	 * The points scored via the Pyramid
	 */
	private Score mPyramidScore;
	
	/**
	 * The points given to opposing alliance due to penalties
	 */
	private Score mPenalties;
	
	public TeamScore(int teamNumber) {
		this.teamNumber = teamNumber;
		mAutoScore = new AutonomousScore();
		mTeleopScore = new TeleopScore();
		mPyramidScore = new PyramidScore();
		mPenalties = new Penalties();
	}
	
	public int getTeamNumber() {
		return teamNumber;
	}
	
	public int score(Enum<?> type) {
		Class<?> clazz = type.getClass().getEnclosingClass();
		if (clazz==null) {
			throw new IllegalArgumentException("Unknown enum");
		}
		if (clazz.equals(AutonomousScore.class)) 
			mAutoScore.score(type);
		else if (clazz.equals(TeleopScore.class)) 
			mTeleopScore.score(type);
		else if (clazz.equals(PyramidScore.class)) 
			mPyramidScore.score(type);
		else if (clazz.equals(Penalties.class)) 
				mPenalties.score(type);
		return getScore();
	}

	public int getScore() {
		return mAutoScore.intValue()
				+ mTeleopScore.intValue()
				+ mPyramidScore.intValue()
				- mPenalties.intValue();
	}
	
	
}

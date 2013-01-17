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
	private Score mPyramaidScore;
	
	/**
	 * The points given to opposing alliance due to penalties
	 */
	private Score mPenalties;
	
	public TeamScore(int teamNumber) {
		this.teamNumber = teamNumber;
		mAutoScore = new AutonomousScore();
		mTeleopScore = new TeleopScore();
		mPyramaidScore = new PyramadScore();
		mPenalties = new Penalties();
	}
	
	public Score score(Enum<?> type) {
		Class<?> clazz = type.getClass().getEnclosingClass();
		if (clazz==null) {
			throw new IllegalArgumentException("Unknown enum");
		}
		if (clazz.equals(AutonomousScore.class)) 
			mAutoScore.score(type);
		else if (clazz.equals(TeleopScore.class)) 
			mTeleopScore.score(type);
		else if (clazz.equals(PyramadScore.class)) 
			mAutoScore.score(type);
		else if (clazz.equals(Penalties.class)) 
				mAutoScore.score(type);
		
		return null;
	}
	
	
}

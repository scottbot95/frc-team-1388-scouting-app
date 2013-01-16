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
	 * The points scored via the Pyramaid
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
		mPyramaidScore = new PyramaidScore();
		mPenalties = new Penalties();
	}
	
	
}

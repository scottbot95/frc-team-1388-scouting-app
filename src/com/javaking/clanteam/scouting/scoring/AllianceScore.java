package com.javaking.clanteam.scouting.scoring;

import com.javaking.clanteam.scouting.matches.MatchHeaderData;

/**
 * This class represents the number of points and penalties scored and incurred
 * by one alliance in any given match. It also contains a break-down of recorded
 * scores of the three teams on this alliance.
 * 
 * @author scott
 *
 */
public class AllianceScore {
	
	private AllianceScore() {
		mTeams = new TeamScore[3];
	}
	
	public enum Alliance {
		RED,
		BLUE
	}
	
	/**
	 * The final score of one alliance not adjusted for points due to penalties from
	 * the other alliance.
	 */
	private int mNominalScore = 0;
	
	/**
	 * Not to be related to Nominal and Final Scores, this is the points for the
	 * <b>OPPOSING</b> alliance due to penalties incurred by this alliance.
	 */
	private int mPenalties = 0;
	
	/**
	 * @return the NominalScore (the raw points scored by the alliance.)
	 */
	public int getNominalScore() {
		return mNominalScore;
	}

	/**
	 * @return the RealScore (adjusted for penalties)
	 */
	public int getRealScore() {
		return mNominalScore-mPenalties;
	}

	/**
	 * @return the Penalties
	 */
	public int getPenalties() {
		return mPenalties;
	}

	/**
	 * @return the Teams
	 */
	public TeamScore[] getTeams() {
		return mTeams;
	}

	/**
	 * Scores of the individual teams on this alliance.
	 */
	private TeamScore[] mTeams;
	
	/**
	 * Grab the score stats from the FRC twiter feed.
	 * @return
	 */
	public static AllianceScore getScores(MatchHeaderData header, Alliance alliance) {
		throw new UnsupportedOperationException("Method not yet implemented.");
	}
}

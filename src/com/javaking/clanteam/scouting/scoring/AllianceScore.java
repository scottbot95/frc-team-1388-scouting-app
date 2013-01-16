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
	
	public enum Alliance {
		RED,
		BLUE
	}
	
	/**
	 * The final score of one alliance not adjusted for points due to penalties from
	 * the other alliance.
	 */
	private int mNominalFinalScore = 0;
	
	/**
	 * Not to be related to Nominal and Final Scores, this is the points for the
	 * <b>OPPOSING</b> alliance due to penalties incurred by this alliance.
	 */
	private int mPenalties = 0;
	
	/**
	 * @return the mNominalFinalScore
	 */
	public int getmNominalFinalScore() {
		return mNominalFinalScore;
	}

	/**
	 * @param mNominalFinalScore the mNominalFinalScore to set
	 */
	public void setmNominalFinalScore(int mNominalFinalScore) {
		this.mNominalFinalScore = mNominalFinalScore;
	}

	/**
	 * @return the mRealFinalScore
	 */
	public int getmRealFinalScore() {
		return mNominalFinalScore-mPenalties;
	}

	/**
	 * @return the mPenalties
	 */
	public int getmPenalties() {
		return mPenalties;
	}

	/**
	 * @param mPenalties the mPenalties to set
	 */
	public void setmPenalties(int mPenalties) {
		this.mPenalties = mPenalties;
	}

	/**
	 * @return the mTeams
	 */
	public Score[] getmTeams() {
		return mTeams;
	}

	/**
	 * @param mTeams the mTeams to set
	 */
	public void setmTeams(Score[] mTeams) {
		this.mTeams = mTeams;
	}

	/**
	 * Scores of the individual teams on this alliance.
	 */
	private Score[] mTeams;
	
	/**
	 * Grab the score stats from the FRC twiter feed.
	 * @return
	 */
	public static AllianceScore getScores(MatchHeaderData header, Alliance alliance) {
		throw new UnsupportedOperationException("Method not yet implemented.");
	}
}

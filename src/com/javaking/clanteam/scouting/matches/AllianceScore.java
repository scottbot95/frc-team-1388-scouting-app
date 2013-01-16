package com.javaking.clanteam.scouting.matches;
/**
 * This class represents the number of points and penalties scored and incurred
 * by one alliance in any given match. It also contains a break-down of recorded
 * scores of the three teams on this alliance.
 * 
 * @author scott
 *
 */
public class AllianceScore {
	
	/**
	 * The final score of one alliance not adjusted for points due to penalties from
	 * the other alliance.
	 */
	private int mNominalFinalScore = 0;
	
	/**
	 * The actual number of pointers earned by one alliance in a match.
	 * Example: Final Score is 50 pts. But 20 of them came from penalties from the
	 * opposing alliance. RealFinalScore would be 30pts.
	 */
	private int mRealFinalScore = 0;
	
	/**
	 * Not to be related to Nominal and Final Scores, this is the points for the
	 * <b>OPPOSING</b> alliance due to penalties incurred by this alliance.
	 */
	private int mPenalties = 0;
	
	
	
}

package com.javaking.clanteam.scouting.matches;

import com.javaking.clanteam.scouting.TeamData;

/**
 * All the data about a match bundled into one nice happy class.
 * 
 * It contains {@link MatchHeaderData} information as well as scores and what teams
 * are there, blah blah blah....
 * @author scott
 *
 */
public class MatchData {
	
	/**
	 * The header data for this match
	 * @see MatchHeaderData
	 */
	private MatchHeaderData mHeaderData;
	
	/**
	 * An array of all the teams in this match
	 */
	private int[] mTeams;

	/**
	 * The final score of Red Alliance
	 */
	private int mRedScore;
	
	/**
	 * The final score of Blue Alliance
	 */
	private int mBlueScore;
	
	private MatchData()
	{
		mTeams = new int[6];
	}
	
	/**
	 * Uses the official FRC twitter feed to lookup the match data for a match 
	 * that matches the criteria provided. If, somehow, multiple matches with the
	 * same number at the same regional occur, this function will only return data
	 * about the first to appear.
	 * 
	 * @param regional The three letter regional code assigned to each FRC Regional.
	 * @param matchNumber The match number
	 * @return A {@link MatchData} containing information about the match based
	 * on the provided criteria or <code>null</code> if no match was found.
	 */
	public static MatchData retrieveMatch(String regional, int matchNumber) {
		throw new UnsupportedOperationException("Method not yet implemented.");
	}
	
	/**
	 * @see MatchData#retrieveMatch(String, int)
	 */
	public static MatchData retrieveMatch(MatchHeaderData data) {
		return retrieveMatch(data.regional, data.matchNumber);
	}
	
	public int[] getTeamNumbers()
	{
		return mTeams;
	}
	
	public TeamData[] getTeams() {
		TeamData[] teams = new TeamData[6];
		for (int i=0; i<6; i++) {
			teams[i] = TeamData.getTeam(mTeams[i]);
		}
		return teams;
	}

}

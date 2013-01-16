package com.javaking.clanteam.scouting;

public class MatchData {
	
	private int[] mTeams;
	
	private MatchData()
	{
		mTeams = new int[6];
	}
	
	public static MatchData retrieveMatch(String regional, int matchNum) {
		throw new UnsupportedOperationException("Method not yet implemented.");
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

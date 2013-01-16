package com.javaking.clanteam.scouting;

import java.util.List;

import android.support.v4.util.LruCache;

public class TeamData {
	
	static LruCache<Integer, TeamData> mCache;

	private int mTeamNumber;
	private List<MatchData> mMatches;
	
	
	public static TeamData getTeam(int number) {
		throw new UnsupportedOperationException("Method not yet implemented.");
	}
	
}

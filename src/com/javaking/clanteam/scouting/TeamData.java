package com.javaking.clanteam.scouting;

import java.util.List;

import com.javaking.clanteam.scouting.matches.MatchData;

import android.support.v4.util.LruCache;

public class TeamData {
	
	/**
	 * Used to build up a cache of recently used teams to improve performance. 
	 */
	static LruCache<Integer, TeamData> mCache;

	/**
	 * Team Number
	 */
	private int mTeamNumber;
	
	/**
	 * Team Name
	 */
	private String mTeamName;
	
	/**
	 * A list of the matches this team has been in.
	 */
	private List<MatchData> mMatches;
	
	/**
	 * The "score" this team has received thus far based on the matches it has
	 * performed in.
	 */
	private float mScore; // TODO Do we really want this here?
	
	
	public static TeamData getTeam(int number) {
		throw new UnsupportedOperationException("Method not yet implemented.");
	}
	
}

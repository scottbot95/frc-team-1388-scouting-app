package com.javaking.clanteam.scouting.matches;

import com.javaking.clanteam.scouting.R;
import com.javaking.clanteam.scouting.R.layout;
import com.javaking.clanteam.scouting.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MatchEditActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_edit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_match_edit, menu);
		return true;
	}

}

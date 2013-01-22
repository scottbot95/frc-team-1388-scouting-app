package com.javaking.clanteam.scouting.matches;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.javaking.clanteam.scouting.R;

public class MatchEditActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_edit);
		getSupportFragmentManager().beginTransaction()
			.add(R.id.frame, new StartMatchFragment())
			.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_match_edit, menu);
		return true;
	}

}

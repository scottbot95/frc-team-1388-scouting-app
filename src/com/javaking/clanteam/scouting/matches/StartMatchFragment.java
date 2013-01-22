package com.javaking.clanteam.scouting.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.javaking.clanteam.scouting.R;

public class StartMatchFragment extends SherlockFragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_start_match, container,false);
		view.findViewById(R.id.startMatchButton).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				getFragmentManager()
					.beginTransaction()
					.replace(getId(), new PlayMatchFragment())
					.addToBackStack(null)
					.commit();
			}
		});
		return view;
	}

}

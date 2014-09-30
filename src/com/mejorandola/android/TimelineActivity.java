package com.mejorandola.android;

import com.mejorandola.android.utils.ConstantsUtils;
import com.mejorandola.android.utils.TwitterUtils;

import android.app.Activity;
import android.os.Bundle;

public class TimelineActivity extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timeline);
		
		TwitterUtils.getTimelineForSearchTerm(ConstantsUtils.MEJORANDROID_TERM);
		
	}


}

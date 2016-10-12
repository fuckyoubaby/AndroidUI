package com.shijinxiang.androidui;

import com.shijinxiang.myview.WheelMenu;
import com.shijinxiang.myview.WheelMenu.WheelChangeListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class WheelMenuActivity extends Activity {

	private WheelMenu wheelMenu;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wheel_menu);
		textView = (TextView) findViewById(R.id.textView);
		wheelMenu = (WheelMenu) findViewById(R.id.wheelmenu);
		wheelMenu.setDivCount(12);//分成多少个刻度
		wheelMenu.setWheelImage(R.drawable.wheel);
		int position = wheelMenu.getSelectedPosition();//获取当前的position
		textView.setText(""+(position+1));
		wheelMenu.setWheelChangeListener(new WheelChangeListener() {
			
			@Override
			public void onSelectionChange(int selectedPosition) {
				textView.setText(""+(selectedPosition+1));
			}
		});
	}
	
}

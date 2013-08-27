package com.example.numberpickerdemo;

import net.simonvt.numberpicker.NumberPicker;
import net.simonvt.numberpicker.NumberPicker.Formatter;
import net.simonvt.numberpicker.NumberPicker.OnValueChangeListener;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends Activity {

	private NumberPicker numberPicker_a;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				LayoutInflater aaa = LayoutInflater.from(MainActivity.this);
//				View bbb = aaa.inflate(R.layout.activity_main, null);
//				numberPicker_a = (NumberPicker) bbb.findViewById(R.id.numberPicker_a);
//				numberPicker_a.setMaxValue(60);
//				numberPicker_a.setMinValue(0);
//				numberPicker_a.setFocusable(true);
//				numberPicker_a.setFocusableInTouchMode(true);
//				Dialog abc = new Dialog(MainActivity.this);
//				abc.setTitle("123");
//				
//				abc.setContentView(bbb);
//				 
//				abc.show();
//				abc.setCancelable(true);
//				abc.setCanceledOnTouchOutside(true);
//				
//				hideSoftInput(v);
//				numberPicker_a.getValue();
//			}
//		});
	    numberPicker_a = (NumberPicker) findViewById(R.id.numberPicker_a);
		numberPicker_a.setMaxValue(60);
		numberPicker_a.setMinValue(0);
		numberPicker_a.setFocusable(true);
		numberPicker_a.setFocusableInTouchMode(true);
	
		numberPicker_a.setOnValueChangedListener(new OnValueChangeListener() {
			
			@Override
			public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
				// TODO Auto-generated method stub
				if(oldVal!=newVal){
					System.out.println(newVal);
				}
				
				
			}
		});
		
		
		NumberPicker numberPicker_b = (NumberPicker) findViewById(R.id.numberPicker_b);
		numberPicker_b.setMaxValue(60);
		numberPicker_b.setMinValue(0);
		numberPicker_b.setFocusable(true);
		numberPicker_b.setFocusableInTouchMode(true);

	}
	
	public static void hideSoftInput(View v) {
		InputMethodManager imm = (InputMethodManager) v.getContext()
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		if (imm.isActive()) {
			imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
		}
	}
	private class WeightFormatter implements Formatter {

		@Override
		public String format(int value) {
			return String.format("%.1f", (float) value / 10);
		}
	}

}

package com.example.clovertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button outputButton;
	EditText inputNumber;
	TextView resultPrimes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		outputButton = (Button) findViewById(R.id.button1);
		inputNumber = (EditText) findViewById(R.id.editText1);
		
		outputButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		resultPrimes = (TextView) findViewById(R.id.textView1);
		String inputNumberText = inputNumber.getText().toString();
		int n = Integer.parseInt(inputNumberText);
		if (n > 0) {
			String result = listPrimes(n);
			resultPrimes.setText(result);
		}
	}
	
	private String listPrimes(int n) {
		StringBuilder result = new StringBuilder();
		int i = 2;
		while (n > 0) {
			if (isPrime(i)) {
				result.append(i);
				result.append(", ");
				n--;
			}
			i++;
		}
		String resultStr = result.toString().substring(0, result.length() - 2); //get rid of last comma
		return resultStr;
	}
	
	private boolean isPrime(int x) {
		int n = 2;
		while (n < x) {
			if (x % n == 0)
				return false;
			n++;
		}
		return true;
	}
	
	

	

	
	

}

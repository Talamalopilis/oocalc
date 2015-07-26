package com.talamalopilis.oocalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity {
        
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] opsReference = new String[2];
        final String[] opsPackage = new String[4];
        final Double[] opsSave = new Double[4];

        final EditText numBox1 = (EditText) findViewById(R.id.numbox1);
        final ToggleButton button1 = (ToggleButton) findViewById(R.id.button1);
        final EditText numBox2 = (EditText) findViewById(R.id.numbox2);
        final ToggleButton button2 = (ToggleButton) findViewById(R.id.button2);
        final EditText numBox3 = (EditText) findViewById(R.id.numbox3);
        final ToggleButton button3 = (ToggleButton) findViewById(R.id.button3);
        final EditText numBox4 = (EditText) findViewById(R.id.numbox4);
        final ToggleButton button4 = (ToggleButton) findViewById(R.id.button4);
        
        final ToggleButton plus = (ToggleButton) findViewById(R.id.plus);
        final ToggleButton minus = (ToggleButton) findViewById(R.id.minus);
        final ToggleButton times = (ToggleButton) findViewById(R.id.times);
        final ToggleButton divide = (ToggleButton) findViewById(R.id.divide);
        final Button sign = (Button) findViewById(R.id.sign);
        final Button sine = (Button) findViewById(R.id.sine);
        final Button cosine = (Button) findViewById(R.id.cosine);
        final Button tangent = (Button) findViewById(R.id.tangent);
        final Button ln = (Button) findViewById(R.id.ln);
        final Button log = (Button) findViewById(R.id.log);
        final Button sin1 = (Button) findViewById(R.id.sin1);
        final Button cos1 = (Button) findViewById(R.id.cos1);
        final Button tan1 = (Button) findViewById(R.id.tan1);
        final Button etox = (Button) findViewById(R.id.etox);
        final Button tentox = (Button) findViewById(R.id.tentox);
        final ToggleButton xtoy = (ToggleButton) findViewById(R.id.xtoy);
        final Button xtotwo = (Button) findViewById(R.id.xtotwo);
        final Button n = (Button) findViewById(R.id.n);
        final Button sqrt = (Button) findViewById(R.id.sqrt);
        final Button oneoverx = (Button) findViewById(R.id.oneoverx);
        final ToggleButton exp = (ToggleButton) findViewById(R.id.exp);
        final Button euler = (Button) findViewById(R.id.euler);
        final Button pi = (Button) findViewById(R.id.pi);
        final ToggleButton copy = (ToggleButton) findViewById(R.id.copy);
        final Button clear = (Button) findViewById(R.id.clear);
        
        
        numBox1.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                	numberBoxClicked(1, numBox1, numBox2, numBox3, numBox4, 
                			button1, button2, button3, button4);
                    handled = true;
                }
                return handled;
            }
        });
       
        numBox2.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                	numberBoxClicked(2, numBox1, numBox2, numBox3, numBox4, 
                			button1, button2, button3, button4);
                    handled = true;
                }
                return handled;
            }
        });
       
        numBox3.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                	numberBoxClicked(3, numBox1, numBox2, numBox3, numBox4, 
                			button1, button2, button3, button4);
                    handled = true;
                }
                return handled;
            }
        });

        numBox4.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                	numberBoxClicked(4, numBox1, numBox2, numBox3, numBox4, 
                			button1, button2, button3, button4);
                    handled = true;
                }
                return handled;
            }
        });
   
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            	toggleButtonClicked(1, opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, 
                		button1, button2, button3, button4, 
                		plus,  minus,  times,  divide,  sign,  sine,
                  		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                  		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                  		 euler,  pi,  copy,  clear);               
            }
        });
        
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            	toggleButtonClicked(2, opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, 
                		button1, button2, button3, button4, 
                		plus,  minus,  times,  divide,  sign,  sine,
                  		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                  		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                  		 euler,  pi,  copy,  clear);            
            }
        });
        
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            	toggleButtonClicked(3, opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, 
                		button1, button2, button3, button4, 
                		plus,  minus,  times,  divide,  sign,  sine,
                  		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                  		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                  		 euler,  pi,  copy,  clear);               
            }
        });
        
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            	toggleButtonClicked(4, opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, 
                		button1, button2, button3, button4, 
                		plus,  minus,  times,  divide,  sign,  sine,
                  		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                  		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                  		 euler,  pi,  copy,  clear);               
            }
        });
        
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("plus", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("minus", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        times.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("times", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        divide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("divide", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        sign.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("sign", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        sine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("sine", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        cosine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("cosine", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        tangent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("tangent", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        ln.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("ln", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        log.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("log", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        sin1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("sin1", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        cos1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("cos1", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        tan1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("tan1", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        etox.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("etox", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        tentox.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("tentox", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        xtoy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("xtoy", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        xtotwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("xtotwo", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        n.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("n", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        sqrt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("sqrt", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        oneoverx.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("oneoverx", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        exp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("exp", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        euler.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   if (opsPackage[3] == null){
                	   opsPackage[3] = "rad";
                	   euler.setText("rad");
                   }
                   else{
                	   opsPackage[3] = null;
                	   euler.setText("°");
                   }
            }
        });
        
        pi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("pi", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        copy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   toggleOpsClicked("copy", opsReference, opsPackage, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                   buttonOpsClicked("clear", opsSave, opsReference, opsPackage, numBox1, numBox2, numBox3, numBox4, button1, button2, button3, button4, 
                   		plus,  minus,  times,  divide,  sign,  sine,
                 		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
                 		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
                 		 euler,  pi,  copy,  clear);        
            }
        });
        
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.about) {
        	Intent intent = new Intent(this, DisplayAboutActivity.class);
        	startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void onToggleClicked(ToggleButton main, ToggleButton button2, ToggleButton button3, ToggleButton button4,
    		ToggleButton plus, ToggleButton minus, ToggleButton times, ToggleButton divide, Button sign, Button sine,
    		Button cosine, Button tangent, Button ln, Button log, Button sin1, Button cos1, Button tan1, Button etox,
    		Button tentox, ToggleButton xtoy, Button xtotwo, Button n, Button sqrt, Button oneoverx, ToggleButton exp,
    		Button euler, Button pi, ToggleButton copy, Button clear, Boolean state){
    	
    	setButtonEnabled(button2,  button3,  button4,
       		 plus,  minus,  times,  divide,  sign,  sine,
       		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
       		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
       		 euler,  pi,  copy,  clear, state);
    	
    }
    
    public void setButtonEnabled(ToggleButton button2, ToggleButton button3, ToggleButton button4,
    		ToggleButton plus, ToggleButton minus, ToggleButton times, ToggleButton divide, Button sign, Button sine,
    		Button cosine, Button tangent, Button ln, Button log, Button sin1, Button cos1, Button tan1, Button etox,
    		Button tentox, ToggleButton xtoy, Button xtotwo, Button n, Button sqrt, Button oneoverx, ToggleButton exp,
    		Button euler, Button pi, ToggleButton copy, Button clear, Boolean state){
    	
    	plus.setEnabled(state); minus.setEnabled(state); times.setEnabled(state); divide.setEnabled(state); sign.setEnabled(state);
    	sine.setEnabled(state); cosine.setEnabled(state); tangent.setEnabled(state); ln.setEnabled(state); log.setEnabled(state);
    	sin1.setEnabled(state); cos1.setEnabled(state); tan1.setEnabled(state); etox.setEnabled(state); tentox.setEnabled(state); 
    	xtoy.setEnabled(state); xtotwo.setEnabled(state); n.setEnabled(state); sqrt.setEnabled(state); oneoverx.setEnabled(state); 
    	exp.setEnabled(state); pi.setEnabled(state); copy.setEnabled(state); clear.setEnabled(state);    	
    	
    		button2.setEnabled(!state);
    		button3.setEnabled(!state);
    		button4.setEnabled(!state);
    
    }

    public void toggleButtonClicked(int key, Double[] opsSave, String[] opsReference, String[] opsPackage, EditText numBox1, EditText numBox2, EditText numBox3, EditText numBox4, 
    		ToggleButton button1, ToggleButton button2, ToggleButton button3, ToggleButton button4, 
    		ToggleButton plus, ToggleButton minus, ToggleButton times, ToggleButton divide, Button sign, Button sine,
    		Button cosine, Button tangent, Button ln, Button log, Button sin1, Button cos1, Button tan1, Button etox,
    		Button tentox, ToggleButton xtoy, Button xtotwo, Button n, Button sqrt, Button oneoverx, ToggleButton exp,
    		Button euler, Button pi, ToggleButton copy, Button clear){
    	ToggleButton main = null;
    	switch (key){
    	case 1: main = button1; break;
    	case 2: main = button2; break;
    	case 3: main = button3; break;
    	case 4: main = button4; break;
    	}
    if(main.isChecked()){
        //Button starts OFF, just been clicked first time
    	switch (key){
    	case 1:  onToggleClicked(button1,button2,  button3,  button4,
          		 plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
    	case 2:  onToggleClicked(button2,button1,  button3,  button4,
          		 plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
    	case 3:  onToggleClicked(button3,button2,  button1,  button4,
          		 plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
    	case 4:  onToggleClicked(button4,button2,  button3,  button1,
          		 plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
    	}
        
        if (opsPackage[0] == null) {
        	//first number to be clicked
        	
        	opsPackage[0] = main.getTextOff().toString();
        	switch (key){
        	case 1: opsReference[0] = "button1"; if (opsSave[0] != null) opsPackage[0] = "save0"; break;
        	case 2: opsReference[0] = "button2"; if (opsSave[1] != null) opsPackage[0] = "save1"; break;
        	case 3: opsReference[0] = "button3"; if (opsSave[2] != null) opsPackage[0] = "save2"; break;
        	case 4: opsReference[0] = "button4"; if (opsSave[3] != null) opsPackage[0] = "save3"; break;
        	}
        	
        }
        else {
        	// clicked after some other number
        	opsPackage[2] = main.getTextOff().toString();
        	switch (key){
        	case 1: if (opsSave[0] != null) opsPackage[2] = "save0"; break;
        	case 2: if (opsSave[1] != null) opsPackage[2] = "save1"; break;
        	case 3: if (opsSave[2] != null) opsPackage[2] = "save2"; break;
        	case 4: if (opsSave[3] != null) opsPackage[2] = "save3"; break;
        	}
        	Double renum = operate(opsPackage, opsSave);
        	String retext = renum.toString();
        	retext = parseStrDisplay(retext);
        	main.setTextOff(retext);
        	main.setTextOn(retext);
        	main.setChecked(false);
        	switch (key){
        	case 1:  onToggleClicked(button1,button2,  button3,  button4,
             		 plus,  minus,  times,  divide,  sign,  sine,
               		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
               		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
               		 euler,  pi,  copy,  clear,false); opsSave[0] = renum; break;
        	case 2:  onToggleClicked(button2,button1,  button3,  button4,
             		 plus,  minus,  times,  divide,  sign,  sine,
               		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
               		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
               		 euler,  pi,  copy,  clear,false); opsSave[1] = renum; break;
        	case 3:  onToggleClicked(button3,button2,  button1,  button4,
             		 plus,  minus,  times,  divide,  sign,  sine,
               		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
               		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
               		 euler,  pi,  copy,  clear,false); opsSave[2] = renum; break;
        	case 4:  onToggleClicked(button4,button2,  button3,  button1,
             		 plus,  minus,  times,  divide,  sign,  sine,
               		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
               		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
               		 euler,  pi,  copy,  clear,false); opsSave[3] = renum; break;
        	}
        	if(opsReference[1].equals("copy")){
        		switch (opsReference[0]){
            	case "button1": button1.setChecked(false); break;
            	case "button2": button2.setChecked(false); break;
            	case "button3": button3.setChecked(false); break;
            	case "button4": button4.setChecked(false); break;
            	}
        	}
        	else{
        	
        	switch (opsReference[0]){
        	case "button1": opsSave[0] = null; button1.setChecked(false); button1.setVisibility(View.GONE); 
        	numBox1.setText(""); numBox1.setVisibility(View.VISIBLE); break;
        	case "button2": opsSave[1] = null; button2.setChecked(false); button2.setVisibility(View.GONE);
        	numBox2.setText(""); numBox2.setVisibility(View.VISIBLE); break;
        	case "button3": opsSave[2] = null; button3.setChecked(false); button3.setVisibility(View.GONE);
        	numBox3.setText(""); numBox3.setVisibility(View.VISIBLE); break;
        	case "button4": opsSave[3] = null; button4.setChecked(false); button4.setVisibility(View.GONE);
        	numBox4.setText(""); numBox4.setVisibility(View.VISIBLE); break;
        	}
        	}
        	switch (opsReference[1]){
        	case "plus": plus.setChecked(false); break;
        	case "minus": minus.setChecked(false); break;
        	case "times": times.setChecked(false); break;
        	case "divide": divide.setChecked(false); break;
        	case "xtoy": xtoy.setChecked(false); break;
        	case "exp": exp.setChecked(false); break;
        	case "copy": copy.setChecked(false); break;
        	}
        	opsPackage[0] = opsPackage[1] = opsPackage[2] = null;
        	opsReference[0] = opsReference[1] = null;
        }
    }
    else
    	//button already ON, clicked again
    	if(opsPackage[1] == null){
    		// operator was not pressed
    		switch (key){
        	case 1:  onToggleClicked(button1,button2,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
              		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
              		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
              		 euler,  pi,  copy,  clear,false); break;
        	case 2:  onToggleClicked(button2,button1,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
              		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
              		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
              		 euler,  pi,  copy,  clear,false); break;
        	case 3:  onToggleClicked(button3,button2,button1,button4,plus,  minus,  times,  divide,  sign,  sine,
              		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
              		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
              		 euler,  pi,  copy,  clear,false); break;
        	case 4:  onToggleClicked(button4,button2,button3,button1,plus,  minus,  times,  divide,  sign,  sine,
              		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
              		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
              		 euler,  pi,  copy,  clear,false); break;
        	}
    	opsPackage[0] = null;
    	opsReference[0] = null;
    	}
    	else {
    		//operator was pressed, same button clicked again
    		opsPackage[2] = main.getTextOff().toString();
    		switch (key){
        	case 1: if (opsSave[0] != null) opsPackage[2] = "save0"; break;
        	case 2: if (opsSave[1] != null) opsPackage[2] = "save1"; break;
        	case 3: if (opsSave[2] != null) opsPackage[2] = "save2"; break;
        	case 4: if (opsSave[3] != null) opsPackage[2] = "save3"; break;
        	}
    		Double renum = operate(opsPackage, opsSave);
        	String retext = renum.toString();
        	retext = parseStrDisplay(retext);
        	main.setTextOff(retext);
        	main.setTextOn(retext);
        	main.setChecked(false);
    		opsPackage[0] = opsPackage[1] = opsPackage[2] = null;
    		
    		switch (key){
    		case 1:  onToggleClicked(button1,button2,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
             		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
             		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
             		 euler,  pi,  copy,  clear,false); opsSave[0] = renum; break;
    		case 2:  onToggleClicked(button2,button1,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
             		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
             		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
             		 euler,  pi,  copy,  clear,false); opsSave[1] = renum; break;
    		case 3:  onToggleClicked(button3,button2,button1,button4,plus,  minus,  times,  divide,  sign,  sine,
             		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
             		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
             		 euler,  pi,  copy,  clear,false); opsSave[2] = renum; break;
    		case 4:  onToggleClicked(button4,button2,button3,button1,plus,  minus,  times,  divide,  sign,  sine,
             		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
             		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
             		 euler,  pi,  copy,  clear,false); opsSave[3] = renum; break;
        	}
    		switch (opsReference[1]){
    		case "plus": plus.setChecked(false); break;
        	case "minus": minus.setChecked(false); break;
        	case "times": times.setChecked(false); break;
        	case "divide": divide.setChecked(false); break;
        	case "xtoy": xtoy.setChecked(false); break;
        	case "exp": exp.setChecked(false); break;
        	case "copy": copy.setChecked(false); break;
        	}
    		opsReference[0] = opsReference[1] = null;
    	}     
    }

    public void numberBoxClicked(int key, EditText numBox1, EditText numBox2, EditText numBox3, EditText numBox4, 
    		ToggleButton button1, ToggleButton button2, ToggleButton button3, ToggleButton button4){
    	
    	ToggleButton main = null;
    	EditText textmain = null;
    	switch (key){
    	case 1: main = button1; textmain = numBox1; break;
    	case 2: main = button2; textmain = numBox2; break;
    	case 3: main = button3; textmain = numBox3; break;
    	case 4: main = button4; textmain = numBox4; break;
    	}
    	 String number = textmain.getText().toString();
    	 number = parseNum(number);
         main.setTextOff(number);
         main.setTextOn(number);
         textmain.setVisibility(View.INVISIBLE);
         main.setChecked(false);
         main.setVisibility(View.VISIBLE);
    }
    
    public void toggleOpsClicked(String key, String[] opsReference, String[] opsPackage, ToggleButton button1, ToggleButton button2, ToggleButton button3, ToggleButton button4, 
    		ToggleButton plus, ToggleButton minus, ToggleButton times, ToggleButton divide, Button sign, Button sine,
    		Button cosine, Button tangent, Button ln, Button log, Button sin1, Button cos1, Button tan1, Button etox,
    		Button tentox, ToggleButton xtoy, Button xtotwo, Button n, Button sqrt, Button oneoverx, ToggleButton exp,
    		Button euler, Button pi, ToggleButton copy, Button clear){
    	
    	ToggleButton main = null;
    	switch (key){
    	case "plus": main = plus; break;
    	case "minus": main = minus; break;
    	case "times": main = times; break;
    	case "divide": main = divide; break;
    	case "xtoy": main = xtoy; break;
    	case "exp": main = exp; break;
    	case "copy": main = copy; break;
    	}
    	
    	if(main.isChecked()){
            //Button starts OFF, just been clicked first time
        	switch (opsReference[0]){
        	case "button1":  onToggleClicked(button1,button2,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
            		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
            		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
            		 euler,  pi,  copy,  clear,false); break;
        	case "button2":  onToggleClicked(button2,button1,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
            		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
            		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
            		 euler,  pi,  copy,  clear,false); break;
        	case "button3":  onToggleClicked(button3,button2,button1,button4,plus,  minus,  times,  divide,  sign,  sine,
            		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
            		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
            		 euler,  pi,  copy,  clear,false); break;
        	case "button4":  onToggleClicked(button4,button2,button3,button1,plus,  minus,  times,  divide,  sign,  sine,
            		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
            		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
            		 euler,  pi,  copy,  clear,false); break;
        	}
        	opsPackage[1] = key;
        	opsReference[1] = key;
        	main.setEnabled(true);
        }
        else{
        	//button already ON, clicked again
        	opsPackage[1] = null;
        	opsReference[1] = null;
        	switch (opsReference[0]){
        	case "button1":  onToggleClicked(button1,button2,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
        	case "button2":  onToggleClicked(button2,button1,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
        	case "button3":  onToggleClicked(button3,button2,button1,button4,plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
        	case "button4":  onToggleClicked(button4,button2,button3,button1,plus,  minus,  times,  divide,  sign,  sine,
           		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
           		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
           		 euler,  pi,  copy,  clear,true); break;
        	}
        }	
    	
    }
    
    public void buttonOpsClicked(String key, Double[] opsSave, String[] opsReference, String[] opsPackage, EditText numBox1, EditText numBox2, EditText numBox3, EditText numBox4,
    		ToggleButton button1, ToggleButton button2, ToggleButton button3, ToggleButton button4,
    		ToggleButton plus, ToggleButton minus, ToggleButton times, ToggleButton divide, Button sign, Button sine,
    		Button cosine, Button tangent, Button ln, Button log, Button sin1, Button cos1, Button tan1, Button etox,
    		Button tentox, ToggleButton xtoy, Button xtotwo, Button n, Button sqrt, Button oneoverx, ToggleButton exp,
    		Button euler, Button pi, ToggleButton copy, Button clear){
    	
    	button1.setEnabled(true);
    	onToggleClicked(button1,button2,button3,button4,plus,  minus,  times,  divide,  sign,  sine,
       		 cosine,  tangent,  ln,  log,  sin1,  cos1,  tan1,  etox,
       		 tentox,  xtoy,  xtotwo,  n,  sqrt,  oneoverx,  exp,
       		 euler,  pi,  copy,  clear,false);
    	
    	if (key.equals("clear")){
    		switch (opsReference[0]){
    		case "button1": opsSave[0] = null; button1.setChecked(false); button1.setVisibility(View.GONE); 
        	numBox1.setText(""); numBox1.setVisibility(View.VISIBLE); break;
        	case "button2": opsSave[1] = null; button2.setChecked(false); button2.setVisibility(View.GONE);
        	numBox2.setText(""); numBox2.setVisibility(View.VISIBLE); break;
        	case "button3": opsSave[2] = null; button3.setChecked(false); button3.setVisibility(View.GONE);
        	numBox3.setText(""); numBox3.setVisibility(View.VISIBLE); break;
        	case "button4": opsSave[3] = null; button4.setChecked(false); button4.setVisibility(View.GONE);
        	numBox4.setText(""); numBox4.setVisibility(View.VISIBLE); break;
        	}
    		
    	}
    	
    	else{
    	opsPackage[1] = key;
    	Double renum = operate(opsPackage, opsSave);
    	String retext = renum.toString();
    	retext = parseStrDisplay(retext);
    	
    	switch (opsReference[0]){
    	case "button1": button1.setTextOff(retext); button1.setTextOn(retext); button1.setChecked(false); opsSave[0] = renum; break;
    	case "button2": button2.setTextOff(retext); button2.setTextOn(retext); button2.setChecked(false); opsSave[1] = renum; break;
    	case "button3": button3.setTextOff(retext); button3.setTextOn(retext); button3.setChecked(false); opsSave[2] = renum; break;
    	case "button4": button4.setTextOff(retext); button4.setTextOn(retext); button4.setChecked(false); opsSave[3] = renum; break;
    	}
    	
    	}
    	opsPackage[0] = opsPackage[1] = null;
    	opsReference[0] = null;
    	
    	
    }
    
    public String parseNum(String num){
    	if (num.equals("") || num.equals(".") || num.equals("-") || num.equals("-."))
    		num = "0";
    	StringBuilder number = new StringBuilder(num);
    	parseStrBuild(number);
    	num = number.toString();
    	if (num.equals("-0") || num.equals("0.") || num.equals("-0."))
    		num = "0";
    	return num;
    }
    
    public void parseStrBuild(StringBuilder build){
    	int dot = build.indexOf(".");
    	if (dot == 0)
    		build.insert(0, '0');
    	
    	if (build.charAt(0) == '-')
    		if (dot == 1)
    			build.insert(1, '0');
    	
    	if (build.length() != 1){
	    	if (dot != -1){
	    		if (build.charAt(build.length() - 1) == '0'){
	    			build.deleteCharAt(build.length() - 1);
	    			if (build.charAt(build.length() - 1) == '.')
	    				build.deleteCharAt(build.length() - 1);
	    			parseStrBuild(build);
	    		}
	    	}
	    	if (build.length() != 1){
		    	if (build.charAt(0) == '-'){
		    		if (build.length() != 2){
			    		if (build.charAt(1) == '0' && build.charAt(2) != '.'){
				    		build.deleteCharAt(1);
				    		parseStrBuild(build);
				    	}	
		    		}
		    	}
		    	else{
			    	if (build.charAt(0) == '0' && build.charAt(1) != '.'){
			    		build.deleteCharAt(0);
			    		parseStrBuild(build);
			    	}
		    	}
	    	}
    	}
    }
    
    public String parseStrDisplay(String display){
    	StringBuilder number = new StringBuilder(display);
    	parseDisplay(number);
    	return number.toString();
    }
    
    public void parseDisplay(StringBuilder display){
    	int E = display.indexOf("E");
    	if (E != -1){
    		if (E > 9){
    			display.deleteCharAt(9);
    			parseDisplay(display);
    		}
    	}
    	else{
    		if (display.length() > 13){
    			display.deleteCharAt(13);
    			parseDisplay(display);
    		}
    		if (display.charAt(display.length() - 1) == '0' && display.charAt(display.length() - 2) == '.'){
    			display.deleteCharAt(display.length() - 1);
    			display.deleteCharAt(display.length() - 1);
    		}
    	}
    }
    
    public Double operate(String[] opsPackage, Double[] opsSave){
    	Double alpha = null;
    	Double beta = null;
    	switch (opsPackage[0]){
    	case "save0": alpha = opsSave[0]; break;
    	case "save1": alpha = opsSave[1]; break;
    	case "save2": alpha = opsSave[2]; break;
    	case "save3": alpha = opsSave[3]; break;
    	default: alpha = Double.parseDouble(opsPackage[0]); break;
    	}
    	if (opsPackage[2] != null){
	    	switch (opsPackage[2]){
	    	case "save0": beta = opsSave[0]; break;
	    	case "save1": beta = opsSave[1]; break;
	    	case "save2": beta = opsSave[2]; break;
	    	case "save3": beta = opsSave[3]; break;
	    	default: beta = Double.parseDouble(opsPackage[2]); break;
	    	}
    	}
    	
    	switch (opsPackage[1]){
    	case "plus": return alpha + beta;
    	case "minus": return alpha - beta;
    	case "times": return alpha * beta;
    	case "divide": if (beta == 0) return Double.NaN; return alpha / beta;
    	case "sign": return alpha * -1;
    	case "sine": if (opsPackage[3] == null && alpha%180 == 0) return 0.0; if (opsPackage[3] == "rad" && alpha%Math.PI == 0) return 0.0; if (opsPackage[3] == null) return Math.sin(alpha*Math.PI/180); else return Math.sin(alpha);
    	case "cosine": if (opsPackage[3] == null && alpha%90 == 0 && alpha%180 != 0) return 0.0; if (opsPackage[3] == "rad" && alpha%(Math.PI/2) == 0 && alpha%Math.PI != 0) return 0.0; if (opsPackage[3] == null) return Math.cos(alpha*Math.PI/180); else return Math.cos(alpha);
    	case "tangent": if (opsPackage[3] == null && alpha%90 == 0) return Double.NaN; if (opsPackage[3] == "rad" && alpha%(Math.PI/2) == 0) return Double.NaN; if (opsPackage[3] == null) return Math.tan(alpha*Math.PI/180); else return Math.tan(alpha);
    	case "ln": return Math.log(alpha);
    	case "log": return Math.log10(alpha);
    	case "sin1": if (opsPackage[3] == null) return Math.asin(alpha)*180/Math.PI; else return Math.asin(alpha);
    	case "cos1": if (opsPackage[3] == null) return Math.acos(alpha)*180/Math.PI; else return Math.acos(alpha);
    	case "tan1": if (opsPackage[3] == null) return Math.atan(alpha)*180/Math.PI; else return Math.atan(alpha);
    	case "etox": return Math.exp(alpha);
    	case "tentox": return Math.pow(10, alpha);
    	case "xtoy": return Math.pow(alpha, beta);
    	case "xtotwo": return Math.pow(alpha, 2);
    	case "n": return factorial(alpha);
    	case "sqrt": return Math.sqrt(alpha);
    	case "oneoverx": if (alpha == 0) return Double.NaN; return 1 / alpha;
    	case "exp": return alpha * Math.pow(10, beta);
    	case "pi": return Math.PI;
    	case "copy": return alpha;
    	}
    	return 9.9;
    }
    
    public static Double factorial(Double n) {
    	
    	if  ((n == Math.floor(n)) && !n.isInfinite()){
    		if (n < 160.0){
	        double fact = 1.0; // this  will be the result
	        for (Double i = 1.0; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    	}
    	}
    	return Double.NaN;
    }
    
}

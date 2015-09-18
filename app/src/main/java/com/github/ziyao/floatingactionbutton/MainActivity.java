package com.github.ziyao.floatingactionbutton;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.ziyao.fablibrary.FloatingActionButton;


public class MainActivity extends ActionBarActivity{

    private FloatingActionButton mButton1;
    private FloatingActionButton mButton2;
    private FloatingActionButton mButton3;
    private FloatingActionButton mButton4;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        mButton1 = ( FloatingActionButton ) findViewById(R.id.float_button1);
        mButton1.setColor(res.getColor(R.color.light_blue), res.getColor(R.color.light_gray));

        mButton2 = ( FloatingActionButton ) findViewById(R.id.float_button2);
        mButton2.setColor(res.getColor(R.color.light_red), res.getColor(R.color.light_gray));

        mButton3 = ( FloatingActionButton ) findViewById(R.id.float_button3);
        mButton3.setColor(res.getColor(R.color.light_green), res.getColor(R.color.light_gray));

        mButton4 = ( FloatingActionButton ) findViewById(R.id.float_button4);
        mButton4.setColor(res.getColor(R.color.light_purpuse), res.getColor(R.color.light_gray));

        toolbar = (Toolbar)findViewById( R.id.app_bar );
        setSupportActionBar( toolbar );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if( id == R.id.action_settings ){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

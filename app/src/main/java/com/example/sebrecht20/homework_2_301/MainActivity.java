/**Chris Sebrechts
 * sebrecht20
 * Runs the actual program and uses most of the methods from face
 * is a listner for all of the objects on the screen
 * @Chris Sebrechts
 */

package com.example.sebrecht20.homework_2_301;

import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SpinnerAdapter, View.OnClickListener,SeekBar.OnSeekBarChangeListener,Spinner.OnItemSelectedListener {
  Spinner spinner1;
    Face SV;
    SeekBar red;
    SeekBar green;
    SeekBar blue;
    Button button_changer;
    RadioButton skin;
    RadioButton hair;
    RadioButton eye;
    int selected=0;
    private TextView minValTV = null;
    private String[] hairtype =
            {"Normal", "Afro", "Crazy Hair"};
        //these names in quotes are what are going to be printed in the seekbar
    public MainActivity()
    {
        super();
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SV = (Face) findViewById(R.id.surfaceView5);
        red = (SeekBar) findViewById(R.id.seekBar10);
        green = (SeekBar) findViewById(R.id.seekBar11);
        blue = (SeekBar) findViewById(R.id.seekBar12);
        red.setOnSeekBarChangeListener(this);
        green.setOnSeekBarChangeListener(this);
        blue.setOnSeekBarChangeListener(this);
        button_changer=(Button)findViewById(R.id.button);
        skin=(RadioButton)findViewById(R.id.radioButton6);
        hair=(RadioButton)findViewById(R.id.radioButton5);
        eye=(RadioButton)findViewById(R.id.radioButton4);
        //All of the above are the references to the XML buttons and other tools
        ArrayAdapter<String> hairAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hairtype);
        spinner1 = (Spinner)findViewById(R.id.spinner2);
        spinner1.setAdapter(hairAdapter);
        spinner1.setOnItemSelectedListener(this);
        //This is setting up the spinner
        /**
         External Citation
         Date: 17 February 2018
         Problem: Had alot of trouble setting up the spinner
         Resource: Nux, https://learning.up.edu/moodle/pluginfile.php/633654/mod_resource/content/0/MainActivity.java
         Solution: I useed the method that nux implenented for his spinner and changed it so it would work with my code.
         */
    }
    public void skinbutton(View v)
    {
        selected=1;
        setseekbars();
    }
    public void hairbutton(View v)
    {
        selected=2;
        setseekbars();
    }
    public void eyebutton(View v)
    {
        selected=3;
        setseekbars();
    }
    //tell the class what is selected in the radiogroup
    public void setseekbars()
    {
        red.setProgress(SV.getRed(selected));
        blue.setProgress(SV.getBlue(selected));
        green.setProgress(SV.getGreen(selected));
    }
    //changes the level of the seekbars according to where the user clicks
    public void changing_redbar(View v)
    {
        SV.setRed(selected,((SeekBar)v).getProgress());
    }
    public void changing_greenbar(View v)
    {
        SV.setGreen(selected,((SeekBar)v).getProgress());
    }
    public void changing_bluebar(View v)
    {
        SV.setBlue(selected,((SeekBar)v).getProgress());
    }
public void random_button(View v)
{
    SV.randomize();
    setseekbars();
//randomly selects the hair, as well as the colors, and changes the seekbars accordingly
}

    @Override
    public void onClick(View v) {

    }

    public void Picture_Click(View v)
    {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
      if(seekBar.equals(red))
    {
        changing_redbar(seekBar);
    }
    else if(seekBar.equals(green))
        {
         changing_greenbar(seekBar);
        }
        else if(seekBar.equals(blue))
    {
        changing_bluebar(seekBar);
    }
    }
//changes the actual color depeding on where you moved the seekbar
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        SV.set_har(position+1);
        SV.invalidate();
        //calls this whenever an item gets selected in the spinner
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

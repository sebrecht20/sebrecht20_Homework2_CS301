/**Chris Sebrechts
 * sebrecht20
 * Does the drawing and randomization for the image displayed on the nexus 9
 * Holds the colors and prints the face to the screen
 * @Chris Sebrechts
 */
package com.example.sebrecht20.homework_2_301;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import java.util.*;

import java.util.Random;

public class Face extends SurfaceView{
    private int green=50;
    private int blue=50;
    private int red=50;
    private int skinColor;
    private int eyeColor;
    private int haircolor;
    private Hair ourhair;
    private int hairstyle; //this identifies which hairstyle the face has


    public static void main(String args[])
    {
        //Content needs to be added to this for the program to run
    }
    public void set_har(int haircut)
            //This selects the actual hairstyle
    {
        if(haircut==1)
        {
            ourhair = new Normal_Hair();
        }
        else if(haircut==2)
        {
            ourhair=new Afro_Hair();
        }
        else if(haircut==3)
        {
            ourhair=new Crazy_Hair();
        }
    }
    public void setRed(int selected,int progress)
    {
        //this changed the color to red accoridng to how the red seekbar is moved by the user
      if(selected==1)
      {
      skinColor = Color.rgb(progress,Color.green(skinColor),Color.blue(skinColor));
      }
      else if(selected==2)
      {
          haircolor = Color.rgb(progress,Color.green(haircolor),Color.blue(haircolor));
      }
      else if(selected==3)
      {
          eyeColor = Color.rgb(progress,Color.green(eyeColor),Color.blue(eyeColor));
      }
invalidate();
    }
    public void setGreen(int selected,int progress)
    {
        //this changed the color to green accoridng to how the red seekbar is moved by the user
        if(selected==1)
        {
            skinColor = Color.rgb(Color.red(skinColor),progress,Color.blue(skinColor));
        }
        else if(selected==2)
        {
            haircolor = Color.rgb(Color.red(haircolor),progress,Color.blue(haircolor));
        }
        else if(selected==3)
        {
            eyeColor = Color.rgb(Color.red(eyeColor),progress,Color.blue(eyeColor));
        }
invalidate();
    }
    //this changed the color to blue accoridng to how the red seekbar is moved by the user
    public void setBlue(int selected,int progress)
    {
        if(selected==1)
        {
            skinColor = Color.rgb(Color.red(skinColor),Color.green(skinColor),progress);
        }
        else if(selected==2)
        {
            haircolor = Color.rgb(Color.red(haircolor),Color.green(haircolor),progress);
        }
        else if(selected==3)
        {
            eyeColor = Color.rgb(Color.red(eyeColor),Color.green(eyeColor),progress);
        }
        /**
         External Citation
         Date: 17 February 2018
         Problem: Did not understand how to change the seekbar when the user moves it and paint it
         Resource: Sam Symmes
         Solution: He told me that progress needed to be included individually for each if statement
         */
invalidate();
    }
    //gets the red value of  each of these three atributes
    public int getRed(int selected) {
        if (selected == 1)
            return Color.red(skinColor);
        else if (selected == 2) {
            return Color.red(haircolor);

        } else if (selected == 3) {
            return Color.red(eyeColor);

        }
        return 0;
    }
    public int getGreen(int selected)
    {
        //gets the green value of  each of these three atributes
        if(selected==1)
            return Color.green(skinColor);
        else if(selected==2)
        {
            return Color.green(haircolor);

        }
        else if(selected==3)
        {
            return Color.green(eyeColor);
        }
            return 0;
    }
    public int getBlue(int selected) {
        //gets the blue value of  each of these three atributes
        if (selected == 1)
            return Color.blue(skinColor);
        else if (selected == 2) {
            return Color.blue(haircolor);

        } else if (selected == 3) {
            return Color.blue(eyeColor);
        }
        return 0;
    }

    public Face(Context context) {
        super(context);
        randomize();
        generalInit();
    }

    public Face(Context context, AttributeSet attrs) {
        super(context, attrs);
        randomize();
        generalInit();
        invalidate();
    }

    public Face(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        generalInit();
    }
    private void generalInit() {
        setWillNotDraw(false);
    }


        private Random gen = new Random();

    public void randomize()
    {
        //this randomly selects a hairstyle when the app opens up
        int random_customazation = gen.nextInt(3);
            hairstyle=gen.nextInt(3);
        if(hairstyle==0)
        {

            ourhair= new Normal_Hair();

        }
        else if(hairstyle==1)
        {

            ourhair=new Crazy_Hair();

        }
        else if(hairstyle==2)
        {

            ourhair=new Afro_Hair();
        }
        //these randomly select the colors then implements them into the hair, skin, and eyes
        this.green=gen.nextInt(256);
        this.red=gen.nextInt(256);
        this.blue=gen.nextInt(256);
        haircolor=Color.rgb(red,green,blue);
        this.green=gen.nextInt(256);
        this.red=gen.nextInt(256);
        this.blue=gen.nextInt(256);
        skinColor=Color.rgb(red,green,blue);
        this.green=gen.nextInt(256);
        this.red=gen.nextInt(256);
        this.blue=gen.nextInt(256);
        eyeColor=Color.rgb(red,green,blue);
        invalidate();//like a repaint method to the surface view
    }


    public void onDraw(Canvas canvas)
    {

        //Drawing the base customization screen for a face
        Paint gray = new Paint();

        gray.setStrokeWidth(5.0f);
        gray.setColor(haircolor);
        ourhair.draw(canvas,gray);
        gray.setColor(skinColor);
        canvas.drawOval(250f,200f,1250.0f,1200.0f,gray);
        //this draws the head
        gray.setColor(eyeColor);
        canvas.drawOval(450.0f,300.0f,500.0f,350.0f,gray);
        canvas.drawOval(1000.0f,300.0f,1050.0f,350.0f,gray);
        //these are the eyes that are drawn
    }
}



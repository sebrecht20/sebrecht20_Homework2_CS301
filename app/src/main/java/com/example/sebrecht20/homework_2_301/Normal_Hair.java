/**Chris Sebrechts
 * sebrecht20
 * changes the hair to an normal look
 * @Chris Sebrechts
 */
package com.example.sebrecht20.homework_2_301;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.*;
public class Normal_Hair extends Hair {
    protected int x;
    //x coordinate
    protected int y;
    //x coordinate
    protected int x2;
    //outside x coordinate;
    protected int y2;
    //outside y coordinate
    protected Random gen = new Random();
    public Normal_Hair()
    {

    }
    public void draw(Canvas canvas, Paint color)

    {
        //Drawing the base customization screen for a face
        //this is drawing the base  color customazation for the avatar face

        //


        //the amount of strands of hair for their hairstyle


        canvas.drawRect(250f, 50.0f, 1250.0f, 650.0f, color);


    }
}

/**Chris Sebrechts
 * sebrecht20
 * changes the hair to an afro look
 * @Chris Sebrechts
 */
package com.example.sebrecht20.homework_2_301;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by sebrecht20 on 2/11/2018.
 */

public class Afro_Hair extends Normal_Hair {
    public Afro_Hair() {
    }

    public void draw(Canvas canvas, Paint color)

    {
        //Drawing the base customization screen for a face
        //this is drawing the base  color customazation for the avatar face

        //


        //the amount of strands of hair for their hairstyle


        canvas.drawOval(250f, 5.0f, 1250.0f, 650.0f, color);

    }
}


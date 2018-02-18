/**Chris Sebrechts
 * sebrecht20
 * changes the hair to a crazy look
 * @Chris Sebrechts
 */
package com.example.sebrecht20.homework_2_301;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Crazy_Hair extends Normal_Hair
{
public Crazy_Hair()
{

}

    public void draw(Canvas canvas, Paint color)

    {
        canvas.drawOval(250f, 0.0f, 1250.0f, 50.0f, color);
        canvas.drawOval(250f, 50.0f, 1250.0f, 100.0f, color);
        canvas.drawOval(250f, 100.0f, 1250.0f, 150.0f, color);
        canvas.drawOval(250f, 150.0f, 1250.0f, 200.0f, color);
        canvas.drawOval(250f, 200.0f, 1250.0f, 250.0f, color);
        canvas.drawOval(250f, 250.0f, 1250.0f, 300.0f, color);
        canvas.drawOval(250f, 300.0f, 1250.0f, 350.0f, color);
        canvas.drawOval(250f, 350.0f, 1250.0f, 400.0f, color);
    }
}



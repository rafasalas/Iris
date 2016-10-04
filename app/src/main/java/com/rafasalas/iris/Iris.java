package com.rafasalas.iris;

/**
 * Created by salas on 29/09/2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.rafasalas.rafalib.atractors.Atractor;
import com.rafasalas.rafalib.composites.Mandala;

import processing.core.PVector;

public class Iris extends View{
    //

                Atractor hole;
                Mandala mandy;
                PVector centro;
    //




    public Iris(Context context){
        super(context);

        centro=new PVector(500, 500);
        mandy=new Mandala(centro, 35,12,10,10,15,4, true, (float).009, true,(float).001, 0, 0,context);

        hole=new Atractor(1);
        hole.rotador("levo",150, 20 );
        hole.posicion.x=500;
        hole.posicion.y=500;
        mandy.spiralcolor(180,0,0);
    }
    @Override

    protected void onDraw(Canvas canvas){
        int width=getWidth();
        int height=getHeight();
        mandy.centro.x=width/2;
        mandy.centro.y=height/4;
        mandy.atraccion(hole);
        canvas.drawColor(0xFF000000);

        mandy.pintar(canvas,"Raro");
        //update();
        invalidate();


    }

    protected void update(){

    }

}

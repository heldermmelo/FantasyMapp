package com.example.fantasymapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MapaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        final ImageView minhaImagemView = (ImageView) findViewById(R.id.imagemResult);
        Bitmap bitmap = Bitmap.createBitmap(minhaImagemView.getMaxWidth(),
                minhaImagemView.getMaxHeight(),
                Bitmap.Config.ARGB_8888);
        bitmap = bitmap.copy(bitmap.getConfig(),true);

        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        float verts[] =new float[] {5.4f, 3.8f, 4.6f, 2.5f};
        float tex[] = new float[]{2.8f};
        int colors[] = new int[]{Color.RED};
        minhaImagemView.setImageBitmap(bitmap);
        canvas.drawRect(100f, 100f, 190f, 150f,paint);
        //canvas.drawVertices(Canvas.VertexMode.TRIANGLE_FAN,2,verts,0,tex,0,colors,0,null,0,0,paint);

    }
    public void generateMapa(View view){
        final ImageView minhaImagemView = (ImageView) findViewById(R.id.imagemResult);
        Bitmap bitmap = Bitmap.createBitmap(minhaImagemView.getMaxWidth(),
                minhaImagemView.getMaxHeight(),
                Bitmap.Config.ARGB_8888);
        bitmap = bitmap.copy(bitmap.getConfig(),true);

        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        float verts[] =new float[] {3.4f, 3.8f, 4.6f, 2.5f};
        float tex[] = new float[]{2.8f};
        int colors[] = new int[]{Color.RED};
        canvas.drawRect(100f, 100f, 1900f, 1500f,paint);
        //canvas.drawVertices(Canvas.VertexMode.TRIANGLE_FAN,2,verts,0,tex,0,colors,0,null,0,0,paint);
        minhaImagemView.setImageBitmap(bitmap);
    }
}

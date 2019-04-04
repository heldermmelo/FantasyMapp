package com.example.fantasymapp;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class desenho extends AppCompatActivity {
    private ImageView minhaImagemView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenho);

        minhaImagemView = (ImageView) findViewById(R.id.imagemResult);
        criaRet();
    }

private void criaRet(){
    Bitmap bitmap = Bitmap.createBitmap(minhaImagemView.getMaxWidth(),
            minhaImagemView.getMaxHeight(),
            Bitmap.Config.ARGB_8888);
            bitmap = bitmap.copy(bitmap.getConfig(),true);

            Canvas canvas = new Canvas(bitmap);

            Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);

            canvas.drawRect(100f, 100f, 500f, 1000f,paint);
            minhaImagemView.setImageBitmap(bitmap);
    }

}
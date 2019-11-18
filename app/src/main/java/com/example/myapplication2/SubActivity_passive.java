package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

//  Color UI
//public class SubActivity_passive<ColorPicker> extends AppCompatActivity implements View.OnClickListener, ColorPickerDialog.OnColorChangedListener{
    public class SubActivity_passive extends  AppCompatActivity {
//        Color UI
//        RelativeLayout relative_color;
//        Button btn_colorPicker;
//        int color;
        private ImageView imageView;
        private TextView textView;
        private Bitmap bitmap;
        private ImageView_bitmap cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_passive);
        //setContentView(new ImageView_bitmap(this));

        LinearLayout linear1 = (LinearLayout)findViewById(R.id.layout);
        ImageView_bitmap ibp = new ImageView_bitmap(linear1.getContext());
        linear1.addView(ibp);
//        <!--  Color UI  -->
//        relative_color = (RelativeLayout) findViewById(R.id.relative_color);
//        btn_colorPicker = (Button) findViewById(R.id.btn_colorPicker);
//        btn_colorPicker.setOnClickListener(this);
    }

    public class ImageView_bitmap extends View
    {

        public ImageView_bitmap(Context context, AttributeSet attrs)
        {
            super(context, attrs);
        }

        protected void onDraw(Canvas canvas)
        {
            int width = canvas.getWidth();
            int height = canvas.getHeight();

            bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.givemergb);
            Bitmap resize_bitmap = Bitmap.createScaledBitmap(bitmap, width, height,true);

            canvas.drawBitmap(resize_bitmap,0,0,null);
        }

//        @Override
//        public boolean onTouchEvent(MotionEvent motionEvent)
//        {
//            if(motionEvent.getAction() == MotionEvent.ACTION_DOWN || motionEvent.getAction() == MotionEvent.ACTION_MOVE)
//            {
//                int pixel = bitmap.getPixel((int) motionEvent.getX(), (int) motionEvent.getY());
//
//                int r = Color.red(pixel);
//                int g = Color.green(pixel);
//                int b= Color.blue(pixel);
//
//                Toast.makeText(SubActivity_passive.this,r + "," + g + "," + b,Toast.LENGTH_LONG).show();
//            }
//            return true;
//        }
    }

    public void passiveOnClick(View v) {
        finish();
    }

    // 완료 버튼 눌렀을 때
    public void passiveCompleteOnClick (View v) {

    }

//    <!--  Color UI  -->
//    @Override
//    public void onClick(View v) {
//        color = PreferenceManager.getDefaultSharedPreferences(this).getInt("color", Color.WHITE);
//        new ColorPickerDialog(this, this, color).show();
//    }
//
//    @Override
//    public void colorChanged(int color) {
//        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("color", color).commit();
//        relative_color.setBackgroundColor(color);
//    }
}
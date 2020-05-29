package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.tomer.fadingtextview.FadingTextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private FadingTextView fadingTextView;

    int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,sound12,sound13,sound14,sound15,sound16,sound17;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    private Button bb1,bb2,bb3,bb4,bb5,bb6,bb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.c1);
        b2=(Button)findViewById(R.id.c2);
        b3=(Button)findViewById(R.id.c3);
        b4=(Button)findViewById(R.id.c4);
        b5=(Button)findViewById(R.id.c5);
        b6=(Button)findViewById(R.id.c6);
        b7=(Button)findViewById(R.id.c7);
        b8=(Button)findViewById(R.id.c8);
        b9=(Button)findViewById(R.id.c9);
        b10=(Button)findViewById(R.id.c10);
       fadingTextView = findViewById(R.id.fading_text_view);
       bb1=(Button)findViewById(R.id.button);
       bb2=(Button)findViewById(R.id.button2);
       bb3=(Button)findViewById(R.id.button4);
       bb4=(Button)findViewById(R.id.button5);
       bb5=(Button)findViewById(R.id.button6);
       bb6=(Button)findViewById(R.id.button7);
       bb7=(Button)findViewById(R.id.button9);





        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(17)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(17, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.one, 1);
        sound2 = soundPool.load(this, R.raw.nine, 1);
        sound3 = soundPool.load(this, R.raw.two, 1);
        sound4 = soundPool.load(this, R.raw.three, 1);
        sound5 = soundPool.load(this, R.raw.four, 1);
        sound6 = soundPool.load(this, R.raw.five, 1);
        sound7 = soundPool.load(this, R.raw.eleven, 1);
        sound8 = soundPool.load(this, R.raw.twelve, 1);
        sound9 = soundPool.load(this, R.raw.third, 1);
        sound10 = soundPool.load(this, R.raw.fourteeen, 1);
        sound11 = soundPool.load(this, R.raw.fifteen, 1);
        sound12 = soundPool.load(this, R.raw.six, 1);
        sound13 = soundPool.load(this, R.raw.seven, 1);
        sound14 = soundPool.load(this, R.raw.eight, 1);
        sound15 = soundPool.load(this, R.raw.nine, 1);
        sound16 = soundPool.load(this, R.raw.ten, 1);
        sound17 = soundPool.load(this, R.raw.four, 1);


    }
    public void playsound(View v) {
        switch (v.getId()) {

            case R.id.c1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b1.startAnimation(animation1);
                Toast.makeText(getApplicationContext(),"Click b1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.c2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                Toast.makeText(getApplicationContext(),"Click b2",Toast.LENGTH_SHORT).show();
                b2.startAnimation(animation2);
                break;
            case R.id.c3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                Toast.makeText(getApplicationContext(),"Click b3",Toast.LENGTH_SHORT).show();
                b3.startAnimation(animation3);
                break;
            case R.id.c4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b4.startAnimation(animation4);
                Toast.makeText(getApplicationContext(),"Click b4",Toast.LENGTH_SHORT).show();


                break;
            case R.id.c5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                Animation animation5 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b5.startAnimation(animation5);
                Toast.makeText(getApplicationContext(),"Click b5",Toast.LENGTH_SHORT).show();

                break;
            case R.id.c6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                Animation animation6 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b6.startAnimation(animation6);
                break;
            case R.id.c7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                Animation animation7 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b7.startAnimation(animation7);
                Toast.makeText(getApplicationContext(),"Click b7",Toast.LENGTH_SHORT).show();

                break;
            case R.id.c8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                Animation animation8 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b8.startAnimation(animation8);
                break;
            case R.id.c9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                Animation animation9 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b9.startAnimation(animation9);
                break;
            case R.id.c10:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                Animation animation10 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                b10.startAnimation(animation10);
                break;
            case R.id.button:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                Animation animation11 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb1.startAnimation(animation11);
                break;
            case R.id.button2:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                Animation animation12 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb2.startAnimation(animation12);
                break;
            case R.id.button4:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                Animation animation13 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb3.startAnimation(animation13);
                break;
            case R.id.button5:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                Animation animation14 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb4.startAnimation(animation14);
                break;
            case R.id.button6:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                Animation animation15 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb5.startAnimation(animation15);
                break;
            case R.id.button7:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                Animation animation16 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb6.startAnimation(animation16);
                break;
            case R.id.button9:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                Animation animation17 = AnimationUtils.loadAnimation(this,R.anim.anim1);
                bb7.startAnimation(animation17);
                break;









        }
    }





    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    public void textAnim(View view) {
        String[] example2 = {"Play ", "and", "Enjoy"};
        fadingTextView.setTexts(example2);
        fadingTextView.setTimeout(300, TimeUnit.MILLISECONDS);
        fadingTextView.forceRefresh();
    }
}

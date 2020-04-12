package com.example.tic_tac;

package com.example.mohitband;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mybeat1,mybeat2,mybeat3,mybeat4,mybeat5,mybeat6,mybeat7,mybeat8,mybeat9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybeat1=MediaPlayer.create(MainActivity.this,R.raw.beat1);
        mybeat2=MediaPlayer.create(MainActivity.this,R.raw.beat2);
        mybeat3=MediaPlayer.create(MainActivity.this,R.raw.beat3);
        mybeat4=MediaPlayer.create(MainActivity.this,R.raw.beat4);
        mybeat5=MediaPlayer.create(MainActivity.this,R.raw.beat5);
        mybeat6=MediaPlayer.create(MainActivity.this,R.raw.beat6);
        mybeat7=MediaPlayer.create(MainActivity.this,R.raw.beat7);
        mybeat8=MediaPlayer.create(MainActivity.this,R.raw.beat8);
        mybeat9=MediaPlayer.create(MainActivity.this,R.raw.beat1);

    }
    public void play1(View v){
        mybeat1.start();}
    public void play2(View v){
        mybeat2.start();}
    public void play3(View v){
        mybeat3.start();}
    public void play4(View v){
        mybeat4.start();}
    public void play5(View v){
        mybeat5.start();}
    public void play6(View v){
        mybeat6.start();}
    public void play7(View v){
        mybeat7.start();}
    public void play8(View v){
        mybeat8.start();}
    public void play9(View v){
        mybeat9.start();
    }
    @Override
    protected  void onPause(){
        super.onPause();
        mybeat1.release();

    }

}

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mybeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybeat=MediaPlayer.create(MainActivity.this,R.raw.beat1);
    }
    public void play1(View v){
        mybeat.start();


}
@Override
    protected  void onPause(){
        super.onPause();
        mybeat.release();
}
}
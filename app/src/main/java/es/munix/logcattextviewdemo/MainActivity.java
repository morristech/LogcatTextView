package es.munix.logcattextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import es.munix.logcat.LogcatTextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LogcatTextViewDemo";

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        LogcatTextView logcat = (LogcatTextView) findViewById( R.id.logcat );

        Log.v( TAG, "verbose log" );
        Log.i( TAG, "info log" );
        Log.e( TAG, "error log" );
        Log.d( TAG, "debug log" );
        Log.w( TAG, "warning log" );

        Log.v( TAG, "scroll verbose log" );
        Log.i( TAG, "scroll info log" );
        Log.e( TAG, "scroll error log" );
        Log.d( TAG, "scroll debug log" );
        Log.w( TAG, "scroll warning log" );

        Log.v( TAG, "scroll verbose log" );
        Log.i( TAG, "scroll info log" );
        Log.e( TAG, "scroll error log" );
        Log.d( TAG, "scroll debug log" );
        Log.w( TAG, "scroll warning log" );

        logcat.refreshLogcat();
    }
}

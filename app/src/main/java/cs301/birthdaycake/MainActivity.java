package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        Button blow_out = (Button) findViewById(R.id.button2);

        CakeView cake_id = (CakeView) findViewById(R.id.cakeview);
        CakeController cake_con = new CakeController(cake_id, blow_out);


        blow_out.setOnClickListener(cake_con);

        Switch candles = (Switch) findViewById(R.id.switch2);
        candles.setOnCheckedChangeListener(cake_con);


        SeekBar how_many_candles = (SeekBar) findViewById(R.id.seekBar2);
        how_many_candles.setOnSeekBarChangeListener(cake_con);

        cake_id.setOnTouchListener(cake_con);

    }


    public void goodbye(View button) {
       Log.i("button", "Goodbye");    //System.out.println("Goodbye");
    }

}

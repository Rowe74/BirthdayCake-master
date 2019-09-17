package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {


        private CakeView cake_v;
        private CakeModel cake_m;
        private Button lit_blowout;

        public CakeController(CakeView cv, Button b){

            cake_v = cv;
            cake_m = cv.getCake();
            lit_blowout= b;


        }

    @Override
    public void onClick(View v) {

        if(cake_m.lit == false){
            lit_blowout.setText("BLOW OUT");
            cake_m.lit= true;
        }
        else if(cake_m.lit == true){
            lit_blowout.setText("RE-LIGHT");
            cake_m.lit= false;

        }

        cake_v.invalidate();

        Log.d("button2", "Clicked");    //System.out.println("Goodbye");



    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        cake_m.candles= isChecked;
        cake_v.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        cake_m.num_candles = progress;
        cake_v.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

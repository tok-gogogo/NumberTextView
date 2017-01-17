package tok_gogogo.numbertext;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NumberTextView a;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (NumberTextView)findViewById(R.id.ttt);
        b = (Button)findViewById(R.id.bbb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
    }
     void initData() {

         //a.withNumber(79234.6f).start();
         NumAnim.startAnim(a, 991213.52f);
    }
}

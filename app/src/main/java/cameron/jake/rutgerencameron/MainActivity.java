package cameron.jake.rutgerencameron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int lol;
    private int wow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText("Hello world!");
        lol = 10;
        wow = lol*lol;


    }



}

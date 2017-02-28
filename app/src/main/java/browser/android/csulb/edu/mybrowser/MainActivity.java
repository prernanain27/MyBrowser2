package browser.android.csulb.edu.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.browser);
        Intent i = getIntent();
        Uri data = i.getData();
        if(data != null)
            tv.setText(data.toString());
        else
            tv.setText("Activity on its own");
    }
}

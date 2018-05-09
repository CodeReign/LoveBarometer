package example.com.android.lovebarometer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startBtn, quitBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn = (Button) findViewById(R.id.start);
        quitBtn = (Button) findViewById(R.id.quit);
        textView = (TextView) findViewById(R.id.text);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void Next(View view){
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startBtn = (Button) findViewById(R.id.start);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    public void Quit(View view) {
        //quitBtn.setOnClickListener(null);
        onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void Start(View view) {
    }
}

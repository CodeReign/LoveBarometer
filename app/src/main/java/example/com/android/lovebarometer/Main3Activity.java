package example.com.android.lovebarometer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void Next(View view){
        Button nextBtn = (Button) findViewById(R.id.button2);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1){
                startActivity(new Intent(Main3Activity.this, Main4Activity.class));
                finish();
            }
        });
    }
}

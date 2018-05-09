package example.com.android.lovebarometer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
         nextBtn = (Button) findViewById(R.id.button2);
    }
    public void Next(View view){
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1){
                startActivity(new Intent(Main4Activity.this, Main5Activity.class));
                finish();
            }
        });
    }


}

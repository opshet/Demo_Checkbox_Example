package sg.edu.rp.c346.id20010021.demo_checkbox_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox discount;
    Button check;
    TextView tvshow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discount=findViewById(R.id.discount);
        check=findViewById(R.id.check);
        tvshow=findViewById(R.id.tvshow);

        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                if(discount.isChecked()){
                    tvshow.setText("The discount is given");
                }
                else{
                    tvshow.setText("The discount is not given");
                }
            }
        });











    }
}
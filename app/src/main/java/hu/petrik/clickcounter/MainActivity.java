package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textView;
    private Button btn1;
    private Button btn2;



    public int szam = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        textView.setText(String.valueOf(0));
        textView.setTextColor(Color.rgb(0,0,255));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = szam + 1;
                textView.setText(String.valueOf(szam));
                if(szam > 0){
                    textView.setTextColor(Color.rgb(0,255,0));
                }
                else if(szam < 0){
                    textView.setTextColor(Color.rgb(255,0,0));
                }
                else{
                    textView.setTextColor(Color.rgb(0,0,255));
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = szam -1;
                textView.setText(String.valueOf(szam));
                if(szam > 0){
                    textView.setTextColor(Color.rgb(0,255,0));
                }
                else if(szam < 0){
                    textView.setTextColor(Color.rgb(255,0,0));
                }
                else{
                    textView.setTextColor(Color.rgb(0,0,255));
                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = 0;
                textView.setText(String.valueOf(szam));
                if(szam > 0){
                    textView.setTextColor(Color.rgb(0,255,0));
                }
                else if(szam < 0){
                    textView.setTextColor(Color.rgb(255,0,0));
                }
                else{
                    textView.setTextColor(Color.rgb(0,0,255));
                }
            }
        });
    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

    }

}
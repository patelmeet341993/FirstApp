package friendlyitsolution.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    TextView tv;
    EditText etn1,etn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btn);
        etn1=findViewById(R.id.etn1);
        etn2=findViewById(R.id.etn2);
        tv=findViewById(R.id.tv);






        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=etn1.getText().toString();
                String s2=etn2.getText().toString();

                int sum=Integer.parseInt(s1)+Integer.parseInt(s2);

                tv.setText("Ans is : "+sum);

                Toast.makeText(getApplicationContext(),"Ans is : "+sum,Toast.LENGTH_LONG).show();


            }
        });


    }

}

package iset.mdw.lemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class cart extends AppCompatActivity {
    EditText et_code;
    TextView tv_code;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        et_code = findViewById(R.id.et_code);
        tv_code = findViewById(R.id.tv_code);
        button = findViewById(R.id.button);

        Random r = new Random();
        String code = String.valueOf(r.nextInt(10000) + 1000);
        tv_code.setText(code);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = et_code.getText().toString();
                if(number.equals(code))
                {
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                }
                finish();
            }
        });

    }
}

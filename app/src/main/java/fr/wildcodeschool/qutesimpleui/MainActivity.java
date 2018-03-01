package fr.wildcodeschool.qutesimpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox boxCoche = findViewById(R.id.checkBox1);
        boxCoche.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                EditText first1 = findViewById(R.id.edit_firstname);
                EditText last1 = findViewById(R.id.edit_lastname);
                Button enable_button = findViewById(R.id.button);
                if (isChecked)
                {
                    first1.setEnabled(true);
                    last1.setEnabled(true);
                    enable_button.setEnabled(true);

                }
                else
                {
                    first1.setEnabled(false);
                    last1.setEnabled(false);
                    enable_button.setEnabled(false);
                }
            }
        });

        Button boutnAccept = findViewById(R.id.button);
        boutnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstname = findViewById(R.id.edit_firstname);
                EditText lastname = findViewById(R.id.edit_lastname);
                String firstN = firstname.getText().toString();
                String lastN = lastname.getText().toString();
                TextView congrats = findViewById(R.id.text_congrats);
                String toast_alrt = getResources().getString(R.string.toast_alert);
                String congr = getResources().getString(R.string.congrats);
                if(firstN.equals("")  || lastN.equals("") )
                {
                    Toast.makeText(MainActivity.this, toast_alrt, Toast.LENGTH_SHORT).show();
                }
                else {
                    String message = congr + " " + firstN + " " + lastN;
                    congrats.setText(message);
                }
            }
        });


    }

}

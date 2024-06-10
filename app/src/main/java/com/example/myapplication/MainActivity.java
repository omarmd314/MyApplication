package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText txtBox1;
    private EditText txtBox2;
    private TextView txtResultado;
    private RadioButton rdb1;
    private RadioButton rdb2;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtBox1 = findViewById(R.id.editText1);
        txtBox2 = findViewById(R.id.editText2);
        txtResultado = findViewById(R.id.txtResultado);
        rdb1 = findViewById(R.id.rdb1);
        rdb2 = findViewById(R.id.rdb2);
        cb1 = findViewById(R.id.cBox1);
        cb2 = findViewById(R.id.cBox2);
        cb3 = findViewById(R.id.cBox3);
        cb4 = findViewById(R.id.cBox4);
    }

    public void Sumar(View view){

        int n1 = Integer.parseInt(String.valueOf(txtBox1.getText()));
        int n2 = Integer.parseInt(String.valueOf(txtBox2.getText()));

        int rst = n1 + n2;

        txtResultado.setText(String.valueOf(rst));
    }

    public void Op(View view){
        int n1 = Integer.parseInt(String.valueOf(txtBox1.getText()));
        int n2 = Integer.parseInt(String.valueOf(txtBox2.getText()));
        int resultado;
        if(rdb1.isChecked()){
            resultado = n1 * n2;
            txtResultado.setText(String.valueOf(resultado));
        } else if (rdb2.isChecked()) {
            resultado = n1 / n2;
            txtResultado.setText(String.valueOf(resultado));
        }
    }

    public void Checks(View view)
    {
        int n1 = Integer.parseInt(String.valueOf(txtBox1.getText()));
        int n2 = Integer.parseInt(String.valueOf(txtBox2.getText()));
        int rst = 0;

        if(cb1.isChecked()){
            rst = n1 + n2;
        } else if (cb2.isChecked()){
            rst = n1 - n2;
        } else if (cb3.isChecked()){
            rst = n1 * n2;
        } else if (cb4.isChecked()){
            rst = n1/n2;
        }

        txtResultado.setText(String.valueOf(rst));
    }

   /*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_LONG).show();
    }
    */
}
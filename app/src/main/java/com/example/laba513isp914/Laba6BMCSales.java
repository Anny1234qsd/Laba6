package com.example.laba513isp914;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Laba6BMCSales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laba6_bmcsales);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnReg = (Button) findViewById(R.id.btnReg);
        EditText LoginBlock = (EditText) findViewById(R.id.LoginBlock);
        EditText PasswordBlock = (EditText) findViewById(R.id.PasswordBlock);
        TextView MessageBox = (TextView) findViewById(R.id.MessageBox);

        View.OnClickListener oclBtnLogin = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LoginBlock.getText().toString().equals("admin") && PasswordBlock.getText().toString().equals("admin")) {
                    MessageBox.setText("Вы вошли в систему");
                }
                else
                {
                    MessageBox.setText("Неправильный логин или пароль");
                    MessageBox.setTextColor(Color.parseColor("#C70404"));
                }
            }
        };

        View.OnClickListener oclBtnReg = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MessageBox.setText("Функция в разработке");
                MessageBox.setTextColor(Color.parseColor("#C70404"));
            }
        };

        btnReg.setOnClickListener(oclBtnReg);
        btnLogin.setOnClickListener(oclBtnLogin);
    }
}
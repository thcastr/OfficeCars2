package com.example.thayn.officecars;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    //Criação dos objetos
    EditText editLogin;
    EditText editSenha;
    Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Vinculando os objetos aos IDs
        editLogin=(EditText) findViewById(R.id.editText);
        editSenha=(EditText) findViewById(R.id.editText2);
        btnAcessar=(Button) findViewById(R.id.btnAcessar);

        //botão btnAcessar
        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editLogin.getText().length() == 0 || editSenha.getText().length() == 0) {
                    Toast.makeText(getApplication(),
                            "Os campos login e senha são obrigatórios",
                            Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText (getApplication(),
                            "Seja bem vindo" + editLogin.getText().toString() + "!",
                            Toast.LENGTH_LONG).show();
                    //Limpando os dados digitados automaticamente
                    editLogin.setText("");
                    editSenha.setText("");
                }
            }
        });
    }

}

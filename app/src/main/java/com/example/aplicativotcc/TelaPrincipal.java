package com.example.aplicativotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {
    private Button btn_Produtos;
    private Button btn_Relatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        //
        Button btn_Produtos = findViewById(R.id.btn_Produtos);
        Button btn_Relatorios = findViewById(R.id.btn_Relatorio);

        //Função para os botões
        btn_Produtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal = new Intent(TelaPrincipal.this, Tela_Leitor.class);
                startActivity(principal);
            }
        });
    }
}
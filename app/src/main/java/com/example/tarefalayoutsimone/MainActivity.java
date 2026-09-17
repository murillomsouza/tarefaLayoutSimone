package com.example.tarefalayoutsimone;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
public class MainActivity extends AppCompatActivity {
    private MaterialButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        configurarEventos();
    }
    private void inicializarComponentes() {
        btnLogin = findViewById(R.id.btnLogin);
    }
    private void configurarEventos() {
        btnLogin.setOnClickListener(v ->
                Toast.makeText(this,
                        "Login realizado com sucesso!",
                        Toast.LENGTH_SHORT).show()
        );
    }
}

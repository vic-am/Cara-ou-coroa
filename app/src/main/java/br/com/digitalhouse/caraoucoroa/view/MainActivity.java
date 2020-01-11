package br.com.digitalhouse.caraoucoroa.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import br.com.digitalhouse.caraoucoroa.R;

public class MainActivity extends AppCompatActivity {

    public static String RESULTADO_KEY = "resultado";
    private ImageButton btnJogar;
    private Random random = new Random();
    private int numeroResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroResultado = random.nextInt(10);
                startActivity(new Intent(MainActivity.this, ResultadoActivity.class)
                        .putExtra(RESULTADO_KEY, numeroResultado));
            }
        });
    }
}

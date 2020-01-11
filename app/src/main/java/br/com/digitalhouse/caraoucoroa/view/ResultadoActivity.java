package br.com.digitalhouse.caraoucoroa.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.digitalhouse.caraoucoroa.R;

import static br.com.digitalhouse.caraoucoroa.view.MainActivity.RESULTADO_KEY;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgResultado;
    private ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgResultado = findViewById(R.id.imgResultado);
        btnVoltar = findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        int resultado = bundle.getInt(RESULTADO_KEY);

        resultado(resultado);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void resultado(int numero) {
        if (numero < 5) {
            imgResultado.setImageResource(R.drawable.moeda_cara);
        } else {
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }
}

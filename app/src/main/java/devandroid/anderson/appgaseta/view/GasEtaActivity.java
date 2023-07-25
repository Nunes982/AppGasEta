package devandroid.anderson.appgaseta.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.anderson.appgaseta.R;
import devandroid.anderson.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    private EditText editGasolina, editEtanol;
    private Button btnCalcular, btnLimpar, btnSalvar, btnFinalizar;
    private TextView txtResultado;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta);

        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);

        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editGasolina.setText("");
                editEtanol.setText("");

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GasEtaActivity.this, "Volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        Toast.makeText(GasEtaActivity.this,
                UtilGasEta.calcularMelhorOpcao(5.12, 3.39),
                Toast.LENGTH_SHORT).show();

    }
}

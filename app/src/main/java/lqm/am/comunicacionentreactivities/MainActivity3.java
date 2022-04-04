package lqm.am.comunicacionentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textoWelcome;
    EditText editCorreo,editPhone,editAddress;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initComponents();
    }

    private void initComponents() {
        textoWelcome.findViewById(R.id.txtWelcome);
        //recogemos los datos que me envia la actividad:


        Bundle intent = getIntent().getExtras();
        String mensaje =  "";
        mensaje = intent.getString("USU");


        textoWelcome.setText("Hola " + mensaje);

    }
}
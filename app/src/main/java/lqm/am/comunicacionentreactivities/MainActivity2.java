package lqm.am.comunicacionentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initComponents();
    }

    private void initComponents() {

        btnVolver=findViewById(R.id.btnAtras);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //volvemos a la actividad anterior
                Intent intent= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
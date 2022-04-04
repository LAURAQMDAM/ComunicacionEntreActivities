package lqm.am.comunicacionentreactivities;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName, editPass;
    Button btnAceptar, btnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        editName = findViewById(R.id.editName);
        editPass = findViewById(R.id.editPass);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnMore = findViewById(R.id.btnMore);

        accionesComponentes();

    }


    private void accionesComponentes() {

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String editableNombre= editName.getText().toString();
                String editableContrasenia = editPass.getText().toString();
                //Deberiamos de comprobar algunas acciones antes de pasar a la actividad siguiente
                //como por ejemplo que los campos no esten vacios
                //trim quita todos los espacios
                if ((editName.getText().toString().trim().length() > 0) || (editPass.getText().toString().trim().length() > 0)) {

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    //esto es igual que lo dearriba , lo dejo comentado, pero para saber que viene a ser lo mismo
                    //Intent intent1 = new Intent(getApplicationContext(),MainActivity2.class);
                    //pasar los datos/valores: como clave valor
                    intent.putExtra("USU",editableNombre);
                    intent.putExtra("PASS", editableContrasenia);

                    startActivity(intent);

                } else if ((editName.getText().toString().trim().equals("laura")) || (editPass.getText().toString().trim().equals("123"))){

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    //pasar los datos/valores: como clave valor
                    intent.putExtra("USU",editableNombre);
                    intent.putExtra("PASS", editableContrasenia);
                    startActivity(intent);

                } else {

                    Toast.makeText(MainActivity.this, "Introduzca los datos correctos", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);

            }
        });
    }
}
/*

                 //pasar los datos a String, con lo siguiente, pasamos los edittext a string, y le decimso que la
                 //contraseña y el pass sea siempre el mismo para que nos acepte

                    String editUsuario = editName.getText().toString();
                    String editContra = editPass.getText().toString();
                    if (editUsuario == "laura" && editContra == "123") {
        //lineas de codigo
                    } else {
                    }
                }}*/

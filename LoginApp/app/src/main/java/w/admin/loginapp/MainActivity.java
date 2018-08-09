package w.admin.loginapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.mainbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.dialogelogin,null);
                final EditText email = mview.findViewById(R.id.email);
                final EditText password = mview.findViewById(R.id.password);
                Button Loginbtn = mview.findViewById(R.id.loginbtn);

                Loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Fill all details",Toast.LENGTH_SHORT).show();
                        }
                    }

                });
                mbuilder.setView(mview);
                AlertDialog dialoge = mbuilder.create();
                dialoge.show();
            }
        });



    }

}

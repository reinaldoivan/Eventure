package eventure.com.eventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button loginButton = (Button)findViewById(R.id.login_button_Login);
        Button continueButton = (Button)findViewById(R.id.login_button_Continue);

        final EditText username = (EditText)findViewById(R.id.login_editText_username);
        final EditText password = (EditText)findViewById(R.id.login_editText_password);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(UserModel.checkUser(username.getText().toString(), password.getText().toString()) == true){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(LogIn.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

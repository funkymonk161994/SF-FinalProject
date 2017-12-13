package sf.vimo.com.sf;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

public class MainActivity extends Activity {

    Button saveData;
    String name;
    String email;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveData = findViewById(R.id.login);
        jsonObject = new JSONObject();
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = ((EditText)findViewById(R.id.userName)).getText().toString();
                email = ((EditText)findViewById(R.id.passWord)).getText().toString();
                try {
                    jsonObject.put("NAME", name);
                    jsonObject.put("email", email);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                Log.d("Data Ready",jsonObject.toString());

                Intent save = new Intent(MainActivity.this, Scanner.class);
                save.putExtra("UserData",jsonObject.toString());
                startActivity(save);
            }
        });

    }
}

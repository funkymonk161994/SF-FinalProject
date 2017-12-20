package sf.vimo.com.sf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class Results extends AppCompatActivity {

    Button addContact;
    ImageView imageView;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Log.d("Results","onCreate Started");
        Intent in = getIntent();
        TextView textView = findViewById(R.id.userName);
        jsonObject= new JSONObject();
        try{
            jsonObject = new JSONObject(in.getStringExtra("Read"));
            Log.d("Read Values",jsonObject.toString());
            textView.setText(jsonObject.getString("NAME"));
            textView = findViewById(R.id.passWord);
            textView.setText(jsonObject.getString("email"));

        }
        catch (Exception e){
            e.printStackTrace();
        }



        addContact = findViewById(R.id.add);
        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Toast.makeText(getApplicationContext(), "Contact Added:" + jsonObject.getString("NAME"), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}

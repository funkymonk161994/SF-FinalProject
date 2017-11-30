package sf.vimo.com.sf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Results extends AppCompatActivity {

    Button addContact;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Log.d("Results","onCreate Started");

        addContact = findViewById(R.id.add);
        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Contact Added: Alex Pichai",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package sf.vimo.com.sf;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


public class Scanner extends Activity {

    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        Log.d("Scanner","onCreate");

        Button sendData = findViewById(R.id.send);
        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Toast.makeText(getApplicationContext(),"Details Sent, looking for nearby contacts",Toast.LENGTH_SHORT).show();
                    Intent save = new Intent(Scanner.this, Results.class);
                    Log.d("Scanner","Found");
                    startActivity(save);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


    }

}

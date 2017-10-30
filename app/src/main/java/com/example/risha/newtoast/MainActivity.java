package com.example.risha.newtoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button deliverToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deliverToast = (Button)findViewById(R.id.button);

        deliverToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delivery();
            }
        });
    }

    public void delivery (){
        Context context = getApplicationContext();
        CharSequence text = "This Toast is very Tasty!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}

package com.example.android.cookie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        i = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        if(i==0) {
        TextView tex = (TextView) findViewById(R.id.status_text_view);
        tex.setText("I'm So full");
        ImageView img = (ImageView) findViewById(R.id.android_cookie_image_view);
        if (img == null) {
            Toast.makeText(getApplicationContext(), "Image view is null", Toast.LENGTH_LONG).show();
        }
        img.setImageResource(R.drawable.after_cookie);
            i=1;
        }
        else {
            TextView tex = (TextView) findViewById(R.id.status_text_view);
            tex.setText("I'm so hungry");
            ImageView img = (ImageView) findViewById(R.id.android_cookie_image_view);
            img.setImageResource(R.drawable.before_cookie);
            i=0;
        }
    }
}

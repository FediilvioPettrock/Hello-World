package ao.co.isptec.aplm.outroprojecto;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Obter a mensagem da intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // atribui o texto da intent na TextView
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(40);
        textView.setText(message);

    }
}
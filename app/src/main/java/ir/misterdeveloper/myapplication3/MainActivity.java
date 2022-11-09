package ir.misterdeveloper.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "test 1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test 2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test 3", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test 4", Toast.LENGTH_SHORT).show();
    }
}
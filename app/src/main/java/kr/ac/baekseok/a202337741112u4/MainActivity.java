package kr.ac.baekseok.a202337741112u4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] movie = {"쿵푸팬더","짱구는 못말려","아저씨","아바타","대부","국가대표","토이스토리",
        "마당을 나온 암탉","죽은 시인의 사회","서유기"};

        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, movie);

        spinner.setAdapter(adapter);
    }
}
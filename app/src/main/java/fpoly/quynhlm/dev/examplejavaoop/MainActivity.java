package fpoly.quynhlm.dev.examplejavaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import fpoly.quynhlm.dev.examplejavaoop.Model.Student;

public class MainActivity extends AppCompatActivity {

    TextView tv_result;

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_result);
        student = new Student("Quynh",19,10);
        String information = student.Information();
        tv_result.setText(information);
    }
}
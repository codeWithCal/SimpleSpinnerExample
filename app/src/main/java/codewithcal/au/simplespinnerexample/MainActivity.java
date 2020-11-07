package codewithcal.au.simplespinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User.initUsers();
        spinner = (Spinner)findViewById(R.id.spinnerExample);

        SpinnerAdapter customAdapter = new SpinnerAdapter(this, R.layout.custom_spinner_adapter, User.getUserArrayList());
        spinner.setAdapter(customAdapter);
    }


}
package com.example.sid.a114db;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String[] firstname, lastname, idnum;
    Student students;
    DBHelper dbhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbhandler = new DBHelper(this);
        //Setting the references with its IDs.
        firstname = new String[]{"Sid", "Jhon", "Ankit", "Amit", "Acadgild"};
        lastname = new String[]{"Pawar", "Dora", "Kumar", "Shrma", "Course"};
        idnum = new String[]{"1", "2", "3", "4", "5"};
        textView = (TextView) findViewById(R.id.textview);

        insertValue();
        loadDataFromArray();
    }

    public boolean insertValue() {
        for (int i = 0; i < idnum.length; i++) {
            students = new Student();
            students.setmId("Id: ");
            students.setmIdnum(idnum[i]);
            students.setmFirstname("First Name: ");
            students.setmFirstnamevalue(firstname[i]);
            students.setmLastname("Last Name: ");
            students.setmLastnamevalue(lastname[i]);
            dbhandler.addValues(students);

        }
        Log.e("Mainactivity", "Values Inserted ");
        return true;

    }

    // loadDataFromArray methd to get the values from db aand returning the true if exist otherwise false
    Boolean loadDataFromArray() {
        try {
            ArrayList array_list = dbhandler.databaseToArray();
            Log.e("student List Size ", String.valueOf(array_list.size()));

            if (!array_list.isEmpty()) {

                StringBuilder stringBuilderFull, stringBuilderstudents;
                stringBuilderFull = new StringBuilder();


                for (int i = 0; i < array_list.size(); i++) {
                    Student students1 = (Student) array_list.get(i);
                    stringBuilderstudents = new StringBuilder()
                            .append(students1.getmId())
                            .append(students1.getmIdnum()).append(" ,")
                            .append(students1.getmFirstname())
                            .append(students1.getmFirstnamevalue()).append(" ,")
                            .append(students1.getmLastname())
                            .append(students1.getmLastnamevalue())
                            .append("\n").append("\n");
                    stringBuilderFull.append(stringBuilderstudents);
                }

                textView.setText(stringBuilderFull);
                Log.e("MainActivity", "The Student List is displayed.");
            } else {
                Log.e("MainActivity", "No Students available.");
            }

            return true;
        } catch (Exception e) {
            Log.e("MainActivity", " Error is " + e.getLocalizedMessage());

            return false;
        }
    }


}

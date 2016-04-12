package com.companyname.listproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private EditText userInput;
    private EditText userInput2;
    private LinkedList<String> roster;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        userInput = (EditText) findViewById(R.id.user_input);
        userInput2 = (EditText) findViewById(R.id.user_input_2);

        roster = new LinkedList<>();
        roster.add("Name: Fartbag" + '\n' + "Position: Joker");
        roster.add("Name: Smelly poo" + '\n' + "Position: Serious Person");
        roster.add("Name: Stink face" + '\n' + "Position: Bad Player");
        roster.add("Name: Terd" + '\n' + "Position: Champion poop");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 , roster);

        listView.setAdapter(arrayAdapter);

    }

    public void clickedAddPlayer(View view) {
        if (!userInput.getText().toString().equals("") && !userInput2.getText().toString().equals("")) {
            roster.add("Name: " + userInput.getText().toString() + '\n' + "Position: " + userInput2.getText().toString());
            arrayAdapter.notifyDataSetChanged();
        }
        else {
            Toast.makeText(getApplicationContext(), "Do Better Jackass", Toast.LENGTH_LONG).show();
        }
    }

    public void clickedRemoveRecent(View view) {
        if (roster.size() != 0) {
            roster.remove(roster.getLast());
            arrayAdapter.notifyDataSetChanged();
        }
    }
}

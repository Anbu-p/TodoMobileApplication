package com.example.todomobileapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.todomobileapplication.model.Project;
import com.example.todomobileapplication.model.ProjectList;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {
    private EditText editText;
    private ImageView imageView;
    private ListView listView;
    private LinearLayout linearLayout;
    private CheckBox checkBox;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.text_edit);
        imageView = findViewById(R.id.add_text);
        listView = findViewById(R.id.listview);
        imageView.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        final String label = editText.getText().toString();

        if (!(label.equals(""))) {

            if (list.contains(label)) {
                Toast.makeText(getBaseContext(), "Item Already Exist", Toast.LENGTH_LONG).show();
            } else {
                list.add(label);
                arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_multiple_choice, list);
                listView.setAdapter(arrayAdapter);
                editText.setText("");
            }
        } else {
            Toast.makeText(getBaseContext(), "Please Provide a task name", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onItemLongClick(final AdapterView<?> adapterView, final View view, final int position, final long id) {
        final int removeItem = position;
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setMessage("Do you want to delete").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(final DialogInterface dialogInterface, final int position) {
                list.remove(removeItem);
                arrayAdapter.notifyDataSetChanged();
                Toast.makeText(getBaseContext(), "Item Deleted", Toast.LENGTH_LONG).show();
            }
        }).setNegativeButton("Cancel", null).show();

        return true;
    }

    private long id = 0;
    private Project project;
    private ProjectList projectList;

    private void AddProject() {
        project.setId(id);
        project.setLabel(lable);
        projectList.add(project);
    }

    private void getAllProject() {
        projectList.getAllList();
    }
}


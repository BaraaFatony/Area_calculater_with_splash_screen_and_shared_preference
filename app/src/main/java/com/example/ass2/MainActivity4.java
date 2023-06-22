package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    public static final String FLAG = "FLAG";
    private boolean flag = false;
    private EditText edtName;
    private EditText edtAge;
    private CheckBox chk;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();
        setupViews();
        setupSharedPrefs();
        checkPrefs();
    }

    private void checkPrefs() {
        flag = prefs.getBoolean(FLAG, false);

        if(flag){
            String name = prefs.getString(NAME, "");
            String password = prefs.getString(AGE, "");
            edtName.setText(name);
            edtAge.setText(password);
            chk.setChecked(true);
        }
    }

    private void setupSharedPrefs() {
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }

    private void setupViews() {
        edtName = findViewById(R.id.edtName);
        edtAge = findViewById(R.id.edtAge);
        chk = findViewById(R.id.chk);
    }

    public void btnLoginOnClick(View view) {
        String name = edtName.getText().toString();
        String password = edtAge.getText().toString();

        if(chk.isChecked()){
            if(!flag) {
                editor.putString(NAME, name);
                editor.putString(AGE, password);
                editor.putBoolean(FLAG, true);
                editor.commit();
            }

        }
        // authenticate the user

    }
}
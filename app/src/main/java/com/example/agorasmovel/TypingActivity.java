package com.example.agorasmovel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class TypingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_typing);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TypingActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_toolbar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        Intent i;
        switch (item.getItemId()){
            case R.id.perfil:
                i = new Intent(TypingActivity.this, PerfilActivity.class);
                startActivity(i);
                return true;

            case R.id.tema:
                i = new Intent(TypingActivity.this, SuggestionActivity.class);
                startActivity(i);
                return true;

            case R.id.oldDebate:
                i = new Intent(TypingActivity.this, OldDebatesActivity.class);
                startActivity(i);
                return true;

            case R.id.ajuda:
                i = new Intent(TypingActivity.this, HelpActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
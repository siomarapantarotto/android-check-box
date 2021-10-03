package br.com.siomara.android.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxCat;
    private CheckBox checkboxDog;
    private CheckBox checkboxBird;
    private CheckBox checkboxLion;
    private Button buttonDisplaySelectedPets;
    private TextView textViewSelectedPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

        // Displays selected pets.
        buttonDisplaySelectedPets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItems = getResources().getString(R.string.see_the_pets_you_have_selected) + "\n\n";
                selectedItems += checkboxCat.getText() + ":\t\t " + checkboxCat.isChecked() + "\n";
                selectedItems += checkboxDog.getText() + ":\t " + checkboxDog.isChecked() + "\n";
                selectedItems += checkboxBird.getText() + ":\t " + checkboxBird.isChecked() + "\n";
                selectedItems += checkboxLion.getText() + ":\t " + checkboxLion.isChecked() + "\n";
                textViewSelectedPets.setText(selectedItems);
            }
        });
    }

    // Initializes/Connects GUI components.
    public void initializeComponents() {
        checkboxCat = findViewById(R.id.checkboxCat);
        checkboxDog = findViewById(R.id.checkboxDog);
        checkboxBird = findViewById(R.id.checkboxBird);
        checkboxLion = findViewById(R.id.checkboxLion);
        buttonDisplaySelectedPets = findViewById(R.id.buttonDisplaySelectedPets);
        textViewSelectedPets = findViewById(R.id.textViewDisplaySelectedPets);
    }
}
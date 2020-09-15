[17:51] animateur 29 (Invité)
    
  
  
  
    
      
      
        Java
      
    
    
    
      package fr.orsys.ama.tp2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
public class AddClientActivity extends AppCompatActivity {
    final int AGE_MAX = 60;
    final int AGE_MIN = 18;
    protected EditText nameText;
    protected EditText firstnameText;
    protected EditText emailText;
    protected TextView ageText;
    protected SeekBar ageBar;
    protected RadioGroup sexeGroup;
    protected Switch activeSwitch;
    protected Spinner levelSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client);
        nameText = findViewById(R.id.ename);
        firstnameText = findViewById(R.id.efirstname);
        emailText = findViewById(R.id.eemail);
        ageText = findViewById(R.id.tage);
        ageBar = findViewById(R.id.sbage);
        sexeGroup = findViewById(R.id.rgsexe);
        activeSwitch = findViewById(R.id.sactive);
        levelSpinner = findViewById(R.id.slevel);
        ageBar.setMax(AGE_MAX - AGE_MIN);
    }
    public void addAclient(View view) {
        Log.i("fr.orsys.ama.tp2", "Click");
    }
}
    
    
  
  


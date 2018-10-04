package comin.example.root.formapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText nama, nis, tempat, tanggal;
    private RadioGroup radioGroupjk;
    private RadioButton radiojkbutton;
    private Button submit;
    private CheckBox baca, gambar, jalan, renang, nari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.edtnama);
        nis = findViewById(R.id.edtnis);
        tempat = findViewById(R.id.edttempat);
        tanggal = findViewById(R.id.edttgl);
        radioGroupjk = findViewById(R.id.groupjk);
        submit = findViewById(R.id.btnsubmit);
        baca = findViewById(R.id.hobi1);
        gambar = findViewById(R.id.hobi2);
        jalan = findViewById(R.id.hobi3);
        renang = findViewById(R.id.hobi4);
        nari = findViewById(R.id.hobi5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroupjk.getCheckedRadioButtonId();

                radiojkbutton = findViewById(selectedId);

                Intent intent = new Intent(MainActivity.this, comin.example.root.formapp.View.class);

                intent.putExtra("Nama", nama.getText().toString());
                intent.putExtra("Nis", nis.getText().toString());
                intent.putExtra("Tempat", tempat.getText().toString());
                intent.putExtra("Tanggal", tanggal.getText().toString());
                intent.putExtra("JK", radiojkbutton.getText().toString());
                if (baca.isChecked()){
                    intent.putExtra("hobi1", baca.getText().toString());
                }else {
                    intent.putExtra("hobi1","");
                }
                if (gambar.isChecked()){
                    intent.putExtra("hobi2", gambar.getText().toString());
                }else {
                    intent.putExtra("hobi2","");
                }
                if (jalan.isChecked()){
                    intent.putExtra("hobi3", jalan.getText().toString());
                }else {
                    intent.putExtra("hobi3","");
                }
                if (renang.isChecked()){
                    intent.putExtra("hobi4", renang.getText().toString());
                }else {
                    intent.putExtra("hobi4","");
                }
                if (nari.isChecked()){
                    intent.putExtra("hobi5", nari.getText().toString());
                }else {
                    intent.putExtra("hobi5","");
                }


                MainActivity.this.startActivity(intent);
                finish();
            }
        });



    }
}

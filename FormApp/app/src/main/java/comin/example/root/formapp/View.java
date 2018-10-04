package comin.example.root.formapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class View extends AppCompatActivity {
    private TextView nama, nis, ttl, jk, hobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        nama = findViewById(R.id.txtnama);
        nis = findViewById(R.id.txtnis);
        ttl = findViewById(R.id.txtttl);
        jk = findViewById(R.id.txtjk);
        hobi = findViewById(R.id.txthobi);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            String Nama = extras.getString("Nama");
            String NIS = extras.getString("Nis");
            String Tempat = extras.getString("Tempat");
            String Tanggal = extras.getString("Tanggal");
            String JK = extras.getString("JK");
            String cek1= extras.getString("hobi1");
            String cek2=extras.getString("hobi2");
            String cek3=extras.getString("hobi3");
            String cek4=extras.getString("hobi4");
            String cek5=extras.getString("hobi5");


            /*Boolean check1 = getIntent().getExtras().getBoolean("hobi1");
            Boolean check2 = getIntent().getExtras().getBoolean("hobi2");
            Boolean check3 = getIntent().getExtras().getBoolean("hobi3");
            Boolean check4 = getIntent().getExtras().getBoolean("hobi4");
            Boolean check5 = getIntent().getExtras().getBoolean("hobi5");

            if (check1=true){
                cek1 = "Membaca";
            }else {
                cek1 = "";
            }

            if(check2=true){
                cek2 = "Menggambar";
            }else {
                cek2 = "";
            }

            if(check3=true){
                cek3 = "Jalan-Jalan";
            }else {
                cek3 = "";
            }

            if (check4=true){
                cek4 = "Berenang";
            }else {
                cek4 = "";
            }

            if (check5=true){
                cek5 = "Menari";
            }else {
                cek5="";
            }
*/
            nama.setText(Nama);
            nis.setText(NIS);
            ttl.setText(Tempat+", "+Tanggal);
            jk.setText(JK);
            hobi.setText(cek1+cek2+cek3+cek4+cek5);
        }
    }

    public void onBackPressed(){
        Intent intent = new Intent(View.this, MainActivity.class);
        View.this.startActivity(intent);
        finish();
    }
}

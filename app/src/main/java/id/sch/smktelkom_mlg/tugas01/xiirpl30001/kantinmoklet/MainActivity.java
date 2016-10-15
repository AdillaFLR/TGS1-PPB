package id.sch.smktelkom_mlg.tugas01.xiirpl3001.aplikasipeminjamanprasarana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import id.sch.smktelkom_mlg.tugas01.xiirpl30001.kantinmoklet.R;

public class MainActivity extends AppCompatActivity {

    EditText atnama;
    Button Bok;
    Spinner spkelas;
    TextView tvHasil;
    RadioButton rbjeruk, rbteh;
    CheckBox cbrawon, cbpecel, cbuduk;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atnama = (EditText) findViewById(R.id.nama);
        Bok = (Button) findViewById(R.id.buttonok);
        spkelas = (Spinner) findViewById(R.id.spinnerkelas);
        tvHasil = (TextView) findViewById(R.id.tvhasil);
        rbjeruk = (RadioButton) findViewById(R.id.rbjeruk);
        rbteh = (RadioButton) findViewById(R.id.rbteh);
        cbrawon = (CheckBox) findViewById(R.id.cbrawon);
        cbpecel = (CheckBox) findViewById(R.id.cbpecel);
        cbuduk = (CheckBox) findViewById(R.id.cbuduk);


        Bok.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       String nama = atnama.getText().toString();
                                       String hasilcb = "Anda membeli : \n";
                                       int startlen = hasilcb.length();
                                       if (cbuduk.isChecked()) hasilcb+=cbuduk.getText()+"\n";
                                       if (cbpecel.isChecked()) hasilcb+=cbpecel.getText()+"\n";
                                       if (cbrawon.isChecked()) hasilcb+=cbrawon.getText()+"\n";
                                       if (hasilcb.length()==startlen) hasilcb+= "Tidak ada yang dipilih";

                                       String hasil= null;

                                       if (rbjeruk.isChecked())
                                       {
                                           hasil = rbjeruk.getText().toString();
                                       }
                                       else if(rbteh.isChecked())
                                       {
                                           hasil = rbteh.getText().toString();
                                       }
                                       if (hasil == null)
                                       {
                                           tvHasil.setText("Belum memilih Menu");
                                       }
                                       else
                                       {
                                           tvHasil.setText("Pemesan : " + nama + "\n \n nomor meja : " + spkelas.getSelectedItem().toString() + "\n \n Pilihan Anda : " + hasil + "\n \n " + hasilcb);
                                       }

                                   }

                               }
        );
    }
}

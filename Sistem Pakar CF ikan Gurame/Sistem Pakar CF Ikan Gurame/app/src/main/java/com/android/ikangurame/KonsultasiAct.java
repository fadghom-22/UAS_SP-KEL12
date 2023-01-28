package com.android.ikangurame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class KonsultasiAct extends AppCompatActivity {

    Button btnProses;
    TextView tvOutput;
    CheckBox chkGejala1, chkGejala2, chkGejala3, chkGejala4, chkGejala5, chkGejala6, chkGejala7, chkGejala8, chkGejala9;
    AutoCompleteTextView txtNilaiGejala1, txtNilaiGejala2, txtNilaiGejala3, txtNilaiGejala4, txtNilaiGejala5, txtNilaiGejala6, txtNilaiGejala7, txtNilaiGejala8, txtNilaiGejala9;

    String[] nilaiKeyakinanGejala1 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala2 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala3 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala4 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala5 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala6 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala7 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala8 = {"", "Yes","no"};
    String[] nilaiKeyakinanGejala9 = {"", "Yes","no"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);
        btnProses   = (Button)findViewById(R.id.button);
        tvOutput    = (TextView)findViewById(R.id.textView);

        chkGejala1  = (CheckBox)findViewById(R.id.checkBox);
        chkGejala2  = (CheckBox)findViewById(R.id.checkBox2);
        chkGejala3  = (CheckBox)findViewById(R.id.checkBox3);
        chkGejala4  = (CheckBox)findViewById(R.id.checkBox4);
        chkGejala5  = (CheckBox)findViewById(R.id.checkBox5);
        chkGejala6  = (CheckBox)findViewById(R.id.checkBox6);
        chkGejala7  = (CheckBox)findViewById(R.id.checkBox7);
        chkGejala8  = (CheckBox)findViewById(R.id.checkBox8);
        chkGejala9  = (CheckBox)findViewById(R.id.checkBox9);

        txtNilaiGejala1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        txtNilaiGejala2 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        txtNilaiGejala3 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        txtNilaiGejala4 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        txtNilaiGejala5 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        txtNilaiGejala6 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView6);
        txtNilaiGejala7 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView7);
        txtNilaiGejala8 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView8);
        txtNilaiGejala9 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView9);

        final ArrayAdapter<String> adapterGejala1 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala1);
        txtNilaiGejala1.setThreshold(1);
        txtNilaiGejala1.setAdapter(adapterGejala1);

        final ArrayAdapter<String> adapterGejala2 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala2);
        txtNilaiGejala2.setThreshold(1);
        txtNilaiGejala2.setAdapter(adapterGejala2);

        final ArrayAdapter<String> adapterGejala3 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala3);
        txtNilaiGejala3.setThreshold(1);
        txtNilaiGejala3.setAdapter(adapterGejala3);

        final ArrayAdapter<String> adapterGejala4 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala4);
        txtNilaiGejala4.setThreshold(1);
        txtNilaiGejala4.setAdapter(adapterGejala4);

        final ArrayAdapter<String> adapterGejala5 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala5);
        txtNilaiGejala5.setThreshold(1);
        txtNilaiGejala5.setAdapter(adapterGejala5);

        final ArrayAdapter<String> adapterGejala6 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala6);
        txtNilaiGejala6.setThreshold(1);
        txtNilaiGejala6.setAdapter(adapterGejala6);

        final ArrayAdapter<String> adapterGejala7 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala6);
        txtNilaiGejala7.setThreshold(1);
        txtNilaiGejala7.setAdapter(adapterGejala7);

        final ArrayAdapter<String> adapterGejala8 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala6);
        txtNilaiGejala8.setThreshold(1);
        txtNilaiGejala8.setAdapter(adapterGejala8);

        final ArrayAdapter<String> adapterGejala9 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, nilaiKeyakinanGejala6);
        txtNilaiGejala9.setThreshold(1);
        txtNilaiGejala9.setAdapter(adapterGejala9);


        txtNilaiGejala1.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala1, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala1.setText(nilaiKeyakinanGejala1[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala2.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala2, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala2.setText(nilaiKeyakinanGejala2[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala3.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala3, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala3.setText(nilaiKeyakinanGejala3[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala4.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala4, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala4.setText(nilaiKeyakinanGejala4[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala5.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala5, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala5.setText(nilaiKeyakinanGejala5[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala6.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala6, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala6.setText(nilaiKeyakinanGejala6[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala7.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala7, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala7.setText(nilaiKeyakinanGejala7[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        txtNilaiGejala8.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala8, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala8.setText(nilaiKeyakinanGejala8[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );


        txtNilaiGejala9.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   new AlertDialog.Builder(KonsultasiAct.this).setTitle("Tentukan Pilihan:").
                                                           setAdapter(adapterGejala9, new DialogInterface.OnClickListener() {
                                                               @Override
                                                               public void onClick(DialogInterface dialog, int which) {
                                                                   txtNilaiGejala9.setText(nilaiKeyakinanGejala9[which].toString());
                                                                   dialog.dismiss();
                                                               }
                                                           }).create().show();
                                               }
                                           }
        );

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Ikan Gurame Anda Menderita Penyakit :";

                // AND && dan OR ||
                if (chkGejala1.isChecked() && chkGejala2.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala1 = 0.8;
                    double nilaiGejala2 = 0.4;

                    // Nilai Inputan dari PASIEN / USER
                    String answer1 = txtNilaiGejala1.getText().toString();
                    String answer2 = txtNilaiGejala2.getText().toString();
                    double doubleGejala1;
                    double doubleGejala2;
                    if (answer1.equals("Yes")) {
                        doubleGejala1 = 1;
                    } else if (answer1.equals("no")) {
                        doubleGejala1 = 0;
                    } else {
                        doubleGejala1 = Double.parseDouble(answer1);
                    }

                    if (answer2.equals("Yes")) {
                        doubleGejala2 = 1;
                    } else if (answer2.equals("no")) {
                        doubleGejala2 = 0;
                    } else {
                        doubleGejala2 = Double.parseDouble(answer2);
                    }

                    double hasilHitunganGejala1 = nilaiGejala1 * doubleGejala1;
                    double hasilHitunganGejala2 = nilaiGejala2 * doubleGejala2;

                    double Combine_CF1_CF2  = hasilHitunganGejala1 + hasilHitunganGejala2 * (1 - hasilHitunganGejala1);

                    String hasilHitungGejalaPenyakitA = String.valueOf((Combine_CF1_CF2 * 100));

                    NamaPenyakit += "\nBintik Putih"+"\n"+hasilHitungGejalaPenyakitA+" %";



                }

                if (chkGejala3.isChecked() && chkGejala4.isChecked() && chkGejala5.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala3 = 0.4;
                    double nilaiGejala4 = 0.2;
                    double nilaiGejala5 = 0.8;

                    // Nilai Inputan dari PASIEN / USER
                    String answer3 = txtNilaiGejala3.getText().toString();
                    String answer4 = txtNilaiGejala4.getText().toString();
                    String answer5 = txtNilaiGejala5.getText().toString();
                    double doubleGejala3;
                    double doubleGejala4;
                    double doubleGejala5;
                    if (answer3.equals("Yes")) {
                        doubleGejala3 = 1;
                    } else if (answer3.equals("no")) {
                        doubleGejala3 = 0;
                    } else {
                        doubleGejala3 = Double.parseDouble(answer3);
                    }

                    if (answer4.equals("Yes")) {
                        doubleGejala4 = 1;
                    } else if (answer4.equals("no")) {
                        doubleGejala4 = 0;
                    } else {
                        doubleGejala4 = Double.parseDouble(answer4);
                    }

                    if (answer5.equals("Yes")) {
                        doubleGejala5 = 1;
                    } else if (answer5.equals("no")) {
                        doubleGejala5 = 0;
                    } else {
                        doubleGejala5 = Double.parseDouble(answer5);
                    }

                    double hasilHitunganGejala3 = nilaiGejala3 * doubleGejala3;
                    double hasilHitunganGejala4 = nilaiGejala4 * doubleGejala4;
                    double hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5;

                    double Combine_CF1_CF2_1  = hasilHitunganGejala3 + hasilHitunganGejala4 * (1 - hasilHitunganGejala3);
                    double Combine_CFold_CF3  = Combine_CF1_CF2_1 + hasilHitunganGejala5 * (1 - Combine_CF1_CF2_1);


                    String hasilHitungGejalaPenyakitB = String.valueOf((Combine_CFold_CF3 * 100));

                    NamaPenyakit += "\nCacing Insang"+"\n"+hasilHitungGejalaPenyakitB+" %";

                }

                if (chkGejala5.isChecked() && chkGejala6.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala5 = 0.8;
                    double nilaiGejala6 = 0.6;

                    // Nilai Inputan dari PASIEN / USER
                    String answer5 = txtNilaiGejala5.getText().toString();
                    String answer6 = txtNilaiGejala6.getText().toString();
                    double doubleGejala5;
                    double doubleGejala6;
                    if (answer5.equals("Yes")) {
                        doubleGejala5 = 1;
                    } else if (answer5.equals("no")) {
                        doubleGejala5 = 0;
                    } else {
                        doubleGejala5 = Double.parseDouble(answer5);
                    }

                    if (answer6.equals("Yes")) {
                        doubleGejala6 = 1;
                    } else if (answer6.equals("no")) {
                        doubleGejala6 = 0;
                    } else {
                        doubleGejala6 = Double.parseDouble(answer6);
                    }

                    double hasilHitunganGejala5 = nilaiGejala5 * doubleGejala5;
                    double hasilHitunganGejala6 = nilaiGejala6 * doubleGejala6;

                    double Combine_CF1_CF2_2  = hasilHitunganGejala5 + hasilHitunganGejala6 * (1 - hasilHitunganGejala5);


                    String hasilHitungGejalaPenyakitC = String.valueOf((Combine_CF1_CF2_2 * 100));

                    NamaPenyakit += "\nKekurangan Oksigen"+"\n"+hasilHitungGejalaPenyakitC+" %";

                }

                if (chkGejala7.isChecked() && chkGejala8.isChecked() && chkGejala9.isChecked()){

                    //  Nilai dari PAKAR / AHLINYA
                    double nilaiGejala7 = 0.6;
                    double nilaiGejala8 = 0.4;
                    double nilaiGejala9 = 0.8;

                    // Nilai Inputan dari PASIEN / USER
                    String answer7 = txtNilaiGejala7.getText().toString();
                    String answer8 = txtNilaiGejala8.getText().toString();
                    String answer9 = txtNilaiGejala9.getText().toString();
                    double doubleGejala7;
                    double doubleGejala8;
                    double doubleGejala9;
                    if (answer7.equals("Yes")) {
                        doubleGejala7 = 1;
                    } else if (answer7.equals("no")) {
                        doubleGejala7 = 0;
                    } else {
                        doubleGejala7 = Double.parseDouble(answer7);
                    }

                    if (answer8.equals("Yes")) {
                        doubleGejala8 = 1;
                    } else if (answer8.equals("no")) {
                        doubleGejala8 = 0;
                    } else {
                        doubleGejala8= Double.parseDouble(answer8);
                    }

                    if (answer9.equals("Yes")) {
                        doubleGejala9 = 1;
                    } else if (answer9.equals("no")) {
                        doubleGejala9= 0;
                    } else {
                        doubleGejala9 = Double.parseDouble(answer9);
                    }

                    double hasilHitunganGejala7 = nilaiGejala7 * doubleGejala7;
                    double hasilHitunganGejala8 = nilaiGejala8 * doubleGejala8;
                    double hasilHitunganGejala9 = nilaiGejala9 * doubleGejala9;

                    double Combine_CF1_CF2_1  = hasilHitunganGejala7 + hasilHitunganGejala8 * (1 - hasilHitunganGejala7);
                    double Combine_CFold_CF3  = Combine_CF1_CF2_1 + hasilHitunganGejala9 * (1 - Combine_CF1_CF2_1);


                    String hasilHitungGejalaPenyakitD = String.valueOf((Combine_CFold_CF3 * 100));

                    NamaPenyakit += "\nKejenuhan Gas"+"\n"+hasilHitungGejalaPenyakitD+" %";

                }

                // Output Semua hasil
                tvOutput.setText(""+NamaPenyakit);
            }
        });



    }
}


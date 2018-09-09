/*
   Copyright (C) 2018  Nicole Astorga

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <http://www.gnu.org/licenses/>
*/


package com.example.nicoleastorga.epr1_notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class promedio extends AppCompatActivity {

    private EditText et_epr1, et_epe1, et_epr2, et_epe2, et_eva1, et_eva2, et_eva3, et_eva4, et_resultado;
    private Button btn_calcular;
    DecimalFormat df = new DecimalFormat("#.#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);

        et_epr1 = (EditText) findViewById(R.id.et_epr1);
        et_epe1 = (EditText) findViewById(R.id.et_epe1);
        et_epr2 = (EditText) findViewById(R.id.et_epr2);
        et_epe2 = (EditText) findViewById(R.id.et_epe2);
        et_eva1 = (EditText) findViewById(R.id.et_eva1);
        et_eva2 = (EditText) findViewById(R.id.et_eva2);
        et_eva3 = (EditText) findViewById(R.id.et_eva3);
        et_eva4 = (EditText) findViewById(R.id.et_eva4);
        et_resultado = (EditText) findViewById(R.id.et_resultado);
        btn_calcular = (Button) findViewById(R.id.btn_promedio);
    }

    public void promediar (View v){

        int epr1 = Integer.parseInt(et_epr1.getText().toString());
        int epe1 = Integer.parseInt(et_epe1.getText().toString());
        int epr2 = Integer.parseInt(et_epr2.getText().toString());
        int epe2 = Integer.parseInt(et_epe2.getText().toString());
        int eva1 = Integer.parseInt(et_eva1.getText().toString());
        int eva2 = Integer.parseInt(et_eva2.getText().toString());
        int eva3 = Integer.parseInt(et_eva3.getText().toString());
        int eva4 = Integer.parseInt(et_eva4.getText().toString());

        String mensaje="";
        int evas = (eva1 + eva2 + eva3 + eva4)/4;
        double total = (epr1*0.1 + epe1*0.15 + epr2*0.2 +epe2*0.25 + evas*0.3);


        if (epr1<40 || epr2<40 || epe1<40 || epe2<40 || evas<40)
        {
            mensaje="Debes dar examén por tener una o mas notas bajo 40";
        }
        else
        {
            mensaje="No tiene notas rojas, Felicidades!";
        }

        //String res= df.format(String.valueOf(total));

        et_resultado.setText("Su promedio es "+df.format(total));
        Toast.makeText(getApplicationContext(), "El promedio es "+df.format(total)+"!"+mensaje,Toast.LENGTH_SHORT).show();


    }


}

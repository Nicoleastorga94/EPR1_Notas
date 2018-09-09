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
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class examen extends AppCompatActivity {

    private EditText et_prom, et_res;
    private Button btn_boton;
    DecimalFormat df = new DecimalFormat("#.#");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);

        et_prom = (EditText) findViewById(R.id.et_prom);
        et_res = (EditText) findViewById(R.id.et_res);
        btn_boton = (Button) findViewById(R.id.btn_boton);


    }

    public void calculoexamen (View v){

        int prom = Integer.parseInt(et_prom.getText().toString());

        double a = (40-(prom*0.7))/0.3;



        et_res.setText(" Necesitas un " + df.format(a)+ " para aprobar el ramo");


    }
}

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

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    private Button btn_promedio;
    private Button btn_examen;
    private Button btn_final;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        btn_promedio = (Button) findViewById(R.id.btn_promedio);
        btn_examen = (Button) findViewById(R.id.btn_examen);
        btn_final = (Button) findViewById(R.id.btn_final);

        btn_promedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btn_promedio = new Intent(Inicio.this, promedio.class);
                startActivity(btn_promedio);


            }



        });

        btn_examen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btn_examen = new Intent(Inicio.this, examen.class);
                startActivity(btn_examen);
            }
        });


        btn_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btn_final = new Intent(Inicio.this, prom_final.class);
                startActivity(btn_final);
            }
        });
    }
}

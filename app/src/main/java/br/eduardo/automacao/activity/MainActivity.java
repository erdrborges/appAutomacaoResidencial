package br.eduardo.automacao.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import br.eduardo.automacao.R;

import br.eduardo.automacao.model.Corredor;
import br.eduardo.automacao.model.Cozinha;
import br.eduardo.automacao.model.Garagem;
import br.eduardo.automacao.model.Living;
import br.eduardo.automacao.model.Quarto1;
import br.eduardo.automacao.model.Quarto2;
import br.eduardo.automacao.model.Quarto3;
import br.eduardo.automacao.model.Varanda;

public class MainActivity extends AppCompatActivity {
    String TAG = "Activity Principal.";

    // declaração dos Switches do Quarto 1
    Switch swArBed1, swLampBed1, swLampClsBed1, swLampWcBed1;

    // declaração dos Switches do Quarto 2
    Switch swArBed2, swLampBed2;

    // declaração dos Switches do Quarto 3
    Switch swArBed3, swLampBed3;

    // declaração dos Switches do Corredor
    Switch swLampCor, swLampBathCor;

    // declaração dos Switches da Cozinha
    Switch swLampKit, swLampLaundry;

    // declaração dos Switches da Garagem
    Switch swGateGarage, swLampGarage;

    // declaração dos Switches do Living
    Switch swLampDining, swLampHall, swLampLiving;

    //declaração dos Switches da Varanda
    Switch swLampBalcHall, swLampBalcLiv, swLampBalcLaundry;

    // leitura dos dados contidos no nó casa
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference myRef = database.getReference("casa");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CODIFICAÇÃO RELACIONADA AO QUARTO 1
        swArBed1 = findViewById(R.id.sw_ar_bed_1);
        swLampBed1 = findViewById(R.id.sw_lamp_bed_1);
        swLampClsBed1 = findViewById(R.id.sw_lamp_cls_bed_1);
        swLampWcBed1 = findViewById(R.id.sw_lamp_wc_bed_1);

        //referencia do quarto1
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRefQuarto1 = database.getReference("casa/").child("quarto1(suite)/");

        myRefQuarto1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto1 quarto1 = dataSnapshot.getValue(Quarto1.class);

                Log.d(TAG, "Snapshot: " + dataSnapshot);
                Log.d(TAG, "O valor é: " + quarto1);

                if(quarto1.getAr_bed()){
                    swArBed1.setChecked(true);
                }else{
                    swArBed1.setChecked(false);
                }

                if(quarto1.getLamp_bed()){
                    swLampBed1.setChecked(true);
                }else{
                    swLampBed1.setChecked(false);
                }

                if(quarto1.getLamp_closet()){
                    swLampClsBed1.setChecked(true);
                }else{
                    swLampClsBed1.setChecked(false);
                }

                if(quarto1.getLamp_wc()){
                    swLampWcBed1.setChecked(true);
                }else{
                    swLampWcBed1.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swArBed1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto1(suite)/ar_bed");
                }else{
                    desligar("quarto1(suite)/ar_bed");
                }
            }
        });

        swLampBed1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto1(suite)/lamp_bed");
                }else{
                    desligar("quarto1(suite)/lamp_bed");
                }
            }
        });

        swLampClsBed1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto1(suite)/lamp_closet");
                }else{
                    desligar("quarto1(suite)/lamp_closet");
                }
            }
        });

        swLampWcBed1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto1(suite)/lamp_wc");
                }else{
                    desligar("quarto1(suite)/lamp_wc");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIOINADA AO QUARTO 2

        swArBed2 = findViewById(R.id.sw_ar_bed_2);
        swLampBed2 = findViewById(R.id.sw_lamp_bed_2);

        //referência do quarto 2
        final DatabaseReference myRefQuarto2 = database.getReference("casa/").child("quarto2/");

        myRefQuarto2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto2 quarto2 = dataSnapshot.getValue(Quarto2.class);

                if(quarto2.getAr_bed()){
                    swArBed2.setChecked(true);
                }else{
                    swArBed2.setChecked(false);
                }

                if(quarto2.getLamp_bed()){
                    swLampBed2.setChecked(true);
                }else{
                    swLampBed2.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });


        swArBed2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto2/ar_bed");
                }else{
                    desligar("quarto2/ar_bed");
                }
            }
        });

        swLampBed2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto2/lamp_bed");
                }else{
                    desligar("quarto2/lamp_bed");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIONADA AO QUARTO 3

        swArBed3 = findViewById(R.id.sw_ar_bed_3);
        swLampBed3 = findViewById(R.id.sw_lamp_bed_3);

        //referência do quarto 3
        final DatabaseReference myRefQuarto3 = database.getReference("casa/").child("quarto3/");

        myRefQuarto3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto3 quarto3 = dataSnapshot.getValue(Quarto3.class);

                if(quarto3.getAr_bed()){
                    swArBed3.setChecked(true);
                }else{
                    swArBed3.setChecked(false);
                }

                if(quarto3.getLamp_bed()){
                    swLampBed3.setChecked(true);
                }else{
                    swLampBed3.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swArBed3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto3/ar_bed");
                }else{
                    desligar("quarto3/ar_bed");
                }
            }
        });

        swLampBed3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("quarto3/lamp_bed");
                }else{
                    desligar("quarto3/lamp_bed");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIONADA AO CORREDOR

        swLampBathCor = findViewById(R.id.sw_lamp_bath_cor);
        swLampCor = findViewById(R.id.sw_lamp_cor);

        // referência do corredor
        final DatabaseReference myRefCorredor = database.getReference("casa/").child("corredor/");

        myRefCorredor.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Corredor corredor = dataSnapshot.getValue(Corredor.class);

                if(corredor.getLamp_bath()){
                    swLampBathCor.setChecked(true);
                }else{
                    swLampBathCor.setChecked(false);
                }

                if(corredor.getLamp_cor()){
                    swLampCor.setChecked(true);
                }else{
                    swLampCor.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swLampBathCor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("corredor/lamp_bath");
                }else{
                    desligar("corredor/lamp_bath");
                }
            }
        });

        swLampCor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("corredor/lamp_cor");
                }else{
                    desligar("corredor/lamp_cor");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIOINADA A COZINHA E LAVANDERIA

        swLampKit = findViewById(R.id.sw_lamp_kit);
        swLampLaundry = findViewById(R.id.sw_lamp_laundry);

        // referência da cozinha e lavanderia
        final DatabaseReference myRefCozinha = database.getReference("casa/").child("cozinha/");

        myRefCozinha.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Cozinha cozinha = dataSnapshot.getValue(Cozinha.class);

                if(cozinha.getLamp_kit()){
                    swLampKit.setChecked(true);
                }else{
                    swLampKit.setChecked(false);
                }

                if(cozinha.getLamp_laundry()){
                    swLampLaundry.setChecked(true);
                }else{
                    swLampLaundry.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swLampKit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("cozinha/lamp_kit");
                }else{
                    desligar("cozinha/lamp_kit");
                }
            }
        });

        swLampLaundry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("cozinha/lamp_laundry");
                }else{
                    desligar("cozinha/lamp_laundry");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIOINADA A GARAGEM

        swGateGarage = findViewById(R.id.sw_gate_garage);
        swLampGarage = findViewById(R.id.sw_lamp_garage);

        // referência da garagem
        final DatabaseReference myRefGaragem = database.getReference("casa/").child("garagem/");

        myRefGaragem.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Garagem garagem = dataSnapshot.getValue(Garagem.class);

                if(garagem.getGate_garage()){
                    swGateGarage.setChecked(true);
                }else{
                    swGateGarage.setChecked(false);
                }

                if(garagem.getLamp_garage()){
                    swLampGarage.setChecked(true);
                }else{
                    swLampGarage.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swGateGarage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("garagem/gate_garage");
                }else{
                    desligar("garagem/gate_garage");
                }
            }
        });

        swLampGarage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("garagem/lamp_garage");
                }else{
                    desligar("garagem/lamp_garage");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIOINADA AO LIVING

        swLampDining = findViewById(R.id.sw_lamp_dining);
        swLampHall = findViewById(R.id.sw_lamp_hall);
        swLampLiving = findViewById(R.id.sw_lamp_living);

        // referência do living
        final DatabaseReference myRefLiving = database.getReference("casa/").child("living/");

        myRefLiving.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Living living = dataSnapshot.getValue(Living.class);

                if(living.getLamp_dining()){
                    swLampDining.setChecked(true);
                }else{
                    swLampDining.setChecked(false);
                }

                if(living.getLamp_hall()){
                    swLampHall.setChecked(true);
                }else{
                    swLampHall.setChecked(false);
                }

                if(living.getLamp_living()){
                    swLampLiving.setChecked(true);
                }else{
                    swLampLiving.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swLampDining.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("living/lamp_dining");
                }else{
                    desligar("living/lamp_dining");
                }
            }
        });

        swLampHall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("living/lamp_hall");
                }else{
                    desligar("living/lamp_hall");
                }
            }
        });

        swLampLiving.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("living/lamp_living");
                }else{
                    desligar("living/lamp_living");
                }
            }
        });

        // ------------------------------------------------------------------------------------------------------
        // CODIFICAÇÃO RELACIOINADA A VARANDA

        swLampBalcHall = findViewById(R.id.sw_lamp_balc_hall);
        swLampBalcLiv = findViewById(R.id.sw_lamp_balc_liv);
        swLampBalcLaundry = findViewById(R.id.sw_lamp_balc_laundry);

        // referência da varanda
        final DatabaseReference myRefVaranda = database.getReference("casa/").child("varanda/");

        myRefVaranda.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Varanda varanda = dataSnapshot.getValue(Varanda.class);

                if(varanda.getLamp_balc_hall()){
                    swLampBalcHall.setChecked(true);
                }else{
                    swLampBalcHall.setChecked(false);
                }

                if(varanda.getLamp_balc_liv()){
                    swLampBalcLiv.setChecked(true);
                }else{
                    swLampBalcHall.setChecked(false);
                }

                if(varanda.getLamp_balc_laundry()){
                    swLampBalcLaundry.setChecked(true);
                }else{
                    swLampBalcLaundry.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Erro ao ler os valores.", error.toException());
            }
        });

        swLampBalcHall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("varanda/lamp_balc_hall");
                }else{
                    desligar("varanda/lamp_balc_hall");
                }
            }
        });

        swLampBalcLiv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("varanda/lamp_balc_liv");
                }else{
                    desligar("varanda/lamp_balc_liv");
                }
            }
        });

        swLampBalcLaundry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ligar("varanda/lamp_balc_laundry");
                }else{
                    desligar("varanda/lamp_balc_laundry");
                }
            }
        });
    }

    public void ligar(String local){
        myRef.child(local).setValue(true);
        Toast.makeText(MainActivity.this, ambiente(local).concat(" ligado(a)."), Toast.LENGTH_SHORT).show();
    }

    public void desligar(String local){
        myRef.child(local).setValue(false);
        Toast.makeText(MainActivity.this, ambiente(local).concat(" desligado(a)."), Toast.LENGTH_SHORT).show();
    }

    public String ambiente(String nome){
        switch (nome){
            case "quarto1(suite)/ar_bed":
                return "Ar Condicionado Quarto 1";
            case "quarto1(suite)/lamp_bed":
                return "Lâmpada Quarto 1";
            case "quarto1(suite)/lamp_closet":
                return "Lâmpada Closet Quarto 1";
            case "quarto1(suite)/lamp_wc":
                return "Lâmpada Banheiro Quarto 1";
            case "quarto2/ar_bed":
                return "Ar Condicionado Quarto 2";
            case "quarto2/lamp_bed":
                return "Lâmpada do Quarto 2";
            case "quarto3/ar_bed":
                return "Ar Condicionado Quarto 3";
            case "quarto3/lamp_bed":
                return "Lâmpada do Quarto 3";
            case "corredor/lamp_bath":
                return "Lâmpada do Banheiro do Corredor";
            case "corredor/lamp_cor":
                return "Lâmpada do Corredor";
            case "cozinha/lamp_kit":
                return "Lâmpada da Cozinha";
            case "cozinha/lamp_laundry":
                return "Lâmpada da Lavanderia";
            case "garagem/gate_garage":
                return "Portão da Garagem";
            case "garagem/lamp_garage":
                return "Lâmpada da Garagem";
            case "living/lamp_dining":
                return "Lâmpada da Sala de Jantar";
            case "living/lamp_hall":
                return "Lâmpada do Hall de Entrada";
            case "living/lamp_living":
                return "Lâmpada da Sala de Estar";
            case "varanda/lamp_balc_hall":
                return "Lâmpada da Entrada da Casa";
            case "varanda/lamp_balc_liv":
                return "Lâmpada da Janela da Sala de Estar";
            case "varanda/lamp_balc_laundry":
                return "Lâmpada da Saída da Lavanderia";
        }

        return " ";
    }
}

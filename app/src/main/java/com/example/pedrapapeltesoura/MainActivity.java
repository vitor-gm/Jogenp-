package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String escolhaDoAdversario(){

        String[] opcoes = new String[]{"pedra", "papel", "tesoura"};
        
        int numeroAleatorio = new Random().nextInt(3);
        String adversario = opcoes[numeroAleatorio];
        ImageView imagemAdversario = findViewById(R.id.imageView);

        switch (adversario){
            case "pedra":
                imagemAdversario.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemAdversario.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemAdversario.setImageResource(R.drawable.tesoura);
                break;
        }
        return adversario;
    }
    public void Pedra(View view){
        verificarGanhador("pedra");
    }
    public void Papel(View view){
        verificarGanhador("papel");
    }
    public void Tesoura(View view){
        verificarGanhador("tesoura");
    }
    public void verificarGanhador(String escolhaDoUsuario){
        String escolhaApp = escolhaDoAdversario();

        if((escolhaDoUsuario == "pedra" && escolhaApp == "tesoura" ) || (escolhaDoUsuario == "papel" && escolhaApp == "pedra") || (escolhaDoUsuario == "tesoura" && escolhaApp == "papel")){
            TextView venceu = findViewById(R.id.resultado);
            venceu.setText("Você venceu :) ");

        }else if((escolhaDoUsuario == "tesoura" && escolhaApp == "pedra" ) || (escolhaDoUsuario == "pedra" && escolhaApp == "papel") || (escolhaDoUsuario == "papel" && escolhaApp == "tesoura")){
            TextView venceu = findViewById(R.id.resultado);
            venceu.setText("Você perdeu :( ");

        }else{
            TextView venceu = findViewById(R.id.resultado);
            venceu.setText("Empate ! ");
        }

    }

}






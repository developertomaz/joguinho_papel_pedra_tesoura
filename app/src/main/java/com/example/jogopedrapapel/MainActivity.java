package com.example.jogopedrapapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        verificarGanhador("pedra");

    }


    public void selecionarPapel(View view) {
        verificarGanhador("papel");
    }

    public void selecionarTesoura(View view) {
        verificarGanhador("tesoura");
    }
    /*//----------------------------------------------------------------------

    private String verquemganhou() {

        String[] opcoes={"pedra","papel","tesoura"};
        int numeroAleatorio = new Random().nextInt(3);

        String escolhaApp = opcoes[numeroAleatorio];

        ImageView imgSelecao = findViewById(R.id.img_selecao);

        switch (escolhaApp){

            case "pedra":
                imgSelecao.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imgSelecao.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imgSelecao.setImageResource(R.drawable.tesoura);
                break;
        }


        return escolhaApp;
    }



    private void verificarGanhador(String nomes){

        String escolhaApp = verquemganhou();
    }
*/


    private String gerarEscolhaAleatoriaApp() {

        String[] opcoes = {"pedra", "papel", "tesoura"}; //array
        int numeroAleatorio = new Random().nextInt(3); //Aqui eu instancio e ja gerro numeroAleatório


        String escolhaApp = opcoes[numeroAleatorio];
        ImageView imgSelecao = findViewById(R.id.img_selecao);

        switch (escolhaApp) {
            case "pedra":
                imgSelecao.setImageResource(R.drawable.pedra);

                break;

            case "papel":
                imgSelecao.setImageResource(R.drawable.papel);

                break;

            case "tesoura":
                imgSelecao.setImageResource(R.drawable.tesoura);

                break;
        }

        return escolhaApp;

    }

    private void verificarGanhador(String escolhaUsuario) {

        String escolhaApp = gerarEscolhaAleatoriaApp();

        TextView textResul = findViewById(R.id.text_result);

            if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel")
        ) {
                   textResul.setText("Voçê perdeu :(");
    } else if (
                ( escolhaUsuario == "pedra"&& escolhaApp == "tesoura") ||
                (escolhaUsuario == "papel"&& escolhaApp == "pedra") ||
                (escolhaUsuario == "tesoura"&& escolhaApp == "papel")
            ) {
                 textResul.setText("Voçê ganhou :)");
        } else {
                textResul.setText("Voçê empatou ;)");
        }

    }


}
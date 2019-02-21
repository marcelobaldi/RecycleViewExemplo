package br.com.listrecyclerview01.view;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import br.com.listrecyclerview01.R;
import br.com.listrecyclerview01.adapter.ListaAdapter;
import br.com.listrecyclerview01.model.Cliente;

public class Lista extends AppCompatActivity {
    //Classe Dados
    private Cliente                 cliente;
    private ListaAdapter            listaAdapter;

    //Lista Objetos
    private RecyclerView            listaObjeto;
    private LinearLayoutManager     listaLayout  = new LinearLayoutManager(this);
    private ArrayList<Cliente>      listaValores = new ArrayList<Cliente>( );

    //Método - Inicial
    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);setContentView(R.layout.lista);

        listaAdapter = new ListaAdapter(this);

        //Lista - Montar
        listaObjeto = (RecyclerView) findViewById( R.id.listaXml );
        listaObjeto.setLayoutManager( listaLayout );

        //Lista - Valores
        cliente = new Cliente();
        cliente.setCod( 1 );
        cliente.setNome( "Marcelo" );

        //Lista - Adicionar
        listaValores.add( cliente );

        listaAdapter = new ListaAdapter(listaValores);



        //Passar Contexto e Carregar o RecyclerView Com o Construtor
   //     listaAdapter = new ListaAdapter(this, listaValores);
        listaObjeto.setAdapter(listaAdapter);
    }
}

//Dúvidas
//Não Consigo Fazer o Context com seu construtor e o Array List com seu construtor.         2 Construtores;
//Não Consigo Fazer o Constex com construtor vazio e o Array List com o seu construtor.     2 Construtores;
//Não consigo fazer sem os construtores (o contexto sim, mas o array não.                    Sem Construtor;

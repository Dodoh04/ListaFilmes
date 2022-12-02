package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;
    //criar base de dados para os filmes
    String titulo[] = {"O Apocalipse","Desejos Ocultos", "2067", "Incriminada", "O rei da Montanha", "Os escolhidos"};
    String desc [] = {"Objetos não identificados estão a caminho de se chocar contra a Terra.","Neste suspense futurista, um casal, Sophie e James compram um robô ultra realista para cuidar de sua nova casa.","A jornada de um homem para o futuro para salvar um mundo moribundo.",
    "Annie decide usar o carro do marido durante uma viagem repentina que ele fez trabalho. Ao ser parada pela polícia.", "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
    "Lacey e Daniel descobrem que sua família é alvo de uma força mortal inimaginável e aterrorizante. Ambos terão que fazer tudo o que estiver ao seu alcance para resolver esse mistério sombrio e salvar suas vidas."};
    String acesso [] = {"4.5","3.3","4.9","5.9", "2.4", "3.9"};
    int filmes [] = {R.drawable.apocalipse,R.drawable.desejosocultod, R.drawable.num, R.drawable.icriminada, R.drawable.oreidamontanha, R.drawable.osescolhidos};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistaFilmes);

        MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(adapter);
    }
    //criando um inner class MyAdapter

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //variaveis do modelo
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //adaptador ligando ao modelo

            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            //Apresentar as Variaveis do java para o modelo xml3

            imagemFilme = v.findViewById(R.id.imgFilme);
            tituloFilme = v.findViewById(R.id.tituloFilme);
            descricaoFilme = v.findViewById(R.id.descFilme);
            acessoFilme = v.findViewById(R.id.acesso);


            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(desc[i]);
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);

            return v;
        }
    }
}
package com.titanz.titanztech.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.titanz.titanztech.R;
import com.titanz.titanztech.adapters.ServicosAdapter;
import com.titanz.titanztech.interfaces.ServicosListener;
import com.titanz.titanztech.models.Produtos;
import java.util.ArrayList;



public class FragmentProdutos extends Fragment implements ServicosListener {

    private RecyclerView recyclerViewServicos;
    private ServicosAdapter servicosAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.servicos_fragment,container,false);

        ArrayList<Produtos> produtosArrayList = new ArrayList<>();

        Produtos produtos1 = new Produtos();
        produtos1.setNome("Jack Daniel's");
        produtos1.setImagem("https://i.ibb.co/G07Nmx8/jackdaniels-logo.png");
        produtos1.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos1.setDescricao("Os whiskeys da família Jack Daniel`s diferenciam-se pelo cuidadoso processo de elaboração. O envelhecimento em Barris de Carvalho novos, aliado ao clima muito especial do Tennessee, lhe confere um sabor suave e marcante. Permanecendo fiel a esta receita, as pessoas podem desfrutar do mesmo whiskey que ganhou sete medalhas de ouro internacionais, quando em 1904 foi homenageado como sendo \"o melhor whiskey do mundo");
        produtos1.setId("1 L");
        produtos1.setValor("R$ 105,00");
        produtosArrayList.add(produtos1);

        Produtos produtos2 = new Produtos();
        produtos2.setNome("Red Label");
        produtos2.setImagem("https://i.ibb.co/bHP2B0t/redlabel-logo.png");
        produtos2.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos2.setDescricao("É um “Blend Scotch Whisky” rico e incorporado. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade. Com aroma doce amadeirado, cravo-da-índia, doce de manteiga e sabor rico com mel. A marca Johnnie Walker existe desde 1920 e hoje é o whisky escocês mais vendido no mundo.");
        produtos2.setId("1 L");
        produtos2.setValor("R$ 70,00");
        produtosArrayList.add(produtos2);

        Produtos produtos3 = new Produtos();
        produtos3.setNome("Ballantine's");
        produtos3.setImagem("https://i.ibb.co/z49BV23/ballantines-logo.png");
        produtos3.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos3.setDescricao("Com sabor único e marcante, é elaborado a partir de uma especial seleção de mais de 50 diferentes tipos de maltes. A presença marcante dos maltes Miltonduff e Glenburgie, das regiões escocesas de Speyside e Highlands, respectivamente, proporcionam ao uísque notas de chocolate, maçã e baunilha ao sabor.");
        produtos3.setId("1 L");
        produtos3.setValor("R$ 65,00");
        produtosArrayList.add(produtos3);

        Produtos produtos4 = new Produtos();
        produtos4.setNome("White Horse");
        produtos4.setImagem("https://i.ibb.co/Y8Yfy0T/whitehorse-logo.png");
        produtos4.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos4.setDescricao("É composto por mais de 35 maltes, uma das mais elevadas proporções de maltes nos scotch whiskies. Assim como Logan, também desenvolvido por Peter Mackie, seus principais maltes são Lagavulim, Glen Elgin e Craigellachie. White Horse foi um dos primeiros scoth a serem introduzidos no Brasil, e traz até hoje o mesmo sabor rico e único, e a mesma qualidade, aqui e no mundo inteiro.");
        produtos4.setId("1 L");
        produtos4.setValor("R$ 65,00");
        produtosArrayList.add(produtos4);

        Produtos produtos5 = new Produtos();
        produtos5.setNome("Smirnoff");
        produtos5.setImagem("https://i.ibb.co/WsfGChZ/smirnoff-logo.png");
        produtos5.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos5.setDescricao("Bebida composta de álcool de cereais tri destilada e dez vezes filtrada. Líder da categoria de vodka Premium no Brasil e no mundo, seu lançamento no Brasil foi em 1974, estando hoje em 150 países aproximadamente.");
        produtos5.setId("998ml");
        produtos5.setValor("R$ 35,00");
        produtosArrayList.add(produtos5);

        Produtos produtos6 = new Produtos();
        produtos6.setNome("Red Bull");
        produtos6.setImagem("https://i.ibb.co/T2Fhx1P/redbull-logo.png");
        produtos6.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos6.setDescricao("Red Bull Energy Drink foi desenvolvido especialmente para momentos de atividade intensa ou quando precisar de energia. Graças a uma combinação única de ingredientes Red Bull Energy Drink vitaliza corpo e mente.");
        produtos6.setId("250ml");
        produtos6.setValor("R$ 7,00");
        produtosArrayList.add(produtos6);

        Produtos produtos7 = new Produtos();
        produtos7.setNome("Água Bonafont");
        produtos7.setImagem("https://i.ibb.co/vhHPgvH/bonafont-logo.png");
        produtos7.setDescricao("Tradicional, a Bonafont 500ml é aquela que todo mundo carrega na mão. Ótima pedida para levar com você e não esquecer de se hidratar. São só 4 garrafinhas por dia!");
        produtos7.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos7.setId("500ml");
        produtos7.setValor("R$ 3,00");
        produtosArrayList.add(produtos7);

        Produtos produtos8 = new Produtos();
        produtos8.setNome("Energético Vibe");
        produtos8.setImagem("https://i.ibb.co/CKwR9KF/vibe-logo.png");
        produtos8.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos8.setDescricao("Bebida pronta à base de taurina e cafeína. O tamanho que você procura para grandes festas ou eventos, onde não pode faltar energia, disposição");
        produtos8.setId("2 L");
        produtos8.setValor("R$ 10,00");
        produtosArrayList.add(produtos8);

        Produtos produtos9 = new Produtos();
        produtos9.setNome("Gelo de Côco");
        produtos9.setDescricao("Aquele Gelo de Côco( ou Maracujá ), para acompanhar uma das nossas ofertas de Blends Scotch Originais, e ter uma maravilhosa manhã sem dor de cabeça.");
        produtos9.setImagem("https://i.ibb.co/LND8LMv/gelo-de-coco-logo.png");
        produtos9.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos9.setId("4un");
        produtos9.setValor("R$ 10,00");
        produtosArrayList.add(produtos9);


        recyclerViewServicos = view.findViewById(R.id.servicos_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        servicosAdapter = new ServicosAdapter(produtosArrayList,this);

        recyclerViewServicos.setAdapter(servicosAdapter);
        recyclerViewServicos.setLayoutManager(layoutManager);

        return view;
    }

    public void onServicoClicado(Produtos servico) {

        Intent intent = new Intent(getContext(), DetalhesServicosActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("SERVICOS", servico);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
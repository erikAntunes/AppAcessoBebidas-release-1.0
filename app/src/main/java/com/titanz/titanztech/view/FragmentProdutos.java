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
        produtos1.setId("1L");
        produtos1.setValor("R$ 110,00");
        produtosArrayList.add(produtos1);

        Produtos produtos2 = new Produtos();
        produtos2.setNome("Jack Honey");
        produtos2.setDescricao("O famoso Jack Daniel's misturado com mel. É uma combinação sedutora, com um belo equilíbrio da suavidade do Jack Daniel´s levemente temperada com mel. Mas o mais importante: não é muito doce, como algumas outras combinações de whisky e mel tendem a ser. ");
        produtos2.setImagem("https://i.ibb.co/cQnfjwm/jackdaniels-Mel-logo.png");
        produtos2.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos2.setId("1L");
        produtos2.setValor("R$ 120,00");
        produtosArrayList.add(produtos2);

        Produtos produtos3 = new Produtos();
        produtos3.setNome("Jack Fire");
        produtos3.setDescricao("Diretamente do Tennessee e produzido com base no clássico e inconfundível No. 7, este Jack Daniels Fire destaca-se pela mistura natural de licor de canela picante com o clássico whiskey Americano Jack Daniels.");
        produtos3.setImagem("https://i.ibb.co/3CBHgkL/jackdaniels-Fire-logo.png");
        produtos3.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos3.setId("1L");
        produtos3.setValor("R$ 120,00");
        produtosArrayList.add(produtos3);

        Produtos produtos4 = new Produtos();
        produtos4.setNome("Red Label");
        produtos4.setImagem("https://i.ibb.co/bHP2B0t/redlabel-logo.png");
        produtos4.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos4.setDescricao("É um “Blend Scotch Whisky” rico e incorporado. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade. Com aroma doce amadeirado, cravo-da-índia, doce de manteiga e sabor rico com mel. A marca Johnnie Walker existe desde 1920 e hoje é o whisky escocês mais vendido no mundo.");
        produtos4.setId("1 L");
        produtos4.setValor("R$ 70,00");
        produtosArrayList.add(produtos4);

        Produtos produtos5 = new Produtos();
        produtos5.setNome("Ballantine's");
        produtos5.setImagem("https://i.ibb.co/z49BV23/ballantines-logo.png");
        produtos5.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos5.setDescricao("Com sabor único e marcante, é elaborado a partir de uma especial seleção de mais de 50 diferentes tipos de maltes. A presença marcante dos maltes Miltonduff e Glenburgie, das regiões escocesas de Speyside e Highlands, respectivamente, proporcionam ao uísque notas de chocolate, maçã e baunilha ao sabor.");
        produtos5.setId("1 L");
        produtos5.setValor("R$ 65,00");
        produtosArrayList.add(produtos5);

        Produtos produtos6 = new Produtos();
        produtos6.setNome("White Horse");
        produtos6.setImagem("https://i.ibb.co/Y8Yfy0T/whitehorse-logo.png");
        produtos6.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos6.setDescricao("É composto por mais de 35 maltes, uma das mais elevadas proporções de maltes nos scotch whiskies. Assim como Logan, também desenvolvido por Peter Mackie, seus principais maltes são Lagavulim, Glen Elgin e Craigellachie. White Horse foi um dos primeiros scoth a serem introduzidos no Brasil, e traz até hoje o mesmo sabor rico e único, e a mesma qualidade, aqui e no mundo inteiro.");
        produtos6.setId("1 L");
        produtos6.setValor("R$ 65,00");
        produtosArrayList.add(produtos6);

        Produtos produtos7 = new Produtos();
        produtos7.setNome("Bombay Sapphire");
        produtos7.setDescricao("A principal marca registrada do Bombay Sapphire Dry London, o segundo gin mais consumido ao redor do mundo");
        produtos7.setImagem("https://i.ibb.co/f2S7PH1/bombay-saphire-logo.png");
        produtos7.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos7.setId("750ml");
        produtos7.setValor("R$ 90,00");
        produtosArrayList.add(produtos7);

        Produtos produtos8 = new Produtos();
        produtos8.setNome("Beefeater Dry");
        produtos8.setDescricao("Traga uma nova experiência de bebida para sua festa ou eventos com família e amigos. Promova novas sensações ao oferecer o Gin Beefeater Dry");
        produtos8.setImagem("https://i.ibb.co/QPzzSSR/beefeater-logo.png");
        produtos8.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos8.setId("750ml");
        produtos8.setValor("R$ 90,00");
        produtosArrayList.add(produtos8);

        Produtos produtos9 = new Produtos();
        produtos9.setNome("Tanqueray Export");
        produtos9.setDescricao("Gin Tanqueray London Dry Export Strength inspirado na mesma receita desde 1830, Tanqueray London Dry é o gin mais premiado na categoria.");
        produtos9.setImagem("https://i.ibb.co/tZ3j8hz/tanqueray-logo.png");
        produtos9.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos9.setId("750ml");
        produtos9.setValor("R$ 90,00");
        produtosArrayList.add(produtos9);

        Produtos produtos10 = new Produtos();
        produtos10.setNome("Smirnoff");
        produtos10.setImagem("https://i.ibb.co/WsfGChZ/smirnoff-logo.png");
        produtos10.setClassificacao("https://i.ibb.co/LrzVM0Q/proibido-menores18-logo.png");
        produtos10.setDescricao("Bebida composta de álcool de cereais tri destilada e dez vezes filtrada. Líder da categoria de vodka Premium no Brasil e no mundo, seu lançamento no Brasil foi em 1974, estando hoje em 150 países aproximadamente.");
        produtos10.setId("998ml");
        produtos10.setValor("R$ 35,00");
        produtosArrayList.add(produtos10);

        Produtos produtos11 = new Produtos();
        produtos11.setNome("Red Bull");
        produtos11.setImagem("https://i.ibb.co/T2Fhx1P/redbull-logo.png");
        produtos11.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos11.setDescricao("Red Bull Energy Drink foi desenvolvido especialmente para momentos de atividade intensa ou quando precisar de energia. Graças a uma combinação única de ingredientes Red Bull Energy Drink vitaliza corpo e mente.");
        produtos11.setId("250ml");
        produtos11.setValor("R$ 8,00");
        produtosArrayList.add(produtos11);

        Produtos produtos12 = new Produtos();
        produtos12.setNome("Água Mineral");
        produtos12.setImagem("https://i.ibb.co/vhHPgvH/bonafont-logo.png");
        produtos12.setDescricao("Ótima pedida para levar com você e não esquecer de se hidratar. São só 4 garrafinhas por dia!");
        produtos12.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos12.setId("510ml");
        produtos12.setValor("R$ 3,00");
        produtosArrayList.add(produtos12);

        Produtos produtos13 = new Produtos();
        produtos13.setNome("Energético Vibe");
        produtos13.setImagem("https://i.ibb.co/CKwR9KF/vibe-logo.png");
        produtos13.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos13.setDescricao("Bebida pronta à base de taurina e cafeína. O tamanho que você procura para grandes festas ou eventos, onde não pode faltar energia, disposição");
        produtos13.setId("2L");
        produtos13.setValor("R$ 10,00");
        produtosArrayList.add(produtos13);

        Produtos produtos14 = new Produtos();
        produtos14.setNome("Gelo de Coco");
        produtos14.setDescricao("Aquele Gelo de Coco( ou Maracujá ), para acompanhar uma das nossas ofertas de Blends Scotch Originais, e ter uma maravilhosa manhã sem dor de cabeça.");
        produtos14.setImagem("https://i.ibb.co/LND8LMv/gelo-de-coco-logo.png");
        produtos14.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos14.setId("4un");
        produtos14.setValor("R$ 10,00");
        produtosArrayList.add(produtos14);

        Produtos produtos15 = new Produtos();
        produtos15.setNome("Água de Coco");
        produtos15.setDescricao("Água de coco verde para hidratação naturalmente. É rica em vitaminas, sais mineiras e não possui gorduras nem colesterol. Ideal para você levar para onde quiser e tomar a qualquer hora do dia.");
        produtos15.setImagem("https://i.ibb.co/3r4TYq9/040ef10d-654b-4ef6-9cbb-6c3ff3ffc5b7.jpg");
        produtos15.setClassificacao("https://i.ibb.co/GFSJdjD/classificacao-livre-logo.png");
        produtos15.setId("1L");
        produtos15.setValor("R$ 10,00");
        produtosArrayList.add(produtos15);

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
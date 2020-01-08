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
import com.titanz.titanztech.adapters.PromocoesAdapter;
import com.titanz.titanztech.interfaces.PromocoesListener;
import com.titanz.titanztech.models.Combos;
import java.util.ArrayList;


public class FragmentCombos extends Fragment implements PromocoesListener {

    private RecyclerView recyclerViewPromocoes;
    private PromocoesAdapter promocoesAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.promocoes_fragment,container,false);

        ArrayList<Combos> combosArrayList = new ArrayList<>();

        Combos combos1 = new Combos();
        combos1.setNome("Jack Daniel's + Red Bull + Gelo de Cocô");
        combos1.setImagem("https://i.ibb.co/thJKZdL/jackdaniels-combo-logo.png");
        combos1.setDescricao("Jack Daniel's. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos1.setValor("R$ 150,00");
        combos1.setEnergetico("+ 4un - Red Bull 250ml");
        combos1.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos1);

        Combos combos2 = new Combos();
        combos2.setNome("Red Label + Red Bull + Gelo de Cocô");
        combos2.setImagem("https://i.ibb.co/tYyVt5W/redlabelredbull-combo-logo.png");
        combos2.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos2.setValor("R$ 120,00");
        combos2.setEnergetico("+ 4un - Red Bull 250ml");
        combos2.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos2);

        Combos combos3 = new Combos();
        combos3.setNome("Red Label + Vibe + Gelo de Cocô");
        combos3.setImagem("https://i.ibb.co/dm1K8NP/redlabelvibe-combo-logo.png");
        combos3.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos3.setEnergetico("+ Energético Vibe 2 L");
        combos3.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos3.setValor("R$ 90,00");
        combosArrayList.add(combos3);

        Combos combos4 = new Combos();
        combos4.setNome("White Horse + Red Bull + Gelo de Cocô");
        combos4.setImagem("https://i.ibb.co/Vj3SG0r/whitehorseredbull-combo-logo.png");
        combos4.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos4.setEnergetico("+ 4un - Red Bull 250ml");
        combos4.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos4.setValor("R$ 100,00");

        combosArrayList.add(combos4);

        Combos combos5 = new Combos();
        combos5.setNome("White Horse + Vibe + Gelo de Cocô");
        combos5.setImagem("https://i.ibb.co/ftpQ3Mk/whitehorsevibe-combo-logo.png");
        combos5.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos5.setEnergetico("+ Energético Vibe 2 L");
        combos5.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos5.setValor("R$ 82,00");
        combosArrayList.add(combos5);

        Combos combos6 = new Combos();
        combos6.setNome("Smirnoff + Red Bull + Gelo de Cocô");
        combos6.setImagem("https://i.ibb.co/QFrSgvf/smirnoffredbull-combo-logo.png");
        combos6.setDescricao("Smirnoff. \n  Graduação alcoólica: 37,5% \n Volume: 998 ml (vidro).");
        combos6.setEnergetico("+ 4un - Red Bull 250ml");
        combos6.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos6.setValor("R$ 80,00");
        combosArrayList.add(combos6);

        Combos combos7 = new Combos();
        combos7.setNome("Smirnoff + Vibe + Gelo de Cocô");
        combos7.setImagem("https://i.ibb.co/tDGcns4/smirnoffvibe-combo-logo.png");
        combos7.setDescricao("Smirnoff. \n  Graduação alcoólica: 37,5% \n Volume: 998 ml (vidro).");
        combos7.setEnergetico("+ Energético Vibe 2 L");
        combos7.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos7.setValor("R$ 50,00");
        combosArrayList.add(combos7);


        recyclerViewPromocoes = view.findViewById(R.id.promocoes_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        promocoesAdapter = new PromocoesAdapter(combosArrayList,this);

        recyclerViewPromocoes.setAdapter(promocoesAdapter);
        recyclerViewPromocoes.setLayoutManager(layoutManager);
        return view;
    }

    public void onPromocaoClicada (Combos promocao){

        Intent intent = new Intent(getContext(), DetalhesPromocoesActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("PROMOCOES", promocao);

        intent.putExtras(bundle);

        startActivity(intent);

    }
}

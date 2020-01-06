package com.titanz.titanztech.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.titanztech.R;
import com.titanz.titanztech.interfaces.PromocoesListener;
import com.titanz.titanztech.models.Combos;

import java.util.List;

public class PromocoesAdapter extends RecyclerView.Adapter<PromocoesAdapter.DetalhePromocoesViewHolder> {



    private List<Combos> listaPromocoes;

    private PromocoesListener promocoesListener;

    public PromocoesAdapter(List<Combos> listaPromocoes, PromocoesListener promocoesListener){

        this.promocoesListener = promocoesListener;
        this.listaPromocoes = listaPromocoes;
    }



    @NonNull
    @Override
    public DetalhePromocoesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_promocoes,viewGroup,false);

        DetalhePromocoesViewHolder detalhePromocoesViewHolder = new DetalhePromocoesViewHolder(view);

        return  detalhePromocoesViewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull DetalhePromocoesViewHolder detalhePromocoesViewHolder, final int i) {
        final Combos combos = listaPromocoes.get(i);

        detalhePromocoesViewHolder.setupPromocoes(combos);

        detalhePromocoesViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                promocoesListener.onPromocaoClicada(listaPromocoes.get(i));

            }
        });

    }

    @Override
    public int getItemCount() {
        return listaPromocoes.size();
    }

    class DetalhePromocoesViewHolder extends RecyclerView.ViewHolder {

        private TextView texNomePromocoesView;

        private TextView textValorPromocoesView;



        public DetalhePromocoesViewHolder(@NonNull View itemView) {
            super(itemView);

            texNomePromocoesView = itemView.findViewById(R.id.textPromocoesNomeView_id);
            textValorPromocoesView = itemView.findViewById(R.id.textValorPromocoesView_id);


        }

        public void setupPromocoes(Combos combos){

            textValorPromocoesView.setText(combos.getValor());
            texNomePromocoesView.setText(combos.getNome());

        }

    }

}

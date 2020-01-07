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
        combos1.setImagem("https://lh3.googleusercontent.com/juJbKDXGoATNAavlLhVNmiWCGh4PdqXBzR30Uz1XqXtPyq46QwoXwEuQojLmMTnVryTrYJWQnB15nWoCbsfadaJVaJKbouwf9m_IoFGPpxo7iFmDWawhTXGYza5urJkuihp6GPlI8g9qjb6311AlzX-xy4YHWkWMSn9Rvc15n7sB2qSdfWhgcQ6JXYQII1x_GSvi9ngWBYM_G0aQlvvJzRkDmKT6pQ9UfwX7JtydZ8MiU7SeDcPAIxOyqUFOMjKmI75smbVRU_aH0XOCKh9Y_l3OJoWmtZb5xIUW1tqLKu5Vpech8RV3RRGpfWBPEIthjxMGWGuLZFiZu9pdzY27xQO1AqEYyvqqkHmMvyQVEyvoQlNHv1LgUWBk0Lfw0CvmIzh3gbpVUIh5-d6N8NtEoMwfGV1a6eM8wPi6sFC6qjnlQhmzFOaisY5gQ-DkXj-Bq7xSKs0NyBqgfuMJmFTuzjgJuzRHjimRDTcK6_XvSiTItgE2TwlBt78apB1UWAjbeYd1xvDiSbf7lhZo-KbukycSYt1Zl365d4kaEF7Y_3E33ydyyuh0DlMTIRsk38Pnddp0JOO_BFt9c9--dshPAlQpUuxHnpMs10dVJVnh6mDqDfB7p0kumeO0YpieY9EDqGYxRY9iP9Lzku-RAwuoQqDrTQTUViRI0YbLinqPFWRCzTT3mBWBAZR9d8JXJ2RgrSRwHTKHEUJdiFeDuE8kHal4e--bwPirl6WprRwHmCw-lbmx=s800-no");
        combos1.setDescricao("Por um preço acessível, nós da Titanz Tech desenvolvemos um aplicativo comercial para vendas digitais, com um Design único seguindo os padrões da Marca do comerciante, contendo um catalogo descritivo de seus produtos e promoções, facilitando a vida do cliente, que pode fazer pedidos de maneira prática, pois Linkamos o Aplicativo diretamente ao Whatsapp do comerciante. Após o desenvolvimento do aplicativo, a Titanz Tech irá publica-lo na Google Play Store, e ele ficará disponível para todo o Mundo.");
        combos1.setValor("R$ 150,00");
        combosArrayList.add(combos1);

        Combos combos2 = new Combos();
        combos2.setNome("Red Label + Red Bull + Gelo de Cocô");
        combos2.setImagem("https://lh3.googleusercontent.com/DItwQWqkiYFPoPGtDrTR9SEQSf84U1G3DkhQlwXGKwZYMBMtTr_xSHr1SuqV12dIp5GYVgXFuSha8ZrWtZsmzXJsKs2ojJNJP0pIzi5KjpWMzi0dYHU_gTAPwzY1FkvaKCWCEi-EyDxnwtT4JtYnQUO9DSFrsrrAtzT3Kl_uSjmp8ChB-svt76eXnhedi4bD6LtXPEzpLpI1m8jQK1SmjIJ1pi9QghqEQb10ALM38UPIq_CGB5SxH2MDLlas7YgFHNP9xOaEL_iiEOXme5b6dr7eofs8WMq2LL2UVEku4groJ3cygM5N6M8OUSCa4gr0Z9eoTQAY-qRmAza66MrY_CreCT0pj0SibmqEQ_t8V85ylwvpdMlFCpO98GkavK3k90_de2FBsr4MpTFsXeuIbvZDk5hedeep3OVXyCjkPlLWpMVMRrjoZeNZ9uRWxF-pDg4v_H_MPSq1u9vekA3fJTUJh1-s7OO3PMN54vZr9qx7MAd6Km8YBPO2RDqmPk83JMfzVVeZ3yofR6AKbbGHeB6Fq4PEyfF1xl8u7MxpYeWQ1jSD_8pC6rNIwikCRBr1r_H9nUzZ3kh7R83S8jKrl_xtCFtZHXzEhmkuuAWjRnFzCc1q0KmpmM4zu5OvjiEsNhYMEfTXpov1bwIQT_UuSFJe6IyYcKRS1uILkKB11QDT2zuqWZKlUz-OOHMQFMc8ErHnd1kWKJ9ZP_FzddZ-fqC_AsiYxeBG1BgXUdwuV-5GB487=s800-no");
        combos2.setDescricao("Backup e Formatação do HD onde o Sistema Operacional está instalado, configuração do Windows 7, Windows 8.1 ou Windows 10. Instalação dos Programas básicos, como Antivírus, Office, Leitores de vídeo e PDF. Limpeza interna dos contatos da memória, cooler e dissipadores de calor.");
        combos2.setValor("R$ 120,00");
        combosArrayList.add(combos2);

        Combos combos3 = new Combos();
        combos3.setNome("Red Label + Vibe + Gelo de Cocô");
        combos3.setImagem("https://lh3.googleusercontent.com/XpzZOgjZqnOod8_V3JToR861ZT2jXEa6Er6n0-wTkETCHvJQtBUGW0y8ZNbf85tAMKTjQmlE4NDpkQVVE297SAqsHd50c2y7WvO2WnoQ5-iZ55BCBaQRfcSIWmpU7gqqpGLInCSR2G48nF_uKnLEfyQwCleujkW5HhQDXOVCiIbvXpDWcMfjORxtt3ZqmOGyh1eQtr0FAWuAeNJE-OsfgEOSCmLsBYozpvVbwD3yVKBdALQOhgEUIUPPDdgQudHSaSxTe62tttKumYps-glD7mRLgjCrkWaPAyJpMtCGDWt3tRfTsi8BpYzkeTu6kGV_O0h5gKV4dwK1gJy44yDb1oCAvMdc-2PpKVqHmhxEgHNIOq7qKtEPG9svT9g-RYXeVXr_YSaPyO8ZgWqYEsOLZknEwUwTNaOijoozfi6-JrELsBMGtJ4pow26DFzuy3f2qvcgbDXJUWa1UBWL0yueg4mxE8c96lVs_9eGd3N1dnmaT6RmfUQOjk79ORT8IoG03l9A7t5V2tdhaM59OuvGWHc9IQtgDXTy7HW_JGsddftLWBK9k6IbdLt0mEAV1-aJjMA_rXeB_xShE9uWhvbJaTKSwThgb1cGl-0mThpVwaD27JMFrKLVAL9eFRzMmAi7012i9wrs5yrK1zjUmwUhFy5Ic2Qb-EhBaoQ_2cd59_ONyG-g7SyNT8EhO9yW1xaggsszQiANCt9JdElfiWuLBPdK-wKZRPcWPeq9OIMuKZT9VCr8=s800-no");
        combos3.setDescricao("Backup e Formatação do HD onde o Sistema Operacional está instalado, configuração do Windows 7, Windows 8.1 ou Windows 10. Instalação dos Programas básicos, como Antivírus, Office, Leitores de vídeo e PDF. Limpeza interna dos contatos da memória, cooler e dissipadores de calor.");
        combos3.setValor("R$ 90,00");
        combosArrayList.add(combos3);

        Combos combos4 = new Combos();
        combos4.setNome("White Horse + Red Bull + Gelo de Cocô");
        combos4.setImagem("https://lh3.googleusercontent.com/3YZb74LnL0xLIKCe5OT2Um-rS4zEaI_bIv18S3wNrJFGUrdN-jHMLUTEJB0C0HE7lkZmGWgbiIoyOGgi_mA2JldCVOY2sQUYMGgVsUAcmbNCALg2rIYw05NP4yqsIYzSTdGw3ueLAjOGPdbqkdUxI7VcgAKcA1B2xcbYZo4RVSvsx93Vg26x9snrBTsRjtr1_T1ZSBmrsNhmGhlfRcjZ7Lvu5DdaZPEiW21hLWb2DNJbnOquViK0VhLSdru1pOF4e529i8MM4vR9m1JqTaJAytJMiAOZYT-yKa5WKjdikhbVnx66kXIL697YKATgLGHsH85UcBswLAu6mG5PWeMeNxCxgePdceHghLpaw7EOGMbrA9u4tKuyyFphfVXmScpI7fj6yA_kLu2V7N9fIQUA6zbKZHFqAZmIH8T7AJ3N85FclR3efHfOUlqqM90WTxDY4pooyBLz6XB12NeYi3Ry7MN-6UiQ2ygEOO4v9kijXGjjOvyekj7ngX21tn3nSUbRroCQ91cPxcwKqKlS68FVMMILsDcAg0BPtuhhQ6CRJAJ-9MTwtWShK2xgL-OJswGoBXAcLUQHiWA4JE8FDyoXtnnvjox6DP3vCki8d_TFCK4yaAaJaNaOA3wAM7HAAd5R7ROcYpdzNUCuuUxoX5bh32T1UfRRGDiZ2nAFX35aD85e-5fDszKnJmOOtpfSu4ZqsVZ4wCgvEJ6L4MwywLWpoH2PC3oVa9Zb-1Ff9nWeZu3zIaG1=s800-no");
        combos4.setDescricao("Substituição do HD antigo da máquina por um SSD de 120GB. Backup e Formatação do HD onde o Sistema Operacional está instalado, configuração do Windows 7, Windows 8.1 ou Windows 10. Instalação dos Programas básicos, como Antivírus, Office, Leitores de vídeo e PDF. Limpeza interna dos contatos da memória, cooler e dissipadores de calor.");
        combos4.setValor("R$ 100,00");
        combosArrayList.add(combos4);

        Combos combos5 = new Combos();
        combos5.setNome("White Horse + Vibe + Gelo de Cocô");
        combos5.setImagem("https://lh3.googleusercontent.com/3YZb74LnL0xLIKCe5OT2Um-rS4zEaI_bIv18S3wNrJFGUrdN-jHMLUTEJB0C0HE7lkZmGWgbiIoyOGgi_mA2JldCVOY2sQUYMGgVsUAcmbNCALg2rIYw05NP4yqsIYzSTdGw3ueLAjOGPdbqkdUxI7VcgAKcA1B2xcbYZo4RVSvsx93Vg26x9snrBTsRjtr1_T1ZSBmrsNhmGhlfRcjZ7Lvu5DdaZPEiW21hLWb2DNJbnOquViK0VhLSdru1pOF4e529i8MM4vR9m1JqTaJAytJMiAOZYT-yKa5WKjdikhbVnx66kXIL697YKATgLGHsH85UcBswLAu6mG5PWeMeNxCxgePdceHghLpaw7EOGMbrA9u4tKuyyFphfVXmScpI7fj6yA_kLu2V7N9fIQUA6zbKZHFqAZmIH8T7AJ3N85FclR3efHfOUlqqM90WTxDY4pooyBLz6XB12NeYi3Ry7MN-6UiQ2ygEOO4v9kijXGjjOvyekj7ngX21tn3nSUbRroCQ91cPxcwKqKlS68FVMMILsDcAg0BPtuhhQ6CRJAJ-9MTwtWShK2xgL-OJswGoBXAcLUQHiWA4JE8FDyoXtnnvjox6DP3vCki8d_TFCK4yaAaJaNaOA3wAM7HAAd5R7ROcYpdzNUCuuUxoX5bh32T1UfRRGDiZ2nAFX35aD85e-5fDszKnJmOOtpfSu4ZqsVZ4wCgvEJ6L4MwywLWpoH2PC3oVa9Zb-1Ff9nWeZu3zIaG1=s800-no");
        combos5.setDescricao("Substituição do HD antigo da máquina por um SSD de 240GB. Backup e Formatação do HD onde o Sistema Operacional está instalado, configuração do Windows 7, Windows 8.1 ou Windows 10. Instalação dos Programas básicos, como Antivírus, Office, Leitores de vídeo e PDF. Limpeza interna dos contatos da memória, cooler e dissipadores de calor.");
        combos5.setValor("R$ 82,00");
        combosArrayList.add(combos5);

        Combos combos6 = new Combos();
        combos6.setNome("Smirnoff + Red Bull + Gelo de Cocô");
        combos6.setImagem("https://lh3.googleusercontent.com/3YZb74LnL0xLIKCe5OT2Um-rS4zEaI_bIv18S3wNrJFGUrdN-jHMLUTEJB0C0HE7lkZmGWgbiIoyOGgi_mA2JldCVOY2sQUYMGgVsUAcmbNCALg2rIYw05NP4yqsIYzSTdGw3ueLAjOGPdbqkdUxI7VcgAKcA1B2xcbYZo4RVSvsx93Vg26x9snrBTsRjtr1_T1ZSBmrsNhmGhlfRcjZ7Lvu5DdaZPEiW21hLWb2DNJbnOquViK0VhLSdru1pOF4e529i8MM4vR9m1JqTaJAytJMiAOZYT-yKa5WKjdikhbVnx66kXIL697YKATgLGHsH85UcBswLAu6mG5PWeMeNxCxgePdceHghLpaw7EOGMbrA9u4tKuyyFphfVXmScpI7fj6yA_kLu2V7N9fIQUA6zbKZHFqAZmIH8T7AJ3N85FclR3efHfOUlqqM90WTxDY4pooyBLz6XB12NeYi3Ry7MN-6UiQ2ygEOO4v9kijXGjjOvyekj7ngX21tn3nSUbRroCQ91cPxcwKqKlS68FVMMILsDcAg0BPtuhhQ6CRJAJ-9MTwtWShK2xgL-OJswGoBXAcLUQHiWA4JE8FDyoXtnnvjox6DP3vCki8d_TFCK4yaAaJaNaOA3wAM7HAAd5R7ROcYpdzNUCuuUxoX5bh32T1UfRRGDiZ2nAFX35aD85e-5fDszKnJmOOtpfSu4ZqsVZ4wCgvEJ6L4MwywLWpoH2PC3oVa9Zb-1Ff9nWeZu3zIaG1=s800-no");
        combos6.setDescricao("Substituição do HD antigo da máquina por um SSD de 480GB. Backup e Formatação do HD onde o Sistema Operacional está instalado, configuração do Windows 7, Windows 8.1 ou Windows 10. Instalação dos Programas básicos, como Antivírus, Office, Leitores de vídeo e PDF. Limpeza interna dos contatos da memória, cooler e dissipadores de calor.");
        combos6.setValor("R$ 80,00");
        combosArrayList.add(combos6);

        Combos combos7 = new Combos();
        combos7.setNome("Smirnoff + Vibe + Gelo de Cocô");
        combos7.setImagem("https://lh3.googleusercontent.com/TBPiWsphWBOYpi5Uj1GOXkdEjgyLqnS6CevtLvl_HBJj68YUCWBb7nSelkmumqEjB4CxCpKWW5Bn7VztfKwR5Zzl5R4DS-MHXa2hb95u2paNdyMFhUDi4VNpbIH6VJvnk7zJhLUTSjroEpB5kUrfa7KHNZqGCmMpWCQIF5HQIHoOv6KXTqPUdotuscYMb7Y81fsIJSwG5R5XZmS98kqCAMmeRMK8p4mzrm403H1Qfz5R7Hnh9YG41MSjVTVoLP_n8FFOTL9PIgaEeegQJJFPBS0uFMM3mtMWoxVrmgZR3N_G-6gkTtPFZu1n1CM2tRqxtHfY4PkGDyG4fM9yIXkvzcc-Af7zUKxXPquxaMlbIUuV7MidL8Qnrc_FDq-TQSlCLDD3def314m1jCrUnLQqf9SRvuR7yDLc5CtYAMbyqRSaMjG-tdHwYIQ6iVUVp0xwRh2SvXLoyYnpQonauvSz9MCnTn1L0xBtnT_FF40dzelrxVGV_pZ0oDgQQvs1XG5xLLRQF7lbL0YKhjEOixd7kroAH0Io7hR2NczYZ9bFhw6ZTEabOiPIKuum4qaDz0nRx2odK-WT7YaOYrbZKKBN5tmY_al8DxRyjBbffc5uL7TwufuJBc8sL_R-gWqlLCc7ccEuXGf9FHe4yGF8ab4k7O-u5kM2GOvswzapu45n7FlE0VB4qrx_vqg2STJCL0Sety6n5y7pXS6FoPT5Y2qoIFWaTf2HvDYLaqKedZgU19UvRnWK=s800-no");
        combos7.setDescricao("Backup de Pastas, Fotos, Vídeos, Músicas, Arquivos do Office e PDF, que estejam armazenados em algum HD ou Computador. Depois de salvar os dados, nós copiamos os arquivos para algum HD externo ou Pen Drive disponibilizado pelo cliente.");
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

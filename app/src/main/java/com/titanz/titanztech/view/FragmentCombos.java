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
        combos1.setImagem("https://lh3.googleusercontent.com/Wdx7O6DiIGQsDcd8I2-AztrYm08-ypBFhvl0G-vow6JgNIg1-jAjlta-WJ9GKscqQ_fGJSDBbjnn4OKzeBftNgS4OovjV819qzkJ0hC6en3tBHnXN_wex8yALyiy46__780nR1bwxNDVlRqblbNYStZHks9vg-m_al7bnTFuaWbP27LATzqU6cVzgfSIW0QmIXaeM6nzWDspRQ97NoNlxbNxBodsVIIBsLl6OeDsZt-r06KBh1s-8wvAE_oaUtzZknWIQrzmgnjuM3PlLcrMBo62AV22QhvvJ2BIT61wSzq-aFftzg_Ug2EhM9WSE1Iu6mv1JyzOyKkI_oKXM-tqZaBPWqdfcx7NjP1aTzq2qBRz06w33Gu3bH7c1jd8YLlKM11CmoDLEteDPAlnYsLl1jM-oHCokZRUGvwNF3ySdnaAQ4lvAZuqzuNOSY2BdaFN0yPKxaAOinZS1qbH0U8xn9S7R_tDKYXWzt3wtNPk0MN5uNOGgqVLc4J1oObtVjUdxjg48K59hWaQurCfgF7ZZ_HqXkl1b-wYChLHAjFh-0Ldo1Vw0Y-sBWICmT-Xjx3_x1lExA6nDCwWtQGkiAcwpgElciJsgVPn7a51ElJwxjJmSbcLC5QUloCC37BVNIN_KwOgEh7_hyLK2OybSAOO2RYznvEOnQnSoK_q5KZD7EARPWPbF3US7bmz8HU9ofUTBsx69eEBubCxXvSyJsaLXWFF-zP0VdVLafWCeYPlTm8J2B4r=s800-no");
        combos1.setDescricao("Jack Daniel's. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos1.setValor("R$ 150,00");
        combos1.setEnergetico("+ 4un - Red Bull 250ml");
        combos1.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos1);

        Combos combos2 = new Combos();
        combos2.setNome("Red Label + Red Bull + Gelo de Cocô");
        combos2.setImagem("https://lh3.googleusercontent.com/JQBdGOILhH2LbRkjGTuksqzzF8YNazyTkT5CbqW6o6n-I6eYNY7ebl-nHg-yIuvw7QkT_n6S7B1IH_AitJMEjdtVqzgySt0VCNjalce9NA-rgtAjWdZ0bqlEzGWLp7BviSpgvHb7UtYYn1PB2gn924AMstqGEEayOZ4DISSZxCiNfNzlXQ1k6898jMCY3tHS1FHF9Joz0D8VEzrFNzFcM7Kp6hjqByN7JKV97fQnLj6TgvFaE_JmOBoIen43KTpbS3CcnCLiHeONbYk5FQkxiSPkmX3-UcWgtzgHfVo74W-NL2IXmu1GTG_rVF-NP73gpDhsoJHl5BYaZBke-7OpjbJf23Npz8hGmikdE88vvUz0G1kpgBUhjmhFEkDkY3bHr4WF865WmJqiMHB7Bd_1D4zmDalyy__c2bqt6Lg8t1iojLrAL1coJyEZM-At0-KQoxixBpFHlNZi2TYjoWXppao2rmH_RKGhLLdYcSdpJadVCWSd9A-JOMDP-zAUSV7YgBuWhnfaFi2Tlid2OLjKp7qWTa8cXKELpty3ZbStk96K23hny5r3lHSQDWd9EjzrC6m8uALPai022CZ0z5A6Cd7ZfAl7NEKaN5px-gMfgvSPDIRsLYzSCeNLzHLdTluToVng4OR-H8PUDX72oWnEAVVPnNxHF2UN-IDPyFs-F25bSOzPisgvfNgRoLUb8SW4KkHOIPiP0b1NX3qHeG_RgCikTRvvnmmhZlmOOn3l4wwTl2cV=s800-no");
        combos2.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos2.setValor("R$ 120,00");
        combos2.setEnergetico("+ 4un - Red Bull 250ml");
        combos2.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos2);

        Combos combos3 = new Combos();
        combos3.setNome("Red Label + Vibe + Gelo de Cocô");
        combos3.setImagem("https://lh3.googleusercontent.com/NxAOcLYV48TdLJ4t-WPJ4N6RE6bDkXrDGqq9lsCRkLsGmG6p8Bv7k4rHGTLBsvL0HnMxIwzgAcDoyEcwUL5V_NMJIbJQF07ARD2h5kaoA4JUpCpcJbjg67fmzWCxXaIYLBmw-sF-tw-jIMZb1Lo_0tiCxuKyaocImmvVpV2SBTZ652wni8JC1kRqgyFOTOXVUpJ_KmmMP2JJCGat9xS0DqodCkLwBzge93c7ezIU-yWdQeIvaOHorxh0plple2BqRRuHOS7T7EMs8Ceao_v-GdbuICZTmqQ8EmsuPT0aW_ddOpoNpSnnkexk9C4cyhmosyjh2NjHLA2kJKCvs2jU05Ull6bEi6JYBsEteFD-48ML85ZRytW3z87dBND0-V5yTZQj2VgcHYiOPA2IyLJvJLxFHwBIzKIUAcDFO1E7KLN3ZoNfedPtBN_0ZdL501RgXBCS8MCSKKp2oDy3SWYdUbtcILyCh8hGJUtqPCxHX1ekw33SJCuF8mqDAqXAleWYYoia7eUMLGoFdS1lThpmCKWXWj7S1uv3a8jbqk9KoQl-TChhEhEdAhufV0ieK0q3RbDw4ZsVtCxS3691u7Be31PP9uBknUQ8wwjGa1jidNYU8VfYkagrrkTlWBJVqBk5c22RyNZwclnrfzt2XQvzEhaVRXcKIDH5EPdgBuNYjBuNb2GbSXg7Vs-4gwpEEDZErIqlWH5yQ3Jz_ikuGJOXfb7I29UstL5cX1no3aB2JNGHnqdZ=s346-no");
        combos3.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos3.setEnergetico("+ Energético Vibe 2 L");
        combos3.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos3.setValor("R$ 90,00");
        combosArrayList.add(combos3);

        Combos combos4 = new Combos();
        combos4.setNome("White Horse + Red Bull + Gelo de Cocô");
        combos4.setImagem("https://lh3.googleusercontent.com/5PtYCpYkUZpvGlzCp0J_tbuGRPr5Muy74syTCLlvK2gCOY_86AwnfrnLH_o0d0UOp1TSWm0KbmFm5ew7ZkflbJYsTLvj5VjFTLtRA4UYQLVgF0ZnXipKBI-mDt24rPI8ajN7c7KpwgrQyD1cdxkOaXRrUWY239XB3DQ20vrdwH88AeNJD8SZobN7LS7AAOXeYDIgBdwi4D_zQlM_E3gvCpElPl3YHJEElq7L-HvmCGbwxWZ5QmB3gtcR90Z5PdukDKhNZqdFWwk7XP0IurEctjTIPDlHO4GXy1AR-_wWsnnKGV9CmGgFQqtAv06RKmNn7pFAD3E5enCtnpQVXsmYGcPr8Gk1l4D0eHsD9-O7X2uBXl4atGVwfMF9wOr9mUbaeKT6_Uoue-z17TQBK-06jfTOKj1aAE8sW5Vz-e5ajrJhRW8DTzYLr1c9izyHY2nk6aqJcIpIT9TJFvGNp4SYr7jh25-RuCeP3d5TEPETTFsD_0_bYyk5NBbohoZZ7EHKW8m6kYEyF_SSOCKGK7l3PRtnSQjevqFCnQkgVlIjvTUKczkssRQ6VlDnfJN2AgL4PBw9rJJSGJssO3Hq90r1_4nxoQcuJmAKS8WPgGaKMC-Zn2XkAuy2UhxDx8mDCmzjYs3enDhjDoEL2sOGiaBrNiwuEYHiehproM9fzs9QcKU0mJrkMvdPV0MszF9u3tY5KxhteX1iPcVeqOTehILTnMMWkKeqGY1nh1bmIk-orfL-UO1d=s346-no");
        combos4.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos4.setEnergetico("+ 4un - Red Bull 250ml");
        combos4.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos4.setValor("R$ 100,00");

        combosArrayList.add(combos4);

        Combos combos5 = new Combos();
        combos5.setNome("White Horse + Vibe + Gelo de Cocô");
        combos5.setImagem("https://lh3.googleusercontent.com/Gwm51QMwyMbowNHXrVjMT35VrHbtEO7qsK_xOq-ajv-nQchWZ4HPloeLnWD1RpKFAEOcrkmG23hW-tvX8gByLyMQWUoQZIxsMJ5oXXPmmV7F8qAYqulzfrnO1839h3LgU8t9sy3KnZWDPa1IO3e_PRkAhvy_XBQ6jVT-d4XHMj5LsGWtVRNbFjfk7TK7ubKZE3OZ9gLzxkuBkOEw52NWJMrtE_cluWzhMh0_b8uHgkoUunUuTvzu5G0Ja7QGohGon7y_r2rPqxOzdNRW4nzrgp8bis2cmQohsNzQ_yYGH_K8kg8wMWF41HQukNtBz3Wr9C_iCVXVagOoMXgk9g6yH8VkzeapwT-Cl26aLw3CGBNyIhSaWp0gMOviN07jCgz9j9PgtZcYYiJ0BfW-dBOXNiETINBGnq1jWG6qMnzcZCDupi8kegVwkMvErjSAZupMR43Yl7Uo_2y6hzQHhjZJmQkVQUpcWz3VKlaBdLuOKcAFnr3dzjRMHQLon72hDYPbGH2rqoBcHvF3t1KJG2YBZWmLIdbcq57XV36ZPgYGffZ-CcDT2L0QR8is8u0JKZydZjWB0Xbzpp6qsYm6hur2lipNBc7XD-wML1pfQA_WW6moO1TI727yQi4KAft9yZkMGcz-1YLttTvEJh3SdwhrJyKL4kKIDQ_vR3l-EwHRXAuLO64BQe3M78mWOTXfvEbbkIE1nFLwU-UTPM4Uod1qiJYJeOuq9cFGNwRAhZFiUQP6D5r3=s357-no");
        combos5.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos5.setEnergetico("+ Energético Vibe 2 L");
        combos5.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos5.setValor("R$ 82,00");
        combosArrayList.add(combos5);

        Combos combos6 = new Combos();
        combos6.setNome("Smirnoff + Red Bull + Gelo de Cocô");
        combos6.setImagem("https://lh3.googleusercontent.com/A2oNGcCHTZdVVY9if1O5ssaVF5O0zh2KVfVnZ4eqEMqQ3UbWErnWKS3fYvFz3RY_QnnganHXHkjOPQWvQzkaGfbD1nBioxTMbsJoma6Lpb-6vmkfm7V01cPSOOGyGRlmGyvazEgAnumJMeFSTWYEnjXGe3lAKf_hOYOzThsFqDvrxliHplNAH1lqsQXRSSc3S8spNvxtx-dauqdiDz8xb923Pt9WLvZGuDwQo3360woOfDf6NfX9aXpIYMAzXFzcE3RLn5QDwrjR_lW7sGL9lAocaye4n8uHClvwZOIGaq6Umd1_7_9zlUgiAoXhPVPUrCRwyKQL_0vFQa8w9oxVPlQ7iW6poI8PmYafHAroKUnrqzbkzgTvDPsicfxCze69WjWPNJmVVBgCRAxOqmCM8LfR4Miavm2Al_GTMYlbDGYlxTqPkSeMCXV9J-UguBEnbStztjyRM8OvyFmOEN4z3cnduW67QYuMtUPQnoTsz_0iYVKjPC3e2YBaXGlPXGo8VN488FrQKIt8f05HamLfCGI4JZs0SdwYaQBjNrmIcb22wa1lhft2kiUq4QJN4VszvTjC_v86u2iSdeopNtNGnFJAN0iuYBVcANsEGXIoGxU-kmljzsHiJ6vnwRCIB0wHD3w_KsLAjEKSgSY-ez24jJef-d1AqGaTmogX6lTblV6uyEFhauQ-Zkq2PuS73mrEImAGuEp804qsTCQSm0Hci0KOTmB8i6wAH65lcMda6TTtOxAf=s800-no");
        combos6.setDescricao("Smirnoff. \n  Graduação alcoólica: 37,5% \n Volume: 998 ml (vidro).");
        combos6.setEnergetico("+ 4un - Red Bull 250ml");
        combos6.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos6.setValor("R$ 80,00");
        combosArrayList.add(combos6);

        Combos combos7 = new Combos();
        combos7.setNome("Smirnoff + Vibe + Gelo de Cocô");
        combos7.setImagem("https://lh3.googleusercontent.com/0EV6V4nRbWznY_ItjKhLcOBQUGjnEtXaCRw_ra28r9plobd1erAOrjciBpYejR4A03On-EK7fsWN268-eUjL5XiaEK2-r_99hIMF-E4TyRw1P_RMEVskKcoEvE0Cv4ey-QDytsKGOLhYpxFlF2FqndRW0fbN-7CigW8NVa6JD9yyTe16usxKcV6kkTOVqHqbX8NBvb_7Ns4HWn7_cyLKGf0HhGTQ5avq3dT7_PZF51nlH-4Znvz-3Y_WUGOV9l9CRVik7ezRS8c2BQIaH_tYY60PBeeSz5IzNUVCGWw591rZ2V7hqVh4myBmBU7uLrSwUiG5MyAqLP8Gb5KQBVbn4mbe_ahmjW__wUXNQyDx0YoMNkZU3w9sGnVGgPUwRs_mlweG9hRu1IPBKwUhSYE8v8Mo60np8t_bg9hXH0gaVKHc75W9Azq7LHkwMjb0G6nCbIhpn9no7UNxjOciBG1l8zOukR7k3ihKWMTO883MWCPXQ6ECaECIDEPSdIL8q85mD2bI7U7lqyrDfIVRyhaEuZ4S5kkX8rgYlRqKcZ1v9MemKP07RlXMwjJnBVvlyyISOFDIGeSHKsgkdNLKh9sa6YkPsyc3ALEE2HWBjTHRmFaTni2i_ZyPNwD3MjS9RlTI-Oh5QRHYmy3j4dEOxzCpK3hXp1NRnIREpKhSTDcbw06XxnmNV_v9-Pu8-7e-lkVrO_Lv19zvn8FrVjKubH8S58yAu3hnCwImU7pvxZMpxa_ZIN2_=s800-no");
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

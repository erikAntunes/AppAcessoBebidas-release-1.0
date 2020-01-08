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
        combos1.setImagem("https://lh3.googleusercontent.com/GDhgwXUO1YutAEgMS63xDLXXKuu6AtN29oa7Gh2QYDCBHe0jXq-W5YH_L0DmSE-b8HPigtq0UCIYT7SorSNX5LlNCSJaaArhh7UthYMYIvGiTox2_wytzIEVe8BnyvhjpNUw_2drJ-UXVB4fpfY2Ikvu2tg69wWzcvFy54ziDTHlVO6fYzsDC2JGTCPIw77ikwf1y-Grp5NofY4p5OAVz9QevYF37Vk-7Jar9v8EU6qgaJxbxywqt_OcIytnPN0oHJ-nyMiF1Yla9zV1o895v9DGpAfzrNnb46syuYcW91qLZorGX3HaOAVKRKuUCdPfiJFPHD6ZmymhHQFnLYWcAlvoSZiJGA-z-n2TWT7sfg-4wIsFWdKvDwg2NhVmYnXAbNWXL0cshTSwunEIGON3jJfKpmm8O5v3yKtjjj269rg4wDknE3UczZGcqXfbk3e9SL-mYlJwajSP3hZhiDjRyVD-5K1I48auWhefHfCNjy0iBJpWYce-rq6YGH2SpK3CzE9kgU1NYZMtH4ZiPOg3M9cBYW_06KntBPuNu5Q0Tg3GVIcZXvBYpj-T2MX2k5EPj0DnUdRIP-6-7zRu_6HDT1Cy-J3VKS2niPMbUfhJHKdYQ6wI1te6lCaZxgc6f_CHgvtzhagiwFe-1gZxe42gRv4HjMJ2DyH4cX1ahOv9XJWQICmQ1D9mo00=s800-no");
        combos1.setDescricao("Jack Daniel's. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos1.setValor("R$ 150,00");
        combos1.setEnergetico("+ 4un - Red Bull 250ml");
        combos1.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos1);

        Combos combos2 = new Combos();
        combos2.setNome("Red Label + Red Bull + Gelo de Cocô");
        combos2.setImagem("https://lh3.googleusercontent.com/8zV3zhYvX9TfN1udC7bG3guxW9ue2TTRoxcpND3GJDJv_XCw_EhJ4u5LSfcqG4fqovo_tX1szQB77vCP-vN9gUnjxP2b7cMzOR2AbdxUGXL8ofYINEcvoG5Cpr2ih-rpQ43yOop7_x8NuzVEwIXCGJkl-PnxWlTudPTpVu1Gzgkxfts5bG7PWVSQnGEdkydDS1SC_zHfV1KZ4o0vel8-buUALtJ0fC6s-cYaehibSkphuWdKIv1AGufNJ7nc1TgMme-ckO-pOPA9IURsJdunmFShkWiKdYe8aP_Y1Kb8Dtkq6PVkflrThHvZOdiYOMrgg61BPYYNl6-fz5LBygWHXwynDh4gYxnNq1MQVW1QHdaS5MFkdFivEDUga_9ohfElENWyovqyuGIfr3RpyHYkusEdAUkUmHgHueX96IEAwVIHx7eEpD6_PmCkpz2Ko7NhFt2TP6U9T-8Saxu5ZnxLExmlmwMhkNaCPUvyGMttHbDnBdEjwqMvyKrfuUe3yykPq0oHXTMzk8dt0K1ksqw0fXzxm6OQ-jcAUXBsZJ5ZNThsWDL9IQi6crdLz5Zox5z3P0w57vtAIM2JJ51Akr2wLPrNXM2RH1_0-1hHcSZ4WurOTe3_1T2rSmjQN-gpdfbe5zXTP9y9jueQP5bD8-I7H0AdviSAs59kYL9V6sVZFN_3Zu5LDd39P98=s357-no");
        combos2.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos2.setValor("R$ 120,00");
        combos2.setEnergetico("+ 4un - Red Bull 250ml");
        combos2.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combosArrayList.add(combos2);

        Combos combos3 = new Combos();
        combos3.setNome("Red Label + Vibe + Gelo de Cocô");
        combos3.setImagem("https://lh3.googleusercontent.com/BhfvtujcMlm5zf5R_u_-RII5VjOLcP46GFAVuM9JNf0jpn1reKUao31aPZbV_WPvkuc0ighhLhlghjI0b0J-dl8PU5PMOt8p8h3d5cDN-13aA7iRxQik_x0tdQ5sWZRdCUo37NApbJPFh2_6wh-RAmZPC-4q4FWxx3bcdcEwZM9PK2W2XC6jxif48GH5w4sUUIWrcJVJeiJPHeoUeZakRFAmD-izIFD2h2LRO1lFGAhNT8_C1KYEVv7V_WPzI7iEU1iktIe7DeNjc92puMtUMuAUrLI6CT-7eKP0Xj_JZPplPVuD9OI_PzslEMYmvj4miamlCxvxyEcGqpbYJUffVyWtdJgJ-FNbUmu8CkWLNK9VY-48zRJz0yPgj9hBCgUOXkSYpPUP_h1tyAN3MRp5oiL_M2aB1wogw4dCIASDVm8hBE9XexOEQVqkKR_Cl34jrDTBtABsGbrOYMyDO-g2u_nm50JlsGyCLPENvvVKpfAMkJi7dglGj7tNqxcePEVAIMSZCxpuN0JAh8XuBJPTE0DPAQ14H2dA_voXkAms1QgswheXe2kb-o5Prz_xjG-zdh0aNbxW6B79m4ynkUoJ81TTT7Z7-FDrj_G3wgS9gy9k0jP4HpD52xcE0Exzg4amoCo69b0jev0zrwy4ZvaRgSHSUufhcN5pbQu56dYzzzkFpC7zccI_Dhk=s800-no");
        combos3.setDescricao("Red Label. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos3.setEnergetico("+ Energético Vibe 2 L");
        combos3.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos3.setValor("R$ 90,00");
        combosArrayList.add(combos3);

        Combos combos4 = new Combos();
        combos4.setNome("White Horse + Red Bull + Gelo de Cocô");
        combos4.setImagem("https://lh3.googleusercontent.com/8oZ-y8apCg0mUPzeEsjtt8yU4aT6CJINxy_4xKKH6yrwPxRj_Xv0PC5G0lqQiNC-Uy_Tfl8Jk9-rwh8HEqzEvrQunBaLUhGmmNXDKTQ_cWP5QUkc3WXfV_1QmFrnXFjGnYCAuM793elg9kTAFrMza8Rm5ZThz3ht4-poRkKvcipE8YG_0F9NS_Kwgmoe1Rgb_crdtdUgGUumHWTbrwoL9mqf59qmOG3gDWxt7zipB8BWTdoZT5ywLzU-1FoXA5hq8pE6B3WZ7Z6MwmB5CHiencVobuknh7sTQZLygs948hgh9butKTYQjICxK70UAwzWL3eksS6AtHHAvceiN7-B5sK2CWlFpqutm6rItnIc7cYZaujlGkTv_UPC1NP-1Qt8r7sB0xJjYj-EANlI42CS3OuikC55FLpNSHuGiSVPDczNSMWUULP-pgkmUynQbf5zIWMokg1Du57aaPk5yYS2C9xHKLc3mIyNPF1vNHXzPs_B98D2JJ4neFiFUwMLTWWtjvTsyo765_b67CkiolFWdq1UFT9sDCUZV8Xa1kfOGu8sog4FaZfoOW7p-rb3QzsAeX-o4yHXk-qTfDotmnsmQ0XCJNwLB5R0GZogKH5PyYEGfufALMxFbo81b01hGMqQ6K2DFUm-ZypJVXhavw3bE7l0sbXc2f9R3hw_usxyiaWAD6vNOpBt3U8=s800-no");
        combos4.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos4.setEnergetico("+ 4un - Red Bull 250ml");
        combos4.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos4.setValor("R$ 100,00");

        combosArrayList.add(combos4);

        Combos combos5 = new Combos();
        combos5.setNome("White Horse + Vibe + Gelo de Cocô");
        combos5.setImagem("https://lh3.googleusercontent.com/kxUo92j1pFsnQUDDpoAZEFNBncG0tCtEVAu4ZquwTqWx3uBGI0hFybg5obxuUUqs4m8KRW4pVSl3VMznHHFqK9bJUvTGVegnvmUwQxsI40YhpGBmJHgrIV-ljhKlzwcdkBn7sUrjPJWVhpG9eJjCthIglCJMb8SzsEz2o1KcEWUoJPU47gHnS8m2laqltZLRpcNOSdR4V0eMO5qNoQq8wyxkDC_v4Vvguj96V-m8gLDZE8WcrcOKG1ikmASaC9SHh39BVlfS_3jHpA33H6W5alh-D1gznxJF68eSGEfmWZ17mPevn2CeCv4NNuUXgYVVCsqXlrceqdB5OI-TuNvQaIw0hcWRZvZSKDnCXetz1tRXnL_FiLO6ROqSSE6CXaFpRK_iNv8LFEQtooJLij24qSRDiK0v5AT3gDyL2gn_deYrulXiKPqEXH7NZQFOEr2vtLbrYIM6gFX375ZrbVPRSCtwu-3Q7-aCe52cRjBAjTN8Xe-YhcDMuEVMbwCrVeFUj-IN-5Q-0-x-J2jnBgrrRLwOdyKPynrztBneyS60YSHyncRVf1mw6wxzj9SO8EtkKZnT9crAWiLkLPYDkQDE7o1kDXplJnV-UgCrPGQUFUmLNbcRZBnQWCO0ZRHHhIietDVeUWUDQBr0nKeVJ7uGU1koHmmCw6tkl9rEW3o62eVifrzc9t_HStc=s800-no");
        combos5.setDescricao("White Horse. \n  Graduação alcoólica: 40% \n Volume: 1000 ml (vidro).");
        combos5.setEnergetico("+ Energético Vibe 2 L");
        combos5.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos5.setValor("R$ 82,00");
        combosArrayList.add(combos5);

        Combos combos6 = new Combos();
        combos6.setNome("Smirnoff + Red Bull + Gelo de Cocô");
        combos6.setImagem("https://lh3.googleusercontent.com/zLo35L1mvyc5lxWoHOCtYcmKW1tX8OyuV25LgDjiFUVoa74lrzlqRzAM7gT5g7sg0YEceIAOBfElrgyvCQH7OFj8TA6Va3w8ljoj3zFBuQrLr_5lyNxF2XxvyRWrNuS4aneGClZ6yZh0LYYVYuDzVlPQ7wjEVwSVM9VisONIF_tEKvqWgMzSj98CVsckdFcT_LH6bjwoKHuZwhA1ys0p8vVc5Si1y7RfGOtyG973LrKtTppBWa3rasPbt9I4Eo7dxUDW3Pdym7mCd5GKzeuWwSuiOUxVmrKp9lwNNvedc875_RY6rV7T8O6bhU2-ZZO1lcYtnJ-j3r3wlMOP-m682LoEkndbw5ZDkBPIbx491_69oRsLcU270cJ3FUJR2cvCkk-YQEAkllBQ1yEmRn_HYRrYJ_ql4mT-3lDotAvy9njw4DROE2vGeIiPoyZ3ibJwJjrp1njFcBRtDyiomfhFytr7_lSRa00C6nLLJhp8IihnEOKYJgVIbQlmjE_nPimNqfd0rZwAZjTOp4sPlHyWgFNW840aMDS7IkkXl-LrAQAeD1ud8m8d5Yz406Rj2YpTlPgJiJ0knrrGpP1nxwUI0ax7fA4v5FZDK4b3f7JhztRO466QZWBOkn_ThyttRF8kPmb5y1eBI1CbzyRTVKhc0AAGCb2GQHYPgeKBCrIKDiw861ggloOcoFY=s800-no");
        combos6.setDescricao("Smirnoff. \n  Graduação alcoólica: 37,5% \n Volume: 998 ml (vidro).");
        combos6.setEnergetico("+ 4un - Red Bull 250ml");
        combos6.setGelo("+ 4un - Gelo de Cocô (Maracujá)");
        combos6.setValor("R$ 80,00");
        combosArrayList.add(combos6);

        Combos combos7 = new Combos();
        combos7.setNome("Smirnoff + Vibe + Gelo de Cocô");
        combos7.setImagem("https://lh3.googleusercontent.com/ZI19gRmF25x2G49egar0V763ED7UEuxzXg1Jq-SdZhQX8gs-78Bw90fS9fdXqvFWOekCFSbmhngAf9fjoDbJzMp38wUr_ASJ5CyEV6NkV2MAzOaIpNqvaldBUIqM56CLIenpHjole3E8O2rGsvfe_6OoxLjAnRcqCaUU6l-CFffdX1w0FFAdVNtTJK5vQI1Bvb9xuFNmb3NUjY1yooY3wHa2lxPl395wtWwSoRH9iFsUKWQ87gAuXyW2PsxR0OOOoMbVCv8wdg_FHCoXXRGqCU-odKnpgqyQfsJ5YK4A6AVboOiA47X8Wye52SASJ86QNPp13X0NfpUCpYD2wq4jMIA2a8iN2tFwCekvhv4Bgujr6TKBexhty-gOKFQ8R8sYJF75uf-ZOUTBayc_PDzPIdSjODIUqBfoyLQTMN0BaTOxVWheRgyS7eCtVT-h8S51MxBBbPG0GKK1XQ3YrRMRMnO9Cq64f4yMOYX_H1M6WMOwJfgpc9m-wSxodupg1mkGq0R9Om8Cjc21czz5hzzUq4qHMpVJdZUo07bzsXsqkS8kx4ERZkR4VnpY8NAjdm7CE90N5XTmEeOiXC24sBweYyDSdGYeyrFWyyQxrENc80fYh3UKXZ0rbuyiqbnfqWe9XD_GTx0XuOMcak9RwizzunoTQtAfk9r1L3-urJK-4vx-ZyiizPrW8Bs=s800-no");
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

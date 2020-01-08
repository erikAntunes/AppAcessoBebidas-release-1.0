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
        produtos1.setImagem("https://lh3.googleusercontent.com/2Dx-Yv8DRNseZKyl_biZOhUS8tzBtGeXSpvBs-SpypPL2rxXYpVnfzssGQuyTD5FoHLSwUvX50WDzffXLwOYErwQIahv8QMzcStX34mWC7R22iXfzBsREHtDEtEVU5Lu_ADP36S3hsB54u_QYUbwbEtZExRnIrjrzZAXy_5ejSH5UxO_wf_ewFZEr-9IJJhMHBOxKayqNFmoXYax_jamJXgjIR-MYu2XY_RDwWq2htqUsIsGuCe_-grOyPUBkPTfa6oJPKjMoCEMGvKJ5lc78IoXZNo26j0HxI3452dhX0FyVfMLMQ9mUePbEz7TxwF0ECeclX_8Sz09I4UWlX8NWKRJs0IKpjms_pHlqa2nr0e0nxgLaVrBCyDHJFgbGERPep2qxNf4-s_LJrdHgr_pWSBNuC63SGQy-ajn-RpO2EHAhBHPacuE90EP3mPP6rhW__6dzm8yAJvaGvPe-IJwPxQZECWzw5rtuAPx8YwcfX8APRGlnpHF59bPpYLKrB4b_Y8vnrJljaSiROAAiw3d4xodyfgkgqr_Y6qAlOE_-Qg0JWSWoITTyuI_HXE-8-vosA8ufXtYc91X7ZNXrj630zGTWSbFYIIzTKIBthtmlEyVjfodSah3Iu97AtlaG3I5FQHUNaKd-YSfWfFXqgeFBzMYNI-oOFI5Xn2zWZqPP1vNIYxwAjfOplU2dATjcewCEyXDd0axpgZ_K1w3mwFEL8Pf1LHMrqDQ_z5PB4JN6KHAwPlQ=s800-no");
        produtos1.setClassificacao("https://lh3.googleusercontent.com/bYzfJ5ll2eZddosZJjmB4saKLI8MTHnZUFEAylEHDgsF5y1G_7DwH18evXe8Ofu7rkUPQsQHHR7lE5PD32P5T6UjyaJKb0WQt0LKPJ8hEuGWLa7ItNbABQJrKHlb9xioKu2dgXBEAxWsaD7gSA_BGl1Eg8gqnjfvAQSsD_T1dXXV8ZAdqHE1jL2Lqxfx9CxZsfkD0lPVnM4uYS0e5M6c698a22lhlGNd8g739K9WLRSe_qkHdfpHyz1f4qqyV955fq3eEM85zMFU1aTdRuaND7pP3XW8xqAKkwPirs3hqJZGq2JGGXIGfdlukoA3fM5BAF-eU8m9epkAEJF6THNaJf8X4zcn349KlTZFEBE0sQpMobtzuVJgznkQoOZZvQdEm6FN1fkjUMrByC2HCQ4akxURWgBDevm7UVrO5htHHOiWvCrE509Fmn9Sc79peIZo0yOaIZMyz7MVGILhj_XQjQuOc79s2kSYGDYdOWbOvNSON24D_zqH74hsGRrfC1YxySvCgM6EdZzBrS1CTDQtL57J-W39QZ-cxvKvOoosxaEIss3tSuivhCShumjHADvmA0Bj8f9cC0Q0yvwp9kl_HPPGaCH0c57pWVyCEvonpnKyO-ySlfATOxHQzVD30qf_ZoXXgfnGXQZcHbBVQ-QXF99JIDUdsDqPSqTVL9UFhZMWF7LxYjZRA9yItJ-V1WbYl0Kjb86sSZn8hgKGZaBbO28KFKe5swryjgHuJR010slTYZhE=s800-no");
        produtos1.setDescricao("Os whiskeys da família Jack Daniel`s diferenciam-se pelo cuidadoso processo de elaboração. O envelhecimento em Barris de Carvalho novos, aliado ao clima muito especial do Tennessee, lhe confere um sabor suave e marcante. Permanecendo fiel a esta receita, as pessoas podem desfrutar do mesmo whiskey que ganhou sete medalhas de ouro internacionais, quando em 1904 foi homenageado como sendo \"o melhor whiskey do mundo");
        produtos1.setId("1 L");
        produtos1.setValor("R$ 105,00");
        produtosArrayList.add(produtos1);

        Produtos produtos2 = new Produtos();
        produtos2.setNome("Red Label");
        produtos2.setImagem("https://lh3.googleusercontent.com/KDfqKjVypY1o9NOh095n_SfOKb08G0eTaOkdSBcWEbfSeURuWYBQmQUlrrXYbjZuLO97kr_JMWehAolMjm-uPoqOOHrH3Wp2izKiBNF-DCOJMXuv_3TPn5wZ48xGea2mIg186d9DivE_j0ySTZ67CCod1QNZ2iKPBafCuMdv-9ReDm3Xc3-db_H4wLE-8fkaoVBsg3XaWJvFpeK9ilPW8WiJOAuLxOAcED-fY2-rjGKwJpWAoXXhErpm6p0mDG53Jv4j57pAO19WXbra2cctQyX3SuFiWBMUBBWyqgr47kiaj0zVwmMcNpYbS6wdGQ5cxmj4eWneaOC3FujS_k_oL12pbZNeRYlrp1ixsv3LQjmofDZVOOEa4tzo181adPu0tbMiNYyU_XSnXTOChMUDDz4jo8x3LfpoiAW0rC3kIS_7Zk4BgAUB_H5G533jifY8lP_cHK8-1GuJ0avWmXVESYUEWGDF-4Ge6S7X-2Q9d3Yz-ko1OU7nQ-CzKG7nVcYO_RRFlVRCodQNCuvZ_oTMI_QB7N_UkspK0lHGyRTue6ziif1OyqNP7r6ETZgiiV-T-sKiYWMw8Fy22ipWIRSKDAFSUeSstQQcCbNl5cDOZL-IDVNdatNCjrFKfOrBZD_ZtobxORtiSoXiNWzked2uOKWEguG7Z6dyMFVrkLt73Q3rUu3Lfc2_5f28d1OXZ6TG4Xrz4JX9ctaai_saLhj7jzza0YDp5xhzJH8XIPcm5CaKgXbv=s800-no");
        produtos2.setClassificacao("https://lh3.googleusercontent.com/bYzfJ5ll2eZddosZJjmB4saKLI8MTHnZUFEAylEHDgsF5y1G_7DwH18evXe8Ofu7rkUPQsQHHR7lE5PD32P5T6UjyaJKb0WQt0LKPJ8hEuGWLa7ItNbABQJrKHlb9xioKu2dgXBEAxWsaD7gSA_BGl1Eg8gqnjfvAQSsD_T1dXXV8ZAdqHE1jL2Lqxfx9CxZsfkD0lPVnM4uYS0e5M6c698a22lhlGNd8g739K9WLRSe_qkHdfpHyz1f4qqyV955fq3eEM85zMFU1aTdRuaND7pP3XW8xqAKkwPirs3hqJZGq2JGGXIGfdlukoA3fM5BAF-eU8m9epkAEJF6THNaJf8X4zcn349KlTZFEBE0sQpMobtzuVJgznkQoOZZvQdEm6FN1fkjUMrByC2HCQ4akxURWgBDevm7UVrO5htHHOiWvCrE509Fmn9Sc79peIZo0yOaIZMyz7MVGILhj_XQjQuOc79s2kSYGDYdOWbOvNSON24D_zqH74hsGRrfC1YxySvCgM6EdZzBrS1CTDQtL57J-W39QZ-cxvKvOoosxaEIss3tSuivhCShumjHADvmA0Bj8f9cC0Q0yvwp9kl_HPPGaCH0c57pWVyCEvonpnKyO-ySlfATOxHQzVD30qf_ZoXXgfnGXQZcHbBVQ-QXF99JIDUdsDqPSqTVL9UFhZMWF7LxYjZRA9yItJ-V1WbYl0Kjb86sSZn8hgKGZaBbO28KFKe5swryjgHuJR010slTYZhE=s800-no");
        produtos2.setDescricao("É um “Blend Scotch Whisky” rico e incorporado. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade. Com aroma doce amadeirado, cravo-da-índia, doce de manteiga e sabor rico com mel. A marca Johnnie Walker existe desde 1920 e hoje é o whisky escocês mais vendido no mundo.");
        produtos2.setId("1 L");
        produtos2.setValor("R$ 70,00");
        produtosArrayList.add(produtos2);

        Produtos produtos3 = new Produtos();
        produtos3.setNome("Ballantine's");
        produtos3.setImagem("https://lh3.googleusercontent.com/Olol9wGPbJEKYSBuTYp9JKE7owqOOBGExtKwNz1e4K8bQamvnXZcudNxkszFbWa2BUyROWm1Tu66QqO3IpNt_zJtpwS1mXsJbfxEKgoSBfA7q4NyXomLM-ZyzMEVoyP8q-jDhX1HKZrDdQORpSVzeEz0r75N5-vGXeR_fgaYWMrw6ISUib2vOh428HyDJ2uUdvDf2ILHcooZk0ZU3fxrm9afB3J97QyddTevirOlbPxiNorGgsxy6xq8MLKZO2vKvwDihWLRZkaNbt9aVClVZvKFEEKJbrM0Aj-m1Oe4xtvnQHGIV6w7Tw-Qz5hWrzR_7hfHjWJTiGkL4bElMKcpnJpRFWKFgrUmEmuiRY1Jv5cSlRSSZ5AR8Pa-jmByAuni3-8CrBm3pUciWpjnk7bHc3in1Xxtux6DkxsFgRMI50RfgPIj37xsOI4s73oS0UM2taVdn71pHcUj8vZs1MS5OFMiXIRUgIaYQI3_ALm7cSQF0u7GbsANQ4EhJ2JeinyCp0i2MHosbX_-XYPlrrRdcgwAHO7zJIk4-N-aWnkrBHbesS5YX2aQWchu3WD_RQ__9nFFiT7GPPcRNOltf03LQeMNnhP_Kid2C8aljD2QFSRrK2foJ9LP2sEVV9Fgc4KfHWlNLn9zSq_FfzRDjxhm0xyhaHBX_RxC775mmy8JjTXzJFjDzszs5sgR3nMSTb55EopxyC2o3NwzgEtdCqYGyt2YPpenYAqwp7Btce3w-9IaTu-k=s800-no");
        produtos3.setClassificacao("https://lh3.googleusercontent.com/bYzfJ5ll2eZddosZJjmB4saKLI8MTHnZUFEAylEHDgsF5y1G_7DwH18evXe8Ofu7rkUPQsQHHR7lE5PD32P5T6UjyaJKb0WQt0LKPJ8hEuGWLa7ItNbABQJrKHlb9xioKu2dgXBEAxWsaD7gSA_BGl1Eg8gqnjfvAQSsD_T1dXXV8ZAdqHE1jL2Lqxfx9CxZsfkD0lPVnM4uYS0e5M6c698a22lhlGNd8g739K9WLRSe_qkHdfpHyz1f4qqyV955fq3eEM85zMFU1aTdRuaND7pP3XW8xqAKkwPirs3hqJZGq2JGGXIGfdlukoA3fM5BAF-eU8m9epkAEJF6THNaJf8X4zcn349KlTZFEBE0sQpMobtzuVJgznkQoOZZvQdEm6FN1fkjUMrByC2HCQ4akxURWgBDevm7UVrO5htHHOiWvCrE509Fmn9Sc79peIZo0yOaIZMyz7MVGILhj_XQjQuOc79s2kSYGDYdOWbOvNSON24D_zqH74hsGRrfC1YxySvCgM6EdZzBrS1CTDQtL57J-W39QZ-cxvKvOoosxaEIss3tSuivhCShumjHADvmA0Bj8f9cC0Q0yvwp9kl_HPPGaCH0c57pWVyCEvonpnKyO-ySlfATOxHQzVD30qf_ZoXXgfnGXQZcHbBVQ-QXF99JIDUdsDqPSqTVL9UFhZMWF7LxYjZRA9yItJ-V1WbYl0Kjb86sSZn8hgKGZaBbO28KFKe5swryjgHuJR010slTYZhE=s800-no");
        produtos3.setDescricao("Com sabor único e marcante, é elaborado a partir de uma especial seleção de mais de 50 diferentes tipos de maltes. A presença marcante dos maltes Miltonduff e Glenburgie, das regiões escocesas de Speyside e Highlands, respectivamente, proporcionam ao uísque notas de chocolate, maçã e baunilha ao sabor.");
        produtos3.setId("1 L");
        produtos3.setValor("R$ 65,00");
        produtosArrayList.add(produtos3);

        Produtos produtos4 = new Produtos();
        produtos4.setNome("White Horse");
        produtos4.setImagem("https://lh3.googleusercontent.com/028hVAnBYD0ic7nFXjTf2DsqKKpYtEG4Anv_D9CYrc4EEaGepsgRzpIc108qeSGe_ax3UhEKGACJBy1B7Fz5Bc43668U6w4if1oDWLz4TaDZpmzLyyj_dndZfFFZK_hj59a8qn7Bk68TJxZajj4DMEd0pmE9rYvgxWul-2Lr0W__KY4kNexDjhHVreT0508OkpI1M3pr5i2xtd-iR0r1eLJwqaoNQlt0LDmF0BGXUSIzfBhBReO64M6h9FGzMOCCB_14tJi8LF33R__2VskJdKe_bCKzJZdAx0wqOOQGD7EdtfthxAAou-mzCJ9d6pdQR3nR7QHZ0x9r-X23YWksQaNjQlXiwC5_RVLgEd20RV31ZuvHoYVdG5XIN1RZpPA7YVQWPMNyXJC_CZg6jThV2B3oLw0pTNF5P4ijpq96hA6LZncCWk5DpW-hgGjpV4wJx8fFM72d3-jTB-_qT-O_8hzlKc6u0di3BFw8oxSgy9ZRP2tWKrcN_znEggbYsTrNuWmZh7etBBPtVyrBmTi7tnvBEXAMiOIppP9g0YPGrmJCW8b_fuxbZmz_ZkUj1RxM3QXTLebSyfJMMbiqDJT5oMTzozkFM-q-zgBLzb6uLUJXWk_JSUgsjGa4I4ZKSSjHUHl_StZCGzfd3syDw7b9a7YGI5gGNQax2AJ5eRCOV0BJqsRzTzpIn9g=s800-no");
        produtos4.setClassificacao("https://lh3.googleusercontent.com/bYzfJ5ll2eZddosZJjmB4saKLI8MTHnZUFEAylEHDgsF5y1G_7DwH18evXe8Ofu7rkUPQsQHHR7lE5PD32P5T6UjyaJKb0WQt0LKPJ8hEuGWLa7ItNbABQJrKHlb9xioKu2dgXBEAxWsaD7gSA_BGl1Eg8gqnjfvAQSsD_T1dXXV8ZAdqHE1jL2Lqxfx9CxZsfkD0lPVnM4uYS0e5M6c698a22lhlGNd8g739K9WLRSe_qkHdfpHyz1f4qqyV955fq3eEM85zMFU1aTdRuaND7pP3XW8xqAKkwPirs3hqJZGq2JGGXIGfdlukoA3fM5BAF-eU8m9epkAEJF6THNaJf8X4zcn349KlTZFEBE0sQpMobtzuVJgznkQoOZZvQdEm6FN1fkjUMrByC2HCQ4akxURWgBDevm7UVrO5htHHOiWvCrE509Fmn9Sc79peIZo0yOaIZMyz7MVGILhj_XQjQuOc79s2kSYGDYdOWbOvNSON24D_zqH74hsGRrfC1YxySvCgM6EdZzBrS1CTDQtL57J-W39QZ-cxvKvOoosxaEIss3tSuivhCShumjHADvmA0Bj8f9cC0Q0yvwp9kl_HPPGaCH0c57pWVyCEvonpnKyO-ySlfATOxHQzVD30qf_ZoXXgfnGXQZcHbBVQ-QXF99JIDUdsDqPSqTVL9UFhZMWF7LxYjZRA9yItJ-V1WbYl0Kjb86sSZn8hgKGZaBbO28KFKe5swryjgHuJR010slTYZhE=s800-no");
        produtos4.setDescricao("É composto por mais de 35 maltes, uma das mais elevadas proporções de maltes nos scotch whiskies. Assim como Logan, também desenvolvido por Peter Mackie, seus principais maltes são Lagavulim, Glen Elgin e Craigellachie. White Horse foi um dos primeiros scoth a serem introduzidos no Brasil, e traz até hoje o mesmo sabor rico e único, e a mesma qualidade, aqui e no mundo inteiro.");
        produtos4.setId("1 L");
        produtos4.setValor("R$ 65,00");
        produtosArrayList.add(produtos4);
        Produtos produtos5 = new Produtos();
        produtos5.setNome("Smirnoff");
        produtos5.setImagem("https://lh3.googleusercontent.com/WDd9lOKglgbSawYbCk2-AEYnp2uQ14MP0gLwblLgMb1ARr7n7b0CfGjNWcsKAmLtalMz5CPt-v9qWeMdafpt94VFOEGhhz3uj3FxsT20NvKgKNOb1IA0KHjncyoTDiqy2Ny0fpkEKuFrUF1cBX30mRijuXeKYuoDAjmyTzDhgJj-foXHTFbrDzE19s_dJnrsAO16XNoEMelLNDb4qAIcb8hxPNAd4aGENS4-UakrfZ3PxEDfoLEnT-uP-xPwVIkUvmImg11YnjhJGUXVxwvG6PF7mcTsrRpS7wkV2PIi0i76eorI-k0eFxzDX2RgheTpVjMNMeScdgnp93yBdtc7C9o2wXsgXm2_JNnohpeNNcs5j5g9buuil2lv0USRowI_g1MkcdI_-XSGl8IaGSNAgAYI5Uo54e8B62kTXf1scyWd0Fjz6wcuxp0XCaPZxQl995iBYKU7e0J_2FdBcGOvE-jDmn4TDTQFLD7ubwiRNJ7pzwL5ngeUWCHGXFhlx8FDfRqa29v8_7LVus5AmCHsSj2m5WT0h5A11NA6s6K4jubs2LZ6aVVN8DA_1U_GFJPFYW6DIshorWvAMqNvhFCKdTV2BRq9GpZTiA0fWcgVzlcTef4HzU1cTkrAE2eFMjCHFZhSbM_YftokbficxcJUS1VDuipVQT8rLzgm-4XAljHPUKK9znUrDiY=s800-no");
        produtos5.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos5.setDescricao("Bebida composta de álcool de cereais tri destilada e dez vezes filtrada. Líder da categoria de vodka Premium no Brasil e no mundo, seu lançamento no Brasil foi em 1974, estando hoje em 150 países aproximadamente.");
        produtos5.setId("998ml");
        produtos5.setValor("R$ 35,00");
        produtosArrayList.add(produtos5);

        Produtos produtos6 = new Produtos();
        produtos6.setNome("Red Bull");
        produtos6.setImagem("https://lh3.googleusercontent.com/8K29j6RziVcdbcJEfYUR5NdcDNGT-AmzjUzRROdD1tU_ADKVJzQ3zr7LcIB03NRaLP3IFXaebuJtDQvyeJWsSkZFdhDnAYU-FU-XThFdJZdlXwBfSmgC8Xzw8xrWSh4Ck1MFeEdB544LRNwTUUSbch9f2R1zPO7HRuHdWgr-cKS_omj79x-bEDHM4uyafaFf5_hh-eKshhWxS109xKQ6f1Us2xa8ShqthgFk6qgPOCRaBRAN8gd-XwnZflmJezOHLM0KzCueFGbYWNPX0dIt6WBiW7hp8diMBlPoHPvzpBpDggKekCPYFobFmy_u5x9KcGyRko91xXA6oZ-fmkaVsj07FZ1BQ5KNzk5PQods0vNKtwSCriwA4y2D0Gg42bgvZOF2AZCbRPccWbOn5p9n9y6opD6SAfAKlUrjT3d6j3rax7jzXedJIK7Hw70vxiUhcbdtVgAMAzr1iUe_T2Gk8gJpBaTfALariEEPQxDMQ7Y1t1wc6SSM_pyGx6NKF7ZOAWHxTn8GCf1D6PgS-aftKbGa8w75Nf63i_ry5pQ0OZvjLx_9hG4oIDFHdBAsTjo59QHf1MbZfDlhLVtS8Gznl8o9zuG-FPh7FH8j-r5-3VeZv3Shd9JxXcuSe3ktjW476FjCF13VTsT1_GcTr0TMgMuNAzswciDRvzScRTku6So4budpbgwSZcw=s800-no");
        produtos6.setClassificacao("https://lh3.googleusercontent.com/8ZjcWAKUxfBKv0Mf4-IA2vJC8F2lx7jRtV7KhR6TdyECYy2KbLaBuOu57de1qHo5vHHR24SXIhsB8sEX5yWIx8NOnxyXvF2MX8hBA0tcP9HwUXFnzpRPmG664l-yEqalVWrEkrV-Rz4SCN-axE-6MqJ6IkgHr59EkygdlkoIuL3368GQecRktSmjJ6d0wvzq-ccLLGN64gA1z0BRkXCUpiTon8cHM43rDj28JWUUet_YosCoTOwWEaaDxJ9KnDVlSOYcSu5QyEK3K7GEvSao_qC5uOWrgblYjbDiKPnLjli38zJdZPN9SEex2ui_tKQdd_0yyHdLq08xAxVURm5iXUnpTUBHpej9d4ijA80VV0VDiiWuYfcMMTGbP_eYIw0RweQ4a6RnxgVSJg2MFy5PvS6xkvPK6vSrJ9WWhJigO5-cyDRGcgo7QBVJpAMl0qD-_i9nRkh-1lsHq4VXg-Eov0LFSDRQKYTWiPGzs5TtRCMsiFmsvnE1pI5TuqpC-XIxU6DqOkluCpNZigZqQ6LgQQJtNuH0rGv5fHo505QR8Duf8EjQWeS1733pzlc1Oe5EkvEZRylSgCbo3lSWGg23rYoX0ZUiswK6W2bgkQFbIn1CQhv4nMRyyNMKi9AGxJ-AGf6j5zNQyldxK_jKgdgU4ljhjPCKRFg9y7gPwMXo6tyaxnO2LZZ7YSs=s800-no");
        produtos6.setDescricao("Red Bull Energy Drink foi desenvolvido especialmente para momentos de atividade intensa ou quando precisar de energia. Graças a uma combinação única de ingredientes Red Bull Energy Drink vitaliza corpo e mente.");
        produtos6.setId("250ml");
        produtos6.setValor("R$ 7,00");
        produtosArrayList.add(produtos6);

        Produtos produtos7 = new Produtos();
        produtos7.setNome("Água Bonafont");
        produtos7.setImagem("https://lh3.googleusercontent.com/TzdCNrB5GUTpOV0uYiev9mEa_A7Jo1UfKLOZ8A8qnTUZa2mNcwAAdfVSz6Ch-F-T6kXmWOwL3iOWDwF61pAHwv_BdlbiuPsCrL1zQtDM7KaBXs9ISjyOUTv-R5UJoX-ORJVPWcFvrBUrIjvg9y7awcop-Tzb-4TD7uWNwESScKlJNkT0_3Il8WrOMEvsv4D7eduuAXEqA5HCo0kj3J72MHSd96SsN_Kzx_YuITCceZmlmf2Pwx_1qtD0BgMPdP8BbKwfhYbPOj-Grdm7LPWcPy5Yxq0gncnr57zM6MIXdhSdkW-wE12isSTKO8ACFWDGq-6faE2MHPYaKkB6imbRNbWcuxf-1GrI4bE-5eJMD5BGBj8U9zw1DLoFhKlvmNS7iYfdjErOIC-fcVNI5-dSYBiKu2ZYR75KchoIJgU2YdDu8w4jY45HAz3uaHCF4WfxpzvnzrRa-tYetedmCfEKJ6wEF3C-io8b1ygC3xLKVBLn6-JWGKRr-EXcxv_VM7RgGEw_hXu-iVhFJDOI5wlrX_1DFzik9dd2-05CSheN7_ZTe9ImqRsBqObFUoXD7NCVxBaL9bybFnl-EoYz-9TjY3FYDLSUiYwTZedSJOP4OJe23RSYxTpZgyQzz_r5FTmtJlwnfaCJtMLIqzytDDuD6nxJmvKsfyVCn2Mar-y2z-rd6HoYu73tU3A=s800-no");
        produtos7.setDescricao("Tradicional, a Bonafont 500ml é aquela que todo mundo carrega na mão. Ótima pedida para levar com você e não esquecer de se hidratar. São só 4 garrafinhas por dia!");
        produtos7.setClassificacao("https://lh3.googleusercontent.com/8ZjcWAKUxfBKv0Mf4-IA2vJC8F2lx7jRtV7KhR6TdyECYy2KbLaBuOu57de1qHo5vHHR24SXIhsB8sEX5yWIx8NOnxyXvF2MX8hBA0tcP9HwUXFnzpRPmG664l-yEqalVWrEkrV-Rz4SCN-axE-6MqJ6IkgHr59EkygdlkoIuL3368GQecRktSmjJ6d0wvzq-ccLLGN64gA1z0BRkXCUpiTon8cHM43rDj28JWUUet_YosCoTOwWEaaDxJ9KnDVlSOYcSu5QyEK3K7GEvSao_qC5uOWrgblYjbDiKPnLjli38zJdZPN9SEex2ui_tKQdd_0yyHdLq08xAxVURm5iXUnpTUBHpej9d4ijA80VV0VDiiWuYfcMMTGbP_eYIw0RweQ4a6RnxgVSJg2MFy5PvS6xkvPK6vSrJ9WWhJigO5-cyDRGcgo7QBVJpAMl0qD-_i9nRkh-1lsHq4VXg-Eov0LFSDRQKYTWiPGzs5TtRCMsiFmsvnE1pI5TuqpC-XIxU6DqOkluCpNZigZqQ6LgQQJtNuH0rGv5fHo505QR8Duf8EjQWeS1733pzlc1Oe5EkvEZRylSgCbo3lSWGg23rYoX0ZUiswK6W2bgkQFbIn1CQhv4nMRyyNMKi9AGxJ-AGf6j5zNQyldxK_jKgdgU4ljhjPCKRFg9y7gPwMXo6tyaxnO2LZZ7YSs=s800-no");
        produtos7.setId("500ml");
        produtos7.setValor("R$ 3,00");
        produtosArrayList.add(produtos7);

        Produtos produtos8 = new Produtos();
        produtos8.setNome("Energético Vibe");
        produtos8.setImagem("https://lh3.googleusercontent.com/pWoz7ALug08DLdNEx6VQZ11q194UzOn5hTNJko7WEHIwhbWcq9r66zl2ysOyUXTYZZyvLt_x7TOhLQ-hJ6B1zYpyu4wa3ZdrE3hPAvhcZ4oxJJDS3xNJH4FqO0UGbkFBpqbNmhA7NvJI0k9dME_12FviG2BLYILL9BJ_sRTwgXM2XtkjMkD8Oj4IDw3OAsuR61Xf1kL6hwFHCqpEOT56eeX58LZzPVqGNRe9-VuVpSx5Zf6y_Qoo91T9ZAFCBqs1VzQryKzqPgqYQm24bm10A5POiFcIgAFC4kJsSg3SFSEaL0hIQ9WJiG2iwIKejsHjn3QfcyLGu1yI0PBH1rkJbTn8Gw_ojeF6arrvr6ZL2uu6Ux9KecnPWkafEDwnWGFS2GVdxKPcPMNr-f2xlSbhAdZCYpBTdGW12LeJPiJoTS0m80zkYqzt_l3IBWmk97tAXuHBWteywIzj1tYKxsm-21qHGxrxXB1N_6pWsv3wZh2ybr_HalCaMTfuvBNeITZkLVGmBFbrxWv4F6gZFto7R8eL3FLgHvffIniYhEo_61sLjNh9yoSWSAEYsjYO1tRBYlDH37wI5YPwvRYFs7GxJAgarBBPf-4ijfPnCunQRaK_FQwIBMJJGHaJY-znQt6Df-L-b29DUV3USl3apl2g3_vxuVpQSBAQDlJd2YuWvSHl3aYogjTBvU8=s800-no");
        produtos8.setClassificacao("https://lh3.googleusercontent.com/8ZjcWAKUxfBKv0Mf4-IA2vJC8F2lx7jRtV7KhR6TdyECYy2KbLaBuOu57de1qHo5vHHR24SXIhsB8sEX5yWIx8NOnxyXvF2MX8hBA0tcP9HwUXFnzpRPmG664l-yEqalVWrEkrV-Rz4SCN-axE-6MqJ6IkgHr59EkygdlkoIuL3368GQecRktSmjJ6d0wvzq-ccLLGN64gA1z0BRkXCUpiTon8cHM43rDj28JWUUet_YosCoTOwWEaaDxJ9KnDVlSOYcSu5QyEK3K7GEvSao_qC5uOWrgblYjbDiKPnLjli38zJdZPN9SEex2ui_tKQdd_0yyHdLq08xAxVURm5iXUnpTUBHpej9d4ijA80VV0VDiiWuYfcMMTGbP_eYIw0RweQ4a6RnxgVSJg2MFy5PvS6xkvPK6vSrJ9WWhJigO5-cyDRGcgo7QBVJpAMl0qD-_i9nRkh-1lsHq4VXg-Eov0LFSDRQKYTWiPGzs5TtRCMsiFmsvnE1pI5TuqpC-XIxU6DqOkluCpNZigZqQ6LgQQJtNuH0rGv5fHo505QR8Duf8EjQWeS1733pzlc1Oe5EkvEZRylSgCbo3lSWGg23rYoX0ZUiswK6W2bgkQFbIn1CQhv4nMRyyNMKi9AGxJ-AGf6j5zNQyldxK_jKgdgU4ljhjPCKRFg9y7gPwMXo6tyaxnO2LZZ7YSs=s800-no");
        produtos8.setDescricao("Bebida pronta à base de taurina e cafeína. O tamanho que você procura para grandes festas ou eventos, onde não pode faltar energia, disposição");
        produtos8.setId("2 L");
        produtos8.setValor("R$ 10,00");
        produtosArrayList.add(produtos8);

        Produtos produtos9 = new Produtos();
        produtos9.setNome("Gelo de Côco");
        produtos9.setDescricao("Aquele Gelo de Côco( ou Maracujá ), para acompanhar uma das nossas ofertas de Blends Scotch Originais, e ter uma maravilhosa manhã sem dor de cabeça.");
        produtos9.setImagem("https://lh3.googleusercontent.com/EAg7nB9Nnfr-U-hhS_o9Hj9WbK8J0rezGsnvHoztecv_faYTfKaLot_Psnh10mWL8dDCHMnE6UK2C1TLJ3FWE47HsTkrqZbdpreSJ88U75MvR7iKMNJZEaYrqCvQ7YR5llWLEch6QaY_JPJhDGnqVXn4eJTHQgve7CBfs18tP5F0VpBio99lcsx8e_ei6I9fsfoOVKdh8pzw_l_vjwUBSpxXUgSS6Kx8pbGBsxfmYobhf1Jf0ANhu2iwZawaCmCJAYuo-e2Wz4Jrk23yiCKYa78v82n55IgKc7-vAq5WPJYl0Wg1bLQbnfF2y0NIXgOES9k4HdE4YkuicVVqaAFPC-bCwvuP_bAcj-dcYfevUuLPAWvYPfbgEQPAVejY_ov-HLCLz1IYwz9MV7J4AdHLI7xVAVJ-lArQN4keNTpgG4AvRYfHlwWdqevT1_kTQv0B51GD-gqIW5cr_EobGsp4ts0Z3hOqbeh3MUp7eTBtvcrN1TgijE0n-sRpYUKCeAwWnaOOq4OX_sApLvfeeoK1QtL3wWj6ZW4V_THD8lfIf6_SlG59VPlUTsMQKSUxxN8yehyPaDllHhRvkUTr91d1MP_-pNYLtiAtNsgE-h_Re94jNH20C13eY3Z4vYpvD7EO4EJa7PkZAkfq9zp-Kf8eNf8TQzotEgEoHGZbVUB0NF3YQNNuFYdbHRQ=s800-no");
        produtos9.setClassificacao("https://lh3.googleusercontent.com/8ZjcWAKUxfBKv0Mf4-IA2vJC8F2lx7jRtV7KhR6TdyECYy2KbLaBuOu57de1qHo5vHHR24SXIhsB8sEX5yWIx8NOnxyXvF2MX8hBA0tcP9HwUXFnzpRPmG664l-yEqalVWrEkrV-Rz4SCN-axE-6MqJ6IkgHr59EkygdlkoIuL3368GQecRktSmjJ6d0wvzq-ccLLGN64gA1z0BRkXCUpiTon8cHM43rDj28JWUUet_YosCoTOwWEaaDxJ9KnDVlSOYcSu5QyEK3K7GEvSao_qC5uOWrgblYjbDiKPnLjli38zJdZPN9SEex2ui_tKQdd_0yyHdLq08xAxVURm5iXUnpTUBHpej9d4ijA80VV0VDiiWuYfcMMTGbP_eYIw0RweQ4a6RnxgVSJg2MFy5PvS6xkvPK6vSrJ9WWhJigO5-cyDRGcgo7QBVJpAMl0qD-_i9nRkh-1lsHq4VXg-Eov0LFSDRQKYTWiPGzs5TtRCMsiFmsvnE1pI5TuqpC-XIxU6DqOkluCpNZigZqQ6LgQQJtNuH0rGv5fHo505QR8Duf8EjQWeS1733pzlc1Oe5EkvEZRylSgCbo3lSWGg23rYoX0ZUiswK6W2bgkQFbIn1CQhv4nMRyyNMKi9AGxJ-AGf6j5zNQyldxK_jKgdgU4ljhjPCKRFg9y7gPwMXo6tyaxnO2LZZ7YSs=s800-no");
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
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
        produtos1.setImagem("https://lh3.googleusercontent.com/j0j5M8fAe6n5X_EDn2uP13R0MSFUE7W_xEwjBEWsvvt1FqEwDIZ9Om8bgEVS51W3SoHj4PUvldjzNeXGwuRlIcfE0TP3MDjpZ1e7mVwNRGm0_W-6Aav2eT-Mnh3YuUTQVpRHRAK-nHy2up70E4FhcCDW9DJEqk2-fH3crnYqM9pPAw9aZguRNyz2FILVkgrM1PJ3cuT0g7B3D81SzGTN_lUhZdYCYaOQbuenVAYr-EYiAXxy1nsq8xrCPIpJ96tbRGxPrTdGRcCkr5NzMH2Zfjq0dPwzPWeNrdjk9L5ayDyWhDlu-pGP89WxKoN83-1Vad6XoyaY4-ZGIPGnDiLjTGJvf-yp-Zq4lWXj_H41OdGYX0DWFO5SAcbXu3CUod6JUDAOJs5rRNiwJUzEKgyVkWiAvK4iIMNV80pa3DGoS0XqFl6ygpriubGiP5tLKZVqBxSuwBvZrMV_B4iatzp5x9s5eNsHYpr2aDqM6GI5YuIZDEaMb7ZGwaafa5A3gOOyJ5TDtMH-1jnyVVxdxeBIrFU2KILAnX4tLulYIG4M7igIP57qs4CgpyZDYapSNbvszwzKQH4qEPlOz1EZFovd6jf-4ZKxiZwDQgylYQr8Y74hGNnMX3Fdl5c9dHtFYEUw0MLGBfGPsZORBuPc5-KF78pw9F35NPSY-4XvP5IUftKX_z8Aerug_oPpyz1B32LXW4qczoctjhju7s-IsSt7DnwNsvD_ZLd2cYhAAhilOQG7-4DD=s800-no");
        produtos1.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos1.setDescricao("Os whiskeys da família Jack Daniel`s diferenciam-se pelo cuidadoso processo de elaboração. O envelhecimento em Barris de Carvalho novos, aliado ao clima muito especial do Tennessee, lhe confere um sabor suave e marcante. Permanecendo fiel a esta receita, as pessoas podem desfrutar do mesmo whiskey que ganhou sete medalhas de ouro internacionais, quando em 1904 foi homenageado como sendo \"o melhor whiskey do mundo");
        produtos1.setId("1 L");
        produtos1.setValor("R$ 105,00");
        produtosArrayList.add(produtos1);
        Produtos produtos2 = new Produtos();
        produtos2.setNome("Red Label");
        produtos2.setImagem("https://lh3.googleusercontent.com/zxzASDmD2HIvE86Ko38o87vcPA_1fTyfzpk1sAZR_uWecRHl-_tbiaMmhC6k1EYwGpCn5stl8i6_Fc8ANCmLBiO36c3BjUBYCj_YIY9eivQ11DHwZmNtlL8soUtnhCWEI151v5IH6l_I37GPLf_u6QfwJgqknrqRG1DVBMhlYfwDm61Vpshhc4qIVYOLScD4-c8QfLf3FuIS16a9VJL5s2UIN_v9UQRQf-jyEZPyFxcVHhx59DFg7H1XzvpTWZ18oJlJ1SkaQfflb-V9hcIlFANE9F3PXvz4-AwsNwnt-RchHraznIvRdjjL3K8J0BZZFL9pkej47_auVbHqAEpOSn__iZH-1qcCXZz8FBx8lJJJKTv7itwzP-hqwQ6VWq4e66C_7IZz_9qUHDLAulfHikPm3bWgGyR6YYPYEBY1oMWcc5DdfAGJMb6TmGTzusvtXttDB4fNOZhx2osxnYVkaGBamc3oEXaFp5c8J6dkAtGhIEkY6IuWegKjDayaHIv3TkSfKpZFUt5pqr013nogqzutUBgZZ_vfEc22gN8zf4ZHTw3tXL4dZ4z2JAeTCJQuDKZ3NnMJ6vHOvCae49hoshYZHdAsOFqbvrGTixKehqVIQ-VEpXxPV1QCMEb7A_nxwV0SNuuMvXZvoDoLGtfBch4KKGHjBzxHfJ0zSHOahTMYMzQvgUmvP8ETv1H7bp9F5VsJvaOZn7k7LLAxpSB45IPGPzp6FvtYpu_RihsMGetwW6Le=s800-no");
        produtos2.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos2.setDescricao("É um “Blend Scotch Whisky” rico e incorporado. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade. Com aroma doce amadeirado, cravo-da-índia, doce de manteiga e sabor rico com mel. A marca Johnnie Walker existe desde 1920 e hoje é o whisky escocês mais vendido no mundo.");
        produtos2.setId("1 L");
        produtos2.setValor("R$ 70,00");
        produtosArrayList.add(produtos2);
        Produtos produtos3 = new Produtos();
        produtos3.setNome("Ballantine's");
        produtos3.setImagem("https://lh3.googleusercontent.com/kkrfxGWzCR1fB22f5OpCLo0431LztlUJUxDslTlU2ocnH_NW1P5r-s1oFFn7uOmCSvllP6TJgC_gWUW98VTURJzcDwLLDno9tYIdJETMz9W3VOZ7go4BRukpQS_9P7KfLieZNtQRBQVWJDYKzg7Yngm1lHwjopCfcBZW_uEIXxACNjTbqGHUqtO_3YyRd2q4M1017j9wSH42dovCoHgxJ_yxGnYTOSwUfxLkR9HkXZd_eSbyYQpiOmkcZz02CESJSO_qVAcZPYzVJoM3_ST53AFUYE1aWE1zHJ_3jjKrewtcqCRJySKTo-uR9cuXPZVUEZysvV-Rw0Y5TIn86gPARkPu0GGl2HtaeyfQw_VCPFeK1wiaz3HhimcTNv3o9NR7lFmFI3Khbk3A9E3u-AxjU8r1SC7By6RVhzTNy77EgfKqh1T2jHyDZflyn7X1VIwTfeEuhHrJcwIbHtwHiag7yNHVm8LsWMftY3_GVLMNmEvww62p1q4B-cIIDX8UgwA3IyCYjrcVeABFagV8YgA4czpZoQkAyuVDg7xKHLgmGpGan9tPya03JcfixidP2hvU2nLhisXXAgBUqcQ10QORKCR3bAeyPTi3PLoU4qfZA3gX8VVlKhP_qqG4tIRtZZMcXHVnAe0QN3a9eds6X0M4Cf6-qzFyssYImEyaaoNVSOeIJ4gBSglIFzcoBauBGSNKfaDLg_BbmP01RKjMact_R8Svk-C3GYxmAZiEN5XjYYpAaLtq=s800-no");
        produtos3.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos3.setDescricao("Com sabor único e marcante, é elaborado a partir de uma especial seleção de mais de 50 diferentes tipos de maltes. A presença marcante dos maltes Miltonduff e Glenburgie, das regiões escocesas de Speyside e Highlands, respectivamente, proporcionam ao uísque notas de chocolate, maçã e baunilha ao sabor.");
        produtos3.setId("1 L");
        produtos3.setValor("R$ 65,00");
        produtosArrayList.add(produtos3);
        Produtos produtos4 = new Produtos();
        produtos4.setNome("White Horse");
        produtos4.setImagem("https://lh3.googleusercontent.com/_dZDd4WfaXgSu2erDTdC3M1lZgzSm9_rpNqovZVPBczFmoytX6wkpd0XI7bzTnxp9Tsnp-BRU_8TWF7ReskIHz4koOdYRKMhtF2o5FYt6ivKScbKOLL2XJ8KVZLsXKq__i-w660QE01imckbpZU6vMJoPPWrTKwuHlKDFxdJVtse8GTNLImBsnq8leT1l-DbSXZaKBW7SFbxeIeB2lBVmnvG7NRrO1pEckBUASWyY8t6yqFM3JFUfvdhbu5IbQnhh8c8POvdsL2N_0CruM99c-17EzxCGyN0p2UJX8XC-RWEyBzh227nLOZTuMrrVT-OY9pa5Eai-YGkmAy099Gi44bCx5otteJImbtZd1WgRwHPEdJvilsvpmZnf7WAKN5R_I0yZp9OESrwLhCmtH3bFEuz40Zo5ZdqFkxLYOKwII4uU3uEI3hD3dycVC6dtZiCp0wBOR7igTkx2_3rf4ZfX_IRahqbvXwGGqale_QicKAJDFzLjTgeCjimCQZc7LOobz0DCl70RHPfG1e6WlojJxmFwWJ-hjF9xXvTD34DURx2k8C7AkXnvW5Wt-8FX4i64epjUJ1UW4daJjcbJnHiIWj7x9dqQIkhrZuWjbWs48Q5MhP6R2usosHfvB4gzX4y3yo57FwH32IRZ1Nov2lyHvx9AfyK9O8o6ELj8KTBtO8_wJiJrKO6ELFNT6obAA4ZLdVUX__MR-eQffqpCuDszJZ99JTbHssciOHNefqfeg6PL-cr=s800-no");
        produtos4.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos4.setDescricao("É composto por mais de 35 maltes, uma das mais elevadas proporções de maltes nos scotch whiskies. Assim como Logan, também desenvolvido por Peter Mackie, seus principais maltes são Lagavulim, Glen Elgin e Craigellachie. White Horse foi um dos primeiros scoth a serem introduzidos no Brasil, e traz até hoje o mesmo sabor rico e único, e a mesma qualidade, aqui e no mundo inteiro.");
        produtos4.setId("1 L");
        produtos4.setValor("R$ 65,00");
        produtosArrayList.add(produtos4);
        Produtos produtos5 = new Produtos();
        produtos5.setNome("Smirnoff");
        produtos5.setImagem("https://lh3.googleusercontent.com/J9yfe3Tb4FcmkcGpBuhiuK6gfqwRcn4KARoELJcWb33s4lpX7Zl1yBMT5pirTh6xvl860TSPhfT9D8lhqEUUm0tWuPJLuNYoz2V2JgOAww5B72JP5SDqc699UiiYL_m3-X5DYdIxywvmnU4HWZxlGeANv-lkEOW4ApYd5F010NJKCohx--h0swA-d3vM92voGVsNeGa5rEcjsSd7_hzp8X51NHgcMzMP9fV9Q7cZxqcpbMCAusOp-sFXxw7sAc-v2jGnKM-GslejbGAtW3BVC5_8DLezZYi_Ve8-mM_t1mQmb2C6irODRQdr5jqrQJZol020P6Q3lfRAxXCHW5ktOVvIR7SHSnuNfoUC300FCUi92YyCdynvcVSFLhgZv61F7jDK3tkhp2epYUHrOzNHdi-agyOw1NByNv7uaGyglCeWRIfaQXC3LS8-GQssNPyC2_NYoQcI9cU9w35jHAAijyJiouVSiEdBFlatlxdSSS_nnZmZrESQ-c9RjVl-faUrUcEpb33PZvqnn0Anp-TQOijY3gA4jyo9WuxaJFgWV6owEQwG1ub6H49vC1Ej3SRfBqZbbsfUP7t38f5yX7ItZqbgPS1pr0aI33UuC99oR72UW7IJl1rEOim3NFLLicvLQ2Ade5zbgLMj5De41Ma03eXCzTFNqT_ENDKy1aplpyGirDXwM-Eo6bKZTfJX3rxSToDB1P_lMGVkwNDXMm43HtP9lEXdrln4aCHRrKAewd7gL6fD=s800-no");
        produtos5.setClassificacao("https://lh3.googleusercontent.com/Y_SUpDh_hXf7XiEbjHqLwXpLauD6THEsOkEK3cwBf1Do-LhmmzDp10Bl7W43CQP6iAScJhMKx3rS8WKYq_H7pq46ferHIAvzP5bv65fMQOP4dcQczZlcAn5fB09MoCgp2G5sDnhnGTXmB0MHeYDn-bhawUQPLKVCe9pzR6XbmJW3TnW-nWzetifgWIjFwAaZqQhwKPK1vhT2qg31DJjwXVUafbEJ4l9j191XouFcR3auK-mZ4-_lcDQYmoIUf5bUZKMXaL_Li--ur4Kivwj6IKKIpeWXtpljpHW-CC3ovMu8rKGFzvl4kqwfNB-3MKyoexz80hIelnaxW0bqk9fov2Lvu9-hCWJffdVpbd0-zhC_CirGUYlQ1J460ibB9XVZL3PmgnHuSIJQwkZ-8kILrapHDmvhOLVVhtR0PYICJsvNVzVrWYhO9Q9l-4kXaWr-k51UzypKH18ifNySp5y6UnpaUekjUru-md4NvrEbeBpGDKu08JJacD47XVWCOU53rBB2eq_6FjWXWIAL4aNdZMfoMqMB1Te28H0DX0GjSrkfxDcn7Gaw9byDhDBny-PlPnahsw8sMHBaXbr_08VP_BcZ1VbmpoSZeZ4FvIL20YIOJECDwQHulO2Ehne0wYr5Oz2OTKG8GpmaqZ8XjNrjtJnUZc19-AVwa5UKxs7Tn7gsCsLbcw2QB014eItYwnKXFB7f2V-RoK_2qy4sN_f4qHiuHq-Ebt7o7LjKbcbxGm-e3HIO=s800-no");
        produtos5.setDescricao("Bebida composta de álcool de cereais tri destilada e dez vezes filtrada. Líder da categoria de vodka Premium no Brasil e no mundo, seu lançamento no Brasil foi em 1974, estando hoje em 150 países aproximadamente.");
        produtos5.setId("998ml");
        produtos5.setValor("R$ 35,00");
        produtosArrayList.add(produtos5);
        Produtos produtos6 = new Produtos();
        produtos6.setNome("Red Bull");
        produtos6.setImagem("https://lh3.googleusercontent.com/09j1A-oQpHYufzkMI0MilQYv163NZkRhEpiW9sCmuUR_z762pI2O-9GI6dK2esqwaonPXRTqzn4B64T7f6GuxzT_y0L3aVxPhSVpTqzXYVQ0FsdkGIYgRVxx5luqzgankQPD3Z4xRt80iFmmjZy9Lh06VYkQanop3Hbk6rMAFN1WoBafpA--9nx9PhHdIep6CGD4wtx3ysSA_K2RZrmfz7uXJQ5ZikqKq9VS1SPqCwQDoWhBWrcdy03j8c0n4psR5VYYgmF-w9OKp4s6XpKfCBT1lAYDnY84_zx8qdreIa4SsjT5vFMH3HxCS00UxHbJQDV63BjtdyamD5XBeNubdLp_GuA2Bov8ZQT2KSRkn66-VVjFSdlwQKx3u7RlhfCosg68cmOr0OTLqb2SU4IjZ5u7Pp_cJ8PlvTBqEQM-hfEmVj7D82k0j3l7N5Za1yM4mtlsNPUhBeUN1689Jb84qi_u20AqEE42rxfJk5VvWSo7D5XiHQ8SzP56Htid7icrzIKQU9qOJkm4cBbjoEVjgkioDDZgI3fRXAN40-djwJ9pfJhVnubuv3gLaMp5PR6G3gEoAdrih16WYQmmV3JcKy2ubhZQ7a-oHa3uGCVZDhi47Qa1C18Wpp4d3pneybgonTP6yL089pqZLUskN-_kJo8N1dIfd4sM2jfOtqO0BamhkbmTZKAwmDGTX3zAkMfYtdXwUcbMr8Fe_MPakyXFPlq0Lyo8h224r2-Jg3fGgcj2V_lu=s800-no");
        produtos6.setClassificacao("https://lh3.googleusercontent.com/6PRkcLb1tXwyeBWpeCUeLqh4sDuTg0aUm9AtY55HhQkxNHcyAcN8ry0qakqBR0HznfbYKKPLcnL2vfA34eMDXqlyGyTjpdeOjO1ypGMQq3o1InORKMclnTzkmKyqZZLTAWy9INDVs8LKmAGrAoP1gVKKBoh8XERcGJLIR8mHUcDdqMw9yhmp4diYGSmtv7Sqp6j38j8Dptu33Gq0cqz6VhtJf7LyUA0SaLn3OQCvw3XYIQwokhoCfrcGHs9TtwtvhHb9GsANltLtvzJilusyB1fS4DZISFIj0WjJLOGr3h26ORSEYKYmFS-d5watOh7nQD14P9gFeuw1MUzN8lZOcr-qo-z5gY7xn5pVBekcZebANBzoB3huUTXS-GtpHnP_5L2kY0HDjA4wKUwVkZLe9C4kUjMSfkgl8shezMIPxBeLed2NMQrRk_82AtJrzdD8ShBnXM839K2UbasnH7fM7ewHWtU0f-gcPD0kp-1fISp9DCeCYykv_du2qtOes4D2KjP-bCye5HrW-GvmIxNmA6O0-aHd1F54NmiaQgILa1ISfvuLMevlWm1KQBTw7LCMJ-6Rb7pV7iRMNafYl4CHRP44-o6k789hA68aFUFXM8V6ohFb6sndjDk3NZbFiIrh7I7X-h6PwBBz5BYjrSLaEOfIUCNKtIWOf34i1RAZ54r0BMwTRfIOVoCUPGUjNAh9P1vZol8TFt8ro14oLgzbQwq9pnynHUhZNnRr0LLMH7p4CNiN=s800-no");
        produtos6.setDescricao("Red Bull Energy Drink foi desenvolvido especialmente para momentos de atividade intensa ou quando precisar de energia. Graças a uma combinação única de ingredientes Red Bull Energy Drink vitaliza corpo e mente.");
        produtos6.setId("250ml");
        produtos6.setValor("R$ 7,00");
        produtosArrayList.add(produtos6);
        Produtos produtos7 = new Produtos();
        produtos7.setNome("Água Bonafont");
        produtos7.setImagem("https://lh3.googleusercontent.com/3dqBBjeBevK6dNn3sM4SxQ7o2eKmiHfsFiMbyZcJ4fRc_7H5nGF6B_VDkonpu_PeZ94J5L5XocZFg3mppHxRof5R3mJ50HPwd3bKmgWExLBXlgDDmdfRwbAGt0S0NTOz5pmIDRalnD_6WD1c1h0uruZ7a6vGGtfwLTff4LkxMGYJHkVMGMhkiAGyabw34AQ901ToOyHxaNuFf5wVlhUVuW4NzUIJJ2J8RkzAEps6VLknWFVxPVmBQwIgzxFgx-nK41YjBV8iZ_NiI-YQt30iSvwYalGW7CxRmXX1KI6wF05Zy316thtV0aUefO-x1S-0Jh0y4y8VD3b96JKbAaykRmoAWgWBOtKGpm6hctsqmwbp1j_AzhyDA9rHWER3e5O5Mw4i8V10L_9KOBWAzII0OGKEgWF6fO7TVb7eNM-6sFD0iGx8-EeJZY-VGBhpajhwvh4Aon1ubHCwTLzQgfJb4EHy7rUdQbgravuppdkLL3g0oIzkMcSDc44z0bc_WG3Q3YFtz0CQqKgU6Bs8OTGs-RabfnWsaevu_rzKY8JyAVly1WoST-utEY-rPoVMguekqY9CfX8p1yE-8wPsiiV-TQAUZRCsvK83ySVQdU0MnDjPgMoWxBvKh3zwH5yCPA9TFPb_YOGtvGEhEm33A5q9gf1v71Uxov9hU3pDdgeL5gUy5a5xFUQ6QJvnwe1fXSX9tJ7iZ9xOr6z55SHbiDXURu1l0b4xbon13HW87LfI87_JZNpb=s800-no");
        produtos7.setDescricao("Tradicional, a Bonafont 500ml é aquela que todo mundo carrega na mão. Ótima pedida para levar com você e não esquecer de se hidratar. São só 4 garrafinhas por dia!");
        produtos7.setClassificacao("https://lh3.googleusercontent.com/6PRkcLb1tXwyeBWpeCUeLqh4sDuTg0aUm9AtY55HhQkxNHcyAcN8ry0qakqBR0HznfbYKKPLcnL2vfA34eMDXqlyGyTjpdeOjO1ypGMQq3o1InORKMclnTzkmKyqZZLTAWy9INDVs8LKmAGrAoP1gVKKBoh8XERcGJLIR8mHUcDdqMw9yhmp4diYGSmtv7Sqp6j38j8Dptu33Gq0cqz6VhtJf7LyUA0SaLn3OQCvw3XYIQwokhoCfrcGHs9TtwtvhHb9GsANltLtvzJilusyB1fS4DZISFIj0WjJLOGr3h26ORSEYKYmFS-d5watOh7nQD14P9gFeuw1MUzN8lZOcr-qo-z5gY7xn5pVBekcZebANBzoB3huUTXS-GtpHnP_5L2kY0HDjA4wKUwVkZLe9C4kUjMSfkgl8shezMIPxBeLed2NMQrRk_82AtJrzdD8ShBnXM839K2UbasnH7fM7ewHWtU0f-gcPD0kp-1fISp9DCeCYykv_du2qtOes4D2KjP-bCye5HrW-GvmIxNmA6O0-aHd1F54NmiaQgILa1ISfvuLMevlWm1KQBTw7LCMJ-6Rb7pV7iRMNafYl4CHRP44-o6k789hA68aFUFXM8V6ohFb6sndjDk3NZbFiIrh7I7X-h6PwBBz5BYjrSLaEOfIUCNKtIWOf34i1RAZ54r0BMwTRfIOVoCUPGUjNAh9P1vZol8TFt8ro14oLgzbQwq9pnynHUhZNnRr0LLMH7p4CNiN=s800-no");
        produtos7.setId("500ml");
        produtos7.setValor("R$ 3,00");
        produtosArrayList.add(produtos7);
        Produtos produtos8 = new Produtos();
        produtos8.setNome("Energético Vibe");
        produtos8.setImagem("https://lh3.googleusercontent.com/8bo0BL60ELYOLxIV-vgBH6GAQegYdgTz2ksV9xEBqW3gndYvl2WmzlcVwOjJPatVU4NVhBVlQ4drDz_hTNXTQjEhT_wRVf-eeOkXJL9ZQGAR6NBai8GKIOFeKT-U-kdonNT8-FNLGF-l4wcPQ46SlnHLn3mA00BayGS7M2Hz4atm1wRL5OjOAT9P7rChfmmVXEeSfxMexOFO3qCOQtZzCZ807B-KefdkNs9PP093dYSzt5cgdVQIbb0-IqSO4NWKIFAglay1VFINCffw1-wyEm8s1zFzyCu7kp3bn_Cc4caAcQHiXXNrM5tZLSTB17kdocj-TbQpDAxranH5tdB0i_SzHNhizSFW1gof8qVPX8QL4NYcgaeJK3guoLyVWhIuaMGRniScoZ5diVZAeKly6-88We-U3wPKzPDG9sImBCXGOxvMuRYk4ZxC6rzvf7RkAKTf1FL6qK2jxxAJoSW7-NSoM_no6R7tZFUdF_o1pUqgaR-UbfPjA-AKruibemrR4V9icLRKwssr6Re1gj1Icb4e0TiKtIwiBoRUFRqIgKWL6K5tlPlfCRCAE9GyM9PJaOSkmp96L6MrkME0ygJ6fgb8iFaiQOMfUIO2rOneqH0c3nSgaRqswddSlWgH4sX078E8JLS-DjUmT4oAVbki3_88v7J4keq4GAvQXmncLxrgB09dcEOPYPbmaDxc5a23sJBozMaxT7dtAIEIuazGjZgTVAvmnPY0uTS2-Yw1YhtPPlZU=s800-no");
        produtos8.setClassificacao("https://lh3.googleusercontent.com/6PRkcLb1tXwyeBWpeCUeLqh4sDuTg0aUm9AtY55HhQkxNHcyAcN8ry0qakqBR0HznfbYKKPLcnL2vfA34eMDXqlyGyTjpdeOjO1ypGMQq3o1InORKMclnTzkmKyqZZLTAWy9INDVs8LKmAGrAoP1gVKKBoh8XERcGJLIR8mHUcDdqMw9yhmp4diYGSmtv7Sqp6j38j8Dptu33Gq0cqz6VhtJf7LyUA0SaLn3OQCvw3XYIQwokhoCfrcGHs9TtwtvhHb9GsANltLtvzJilusyB1fS4DZISFIj0WjJLOGr3h26ORSEYKYmFS-d5watOh7nQD14P9gFeuw1MUzN8lZOcr-qo-z5gY7xn5pVBekcZebANBzoB3huUTXS-GtpHnP_5L2kY0HDjA4wKUwVkZLe9C4kUjMSfkgl8shezMIPxBeLed2NMQrRk_82AtJrzdD8ShBnXM839K2UbasnH7fM7ewHWtU0f-gcPD0kp-1fISp9DCeCYykv_du2qtOes4D2KjP-bCye5HrW-GvmIxNmA6O0-aHd1F54NmiaQgILa1ISfvuLMevlWm1KQBTw7LCMJ-6Rb7pV7iRMNafYl4CHRP44-o6k789hA68aFUFXM8V6ohFb6sndjDk3NZbFiIrh7I7X-h6PwBBz5BYjrSLaEOfIUCNKtIWOf34i1RAZ54r0BMwTRfIOVoCUPGUjNAh9P1vZol8TFt8ro14oLgzbQwq9pnynHUhZNnRr0LLMH7p4CNiN=s800-no");
        produtos8.setDescricao("Bebida pronta à base de taurina e cafeína. O tamanho que você procura para grandes festas ou eventos, onde não pode faltar energia, disposição");
        produtos8.setId("2 L");
        produtos8.setValor("R$ 10,00");
        produtosArrayList.add(produtos8);
        Produtos produtos9 = new Produtos();
        produtos9.setNome("Gelo de Côco");
        produtos9.setDescricao("Aquele Gelo de Côco( ou Maracujá ), para acompanhar uma das nossas ofertas de Blends Scotch Originais, e ter uma maravilhosa manhã sem dor de cabeça.");
        produtos9.setImagem("https://lh3.googleusercontent.com/sDSuu4zPKAJ-bCEb8CbJcRVKO663fQi1Kz5uLhKvl6flQI0zNaQl8D8jhaiSY4MO1NBj6IK6TIz1DoHQtKH8ce5_uJI6K5OuGE6K9svN4JlVRF0Yow-FpAHM96SwZIbSz4ap2r8yhrTehfqYZdPOVs09Gk679Xl5KFE56TEAsjXdBSLBfvHgkUDRJphKVEqtzwt-N03_jXjGdbXHkFlXtLzOoTbWnCTk1D9mZd2Y1sgMyaX2OqyNgAcEJaCJ28rXczhlmW42fqxqB9tIJf0d3M3M_jemb-nLqPp0QKSwwAy1BvBDjmefZzX_JwI1cOFGJTNjamIGPAZXEZEWYn9X3e2BAVb-A7X-hOfLM13528XZdJrOPk7_5OUYsiCgVm_c4YdicfKsLw0RCBETUsY2BSVhBrWmyzV6CLW6VwLZOWjwBzDNkxGr8boOh51qW5ueEMiziDwLdt5EwYhWJ-D-5u6DSvRMjvExbTxE37w5gLss-ZXx9R-zzX2QkvhNpVP5JoAVmwqZmJy89M4XNC-7yrxP-kZFoIjAe3_GZ0M8BeUCjKkPwR4VGI7HnEQn1zKBuC1rKg1sweZQTnTJH4TwdFDLjScM-QbxfA2DOgdrTeLOmcYam2VZBk2EK9O-qlFw4zwzPY-qx0gTSf9FsWy3hi27bHmcMLaYyE4NZfk2FCLIQiuqYlgyoJ4GGUNm9VxZJywvMQLSfSlPY4RSNhHz0cH6G_gSOe8SKIG3zsHl7-uVOAv4=s800-no");
        produtos9.setClassificacao("https://lh3.googleusercontent.com/6PRkcLb1tXwyeBWpeCUeLqh4sDuTg0aUm9AtY55HhQkxNHcyAcN8ry0qakqBR0HznfbYKKPLcnL2vfA34eMDXqlyGyTjpdeOjO1ypGMQq3o1InORKMclnTzkmKyqZZLTAWy9INDVs8LKmAGrAoP1gVKKBoh8XERcGJLIR8mHUcDdqMw9yhmp4diYGSmtv7Sqp6j38j8Dptu33Gq0cqz6VhtJf7LyUA0SaLn3OQCvw3XYIQwokhoCfrcGHs9TtwtvhHb9GsANltLtvzJilusyB1fS4DZISFIj0WjJLOGr3h26ORSEYKYmFS-d5watOh7nQD14P9gFeuw1MUzN8lZOcr-qo-z5gY7xn5pVBekcZebANBzoB3huUTXS-GtpHnP_5L2kY0HDjA4wKUwVkZLe9C4kUjMSfkgl8shezMIPxBeLed2NMQrRk_82AtJrzdD8ShBnXM839K2UbasnH7fM7ewHWtU0f-gcPD0kp-1fISp9DCeCYykv_du2qtOes4D2KjP-bCye5HrW-GvmIxNmA6O0-aHd1F54NmiaQgILa1ISfvuLMevlWm1KQBTw7LCMJ-6Rb7pV7iRMNafYl4CHRP44-o6k789hA68aFUFXM8V6ohFb6sndjDk3NZbFiIrh7I7X-h6PwBBz5BYjrSLaEOfIUCNKtIWOf34i1RAZ54r0BMwTRfIOVoCUPGUjNAh9P1vZol8TFt8ro14oLgzbQwq9pnynHUhZNnRr0LLMH7p4CNiN=s800-no");
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
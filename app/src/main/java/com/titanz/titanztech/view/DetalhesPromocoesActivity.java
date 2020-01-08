package com.titanz.titanztech.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.titanz.titanztech.R;
import com.titanz.titanztech.models.Combos;

import cn.pedant.SweetAlert.SweetAlertDialog;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetalhesPromocoesActivity extends AppCompatActivity {

    private CircleImageView detalhePromocoesImageView;
    private CircleImageView classificacaoPromocaoImageView;
    private TextView detalhePromocoesTextView;
    private TextView nomeDetalhePromocoesTextView;
    private TextView precoDetalhesPromocoesTextView;
    private TextView energeticoTextView;
    private TextView geloTextView;
    private ImageView whatsappButton;
    private ImageView homeButtonServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_promocoes);
        getSupportActionBar().hide();

        final SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(R.color.colorPrimary);
        pDialog.setTitleText("Carregando ...");

        pDialog.setCancelable(true);

        pDialog.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pDialog.dismiss();
            }
        },1000);

        whatsappButton = findViewById(R.id.whatsapp_button_promocoes_imageView);
        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irParaTitanz();
            }
        });

        homeButtonServicos = findViewById(R.id.home_button_promocoes_imageView);
        homeButtonServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irParaHome();
            }
        });

        detalhePromocoesImageView = findViewById(R.id.detalhes_promocoes_circleImageView);
        detalhePromocoesTextView = findViewById(R.id.detalhes_promocoes_textView);
        nomeDetalhePromocoesTextView = findViewById(R.id.nome_detalhes_promocoes_textView);
        precoDetalhesPromocoesTextView = findViewById(R.id.preco_detalhes_promocoes_textView);
        classificacaoPromocaoImageView = findViewById(R.id.cicleView_promocoes_detalhes_classificacao);
        Picasso.get().load("https://lh3.googleusercontent.com/sXRxTyec4GQRxmOHmPb4vtGYZ5Pdj6tfiPmsfvsCXaiJE9dqHmeapNOiS_yyYyIYzeP0t4KHcuNUaLtuPnXcbJrMDKSf-fzKmGjMoPHDXTn8naIqfeQnrq0M-FaJWB8Fx82k7sb2MPnGd2zMoJFryDtGDAiJ_v1wBwFErZ3Mp0S4eqcbCB_Hwubo0ScZ4GlcMDxcYuFkOsscVgJpoKIDqZxGBEfDrJokskxIq7tBOT1AvKAbzlp0YoUwnVllfe8Xqwi4aMYQpj-lY6wGvntGYzj6W2Si42hfYcYmbS1MJDLWW6kcpmO_u6qHB3scwni9cnoXdmrgxz078Q0PLkVDkZk3o6t_OBTL4AQpLOuURKSCFVYmRFTzOXtklKffmKx9HtTBiKmrmLdTPxjQwO9i54Z3VtvBEuSiHsc9ScQi0fG4gHN3XO1stJN66ywwnhgIxCwwUjzJSLYQ2XIWs6TwNEQD4TAWtikZyFqnHkZ5eKJq1wmHSTCXiWlMvUByVMxS-fIakIcvyxn8s9FDPOrG1kKTCxwvaHQxL7SBGnd64IDhIwt1ZfQII9RuE6dSLzFUQsm8t0B3u5l4u8D7QELbdw36m4gJY4XWChfnfUO-LwlEsziWGDHXj61aWLMEiz4vlPXPikZva0A1No4NoynpQIU_rTY1rmCTrsqo2A6p9nVuCsEQd1j7iRw=s800-no").into(classificacaoPromocaoImageView);
        energeticoTextView = findViewById(R.id.energetico_detalhes_promocoes_textView);
        geloTextView = findViewById(R.id.gelo_detalhes_promocoes_textView);


        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Combos promocao = (Combos) bundle.getSerializable("PROMOCOES");

        energeticoTextView.setText(promocao.getEnergetico());
        geloTextView.setText(promocao.getGelo());
        nomeDetalhePromocoesTextView.setText(promocao.getNome());
        detalhePromocoesTextView.setText(promocao.getDescricao());
        nomeDetalhePromocoesTextView.setText(promocao.getNome());
        Picasso.get().load(promocao.getImagem()).into(detalhePromocoesImageView);
        precoDetalhesPromocoesTextView.setText(promocao.getValor());


    }

    private void irParaHome() {

        onBackPressed();
    }

    public void irParaTitanz(){

        String titanz = "+55 11946961255"; // use country code with your phone number
        String url = "https://api.whatsapp.com/send?phone=" + titanz;
        try {
            PackageManager pm = this.getPackageManager();
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

            final SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
            pDialog.getProgressHelper().setBarColor(R.color.colorPrimary);
            pDialog.setTitleText("Carregando ...");

            pDialog.setCancelable(true);

            pDialog.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    pDialog.dismiss();
                }
            },1000);
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "... poxa o Whatsapp não está instalado!!!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

}

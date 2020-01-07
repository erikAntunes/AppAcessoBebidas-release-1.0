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
        Picasso.get().load("https://lh3.googleusercontent.com/6jsgD32Tm1c5CjskidPJFjdER7fbcbCUAbSw_omx_J7xuXNHBWBrLW13ehzXxCRksM_suRcvF8dgVuunnaYqGrdu3RV6O0Cq2gIxgdaD6GjZ5MIwTuhoQqSc9yjxjAK8cOcXXzKm6PfSn7ceWU33ByoGqsdRqti5ABdyAUjcnNlrDDTmbRdnGXhRfQWXUZtfOJTl5vSCirLqaKmFCiWMW1qNw2nybJvkjdH3u80hQr7FCn8C7_O1YzDfMVEgZPxLc6lUKm-HVq2rnN3XwZuj-J_jrCwQU3eUEfdSfUqkwa-xhTE_eRoQn86ExDySC36WNiAGG7ADZr-mEuz-5AqHC2k3qC7nDDbeUVseEB0Z59aR9rjlaq0B5C2lVaiKNeD5nI6AXz5zA6D3J2cRTvYJnYrXW4HXjw3ci7w-66a-w8heBM348F4soh3ssbDtqNv2wjK80X29QA2wPoTwuHsMhkpA-rOQpeegm3s9KMxpjGlbObxJiIKABmBCTlqCF-k5Xw49nt1dBZGXhQqJYM-fJSuiYcmAh8_NFB2k6HT8guyOHaYNwwfZhwb7Jc1V0Q3nDZpP9sDYai8ofHBWBWA-zW7QVNRQHW3gJ0uVXhSDnuvjM0FMR8nPUQhlz-OWi27-A_1lpGLXEdejnBHs_K52O365mZmbANWnZjOFHYF8IcTryXaJUNr2orJr4m9okCQ9XVe7SEbBnFti4LLM4pIvj6QacOAmCLQSF07Y59fGIBlJ8j-z=s800-no").into(classificacaoPromocaoImageView);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Combos promocao = (Combos) bundle.getSerializable("PROMOCOES");


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
            },500);
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "... poxa o Whatsapp não está instalado!!!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

}

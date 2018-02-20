package shome.einsatzuebersicht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webViewUwz = (WebView) findViewById(R.id.view_uwz);
        webViewUwz.loadUrl("http://www.uwz.at/at/de/outwards/current_uwz.png");

        WebView webViewZamg = (WebView) findViewById(R.id.view_zamg);
        settings(webViewZamg);
        webViewZamg.loadUrl("http://warnungen.zamg.at/warnwidget/de/heute/alle/at/");
    }
    public void settings(WebView view){
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(false);
        view.getSettings().setSupportZoom(false);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebSettings viewSettings = view.getSettings();
        viewSettings.setDomStorageEnabled(true);
    }
    public void goGUEinsatz(View view){
        Intent intent= new Intent(this,gu.class);
        startActivity(intent);
    }
    public void goSTMKEinsatz(View view){
        Intent intent= new Intent(this,stmk.class);
        startActivity(intent);
    }
}

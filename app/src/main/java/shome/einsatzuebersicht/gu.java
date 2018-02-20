package shome.einsatzuebersicht;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Kevin on 20.02.2018.
 */

public class gu extends Activity{
    String bereich = "GU";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gulayout);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebSettings websettings = webView.getSettings();
        websettings.setDomStorageEnabled(true);
        webView.loadUrl("http://80.122.160.3/lfvasp/einsatzkarte/Feuerwehren_Privat.html?Bereich="+bereich);
    }

    public void doRefresh(View view){
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setDomStorageEnabled(true);
        webView.loadUrl("http://80.122.160.3/lfvasp/einsatzkarte/Feuerwehren_Privat.html?Bereich="+bereich);
    }
    public void goHome(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

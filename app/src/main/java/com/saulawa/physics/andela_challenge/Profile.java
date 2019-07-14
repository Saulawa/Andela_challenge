package com.saulawa.physics.andela_challenge;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Profile extends AppCompatActivity {
    WebView webview;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        webview = findViewById(R.id.webview);
//        progressBar = findViewById(R.id.pg);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setLoadsImagesAutomatically(true);

        webview.setWebViewClient(new SSLTolerentWebViewClient());

        webview.loadUrl("https://andela.com/alc/");

//        webview.setWebViewClient(new WebViewClient() {
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//
//                view.loadUrl(url);
//                return true;
//            }
//
//
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                progressBar.setVisibility(View.VISIBLE);
//            }
//
//
//            public void onPageFinished(WebView view, String url) {
//
//                progressBar.setVisibility(View.GONE);
//
//            }
//
//        });


        webview.setHorizontalScrollBarEnabled(false);

        webview.clearCache(true);
        webview.clearHistory();
    }


    @Override
    protected void onResume() {
        super.onResume();

        webview.loadUrl("https://andela.com/alc/");

    }
}


class SSLTolerentWebViewClient extends WebViewClient {

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // Ignore SSL certificate errors
    }

}
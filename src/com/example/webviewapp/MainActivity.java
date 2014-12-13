package com.example.webviewapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

   
   private WebView webView;

   @Override		
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      
      
      
      
      webView = (WebView) findViewById(R.id.webView1);
      webView.getSettings().setJavaScriptEnabled(true);
     // webView.getSettings().setBuiltInZoomControls(true) ;
      // this is set webview in ur activity
      webView.setWebViewClient(new WebViewClient()); 
     // webView.loadUrl("http://www.androidaspect.com/?m=1");
      
      webView.loadUrl("file:///android_asset/firsthtml.html");
        
      //browser = (WebView)findViewById(R.id.webView1);
      //browser.setWebViewClient(new MyBrowser());
   }


   /*
   public void open(View view){
      String url = "https://www.google.co.in/";
      browser.getSettings().setLoadsImagesAutomatically(true);
      browser.getSettings().setJavaScriptEnabled(true);
      browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
      browser.loadUrl(url);

   }*/
   
   
   private class MyBrowser extends WebViewClient {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
    	 // open(view);
         view.loadUrl("https://m.facebook.com/");
         return true;
      }
   }

   
}

package com.example.kakaoshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)

        // 웹뷰 자바스크립트 허용
        myWebView.settings.javaScriptEnabled = true

        // 웹뷰 로드
        myWebView.loadUrl("http://kakao-share.s3-website.ap-northeast-2.amazonaws.com/")
    }
}
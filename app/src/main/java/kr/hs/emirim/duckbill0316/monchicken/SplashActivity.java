package kr.hs.emirim.duckbill0316.monchicken;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class SplashActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        //지정 시간에 따라 화면이 넘어간다!
        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {  //익명 객
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class); //액티비티 시작시 필요한 객체 (인턴트 객체)
                startActivity(intent);
                finish(); //현재 액티비트를 닫아줌
            }
        },3000); //1초에 1000 (ms 단위)



    }


}

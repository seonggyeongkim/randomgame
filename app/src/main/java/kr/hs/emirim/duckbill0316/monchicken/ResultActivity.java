package kr.hs.emirim.duckbill0316.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreator01 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult=(TextView)findViewById(R.id.result);


        //life cycle of activity (액티비티의 생명 주기)

        Intent intent=getIntent();
        String name =intent.getStringExtra("name"); //name을 불러와 주세요!
        int age=intent.getIntExtra("age", -1); //defaultvalue : 값 x , (-1을 사용하여, 값 지정이 안되어 있음을 알려줌!)

        mResult.setText(name+"님, 안녕하세요!"); //출력
    }
}

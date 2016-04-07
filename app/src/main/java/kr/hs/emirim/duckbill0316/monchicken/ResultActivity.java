package kr.hs.emirim.duckbill0316.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator01 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {
    static String TAG="몬치킨:ResultActivity"; //밑의 log의 데이터 값에 출력

    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!"); //log에 메세지 출력!

        mResult=(TextView)findViewById(R.id.result);
        mImageView =(ImageView)findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰 연결 성공!");

        //랜덤 객체
        Random r= new Random();

        //랜덤 값 저장
        int result=r.nextInt(8);
        Log.d(TAG,"랜덤값 생성! : "+result);

        mImageView.setImageResource(R.drawable.ch01+result); //이미지의 지정된 값이 '1'씩 증가 하므로, 값 출력 가능!


        //

//        if(result==0){
//         mImageView.setImageResource(R.drawable.ch02);
//        }
//        else if(result==1){
//            mImageView.setImageResource(R.drawable.ch03);
//        }
//        else if(result==2){
//            mImageView.setImageResource(R.drawable.ch04);
//        }
//        else if(result==3){
//            mImageView.setImageResource(R.drawable.ch05);
//        }
//        else if(result==4){
//            mImageView.setImageResource(R.drawable.ch07);
//        }
//        else if(result==5){
//            mImageView.setImageResource(R.drawable.ch08);
//        }

//        switch (result){
//            case 0:mImageView.setImageResource(R.drawable.ch02);break;
//            case 1:mImageView.setImageResource(R.drawable.ch03);break;
//            case 2:mImageView.setImageResource(R.drawable.ch04);break;
//            case 3:mImageView.setImageResource(R.drawable.ch05);break;
//            case 4:mImageView.setImageResource(R.drawable.ch07);break;
//            case 5:mImageView.setImageResource(R.drawable.ch08);break;
//        }




        //life cycle of activity (액티비티의 생명 주기)

        Intent intent=getIntent();
        String name =intent.getStringExtra("name"); //name을 불러와 주세요!
        Log.d(TAG,"인텐트값 읽기 <name> : "+name);

        int age=intent.getIntExtra("age", -1); //defaultvalue : 값 x , (-1을 사용하여, 값 지정이 안되어 있음을 알려줌!)

        //int형으로 넘어온 것을 String형으로 받게 되면, NULL이 출력 된다!
        //Stirng형으로 넘어온 것을 int형으로 받게 되면, -1이 출력 된다!

        Log.d(TAG,"인텐트값 읽기 <age> : "+age);

        mResult.setText(name + "님, 안녕하세요!"); //출력
    }
}

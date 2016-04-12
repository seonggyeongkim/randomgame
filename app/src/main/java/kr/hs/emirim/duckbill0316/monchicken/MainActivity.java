package kr.hs.emirim.duckbill0316.monchicken;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;




    @Override
    //한번만 만든다!
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이름 =  타입                      아이디 (아이디는 하나만 존재!)
        mName = (EditText) findViewById(R.id.name);

        mButton=(Button) findViewById(R.id.btn_show_me_the_chicken);
        //button 을 만들 때 꼭 넣어야 하는 것 (버튼이 눌렸을 때)
        mButton.setOnClickListener(this); //this(자기 자신 main 을 불러옴)
    }

    //화면이 바뀔때 마다 나온다
    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);//(" "); 빈칸을 넣어두는 것이 좋음
    }

    /**  <-javadoc 표시
     * Called when a view has been clicked. <- 함수 설명
     *
     * @param v The view that was clicked. <- 인수
     */

    //오버라이딩된 onClick
    @Override
    public void onClick(View v) {
        //get : 얻어오는 것 , editable형을 문자로  toString()으로 반환 한다!
        String name = mName.getText().toString();

//        if(name==null){
//            Toast.makeText(this,"이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        }else {
//
//            //알림을 해주는 것 (.show 를 꼭 써줘여야 출력 될 수 있다!)
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show(); //메소드가 연속되어 실행된 것 (메소드 체이닝)
//            //이름을 입력하지 않으면, NULL point inception 발생한다.
//
//            Intent intent = new Intent(this, ResultActivity.class); // (문맥 , 다음 액티비티 )
//            startActivity(intent); //액티비티로 넘겨 지는 명령어
//        }

        //시도 하는 코드! (예외 처리를 하는 것을 도와주는 코드)
        try{
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            //값(데이터)을 넘겨주는 코드 (extra : 추가)
            intent.putExtra("name",name);
            intent.putExtra("age",18);
            startActivity(intent);
            overridePendingTransition(0, R.anim.zoom_exit);

        }catch (NullPointerException e){ //예외 처리
            Toast.makeText(this,"이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        }catch (Exception e){ //프로그램이 죽지 않게 해준다!
            Toast.makeText(this,"뭔지 모르지만 잘 안돼요!", Toast.LENGTH_LONG).show();
        }

    }
}

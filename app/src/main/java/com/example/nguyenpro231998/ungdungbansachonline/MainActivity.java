package com.example.nguyenpro231998.ungdungbansachonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btdn;
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        btdn= (Button) findViewById(R.id.btnlog);
        ed1=(EditText) findViewById(R.id.edttk);
        ed2=(EditText) findViewById(R.id.edtmk);

        btdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = ed1.getText().toString();
                String b = ed2.getText().toString();
                if(a.length()==0 && b.length()==0){
                    Toast.makeText(MainActivity.this,"Chưa nhập đủ",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (a.equals("admin") && b.equals("1")) {
                        //sử dụng Intent để gọi activity mới
                        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Sai tên đăng nhập hoặc mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}

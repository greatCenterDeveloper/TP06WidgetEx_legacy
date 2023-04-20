package com.swj.tp06widgetex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivOverflow;
    ImageView ivHeart;
    ImageView ivComment;
    ImageView ivSend;
    ImageView ivBookmark;
    ImageView ivCenterImg;
    ImageView dialogMainIv;
    ImageView dialogIv;

    int clickCount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivOverflow = findViewById(R.id.iv_overflow);
        ivHeart = findViewById(R.id.iv_heart);
        ivComment = findViewById(R.id.iv_comment);
        ivSend = findViewById(R.id.iv_send);
        ivBookmark = findViewById(R.id.iv_bookmark);
        ivCenterImg = findViewById(R.id.iv_center_img);

        ivOverflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "overflow", Toast.LENGTH_SHORT).show();
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Heart", Toast.LENGTH_SHORT).show();
            }
        });

        ivComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Comment", Toast.LENGTH_SHORT).show();
            }
        });

        ivSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Send", Toast.LENGTH_SHORT).show();
            }
        });

        ivBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Bookmark", Toast.LENGTH_SHORT).show();
            }
        });

        ivCenterImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(R.layout.dialog);

                AlertDialog dialog = builder.create();
                dialog.show();
                dialogMainIv = dialog.findViewById(R.id.dialog_main_iv);
                dialogIv = dialog.findViewById(R.id.dialog_iv);

                dialogMainIv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(clickCount == 0) dialogMainIv.setImageResource(R.drawable.newyork);
                        if(clickCount == 1) dialogMainIv.setImageResource(R.drawable.paris);
                        if(clickCount == 2) {
                            dialogMainIv.setImageResource(R.drawable.sydney);
                            clickCount = -1;
                        }
                        clickCount++;
                    }
                });

                dialogIv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(clickCount == 0) dialogMainIv.setImageResource(R.drawable.newyork);
                        if(clickCount == 1) dialogMainIv.setImageResource(R.drawable.paris);
                        if(clickCount == 2) {
                            dialogMainIv.setImageResource(R.drawable.sydney);
                            clickCount = -1;
                        }
                        clickCount++;
                    }
                });
            }
        });
    }
}
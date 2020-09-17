package cn.njcit.boxuegu;

import androidx.appcompat.app.AppCompatActivity;


import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView tvVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    private void initView() throws PackageManager.NameNotFoundException {
        tvVersion = findViewById(R.id.tv_version);
        //获取程序包信息
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(),0);
            tvVersion.setText(info.versionName);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
            tvVersion.setText("V");
        }

    }
}
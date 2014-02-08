package app.akexorcist.translateanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Main extends Activity {
	RelativeLayout layout;
	ImageView imgLogo;
	Animation anim;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        layout = (RelativeLayout)findViewById(R.id.layout);
        imgLogo = (ImageView)findViewById(R.id.imgLogo);

		Button btnNormalScale = (Button)findViewById(R.id.btnNormalScale);
		btnNormalScale.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				anim = new TranslateAnimation(0, 0, 0, 100);
				anim.setDuration(1000);
				imgLogo.startAnimation(anim);
			}
		});

		Button btnToggleScale = (Button)findViewById(R.id.btnToggleScale);
		btnToggleScale.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				anim = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, (float)0
						, Animation.RELATIVE_TO_PARENT, (float)0.25
						, Animation.RELATIVE_TO_PARENT, (float)0
						, Animation.RELATIVE_TO_PARENT, (float)0.25);
				anim.initialize(imgLogo.getWidth(), imgLogo.getHeight()
						, layout.getWidth(), layout.getHeight());
				anim.setDuration(1000);
				imgLogo.startAnimation(anim);
			}
		});
    }
}

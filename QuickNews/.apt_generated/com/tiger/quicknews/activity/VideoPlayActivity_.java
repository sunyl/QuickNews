//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.tiger.quicknews.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tiger.quicknews.R.id;
import com.tiger.quicknews.R.layout;
import io.vov.vitamio.widget.VideoView;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class VideoPlayActivity_
    extends VideoPlayActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_play_videobuffer);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(1);
        requestWindowFeature(5);
        init();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, android.view.ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static VideoPlayActivity_.IntentBuilder_ intent(Context context) {
        return new VideoPlayActivity_.IntentBuilder_(context);
    }

    public static VideoPlayActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new VideoPlayActivity_.IntentBuilder_(fragment);
    }

    public static VideoPlayActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new VideoPlayActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mLoadRate = ((TextView) hasViews.findViewById(id.load_rate));
        mVideoEnd = ((ImageView) hasViews.findViewById(id.video_end));
        mProgressBar = ((ProgressBar) hasViews.findViewById(id.probar));
        mVideoView = ((VideoView) hasViews.findViewById(id.buffer));
        initView();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<VideoPlayActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, VideoPlayActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), VideoPlayActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), VideoPlayActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

    }

}

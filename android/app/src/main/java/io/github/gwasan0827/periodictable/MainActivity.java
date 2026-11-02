package io.github.gwasan0827.periodictable;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(GallerySavePlugin.class);   // 카드 이미지를 갤러리에 바로 저장
        super.onCreate(savedInstanceState);
    }
}

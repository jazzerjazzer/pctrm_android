package piksel.oyun.pictrum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Dogancan on 29/07/15.
 */
public class ImagePagerActivity extends FragmentActivity {

    int frIndex = 1;
    Fragment fr;
    String tag;
    int titleRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag = ImagePagerFragment.class.getSimpleName();
        fr = getSupportFragmentManager().findFragmentByTag(tag);

        if (fr == null) {
            fr = new ImagePagerFragment();
        }
        titleRes = R.string.ac_name_image_pager;
        setTitle(titleRes);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, fr, tag).commit();
    }
}

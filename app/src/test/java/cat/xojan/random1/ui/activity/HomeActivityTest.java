package cat.xojan.random1.ui.activity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import cat.xojan.random1.BuildConfig;

import static junit.framework.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class HomeActivityTest {

    private HomeActivity mHomeActivity;

    @Before
    public void setUp() {
        mHomeActivity = Robolectric.setupActivity(HomeActivity.class);
    }

    @Test
    public void test_something() {
        assertNotNull(mHomeActivity);
    }
}

package e.meghna.testwithjunit4;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class MainActivityTest {
    @Rule
   public ActivityTestRule<MainActivity> mActivitytestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
      mActivity = mActivitytestRule.getActivity();
    }
    @Test
    public void Testlaunch()
    {
     View view = mActivity .findViewById( R.id.Txt1);
     assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
     mActivity =null;
    }
}
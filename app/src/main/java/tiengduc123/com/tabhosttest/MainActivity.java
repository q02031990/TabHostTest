package tiengduc123.com.tabhosttest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

import tiengduc123.com.tabhosttest.Fragment.Fragment1;
import tiengduc123.com.tabhosttest.Fragment.Fragment2;
import tiengduc123.com.tabhosttest.Fragment.Fragment3;


public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initTabHost();
        initViewPage();
    }

    void initTabHost(){
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        String[] tabName = {"Film", "History", "App"};
        for(int i=0; i<tabName.length; i++){
            TabHost.TabSpec tabSpec;
            tabSpec = tabHost.newTabSpec(tabName[i]);
            tabSpec.setIndicator(tabName[i]);
            tabSpec.setContent(new FakeContent(getApplicationContext()));
            tabHost.addTab(tabSpec);
        }
        //tabHost.setOnTabChangedListener(this);
    }

    void initViewPage(){
        viewPager = (ViewPager) findViewById(R.id.viewPage);
        List<Fragment> listFragment = new ArrayList<Fragment>();
        listFragment.add(new Fragment1());
        listFragment.add(new Fragment2());
        listFragment.add(new Fragment3());

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), listFragment);
        viewPager.setAdapter(adapter);
        //viewPager.setOnPageChangeListener(this);
    }

    /*@Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabHost.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {
        int tabCurrent = tabHost.getCurrentTab();
        viewPager.setCurrentItem(tabCurrent);
    }
*/
    public class FakeContent implements TabHost.TabContentFactory{

        Context context;
        public FakeContent(Context context){
            this.context = context;
        }

        @Override
        public View createTabContent(String tag) {
            View fakeView = new View(context);
            fakeView.setMinimumHeight(0);
            fakeView.setMinimumWidth(0);
            return fakeView;
        }
    }



}

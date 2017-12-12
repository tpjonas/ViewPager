package cimdata.android.dez2017.viewpager.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import cimdata.android.dez2017.viewpager.R;
import cimdata.android.dez2017.viewpager.fragments.ItemViewFragment;
import cimdata.android.dez2017.viewpager.services.DataService;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private ViewPager pager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar
                        .make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .show();
            }
        });

        final String[] dataList = DataService.fetchData();

        PagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            // Diese Methode gibt eine Ansicht eines Elementes zurück.
            @Override
            public Fragment getItem(int position) {
                String title = dataList[position];
                ItemViewFragment fragment = ItemViewFragment.newInstance(title);
                return fragment;
            }

            @Override
            public int getCount() {
                return dataList.length;
            }
        };

        pager = findViewById(R.id.pgr_acmain_scroller);
        pager.setAdapter(adapter);
    }

}

package geondan.surfguide.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import geondan.surfguide.HomeMenu.HomeMenuAdapter;
import geondan.surfguide.R;

public class MainActivity extends Activity
{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdaper;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.home_menu_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdaper = new HomeMenuAdapter();
        mRecyclerView.setAdapter(mAdaper);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}

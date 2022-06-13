package com.tonni.banglaquiz;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeActivity extends FragmentActivity  {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private FragmentAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        pagerAdapter = new FragmentAdapter(this);

        pagerAdapter.addFragment(new ProfileFragment());
        pagerAdapter.addFragment(new LeaderBoardFragment());
        pagerAdapter.addFragment(new QuestionInputFragment());
        pagerAdapter.addFragment(new DailyChallengeFragment());

        viewPager.setAdapter(pagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        switch(position){
                            case 0:
                                tab.setIcon(R.drawable.ic_baseline_home_24);
                                break;

                            case 1:
                                tab.setIcon(R.drawable.ic_baseline_leaderboard_24);
                                break;

                            case 2:
                                tab.setIcon(R.drawable.ic_baseline_question_answer_24);
                                break;

                            case 3:
                                tab.setIcon(R.drawable.ic_baseline_daily_challenge);
                                break;
                        }
                    }
                }).attach();
    }


}
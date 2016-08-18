package com.ga.roosevelt.project_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ArticlesHome.OnFragmentInteractionListener {
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Load fragment with data
//        Fragment fragment = ArticlesHome.newInstance("home");
//        replaceFragment(fragment);


        pager = (ViewPager) findViewById(R.id.sectionViewPager);
        pager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
//        Fragment fragment = null;
        Intent intent = null;
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id){
            case R.id.nav_login:
                intent = new Intent(this, LoginActivity.class);
            case R.id.nav_home:
                pager.setCurrentItem(0, true);
                break;
            case R.id.nav_search:
                intent = new Intent(this, SearchActivity.class);
                break;
            case R.id.nav_bookmarks:
                intent = new Intent(this, BookmarksActivity.class);
                break;
            case R.id.nav_saved:
                intent = new Intent(this, SavedArticlesActivity.class);
                break;
            case R.id.nav_section_all:
                pager.setCurrentItem(0, true);
                break;
            case R.id.nav_section_opinion:
                pager.setCurrentItem(1, true);
                break;
            case R.id.nav_section_world:
                pager.setCurrentItem(2, true);
                break;
            case R.id.nav_section_national:
                pager.setCurrentItem(3, true);
                break;
            case R.id.nav_section_politics:
                pager.setCurrentItem(4, true);
                break;
            case R.id.nav_section_upshot:
                pager.setCurrentItem(5, true);
                break;
            case R.id.nav_section_nyregion:
                pager.setCurrentItem(6, true);
                break;
            case R.id.nav_section_business:
                pager.setCurrentItem(7, true);
                break;
            case R.id.nav_section_tech:
                pager.setCurrentItem(8, true);
                break;
            case R.id.nav_section_science:
                pager.setCurrentItem(9, true);
                break;
            case R.id.nav_section_health:
                pager.setCurrentItem(10, true);
                break;
            case R.id.nav_section_sports:
                pager.setCurrentItem(11, true);
                break;
            case R.id.nav_section_arts:
                pager.setCurrentItem(12, true);
                break;
            case R.id.nav_section_books:
                pager.setCurrentItem(13, true);
                break;
            case R.id.nav_section_movies:
                pager.setCurrentItem(14, true);
                break;
            case R.id.nav_section_theater:
                pager.setCurrentItem(15, true);
                break;
            case R.id.nav_section_sunday:
                pager.setCurrentItem(16, true);
                break;
            case R.id.nav_section_fashion:
                pager.setCurrentItem(17, true);
                break;
            case R.id.nav_section_magazine:
                pager.setCurrentItem(18, true);
                break;
            case R.id.nav_section_food:
                pager.setCurrentItem(19, true);
                break;
            case R.id.nav_section_travel:
                pager.setCurrentItem(20, true);
                break;
            case R.id.nav_section_realestate:
                pager.setCurrentItem(21, true);
                break;
            case R.id.nav_section_auto:
                pager.setCurrentItem(22, true);
                break;
            case R.id.nav_section_obituaries:
                pager.setCurrentItem(23, true);
                break;
            case R.id.nav_section_insider:
                pager.setCurrentItem(24, true);
                break;

        }
//
//        if (id == R.id.nav_home) {
//            // Handle the camera action
//            fragment = ArticlesHome.newInstance("home");
//        } else if (id == R.id.nav_search) {
//            intent = new Intent(this, SearchActivity.class);
//        } else if (id == R.id.nav_bookmarks) {
//            intent = new Intent(this, BookmarksActivity.class);
//        } else if (id == R.id.nav_saved) {
//            intent = new Intent(this, SavedArticlesActivity.class);
//        } else if (id == R.id.nav_section_all) {
//            fragment = ArticlesHome.newInstance("home");
//        } else if (id == R.id.nav_section_opinion) {
//            fragment = ArticlesHome.newInstance("opinion");
//        }

        if(intent != null){
            startActivity(intent);
        }

//        if(fragment != null){
//            replaceFragment(fragment);
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter{

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            switch(position){
                case 0:
                    fragment = ArticlesHome.newInstance("home");
                    break;
                case 1:
                    fragment = ArticlesHome.newInstance("opinion");
                    break;
                case 2:
                    fragment = ArticlesHome.newInstance("world");
                    break;
                case 3:
                    fragment = ArticlesHome.newInstance("national");
                    break;
                case 4:
                    fragment = ArticlesHome.newInstance("politics");
                    break;
                case 5:
                    fragment = ArticlesHome.newInstance("upshot");
                    break;
                case 6:
                    fragment = ArticlesHome.newInstance("nyregion");
                    break;
                case 7:
                    fragment = ArticlesHome.newInstance("business");
                    break;
                case 8:
                    fragment = ArticlesHome.newInstance("technology");
                    break;
                case 9:
                    fragment = ArticlesHome.newInstance("science");
                    break;
                case 10:
                    fragment = ArticlesHome.newInstance("health");
                    break;
                case 11:
                    fragment = ArticlesHome.newInstance("sports");
                    break;
                case 12:
                    fragment = ArticlesHome.newInstance("arts");
                    break;
                case 13:
                    fragment = ArticlesHome.newInstance("books");
                    break;
                case 14:
                    fragment = ArticlesHome.newInstance("movies");
                    break;
                case 15:
                    fragment = ArticlesHome.newInstance("theater");
                    break;
                case 16:
                    fragment = ArticlesHome.newInstance("sundayreview");
                    break;
                case 17:
                    fragment = ArticlesHome.newInstance("fashion");
                    break;
                case 18:
                    fragment = ArticlesHome.newInstance("magazine");
                    break;
                case 19:
                    fragment = ArticlesHome.newInstance("food");
                    break;
                case 20:
                    fragment = ArticlesHome.newInstance("travel");
                    break;
                case 21:
                    fragment = ArticlesHome.newInstance("realestate");
                    break;
                case 22:
                    fragment = ArticlesHome.newInstance("automobiles");
                    break;
                case 23:
                    fragment = ArticlesHome.newInstance("obituaries");
                    break;
                case 24:
                    fragment = ArticlesHome.newInstance("insider");
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 25;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        if(fragment != null){
            fragmentManager.beginTransaction()
                    .replace(R.id.nav_content, fragment)
                    .commit();
        }

    }
}


/*

    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;
        Intent intent = null;
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id){
            case R.id.nav_home:
                fragment = ArticlesHome.newInstance("home");
                break;
            case R.id.nav_search:
                intent = new Intent(this, SearchActivity.class);
                break;
            case R.id.nav_bookmarks:
                intent = new Intent(this, BookmarksActivity.class);
                break;
            case R.id.nav_saved:
                intent = new Intent(this, SavedArticlesActivity.class);
                break;
            case R.id.nav_section_all:
                fragment = ArticlesHome.newInstance("home");
                break;
            case R.id.nav_section_opinion:
                fragment = ArticlesHome.newInstance("opinion");
                break;
            case R.id.nav_section_world:
                fragment = ArticlesHome.newInstance("world");
                break;
            case R.id.nav_section_national:
                fragment = ArticlesHome.newInstance("national");
                break;
            case R.id.nav_section_politics:
                fragment = ArticlesHome.newInstance("politics");
                break;
            case R.id.nav_section_upshot:
                fragment = ArticlesHome.newInstance("upshot");
                break;
            case R.id.nav_section_nyregion:
                fragment = ArticlesHome.newInstance("nyregion");
                break;
            case R.id.nav_section_business:
                fragment = ArticlesHome.newInstance("business");
                break;
            case R.id.nav_section_tech:
                fragment = ArticlesHome.newInstance("technology");
                break;
            case R.id.nav_section_science:
                fragment = ArticlesHome.newInstance("science");
                break;
            case R.id.nav_section_health:
                fragment = ArticlesHome.newInstance("health");
                break;
            case R.id.nav_section_sports:
                fragment = ArticlesHome.newInstance("sports");
                break;
            case R.id.nav_section_arts:
                fragment = ArticlesHome.newInstance("arts");
                break;
            case R.id.nav_section_books:
                fragment = ArticlesHome.newInstance("books");
                break;
            case R.id.nav_section_movies:
                fragment = ArticlesHome.newInstance("movies");
                break;
            case R.id.nav_section_theater:
                fragment = ArticlesHome.newInstance("theater");
                break;
            case R.id.nav_section_sunday:
                fragment = ArticlesHome.newInstance("sundayreview");
                break;
            case R.id.nav_section_fashion:
                fragment = ArticlesHome.newInstance("fashion");
                break;
            case R.id.nav_section_magazine:
                fragment = ArticlesHome.newInstance("magazine");
                break;
            case R.id.nav_section_food:
                fragment = ArticlesHome.newInstance("food");
                break;
            case R.id.nav_section_travel:
                fragment = ArticlesHome.newInstance("travel");
                break;
            case R.id.nav_section_realestate:
                fragment = ArticlesHome.newInstance("realestate");
                break;
            case R.id.nav_section_auto:
                fragment = ArticlesHome.newInstance("automobiles");
                break;
            case R.id.nav_section_obituaries:
                fragment = ArticlesHome.newInstance("obituaries");
                break;
            case R.id.nav_section_insider:
                fragment = ArticlesHome.newInstance("insider");
                break;

        }
//
//        if (id == R.id.nav_home) {
//            // Handle the camera action
//            fragment = ArticlesHome.newInstance("home");
//        } else if (id == R.id.nav_search) {
//            intent = new Intent(this, SearchActivity.class);
//        } else if (id == R.id.nav_bookmarks) {
//            intent = new Intent(this, BookmarksActivity.class);
//        } else if (id == R.id.nav_saved) {
//            intent = new Intent(this, SavedArticlesActivity.class);
//        } else if (id == R.id.nav_section_all) {
//            fragment = ArticlesHome.newInstance("home");
//        } else if (id == R.id.nav_section_opinion) {
//            fragment = ArticlesHome.newInstance("opinion");
//        }

        if(intent != null){
            startActivity(intent);
        }

        if(fragment != null){
            replaceFragment(fragment);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
 */
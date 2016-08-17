package com.ga.roosevelt.project_3;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.ga.roosevelt.project_3.models.search_result.SearchResult;
import com.ga.roosevelt.project_3.recycler.SearchResultRecyclerViewAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {

    SearchResultRecyclerViewAdapter mAdapter;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_search_menu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));


        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            searchArticles(query);
        }
    }

    protected void searchArticles(String query){
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(APIConstants.ARTICLE_SEARCH_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            NYTAPIService service = retrofit.create(NYTAPIService.class);

            Call<SearchResult> articlesSearch = service.searchArticles(query);

            articlesSearch.enqueue(new Callback<SearchResult>() {
                @Override
                public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {

                    Log.d("iiiiiii", "harambe");
                    if(!response.isSuccessful()){
                        Toast.makeText(SearchActivity.this, "response NOT successful", Toast.LENGTH_SHORT).show();
                        String str = response.message();
                        Log.d("iiiiiii", str);
                    }
                    try{

//                        Log.d("iiiiiii", "harambe");
                        Toast.makeText(SearchActivity.this, "response IS successful", Toast.LENGTH_SHORT).show();
                        mAdapter = new SearchResultRecyclerViewAdapter(response.body().getResponse().getDocs());
                        mRecyclerView.setAdapter(mAdapter);

                    } catch (Exception e){
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(Call<SearchResult> call, Throwable t) {

                }
            });
        }
    }
}

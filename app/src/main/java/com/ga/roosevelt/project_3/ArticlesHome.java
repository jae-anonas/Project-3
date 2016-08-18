package com.ga.roosevelt.project_3;

import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ga.roosevelt.project_3.models.Articles;
import com.ga.roosevelt.project_3.recycler.ArticleRecyclerViewAdapter;
import com.ga.roosevelt.project_3.services.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ArticlesHome.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ArticlesHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArticlesHome extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

//    private static final String ARG_PARAM_SECTION = "section";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private ArticleRecyclerViewAdapter mAdapter;
    private RecyclerView mRecyclerView;

    public ArticlesHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment ArticlesHome.
     */
    // TODO: Rename and change types and number of parameters
    public static ArticlesHome newInstance(String param1) {
        ArticlesHome fragment = new ArticlesHome();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
//        getStories(mParam1);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_articles_home, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.articleRecyclerView);
        GridLayoutManager gridLayoutManagerPortrait = new GridLayoutManager(getContext(), 2,
                LinearLayoutManager.VERTICAL, false);
        GridLayoutManager gridLayoutManagerLandscape = new GridLayoutManager(getContext(), 3,
                LinearLayoutManager.VERTICAL, false);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mRecyclerView.setLayoutManager(gridLayoutManagerPortrait);

            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(mParam1);
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mRecyclerView.setLayoutManager(gridLayoutManagerLandscape);

            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(mParam1);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getStories(mParam1);
//        mRecyclerView = (RecyclerView) getView().findViewById(R.id.articleRecyclerView);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
//                LinearLayoutManager.VERTICAL, false);
//        mRecyclerView.setLayoutManager(linearLayoutManager);
//
//        TextView textView = (TextView) getView().findViewById(R.id.textView);
//        textView.setText(mParam1);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    protected void getStories(String section) {

        ConnectivityManager connMgr = (ConnectivityManager) getContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(APIConstants.TOP_STORIES_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            //get an instance of GitHubService
            NYTAPIService service = retrofit.create(NYTAPIService.class);
//            NYTAPIService service = ServiceGenerator.createService(NYTAPIService.class);

            //Get a Call of type User with the service and getUser method
            Call<Articles> storiesCall = service.getTopStories(section);

            //use .enqueue to get the response.
            storiesCall.enqueue(new Callback<Articles>() {
                @Override
                public void onResponse(Call<Articles> call, Response<Articles> response) {
                    if (!response.isSuccessful()) {
                        Toast.makeText(getContext(), "response NOT successful", Toast.LENGTH_SHORT).show();
                        String str = response.toString();
                        Log.d("iiiiiii", str);
                    }
                    try {
//                        String title = response.body().getResults().get(0).getTitle();
//
//                        TextView textView = (TextView) getView().findViewById(R.id.textView);
//                        textView.setText(title);

                        mAdapter = new ArticleRecyclerViewAdapter(response.body().getResults());
                        mRecyclerView.setAdapter(mAdapter);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onFailure(Call<Articles> call, Throwable t) {

                }
            });
        }
    }
}

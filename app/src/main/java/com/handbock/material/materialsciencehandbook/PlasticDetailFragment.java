package com.handbock.material.materialsciencehandbook;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.webkit.WebView;

import com.handbock.material.materialsciencehandbook.dummy.DummyContent;

/**
 * A fragment representing a single Plastic detail screen.
 * This fragment is either contained in a {@link PlasticListActivity}
 * in two-pane mode (on tablets) or a {@link PlasticDetailActivity}
 * on handsets.
 */
public class PlasticDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PlasticDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Activity activity = this.getActivity();

        CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
        if (appBarLayout != null) {
            appBarLayout.setTitle(mItem.content);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.plastic_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            WebView impact = (WebView) rootView.findViewById(R.id.detail_area);
            impact.getSettings().setJavaScriptEnabled(true);
            impact.loadUrl (mItem.details);
        }

        return rootView;
    }
}

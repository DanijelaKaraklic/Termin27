package rs.aleph.android.example27.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import rs.aleph.android.example27.R;

/**
 * Created by KaraklicDM on 17.11.2017.
 */

public class ResultFragment1 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String data = getArguments().getString("dataString");
        ListView listView = (ListView) getActivity().findViewById(R.id.lv_events);
        String[] dataArray = data.split(" ");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item,dataArray);
        listView.setAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (container == null)
            return null;
        View view = inflater.inflate(R.layout.result_fragment_layout,container,false);
        return view;
    }
}

package br.ufpe.cin.vjsl.projium;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


/**
 * A simple {@link Fragment} subclass.
 */
public class ManageDataFragment extends Fragment {


    public ManageDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manage_data, container, false);
        return view;

    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        GraphView graph1 = (GraphView) view.findViewById(R.id.graph1);
        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 2),
                new DataPoint(1, 5),
                new DataPoint(2, 4),
                new DataPoint(3, 8),
                new DataPoint(4, 7)
        });
        graph1.addSeries(series1);
        GraphView graph2 = (GraphView) view.findViewById(R.id.graph2);
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 3),
                new DataPoint(1, 6),
                new DataPoint(2, 7),
                new DataPoint(3, 8),
                new DataPoint(4, 7)
        });
        graph2.addSeries(series2);

        GraphView graph3 = (GraphView) view.findViewById(R.id.graph3);
        LineGraphSeries<DataPoint> series3 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 4),
                new DataPoint(1, 6),
                new DataPoint(2, 7),
                new DataPoint(3, 6),
                new DataPoint(4, 8)
        });
        graph3.addSeries(series3);

    }

}

package br.ufpe.cin.vjsl.projium;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AtividadeFragment extends Fragment {


    public AtividadeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_atividade, container, false);
        return view;
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TableRow tableRow = (TableRow) view.findViewById(R.id.linha1exercicios);
        tableRow.setClickable(true);
        tableRow.setOnClickListener(mostraexercicioum);
    }
    private View.OnClickListener mostraexercicioum= new View.OnClickListener() {
        public void onClick(View v) {
            AtividadeOneFragment atividadeOneFragment = new AtividadeOneFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,atividadeOneFragment,atividadeOneFragment.getTag()).commit();
        }
    };

}

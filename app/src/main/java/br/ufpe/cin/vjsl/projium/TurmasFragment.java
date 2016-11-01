package br.ufpe.cin.vjsl.projium;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TurmasFragment extends Fragment {

    private Activity activity;
    public TurmasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_turmas, container, false);
        return view;

    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView textView = (TextView) view.findViewById(R.id.welcomeMessage);
        textView.append(" Urahara");
        Button button = (Button) view.findViewById(R.id.btn_cadastrar_turmas);
        button.setOnClickListener(listenerCadastrar);
        TableRow tableRow1 = (TableRow) view.findViewById(R.id.linha1);
        TableRow tableRow2 = (TableRow) view.findViewById(R.id.linha2);
        TableRow tableRow3 = (TableRow) view.findViewById(R.id.linha3);
        TableRow tableRow4 = (TableRow) view.findViewById(R.id.linhafour);
        TableRow tableRow5 = (TableRow) view.findViewById(R.id.linhafive);
        tableRow1.setClickable(true);
        tableRow2.setClickable(true);
        tableRow3.setClickable(true);
        tableRow4.setClickable(true);
        tableRow5.setClickable(true);
        tableRow1.setOnClickListener(listenerTurma1);
        tableRow2.setOnClickListener(listenerTurma2);
        tableRow3.setOnClickListener(listenerTurma3);
        tableRow4.setOnClickListener(listenerTurma4);
        tableRow5.setOnClickListener(listenerTurma5);
    }
    private View.OnClickListener listenerCadastrar = new View.OnClickListener() {
        public void onClick(View v) {
            CadastroTurmaFragment cadastroTurmaFragment = new CadastroTurmaFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,cadastroTurmaFragment,cadastroTurmaFragment.getTag()).commit();
        }
    };
    private View.OnClickListener listenerTurma1 = new View.OnClickListener(){
        public void onClick(View v){
            TurmaOneFragment turmaOneFragment = new TurmaOneFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,turmaOneFragment,turmaOneFragment.getTag()).commit();
        }
    };
    private View.OnClickListener listenerTurma2 = new View.OnClickListener(){
        public void onClick(View v){
            TurmaTwoFragment turmaTwoFragment = new TurmaTwoFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,turmaTwoFragment,turmaTwoFragment.getTag()).commit();
        }
    };
    private View.OnClickListener listenerTurma3 = new View.OnClickListener(){
        public void onClick(View v){
            TurmaThreeFragment turmaThreeFragment = new TurmaThreeFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,turmaThreeFragment,turmaThreeFragment.getTag()).commit();
        }
    };
    private View.OnClickListener listenerTurma4 = new View.OnClickListener(){
        public void onClick(View v){
            TurmaFourFragment turmaFourFragment = new TurmaFourFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,turmaFourFragment,turmaFourFragment.getTag()).commit();
        }
    };
    private View.OnClickListener listenerTurma5 = new View.OnClickListener(){
        public void onClick(View v){
            TurmaFiveFragment turmaFiveFragment = new TurmaFiveFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_replace,turmaFiveFragment,turmaFiveFragment.getTag()).commit();
        }
    };


}

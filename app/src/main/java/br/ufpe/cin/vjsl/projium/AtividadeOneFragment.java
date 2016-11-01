package br.ufpe.cin.vjsl.projium;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AtividadeOneFragment extends Fragment {
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private Context context;
    private View view;
    private Activity activity;

    public AtividadeOneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        this.activity = activity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atividade_one, container, false);
        return view;
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        context = view.getContext();
        EditText editText1 = (EditText) view.findViewById(R.id.resposta1);
        EditText editText2 = (EditText) view.findViewById(R.id.resposta2);
        EditText editText3 = (EditText) view.findViewById(R.id.resposta3);
        EditText editText4 = (EditText) view.findViewById(R.id.resposta4);
        EditText editText5 = (EditText) view.findViewById(R.id.resposta5);
        question1 = editText1.getText().toString();
        question2 = editText2.getText().toString();
        question3 = editText3.getText().toString();
        question4 = editText4.getText().toString();
        question5 = editText5.getText().toString();
        Button btn = (Button) view.findViewById(R.id.btn_atividade_testar);
        btn.setOnClickListener(listener_testa_exercicio);

    }
    private View.OnClickListener listener_testa_exercicio= new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(context,"Suas respostas foram enviadas para o professor", Toast.LENGTH_LONG).show();
            Toast.makeText(context, "Consulte seu professor para verificar seu desempenho neste exercício", Toast.LENGTH_LONG).show();
        }
    };

}

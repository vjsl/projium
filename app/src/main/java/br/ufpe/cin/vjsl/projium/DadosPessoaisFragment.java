package br.ufpe.cin.vjsl.projium;


import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
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
public class DadosPessoaisFragment extends Fragment {

    private Context context;
    public DadosPessoaisFragment() {
        // Required empty public constructor
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dados_pessoais, container, false);
        return view;
        
    }

    public void salvarDados(View v){
        EditText txtNome = (EditText) v.findViewById(R.id.txtNomeCompleto);
        EditText txtApelido = (EditText) v.findViewById(R.id.txtApelido);
        String nome = txtNome.getText().toString();
        String apelido = txtApelido.getText().toString();
        DBManager manager = new DBManager(context);
        manager.addDadosPessoais(nome,apelido);
        Toast.makeText(context, "Dados salvos com sucesso", Toast.LENGTH_SHORT);

    }

}

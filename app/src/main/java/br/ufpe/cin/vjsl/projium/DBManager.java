package br.ufpe.cin.vjsl.projium;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vitor on 24/10/16.
 */

public class DBManager {
    private static DBHelper dbHelper = null;
    private Context context;

    public DBManager(Context context){
        if (dbHelper == null){
            dbHelper = new DBHelper(context);
        }
        this.context = context;
    }
    public void addItem(String disciplina, String escola, String sala, String horario){
        String sql = "INSERT INTO turmas (disciplina, escola, sala, horario) VALUES ('"+
                disciplina+"', '"+
                escola+"', '"+
                sala+"', '"+
                horario+"');";
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL(sql);
        System.out.println("Dados inseridos");
    }
    public void addDadosPessoais(String nomeCompleto, String apelido){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL("DELETE * FROM dadospessoais");
        String sql = "INSERT INTO dadospessoais(nomecompleto, apelido) VALUES ('"+nomeCompleto+"', '"+apelido+"';";
        db.execSQL(sql);
        Toast.makeText(context, "Dados inseridos com sucesso!", Toast.LENGTH_SHORT);
        System.out.print("Inserido com sucesso!!!!");
    }
    public ArrayList<String> getAllItens(){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String sql = "SELECT disciplina FROM turmas";
        Cursor cursor = db.rawQuery(sql,null);
        ArrayList<String> dados = null;
        if(cursor !=null && cursor.moveToFirst()) {
            dados = new ArrayList<String>();
            do{
                dados.add(cursor.getString(0));
            }while(cursor.moveToNext());
        }
        return dados;
    }
}

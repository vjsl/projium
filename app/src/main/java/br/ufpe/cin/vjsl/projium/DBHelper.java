package br.ufpe.cin.vjsl.projium;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "dados.db";
    private static int DB_VERSION = 1;

    private static String TABLE_TURMAS =
            "CREATE TABLE turmas(id INTEGER PRIMARY KEY AUTOINCREMENT, disciplina TEXT, escola TEXT, sala TEXT, horario TEXT);";
    private static String TABLE_DADOS_PESSOAIS = "CREATE TABLE dadospessoais(nomecompleto TEXT, apelido TEXT);";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_TURMAS);
        db.execSQL(TABLE_DADOS_PESSOAIS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
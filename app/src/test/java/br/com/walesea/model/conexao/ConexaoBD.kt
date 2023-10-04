package br.com.walesea.model.conexao

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.VERSION
import org.junit.runner.manipulation.Ordering.Context
import java.util.jar.Attributes.Name

class ConexaoBD(contexto : Context) : SQLiteOpenHelper(contexto, NAME,null, VERSION) {
    companion object{
        private  val NAME : String = "bdWale"
        private  val VERSION : Int = 1
    }

    override fun onCreate(p0: SQLiteDatabase?){
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
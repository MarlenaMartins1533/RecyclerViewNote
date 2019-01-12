package com.marlena.recyclerviewnote
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        note_list_recyclerview.adapter = NoteListAdapter(notes(),this)

        val layoutManager = LinearLayoutManager(this)
        note_list_recyclerview.layoutManager = layoutManager
    }

    private fun notes(): List<Note>{
        return listOf(
            Note("Leitura",
                "Livro 1"),
            Note("Pesquisa",
                "Livro 2"),
            Note("Estudo",
                "Livro 3")
        )
    }
}


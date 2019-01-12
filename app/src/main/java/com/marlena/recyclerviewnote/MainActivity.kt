package com.marlena.recyclerviewnote

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextTXT.setOnClickListener {
            nextPage()
        }
    }

    private fun nextPage () {
        val intent = Intent(this, NoteListActivity::class.java)
        startActivity(intent)

    }
    /*
        Intent nextpage = new Intent(nextTXT.this, ListActivity.class);
    startActivity(nextpage);
        }*/
}


package com.marlena.recyclerviewnote


import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.note_item.view.*


//NoteListAdapter
class NoteListAdapter (private val notes: List<Note>,
                       private val context:Context) : Adapter<NoteListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val note = notes[position]

        holder?.let{
            it.title.text = note.title
            it.description.text = note.description
            //val people: String? = null
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.note_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindView(note: Note) {
            val title = itemView.note_item_title
            val description = itemView.note_item_description

            title.text = note.title
            description.text = note.description
        }
    }
}
/* (val people: ArrayList<Person>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
class ViewHolder (people: ArrayList<Person>): RecyclerView.ViewHolder(people) {
        val

*/

package pt.ipt.dama.androidapi.ui.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.Text
import pt.ipt.dama.androidapi.R
import pt.ipt.dama.androidapi.model.Note

class NoteListAdapter (

    private val notes : List<Note>,
    private val context: Context
):RecyclerView.Adapter<NoteListAdapter.ViewHolder>()
{
    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteListAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.note_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteListAdapter.ViewHolder, position: Int) {
        val note = notes[position]
        holder?.let{
            it.bindView(note)
        }

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bindView(note : Note){
            val  auxTitle: TextView = itemView.findViewById(R.id.noteItemTitle)
            val auxDescription:TextView=itemView.findViewById(R.id.noteItemDescription)

            auxTitle.text = note.title
            auxDescription.text = note.description
        }

    }
}





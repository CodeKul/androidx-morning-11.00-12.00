package com.codekul.androidnewmorning


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val parAct = activity as MainActivity
        view.findViewById<Button>(R.id.btCy).setOnClickListener {
            parAct.nowChangeImage(R.drawable.ic_motorcycle_black_24dp)
        }
        view.findViewById<Button>(R.id.btBs).setOnClickListener {
            parAct.nowChangeImage(R.drawable.ic_directions_bus_black_24dp)
        }
        view.findViewById<Button>(R.id.btPl).setOnClickListener {
            parAct.nowChangeImage(R.drawable.ic_airplanemode_active_black_24dp)
        }
    }
}

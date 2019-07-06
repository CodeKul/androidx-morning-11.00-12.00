package com.codekul.androidnewmorning


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


/**
 * A simple [Fragment] subclass.
 *
 */
class OneFragment : Fragment() {

    val onImgChange : (img : Int) -> Unit =  {
        img -> view?.findViewById<ImageView>(R.id.imageView)?.setImageResource(img)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(
            R.layout.fragment_one,
            container,
            false
        )
    }
}

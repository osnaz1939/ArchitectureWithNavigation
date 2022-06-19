package ost.host.module_with_nav_second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import ost.host.base_interfaces.BaseNavigationApplication

class TwoSecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button_two)

        button.setOnClickListener {
            (requireActivity().application as BaseNavigationApplication).navigateToSharedModule(findNavController(),"test2")
        }
    }
}
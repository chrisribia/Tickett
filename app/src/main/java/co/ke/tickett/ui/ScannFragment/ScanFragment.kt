package co.ke.tickett.ui.ScannFragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import co.ke.tickett.R

class ScanFragment : Fragment() {

    companion object {
        fun newInstance() = ScanFragment()
    }

    private lateinit var viewModel: ScanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.scan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ScanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
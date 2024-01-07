package com.example.riansyahsetiawan.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.riansyahsetiawan.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textAppNameView: TextView = binding.textAppName
        val textAppVersionView: TextView = binding.textAppVersion
        val textDeveloperView: TextView = binding.textDeveloper
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textAppNameView.text = it
        }
        dashboardViewModel.textVersion.observe(viewLifecycleOwner) {
            textAppVersionView.text = it
        }
        dashboardViewModel.textDeveloper.observe(viewLifecycleOwner) {
            textDeveloperView.text = it
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
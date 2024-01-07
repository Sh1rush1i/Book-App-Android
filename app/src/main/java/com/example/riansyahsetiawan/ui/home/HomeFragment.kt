package com.example.riansyahsetiawan.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.riansyahsetiawan.*
import com.example.riansyahsetiawan.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val cardView1:CardView=binding.card1
        val cardView2:CardView=binding.card2
        val cardView3:CardView=binding.card3
        val cardView4:CardView=binding.card4
        val cardView5:CardView=binding.card5
        val cardView6:CardView=binding.card6
        val cardView7:CardView=binding.card7

        cardView1.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book1Activity::class.java))
                finish()
            }
        }
        cardView2.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book2Activity::class.java))
                finish()
            }
        }
        cardView3.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book3Activity::class.java))
                finish()
            }
        }
        cardView4.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book4Activity::class.java))
                finish()
            }
        }
        cardView5.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book5Activity::class.java))
                finish()
            }
        }
        cardView6.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Book6Activity::class.java))
                finish()
            }
        }
        cardView7.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, OthersActivity::class.java))
                finish()
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
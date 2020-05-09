package com.ismailhakkiaydin.football.ui.setting

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import androidx.lifecycle.Observer

import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.base.BaseVMFragment
import com.ismailhakkiaydin.football.model.country.Country
import com.ismailhakkiaydin.football.util.CustomSharedPreferences
import kotlinx.android.synthetic.main.fragment_setting.*


class SettingFragment : BaseVMFragment<SettingViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var sharedPreferences = activity?.applicationContext?.getSharedPreferences("id", Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()

        viewModel.getAllCountries()
        viewModel.countriesList.observe(viewLifecycleOwner, Observer {
            var list = arrayListOf("")
            for (i in 1..62) {
                list.add(it[i].country)
            }
            val adapter = ArrayAdapter<String>(
                requireContext(),
                R.layout.support_simple_spinner_dropdown_item,
                list
            )
            spnCountries.adapter = adapter

            spnCountries.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    editor?.putInt("a",position)
                    editor?.commit()
                    val selectedCountry = parent?.selectedItem.toString()
                    editor?.putString("country", selectedCountry)
                    editor?.commit()
                    Log.i("POSITION -" , " "+sharedPreferences?.getInt("a", 1201))
                    Log.i("VALUE -" , " "+sharedPreferences?.getString("country","0"))
                }
            }
            val a = sharedPreferences?.getInt("a",5)
            spnCountries.setSelection(a!!)
            Log.i("POSITION +" , " "+sharedPreferences?.getInt("a", 1201))
            Log.i("VALUE +" , " "+sharedPreferences?.getString("country","0"))

        })

        Log.i("POSITION " , " "+sharedPreferences?.getInt("a", 1201))
        Log.i("VALUE " , " "+sharedPreferences?.getString("country","0"))

    }

    override fun getViewModel(): Class<SettingViewModel> = SettingViewModel::class.java

}

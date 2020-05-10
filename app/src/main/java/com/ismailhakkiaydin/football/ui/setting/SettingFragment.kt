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
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.get
import androidx.lifecycle.Observer

import com.ismailhakkiaydin.football.R
import com.ismailhakkiaydin.football.base.BaseVMFragment
import com.ismailhakkiaydin.football.model.country.Country
import com.ismailhakkiaydin.football.util.CustomSharedPreferences
import kotlinx.android.synthetic.main.fragment_setting.*


class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var customPreferences = CustomSharedPreferences(activity?.applicationContext!!)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            var radioButton = radioGroup.findViewById<RadioButton>(checkedId)
            var radioButtonId = radioGroup.indexOfChild(radioButton)
            when(radioButton.id){
                R.id.rbEngland -> customPreferences.saveCountryId(524)
                R.id.rbGermany -> customPreferences.saveCountryId(754)
                R.id.rbItaly -> customPreferences.saveCountryId(891)
                R.id.rbSpain -> customPreferences.saveCountryId(775)
                R.id.rbFrance -> customPreferences.saveCountryId(525)
                R.id.rbTurkey -> customPreferences.saveCountryId(782)
                R.id.rbHolland -> customPreferences.saveCountryId(566)
                R.id.rbGreece -> customPreferences.saveCountryId(787)
                R.id.rbPortugal -> customPreferences.saveCountryId(766)
                R.id.rbRussia -> customPreferences.saveCountryId(511)
            }
            customPreferences.saveRbCountry(radioButtonId)
        }

        var radioButtonResult= customPreferences.getRbCountry()
        var countryIdResult = customPreferences.getCountryId()
        Toast.makeText(requireContext(), "League Selected "+countryIdResult, Toast.LENGTH_SHORT).show()
        var selectedRadioButton : RadioButton = radioGroup.getChildAt(radioButtonResult!!) as RadioButton
        selectedRadioButton.isChecked = true
    }
}

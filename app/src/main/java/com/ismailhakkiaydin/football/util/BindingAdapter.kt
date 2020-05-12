package com.ismailhakkiaydin.football.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.ismailhakkiaydin.football.R

@BindingAdapter("android:backgroundLeagueState")
fun setBackgroundLeagueState(textView: TextView, url:String?){
    if (url == "Promotion - Champions League (Group Stage)"){
        textView.setBackgroundColor(textView.resources.getColor(R.color.colorChampionsLeagueGroup))
    }else if (url == "Promotion - Champions League (Qualification)"){
        textView.setBackgroundColor(textView.resources.getColor(R.color.colorChampionsLeagueQualification))
    }else if (url == "Promotion - Europa League (Group Stage)"){
        textView.setBackgroundColor(textView.resources.getColor(R.color.colorEuropaLeagueGroup))
    }else if (url == "Promotion - Europa League (Qualification)"){
        textView.setBackgroundColor(textView.resources.getColor(R.color.colorEuropaLeagueQualification))
    }else if (url == "Promotion - Eredivisie (Europa League - Play Offs)"){
        textView.setBackgroundColor(textView.resources.getColor(R.color.colorEredivisie))
    }else if (url == null){
        textView.setBackgroundColor(textView.resources.getColor(android.R.color.transparent))
    }
}
package com.abacha.azkarapp.data

import android.content.Context
import androidx.compose.ui.res.stringResource
import com.abacha.azkarapp.R
import com.abacha.azkarapp.model.DoaaData
import java.io.File
import java.io.OutputStreamWriter
import java.io.PrintWriter
import java.nio.charset.StandardCharsets

class AdiyaData {

    fun getSabahAdiya() : List<DoaaData> {
        return listOf<DoaaData>(
            DoaaData(R.string.ayat_alKorsi, 1),
            DoaaData(R.string.al_ikhlas, 3),
            DoaaData(R.string.al_falaq, 3),
            DoaaData(R.string.al_nas, 3),
            DoaaData(R.string.doaaSabah, 1),
            DoaaData(R.string.doaa, 1),
            DoaaData(R.string.doaa1, 3),
            DoaaData(R.string.doaa2, 100),
            DoaaData(R.string.doaa3, 1),
            DoaaData(R.string.doaa4, 3),
        )
    }


    fun getMasaaData() : List<DoaaData> {
        return listOf<DoaaData>(
            DoaaData(R.string.ayat_alKorsi, 1),
            DoaaData(R.string.al_ikhlas, 3),
            DoaaData(R.string.al_falaq, 3),
            DoaaData(R.string.al_nas, 3),
            DoaaData(R.string.massadoaa1, 1),
            DoaaData(R.string.massadoaa2, 1),
            DoaaData(R.string.massadoaa3, 3),
            DoaaData(R.string.doaa, 1),
            DoaaData(R.string.doaa1, 3),
            DoaaData(R.string.doaa2, 100),
            DoaaData(R.string.doaa3, 1),
            DoaaData(R.string.doaa4, 3),
        )
    }
    fun getSalahData() : List<DoaaData> {
        return listOf<DoaaData>(
            DoaaData(R.string.salah1, 1),
            DoaaData(R.string.salah2, 1),
            DoaaData(R.string.ayat_alKorsi, 1),
            DoaaData(R.string.al_ikhlas, 1),
            DoaaData(R.string.al_falaq, 1),
            DoaaData(R.string.al_nas, 1),
            DoaaData(R.string.salah3, 1),
            DoaaData(R.string.salah4, 33),
            DoaaData(R.string.salah5, 1),
        )
    }
    fun getNawmData() : List<DoaaData> {
        return listOf<DoaaData>(
            DoaaData(R.string.ayat_alKorsi, 3),
            DoaaData(R.string.al_ikhlas, 3),
            DoaaData(R.string.al_falaq, 3),
            DoaaData(R.string.al_nas, 3),
            DoaaData(R.string.sleep1, 1),
            DoaaData(R.string.sleep2, 1),
            DoaaData(R.string.sleep3, 33),
            DoaaData(R.string.sleep5, 33),
            DoaaData(R.string.sleep4, 34),
            DoaaData(R.string.sleep6, 1),

        )
    }


    fun getMonawaData() : List<DoaaData> {
        return listOf<DoaaData>(
            DoaaData(R.string.other, 1),
            DoaaData(R.string.other1, 1),
            DoaaData(R.string.other2, 1),
            DoaaData(R.string.other3, 1),
            DoaaData(R.string.other5, 1),

            )
    }






}
package com.example.matkul.data

import com.example.matkul.R
import com.example.matkul.model.Matkul

class Datasource {
    fun load_matkul(): List<Matkul>{
        return listOf<Matkul>(
            Matkul(R.string.matkul1, R.drawable.image1, R.string.sks1),
            Matkul(R.string.matkul2, R.drawable.image2, R.string.sks2),
            Matkul(R.string.matkul3, R.drawable.image3, R.string.sks3),
            Matkul(R.string.matkul4, R.drawable.image4, R.string.sks4),
            Matkul(R.string.matkul5, R.drawable.image5, R.string.sks5),
            Matkul(R.string.matkul6, R.drawable.image6, R.string.sks6),
            Matkul(R.string.matkul7, R.drawable.image7, R.string.sks7),
            Matkul(R.string.matkul8, R.drawable.image8, R.string.sks8),
            Matkul(R.string.matkul9, R.drawable.image9, R.string.sks9),
            Matkul(R.string.matkul10, R.drawable.image10, R.string.sks10),
        )
    }

}
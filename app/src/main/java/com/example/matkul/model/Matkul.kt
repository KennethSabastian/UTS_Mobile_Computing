package com.example.matkul.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId2: Int

)

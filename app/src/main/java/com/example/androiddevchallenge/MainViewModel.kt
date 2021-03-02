/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.beans.Dog

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            Dog(
                "Lee Loy", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_nala
            ),
            Dog(
                "Lulu", "Terrier Mix", "Sunnyvale, CA",
                "Young", "Female", "Medium", R.drawable.img_puppy_lulu
            ),
            Dog(
                "Billy", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
                "Adult", "Male", "Large", R.drawable.img_puppy_billy
            ),
            Dog(
                "Arnie", "Chihuahua Mix", "Mountain View, CA",
                "Young", "Male", "Small", R.drawable.img_puppy_arnie
            ),
            Dog(
                "Doby", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Dog", "Female", "Medium", R.drawable.img_puppy_doby
            ),
            Dog(
                "Bowen", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Dog", "Male", "Medium", R.drawable.img_puppy_bowen
            ),
            Dog(
                "Rumi", "Border Collie & German Shepherd Dog Mix", "Los Altos, CA",
                "Young", "Male", "Medium", R.drawable.img_puppy_rumi
            ),
            Dog(
                "Mikey", "Chihuahua & Rat Terrier Mix", "Santa Clara, CA",
                "Young", "Male", "Medium", R.drawable.img_puppy_mikey
            ),
            Dog(
                "Layla", "Chihuahua & Terrier Mix", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.img_puppy_layla
            ),
            Dog(
                "Tessie", "Pit Bull Terrier Mix", "Santa Clara, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_tessie
            ),
            Dog(
                "Sia", "Pit Bull Terrier", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.img_puppy_sia
            ),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }
}

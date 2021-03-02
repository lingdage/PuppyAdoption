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
package com.example.androiddevchallenge.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.MainViewModel
import kotlinx.coroutines.launch

@Preview
@Composable
fun Index() {
    val snackHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Dog Adoption") })
        },
        snackbarHost = {
            SnackbarHost(hostState = snackHostState)
        }
    ) {

        val viewModel: MainViewModel = viewModel()
        val currentDog = viewModel.currentDog
        DogList(viewModel.dogs) { dog ->
            if (currentDog == null) {
                viewModel.showDog(dog)
            }
        }
        if (currentDog != null) {
            DogDetails(currentDog) {
                coroutineScope.launch {
                    snackHostState.showSnackbar("You have adopted ${currentDog.name}")
                }
            }
        }
    }
}

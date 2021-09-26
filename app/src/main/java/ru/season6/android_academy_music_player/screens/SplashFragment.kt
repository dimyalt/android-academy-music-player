package ru.season6.android_academy_music_player.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.season6.android_academy_music_player.R

class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // переход на фрагмент логина
        view.findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
    }
}
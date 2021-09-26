package ru.season6.android_academy_music_player.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.season6.android_academy_music_player.R

class RegistrationFragment: Fragment(R.layout.fragment_registration) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // создаём экземпляр кнопки регистрации
        // задаём обработчик нажатия на кнопку -> открыть фрагмент логина
        val buttonRegistration: Button = view.findViewById(R.id.registration_button_registration)
        buttonRegistration.setOnClickListener {
            view.findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
            Toast.makeText(context, "Вы зарегестрированы! Авторизуйтесь", Toast.LENGTH_LONG).show()
        }
    }
}
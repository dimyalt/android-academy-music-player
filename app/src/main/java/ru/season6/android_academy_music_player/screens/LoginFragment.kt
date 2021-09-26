package ru.season6.android_academy_music_player.screens

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.season6.android_academy_music_player.R

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // создаём экземпляр кнопки регистрации
        // задаём обработчик нажатия на кнопку -> открыть фрагмент регистрации
        val buttonRegistration: Button = view.findViewById(R.id.login_button_registration)
        buttonRegistration.setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }

        // создаём экземпляр кнопки логина
        // задаём обработчик нажатия на кнопку -> открыть фрагмент регистрации
        val buttonLogin: Button = view.findViewById(R.id.login_button_login)
        buttonLogin.setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
            Toast.makeText(context, "Вы зашли, поздравляем!", Toast.LENGTH_LONG).show()
        }
    }

}
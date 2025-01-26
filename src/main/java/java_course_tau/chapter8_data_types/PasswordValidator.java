package java_course_tau.chapter8_data_types;

public class PasswordValidator {

    public boolean validatePassword(String newPassword, String username, String oldPassword) {
        // Проверка на минимальную длину
        if (newPassword.length() < 8) {
            return false; // слишком короткий
        }

        // Проверка на заглавные буквы
        if (!newPassword.matches(".*[A-Z].*")) {
            return false; // нет заглавной буквы
        }

        // Проверка на специальный символ
        if (!newPassword.matches(".*[^a-zA-Z0-9].*")) {
            return false; // нет специального символа
        }

        // Проверка, чтобы пароль не содержал имя пользователя
        if (newPassword.toLowerCase().contains(username.toLowerCase())) {
            return false; // содержит имя пользователя
        }

        // Проверка на совпадение с старым паролем
        if (newPassword.equals(oldPassword)) {
            return false; // совпадает с предыдущим паролем
        }

        // Если все проверки прошли, пароль валиден
        return true;
    }
}


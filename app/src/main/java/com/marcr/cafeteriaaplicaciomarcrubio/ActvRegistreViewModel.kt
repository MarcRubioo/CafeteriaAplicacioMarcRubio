import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marcr.aplicaciologinbdmarcrubio.AccountModel
import com.marcr.aplicaciologinbdmarcrubio.AccountProvider

class ActvRegistreViewModel : ViewModel() {

    private val _user = MutableLiveData<String>()
    val user: LiveData<String> = _user

    fun createUser(user: String, password: String): Boolean {

        if (AccountProvider.getUser(user) != null) {
            return false
        }

        val newAccount = AccountModel(user, password)
        AccountProvider.addUser(newAccount)

        _user.value = newAccount.user

        return true
    }
}
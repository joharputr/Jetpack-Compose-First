package id.co.indocyber.composefirst

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = MutableLiveData<Int>(0)


    fun changeCount() {
        count.postValue(count.value?.plus(1) ?: 2)
    }
}
package org.altbeacon.beacon

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class RegionViewModel: ViewModel() {
    val regionState: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val rangedBeacons: MutableLiveData<Collection<Beacon>> by lazy {
        MutableLiveData<Collection<Beacon>>()
    }
}
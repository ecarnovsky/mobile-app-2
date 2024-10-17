package com.csi2818.statecapitals
class Capital(state : String, capitalCity : String) {

    var state : String = ""
        get() = field
        set(value) {
            field = value
        }
    var capitalCity : String = ""
        get() = field
        set(value) {
            field = value
        }
    init {
        this.state = state
        this.capitalCity = capitalCity
    }
}
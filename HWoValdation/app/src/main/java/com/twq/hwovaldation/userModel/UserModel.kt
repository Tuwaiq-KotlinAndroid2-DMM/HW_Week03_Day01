package com.twq.hwovaldation.userModel

import java.io.Serializable

class UserModel(
    var name:String,
    var email:String,
    var phone:String,
    var gender:String
): Serializable {
}

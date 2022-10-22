package ashutosh.sitaskloginform

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageButton

class SignUpActivity : Activity() {

    var showPassword1 : Boolean = false
    var showPassword2 : Boolean = false

    fun signInActivity(view: View){
        finish()
    }

    fun showHidePassword1(view:View){
        val passwordETxt1 : EditText = findViewById(R.id.passwordETxt1)
        val eyeBtn1 : ImageButton = findViewById(R.id.eyeBtn1)
        if(!showPassword1){
            passwordETxt1.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showPassword1 = true
            eyeBtn1.alpha = 0.25f
        }
        else {
            passwordETxt1.transformationMethod = PasswordTransformationMethod.getInstance()
            showPassword1 = false
            eyeBtn1.alpha = 1f
        }
    }

    fun showHidePassword2(view:View){
        val passwordETxt2 : EditText = findViewById(R.id.passwordETxt2)
        val eyeBtn2 : ImageButton = findViewById(R.id.eyeBtn2)
        if(!showPassword2){
            passwordETxt2.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showPassword2 = true
            eyeBtn2.alpha = 0.25f
        }
        else {
            passwordETxt2.transformationMethod = PasswordTransformationMethod.getInstance()
            showPassword2 = false
            eyeBtn2.alpha = 1f
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }
}
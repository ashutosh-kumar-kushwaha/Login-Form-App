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

class SignInActivity : Activity() {

    var showPassword : Boolean = false

    fun signUpActivity(view: View){
        val intent : Intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    fun showHidePassword(view:View){
        val passwordETxt : EditText = findViewById(R.id.passwordETxt)
        val eyeBtn : ImageButton = findViewById(R.id.eyeBtn)
        if(!showPassword){
            passwordETxt.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showPassword = true
            eyeBtn.alpha = 0.25f
        }
        else {
            passwordETxt.transformationMethod = PasswordTransformationMethod.getInstance()
            showPassword = false
            eyeBtn.alpha = 1f
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

}
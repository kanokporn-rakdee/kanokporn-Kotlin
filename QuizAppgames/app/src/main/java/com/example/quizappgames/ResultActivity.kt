package com.example.quizappgames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*




@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestion"

        val fireb = FirebaseDatabase.getInstance()
        val ref = fireb.getReference("Player")
        val id: String? = ref.push().key

        val Player = Player(id.toString(), username.toString(), correctAnswers.toString())

        ref.child(id.toString()).setValue(Player).addOnCompleteListener {
            Toast.makeText(applicationContext, "Complete", Toast.LENGTH_LONG).show()

            btn_finish.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}







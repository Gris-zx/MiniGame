package cn.edu.zuoye1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fail.*
import kotlinx.android.synthetic.main.activity_success.*

class FailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)

        val mediaPlayer = MediaPlayer.create(this, R.raw.failed)//msg是滴的MP3文件，很小
        mediaPlayer.start()
        button_failback.setOnClickListener {
            finish()
        }
    }
}
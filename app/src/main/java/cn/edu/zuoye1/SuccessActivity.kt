package cn.edu.zuoye1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_success.*

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        textView_sc.text="您在30秒内成功"+intent.getIntExtra("successcount",0)+"次!"
        val mediaPlayer = MediaPlayer.create(this, R.raw.success)//msg是滴的MP3文件，很小
        mediaPlayer.start()
        button_successback.setOnClickListener {
           finish()
        }
    }
}
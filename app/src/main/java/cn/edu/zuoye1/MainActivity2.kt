package cn.edu.zuoye1

import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import cn.edu.zuoye1.R.drawable
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {

    fun music(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.dianzhong)//msg是滴的MP3文件，很小
        mediaPlayer.start()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button_game.setOnClickListener {
            music()
            AlertDialog.Builder(this)
                .setMessage("       快刀戳指缝又叫做勇敢者游戏，是《荒野大镖客2》中可以游玩的小游戏之一，考验玩家的手速。\n" +
                        "在游戏中你需要伸出一只手，五指分开，掌心向下放在桌子上，然后用匕首快速向指缝之间的空位戳刺，你需要快速移动匕首并且避免让手指受伤，戳刺轮数最多的玩家获胜。\n")
                .setTitle("关于游戏:")

                .setPositiveButton("确定", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this,"您已阅读游戏说明",Toast.LENGTH_LONG).show()
                })
                .setIcon(drawable.beijing)
                .setNeutralButton("取消", null)
                .create()
                .show()

        }

        button_jingsu.setOnClickListener {
            music()
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        button_fanying.setOnClickListener {
            music()
            AlertDialog.Builder(this)
                .setMessage("      由于该模式出现逻辑错误，本人暂时对该模式实施临时下线维护，详细上线时间请咨询：\nqq：1713787511\n")
                .setTitle("反应模式:")

                .setPositiveButton("确定", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this,"您已阅读维护公告",Toast.LENGTH_LONG).show()
                })
                .setIcon(drawable.beijing)
                .setNeutralButton("取消", null)
                .create()
                .show()

        }

        button_pay.setOnClickListener {
            music()
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
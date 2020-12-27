package cn.edu.zuoye1

import android.content.Context.VIBRATOR_SERVICE
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var second = 0
    var running = false
    var time=""
    var clicklist = arrayOf(0, 0, 0, 0, 0, 0)
    var life = 3
    fun zhendong(){
        val vibrator = this.getSystemService(android.content.Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(200)
    }//点击按钮震动
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start.setOnClickListener {
            zhendong()
            running = true
            runTimer()
            Log.d("button_start", "开始游戏")


            buttonA.setOnClickListener {
                zhendong()


                clicklist[0]++
                Log.d("buttonA", "${clicklist[0]}")
            }

            buttonB1.setOnClickListener {
                zhendong()
                if (clicklist[0] == 1) {
                    clicklist[1]++
                    Log.d("buttonB1", "${clicklist[1]}")
                }
                else {
                    clicklist = arrayOf(0, 0, 0, 0, 0, 0)
                    Toast.makeText(this, "你的手被割了，请重新点击,你还有${life}次机会!!!", Toast.LENGTH_SHORT).show()
                    life--
                }
                isLife(life)
            }
            buttonB2.setOnClickListener {
                zhendong()
                if (clicklist[0] == 2) {
                    clicklist[2]++
                    Log.d("buttonB2", "${clicklist[2]}")
                } else {
                    clicklist = arrayOf(0, 0, 0, 0, 0, 0)
                    Toast.makeText(this, "你的手被割了，请重新点击,你还有${life}次机会!!!", Toast.LENGTH_SHORT).show()
                    life--
                }
                isLife(life)

            }
            buttonB3.setOnClickListener {
                zhendong()
                if (clicklist[0] == 3) {
                    clicklist[3]++
                    Log.d("buttonB3", "${clicklist[3]}")
                } else {
                    clicklist = arrayOf(0, 0, 0, 0, 0, 0)
                    Toast.makeText(this, "你的手被割了，请重新点击,你还有${life}次机会!!!", Toast.LENGTH_SHORT).show()
                    life--
                }
                isLife(life)
            }
            buttonB4.setOnClickListener {
                zhendong()

                if (clicklist[0] == 4) {
                    clicklist[4]++
                    Log.d("buttonB4", "${clicklist[4]}")
                } else {
                    clicklist = arrayOf(0, 0, 0, 0, 0, 0)
                    Toast.makeText(this, "你的手被割了，请重新点击,你还有${life}次机会!!!", Toast.LENGTH_SHORT).show()
                    life--
                }
                isLife(life)
            }
            buttonB5.setOnClickListener {
                zhendong()
                if (clicklist[0] == 5) {
                    clicklist[5]++
                    Log.d("buttonB5", "${clicklist[5]}")
                } else {
                    clicklist = arrayOf(0, 0, 0, 0, 0, 0)
                    Toast.makeText(this, "你的手被割了，请重新点击,你还有${life}次机会!!!", Toast.LENGTH_SHORT).show()
                    life--
                }
                isLife(life)
                isSuccess()
            }
            Log.d("buttonsum", "${clicklist[0]} ${clicklist[1]} ${clicklist[2]} ${clicklist[3]} ${clicklist[4]} ${clicklist[5]}")

        }
    }

        fun isSuccess(){
            if(clicklist[0]== 5 && clicklist[1]== 1 && clicklist[2]== 1 && clicklist[3]== 1 && clicklist[4]== 1 && clicklist[5]== 1 ){
                running = false
                Toast.makeText(this, "成功啦！", Toast.LENGTH_SHORT).show()
            }
        }
        fun isLife(l: Int){
            if(l<=0){
                Toast.makeText(this, "你失败了，再来一局", Toast.LENGTH_SHORT).show()
                 second = 0
                 running = false
                life = 3
            }

        }
        fun runTimer(){
            val handler = Handler()
            val runnable = object : Runnable{
                override fun run() {
                    val hours = second / 3600
                    val minutes = (second % 3600) / 60
                    val secs = second % 60
                    textView_time.text = String.format("%02d:%02d:%02d", hours, minutes, secs)
                    if (running) {
                        second++
                    }
                    handler.postDelayed(this, 2000)
                }
            }
            handler.post(runnable)
        }


}
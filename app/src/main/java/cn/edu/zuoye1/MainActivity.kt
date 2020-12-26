package cn.edu.zuoye1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var second = 0
    var running = false
    var time=""
    var clicklist = arrayOf(0,0,0,0,0,0)
    var life = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start.setOnClickListener {
            running = true
            runTimer()
            Log.d("sadaa","sadasda")
        }

        buttonA.setOnClickListener {
            clicklist[0]++
            Log.d("button1","${clicklist[0]}")
            isSuccess()
        }
        buttonB1.setOnClickListener {
            if(clicklist[0]==1){
                clicklist[1]++
                Log.d("buttonB1","${clicklist[1]}")
            }else{
                clicklist = arrayOf(0,0,0,0,0,0)
                Toast.makeText(this,"你的手被割了，请重新点击,你还有两次机会!!!",Toast.LENGTH_SHORT).show()
                life --
            }
            isLife(life)
        }
        buttonB2.setOnClickListener {
            if(clicklist[0]==2){
                clicklist[2]++
                Log.d("buttonB2","${clicklist[2]}")
            }else{
                clicklist = arrayOf(0,0,0,0,0,0)
                Toast.makeText(this,"你的手被割了，请重新点击,你还有${life}次机会!!!",Toast.LENGTH_SHORT).show()
                life --
            }
            isLife(life)

        }
        buttonB3.setOnClickListener {

            if(clicklist[0]==3){
                clicklist[3]++
            }else{
                clicklist = arrayOf(0,0,0,0,0,0)
                Toast.makeText(this,"你的手被割了，请重新点击,你还有${life}次机会!!!",Toast.LENGTH_SHORT).show()
                life --
            }
            isLife(life)
        }
        buttonB4.setOnClickListener {

            if(clicklist[0]==4){
                clicklist[4]++
                Log.d("buttonB2","${clicklist[2]}")
            }else{
                clicklist = arrayOf(0,0,0,0,0,0)
                Toast.makeText(this,"你的手被割了，请重新点击,你还有${life}次机会!!!",Toast.LENGTH_SHORT).show()
                life --
            }
            isLife(life)
        }
        buttonB5.setOnClickListener {
            if(clicklist[0]==5){
                clicklist[5]++
                Log.d("buttonB2","${clicklist[2]}")
            }else{
                clicklist = arrayOf(0,0,0,0,0,0)
                Toast.makeText(this,"你的手被割了，请重新点击,你还有${life}次机会!!!",Toast.LENGTH_SHORT).show()
                life --
            }
            isLife(life)
            isSuccess()
        }
        Log.d("buttonsum","${clicklist[0]} ${clicklist[1]} ${clicklist[2]} ${clicklist[3]} ${clicklist[4]} ${clicklist[5]}")

    }

        fun isSuccess(){
            if(clicklist[0]== 5 && clicklist[1]== 1 && clicklist[2]== 1 && clicklist[3]== 1 && clicklist[4]== 1 && clicklist[5]== 1 ){
                running = false
            }
        }
        fun isLife(life:Int){
            if(life==0){
                Toast.makeText(this,"你失败了，再来一局",Toast.LENGTH_SHORT).show()
                 second = 0
                 running = false
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
package com.example.app202204

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.AttributeSet
import android.widget.Button
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import java.util.*
import kotlin.collections.ArrayList

class MvvmActivity : AppCompatActivity() {

    private lateinit var viewModel: My01ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        viewModel = ViewModelProvider(this).get(My01ViewModel::class.java)

        //TEST
//        var btn01 = Button(this)
//        var btn01 = MyButton01(this)
        var btn01 = MyButton(this)
        btn01.x=10F
        btn01.y=10F
        btn01.width=200
        btn01.height=100
        btn01.setText("tap")

        var param1 = RelativeLayout.LayoutParams(10,10)
        param1.setMargins(10,20,30,40)
//        param1.setMargins(siz)
        btn01.layoutParams = param1

        btn01.setOnClickListener {
            val uri = Uri.parse("market://details?id=jp.naver.line.android")
            val it = Intent(Intent.ACTION_VIEW, uri)
            startActivity(it)

        }


    }


    /*
            <activity
            android:name=".MvvmActivity"
            android:exported="false" />

     */

    /*
    <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MvvmActivity">

</androidx.constraintlayout.widget.ConstraintLayout>
     */


    //222 NO



    var A = intArrayOf(1, 22, 333, 4444, 333, 55555)

    //        String[] sa = new String[]{"a","bbb","cc","dddd"};
    var sa = arrayOf("a", "bbb", "cc", "dddd")
//    var ss: String = s1





    /*
    //GOOD
    @RequiresApi(Build.VERSION_CODES.N)
    fun removeElement(arr: Array<String?>?, item: String?): Array<String?>? {
        //Arrays.stream(arr) .filter(i -> i != item) .toArray();
        return Arrays.stream(arr)
            .filter { s -> !s.equals(item) }
            .toArray { _Dummy_.__Array__() }
    }

     */


    //01
    // public static void solution(int[] A) {
    fun toIntegerArray(A: IntArray): ArrayList<Int>? {
//        int[] A = new int[]{1,22,333};

        //al
        val al1: ArrayList<Int> = ArrayList()
        for (i in A) {
            al1.add(i)
            //  System.out.println(i);
        }

        //  for(int i=0; i<al1.size() ; i++){
        //      System.out.println(al1.get(i));
        //  }


        //  for(int i2: al1){
        //      System.out.println(i2);
        //  }
        return al1
    }


/*
    class MyButton01 @JvmOverloads constructor():Button

    class MyButton01 :Button{
}


class MyButton01 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : Button(context, attrs) {

}

    class MyButton01(context: Context?) : Button(context) {
    }

*/

//    class MyButton : Button {
    class MyButton : androidx.appcompat.widget.AppCompatButton {
        constructor(context: Context) : super(context)
        constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
        constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            // 自定义绘制代码
        }
    }

//    class MyButton01 : Button() {
//    }


    //TEST
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        textAlign = Paint.Align.CENTER
        textSize = 55.0f
        typeface = Typeface.create( "", Typeface.BOLD)
    }


}

//TEST
private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
    style = Paint.Style.FILL
    textAlign = Paint.Align.CENTER
    textSize = 55.0f
    typeface = Typeface.create( "", Typeface.BOLD)
}

/*

    class MyButton : Button {
        constructor(context: Context) : super(context)
        constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
        constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            // 自定义绘制代码
        }
    }
 */


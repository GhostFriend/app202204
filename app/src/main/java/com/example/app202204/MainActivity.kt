package com.example.app202204

import android.content.ContentValues
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var et1: EditText

    lateinit var r1: RelativeLayout

//    var btn:Button = Button(this)
//    var btn:Button

    //222
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout01: View = findViewById(R.id.layout01)

//        layout01.foregroundGravity

/*

    layout.setGravity(Gravity.CENTER);
    //layoutParams.gravity = Gravity.CENTER;
    layout.setOrientation(LinearLayout.VERTICAL);
    //layout.setLayoutParams(layoutParams);

 */

        //ME
        var txt = TextView(this)
        txt.x = 500F
        txt.y = 200F
        txt.width = 300
        txt.height = 300
        txt.setText("Tap");
        txt.setTextColor(Color.GREEN);
        txt.setBackgroundColor(Color.RED)
        txt.textSize = 40F
//        var  param2: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(300,200);
//        param2.setMargins(300,320,0,0)
//        params2.addRule(RelativeLayout.CENTER_IN_PARENT);
//        param2.pa
//        param2.setBackgroundColor(Color.GRAY)
//        addContentView(txt, param2)
//222
        //   (layout01 as ConstraintLayout).addView(txt)

        //me
        btn = Button(this)
//        btn = Button()
//        btn.layoutParams = LayoutParams(200,100)
//        btn.layoutParams = LinearLayout.LayoutParams(100,100)
//        btn.layoutParams = ViewGroup.LayoutParams(200,200)


//                var  param2: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,100);
//        var  param2: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(300,200);
//        param2.setMargins(300,320,0,0)
        var param1: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(300, 200);
        param1.setMargins(300, 320, 0, 0)
//        params12.addRule(RelativeLayout.CENTER_IN_PARENT);
//        param12.pa
//        param12.setBackgroundColor(Color.GRAY)
//        addContentView(txt, param2)

        //?? 222
        btn.layoutParams = param1

        val ii: Int = 123
        btn.id = ii
        btn.text = "111"
        btn.alpha = 0.5f
//        btn.updateLayoutParams {
//            height = 300
//        }

        (layout01 as ConstraintLayout).addView(btn)

        btn.setOnClickListener {

//            val intent = packageManager.getLaunchIntentForPackage(com.)

            //            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mmsto:<number>"))
//            intent.putExtra(Intent.)
//            intent.putExtra(Uri.parse("mailto:"))
//
//            Intent intent = new Intent(Intent.ACTION_SENDTO,
//                Uri.parse("mmsto:<number>");
//            intent.putExtra("address", <number>);
//            intent.putExtra("subject", <subject>);
//            startActivity(intent);

            //https://play.google.com/store/apps/details?id=jp.naver.line.android
//            val uri = Uri.parse("market://search?q=pname:pkg_name")
            val uri = Uri.parse("market://details?id=jp.naver.line.android")

            val it = Intent(Intent.ACTION_VIEW, uri)
            startActivity(it)


        }

        fun getAppInfoList(): MutableList<ApplicationInfo> {
            return getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA)
        }
//        private List<ApplicationInfo> getAppInfoList() {
//            return getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA);
//        }

        
        /*
//ok?  WAIT
            val appPackageName =
                packageName // getPackageName() from Context or Activity object

            try {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=$appPackageName")
                    )
                )
            } catch (anfe: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                    )
                )
            }

         */

        /*
                    val uri: Uri = Uri.parse("market://search?q=pname:pkg_name")
            val it = Intent(Intent.ACTION_VIEW, uri)
            startActivity(it)

         */

        /*
        //OK
            val callIntent: Intent = Uri.parse("tel:5551234").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
         */

/*

    val ACTION_ALBUM_REQUEST_CODE = 2
    val intent = Intent(Intent.ACTION_PICK)
    intent.type = "image/*"
    startActivityForResult(intent, ACTION_ALBUM_REQUEST_CODE)


            val ACTION_CAMERA_REQUEST_CODE = 1
    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    startActivityForResult(intent, ACTION_CAMERA_REQUEST_CODE)

//ERR? NO?
    val CAMERA_REQUEST_CODE = 0
    val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    if (callCameraIntent.resolveActivity(packageManager) != null) {
        startActivityForResult(callCameraIntent, CAMERA_REQUEST_CODE)
    }
 */

 */

/*

    val it = Intent(Intent.ACTION_VIEW, People.CONTENT_URI)
    startActivity(it)

 */

/*
//            val uri = Uri.parse("smsto:0800000123")
    val uri = Uri.parse("smsto:0956961960")
    val it = Intent(Intent.ACTION_SENDTO, uri)
    it.putExtra("sms_body", "The SMS text")
    startActivity(it)

 */

/*
    val uri = Uri.parse("tel:0800000123")
    val it = Intent(Intent.ACTION_DIAL, uri)
//            val it = Intent(Intent.ACTION_CALL, uri)
    startActivity(it)


    //ERR  //USE PHONE
    //add     <uses-permission android:name="android.permission.CALL_PHONE" />
    val uri = Uri.parse("tel:0800000123")
    val it = Intent(Intent.ACTION_CALL, uri)
    startActivity(it)

 */

/*
    val uri = Uri.parse("geo:38.899533,-77.036476")
    val it = Intent(Intent.ACTION_VIEW, uri)
    startActivity(it)

 */

/*
            //OPEN WEB
    val uri = Uri.parse("http://google.com")
    val it = Intent(Intent.ACTION_VIEW, uri)
    startActivity(it)

 */

/*
//            Toast.makeText(this,"HELLO",Toast.LENGTH_LONG).show()

    val intent = Intent(Intent.ACTION_SEND)
    intent.setData(Uri.parse("mailto:"))
    var to = "xxx@gmail.com"
    intent.putExtra(Intent.EXTRA_EMAIL, to)
    intent.putExtra(Intent.EXTRA_SUBJECT, "first mail")
    intent.putExtra(Intent.EXTRA_TEXT, "hi this is first mail")
    intent.setType("message/rfc822")
    val chooser = Intent.createChooser(intent, "send mail")
    startActivity(chooser)

 */


        var btn2: Button = Button(this)
//        var  param2: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
//        var  param2: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(400,400);
//        param2.topToBottom = btn.id
//        btn2.layoutParams = param2
        btn2.text = "222"
//        (layout01 as ConstraintLayout).addView(btn2)

//----------------------

        var web = WebView(this)
        val webid: Int = 1122
        web.id = webid
//        web.setTextColor(Color.GREEN);
        web.setBackgroundColor(Color.GREEN)
//        var  param2: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        var param2: ConstraintLayout.LayoutParams =
            ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, 1500);
        param2.topToBottom = btn.id
        web.layoutParams = param2
        (layout01 as ConstraintLayout).addView(web)

        web.loadUrl("https://www.google.com/")

//        web.webViewClient = WebViewClient()
//        web.apply {
//            loadUrl("https://www.google.com/")
//            settings.javaScriptEnabled = true
//            settings.safeBrowsingEnabled = true
//        }

//----------------------------


/*
tv.setLayoutParams(
    ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
)
 */

/*
val parm : ViewGroup.LayoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
binding!!.youtubePlayerView.layoutParams = parm
 */

/*
yourView.setLayoutParams(new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
            //change the parameters as whatever you want
    ));
//keep in mind that LinearLayout is not the only Layout, e.g. you can use ConstrainLayout etc...
//after, you need to add yourView to a layout as it won't redraw itself if you just change the layout parameters e.g.:
yourLayout.addView(yourView); //yourView will pop on yourLayout
 */

//
        r1 = RelativeLayout(this)
        var rlp: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

//
        var view: RelativeLayout = RelativeLayout(this)
        view.layoutParams = RelativeLayout.LayoutParams(25, 25)

//
        var param: RelativeLayout.LayoutParams =
            RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, 100);
        param.setMargins(200, 12, 0, 0)
        val i: Int = 11
        var temp: TextView = TextView(this);
        temp.id = i
        temp.layoutParams = param;
        temp.text = "BBB"
        //"TextView\nadfadsfasdfadsfasdf\nadfadsfasdfa\nadfadsfasdf"+i
        Log.e(ContentValues.TAG, "onCreate: " + i)

/*
imageView.layoutParams = AbsListView.LayoutParams(85,85)
*/

    }

    fun main() {
        println("Hello world!")
    }

//    class PieChart(context: Context, attrs: AttributeSet) : View(context, attrs)
//    class PieChart(context: Context, attrs: AttributeSet) : Button(context, attrs)
//    class PieChart() : Button()


/*
<Button
android:id="@+id/button"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:gravity="bottom|right"
android:text="Button99"
tools:layout_editor_absoluteX="713dp"
tools:layout_editor_absoluteY="884dp" />

*/

}
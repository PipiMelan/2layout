package com.example.a2layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         1. xml configuration  -> create .xml files under the layout path to make a page layout(页面布局)
         2.code creation -> manually use code to create interface or add controls

         one interface is one Activity
         shows what in an interface : controls , views
         View : single , visible(可视的) , interactive , controls
         ViewGroup: container , hold multiple view/ViewGroup and manage the layout of them
                -> they are nested within each other
         Divided according to the specific function of each container
                FrameLayout         帧布局
                LinearLayout        线性布局
                RelativeLayout      相对布局 relative alignment(相对对齐关系)
                ConstraintLayout    约束布局

          FRAMELAYOUT
      We use '@' to quote certain resource
                layout_width/height
                    ->
                        match_parent ->  The size of container
                        dp           ->  The fixed size
                        wrap_parent  ->  The default size
          When add a new control after another that is enough big ,this control will discover the former
                    hierarchical relationship(层级关系)

          layout_margin
                    ->  set the  outer spacing between the top,bottom,left and right of the parent container
          padding
                    ->  the  distance between the view and the contents in it

          layout_marginStart/Left

      FrameLayout is seldom used because of ite boundedness but it's concise



       LINEARLAYOUT
                Only horizontal or vertical layout of interface
                1.You need ot confirm the layout -> Horizontal / Vertical
                    orientation     ->  The default placement
                    layout_weight   -> weight  权重
                           set width sa 0dp
                           set the corresponding scale value(比刘值)
        * */

    }
}
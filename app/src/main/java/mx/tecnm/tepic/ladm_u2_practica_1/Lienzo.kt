package mx.tecnm.tepic.ladm_u2_practica_1

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.graphics.ColorUtils
import kotlin.random.Random

class Lienzo(p:MainActivity) : View(p){
var Esqueletox=0f
var Esqueletoy=1200f
    var ince=0
    var st=0
    var may=true
var Esq=Imagen(this,2000f,200f,R.drawable.skeleton_2)
    val timer =object : CountDownTimer(2000,60000){
        override fun onTick(p0: Long) {
            if(may){
            Esqueletoy=Esqueletoy-2
            ince++}else{
                Esqueletoy=Esqueletoy+2
                ince--}

            if(ince==80){
                may=false}
            if(ince==0){
                    if (Random.nextBoolean()) {
                        if (Random.nextBoolean()) {
                            Esqueletox = 0f
                        } else {
                            Esqueletox = 200f
                        }
                        Esqueletoy = 1200f
                        ince = 0
                    }
                    if (Random.nextBoolean()) {
                        if (Random.nextBoolean()) {
                            Esqueletox = 0f
                        } else {
                            Esqueletox = 400f
                        }
                        Esqueletoy = 1400f
                        ince = 0
                    }
                    if (Random.nextBoolean()) {
                        if (Random.nextBoolean()) {
                            Esqueletox = 600f
                        } else {
                            Esqueletox = 400f
                        }
                        Esqueletoy = 1600f
                        ince = 0
                    }
                may=true
        }
            Esq.mover(Esqueletox,Esqueletoy)
            invalidate()
        }
        override fun onFinish() {
            start()
        }

    }
    override fun onDraw(c: Canvas){
        super.onDraw(c)
        val p= Paint()
        c.drawARGB(1000,0,26,104)

        p.setColor(Color.GRAY)
        p.style=Paint.Style.FILL_AND_STROKE
        c.drawCircle(width/2f,-100f,500f,p)

        p.setColor(Color.YELLOW)
        p.style=Paint.Style.STROKE
        p.strokeWidth=6F
        c.drawCircle(width/2f,-100f,550f,p)

        //p.setColor(Color.YELLOW)
        p.style=Paint.Style.STROKE
        p.strokeWidth=7F
        c.drawCircle(width/2f,-100f,600f,p)
/////////////////////////////////////////Lunares
        p.setColor(Color.WHITE)
        p.style=Paint.Style.FILL
        c.drawCircle(width/3f,0f,150f,p)

        p.setColor(Color.WHITE)
        p.style=Paint.Style.FILL
        c.drawCircle(2*width/3f,0f,75f,p)

        p.setColor(Color.WHITE)
        p.style=Paint.Style.FILL
        c.drawCircle(2*width/3f-100,200f,75f,p)

        p.setColor(Color.WHITE)
        p.style=Paint.Style.FILL
        c.drawCircle(width/3f+100,275f,50F,p)
////////////////////////// ///////////Piso
        p.setColor(Color.GREEN)
        c.drawRect(width*-1f,height-height/3f,width*1f,height*1f,p)
        p.setColor(Color.DKGRAY)

        c.drawRect(width/2-400f,height-height/3f,width/2+100f,height-550f,p)
        c.drawRect(width/2-300f,height-(height/3f)+50,width/2+200f,height-500f,p)
        c.drawRect(width/2-200f,height-(height/3f)+100,width/2+300f,height-450f,p)
        c.drawRect(width/2-100f,height-(height/3f)+150,width/2+400f,height-400f,p)
        c.drawRect(width/2f,height-(height/3f)+200,width/2+500f,height-350f,p)
        c.drawRect(width/2f+100,height-(height/3f)+250,width/2+600f,height-300f,p)
        c.drawRect(width/2f+200,height-(height/3f)+300,width/2+700f,height-250f,p)
        c.drawRect(width/2f+300,height-(height/3f)+350,width/2+800f,height-200f,p)
        c.drawRect(width/2f+400,height-(height/3f)+400,width/2+900f,height-150f,p)
        c.drawRect(width/2f+500,height-(height/3f)+450,width/2+1000f,height-100f,p)
        c.drawRect(width/2f+600,height-(height/3f)+500,width/2+1100f,height-50f,p)
        var gr1=Imagen(this,0f,height-height/3f,R.drawable.grave)
        var gr1_2=Imagen(this,200f,height-height/3f,R.drawable.grave)
        var gr2=Imagen(this,0f,height-height/3f+200,R.drawable.grave)
        var gr2_2=Imagen(this,200f,height-height/3f+200,R.drawable.grave)
        var gr2_3=Imagen(this,400f,height-height/3f+200,R.drawable.grave)
        var gr3=Imagen(this,0f,height-height/3f+400,R.drawable.grave)
        var gr4=Imagen(this,200f,height-height/3f+400,R.drawable.grave)
        var gr5=Imagen(this,400f,height-height/3f+400,R.drawable.grave)
        var gr6=Imagen(this,600f,height-height/3f+400,R.drawable.grave)
        var gr7=Imagen(this,800f,height-height/3f+400,R.drawable.grave)
        Esq.pintar(c)
        gr1.pintar(c)
        gr2.pintar(c)
        gr3.pintar(c)
        gr4.pintar(c)
        gr5.pintar(c)
        gr6.pintar(c)
        gr7.pintar(c)
        gr2_2.pintar(c)
        gr2_3.pintar(c)
        gr1_2.pintar(c)
/////////////////////////////////////////nubes
        p.setColor(Color.LTGRAY)
        c.drawCircle(0f,height/2f-100,100f,p)
        c.drawCircle(50f,height/2f-200,100f,p)
        c.drawCircle(100f,height/2f-100,100f,p)
        c.drawCircle(0f,height/2f-100,100f,p)

        c.drawCircle(width*1f,height/2f-100,100f,p)
        c.drawCircle(width*1f-50,height/2f-200,100f,p)
        c.drawCircle(width*1f-100f,height/2f-100,100f,p)
        c.drawCircle(width*1f,height/2f-100,100f,p)
        timer.start()
    }
    override fun onTouchEvent(event: MotionEvent): Boolean{

        return true
    }
}
package com.test.mauri1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   boolean aux=false;
   float primer=0;
   float result=0;
   char operacion='0';
   boolean igualOn=false;
   boolean operaOn=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn0=(ImageButton)findViewById(R.id.btn0);
        ImageButton btn1=(ImageButton)findViewById(R.id.btn1);
        ImageButton btn2=(ImageButton)findViewById(R.id.btn2);
        ImageButton btn3=(ImageButton)findViewById(R.id.btn3);
        ImageButton btn4=(ImageButton)findViewById(R.id.btn4);
        ImageButton btn5=(ImageButton)findViewById(R.id.btn5);
        ImageButton btn6=(ImageButton)findViewById(R.id.btn6);
        ImageButton btn7=(ImageButton)findViewById(R.id.btn7);
        ImageButton btn8=(ImageButton)findViewById(R.id.btn8);
        ImageButton btn9=(ImageButton)findViewById(R.id.btn9);
        ImageButton btnmas=(ImageButton)findViewById(R.id.btnmas);
        ImageButton btnmenos=(ImageButton)findViewById(R.id.btnmenos);
        ImageButton btnpor=(ImageButton)findViewById(R.id.btnpor);
        ImageButton btndiv=(ImageButton)findViewById(R.id.btndiv);
        ImageButton btncancel=(ImageButton)findViewById(R.id.btncancel);
        ImageButton btndecimal=(ImageButton)findViewById(R.id.btndecimal);

        TextView texto=(TextView)findViewById(R.id.texto);
       /* btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        texto.setText("hiciste click");

                    }
        }
        );*/
    }
    private void limpiar(TextView texto)
    {
        if(igualOn || operaOn )
        {   operaOn=false;
            igualOn=false;
            texto.setText("");
        }
    }
    private void result(TextView texto)
    {
        if(result % 1==0)
            texto.setText(String.valueOf(Math.round(result)));
        else  texto.setText(String.valueOf(result));
    }
    public void btnClick(View v)
    {
        final TextView texto=(TextView)findViewById(R.id.texto);
        switch (v.getId()) {
            case (R.id.btn0):
                limpiar(texto);
                texto.setText(texto.getText()+"0");
                break;
            case (R.id.btn1):
                limpiar(texto);
                texto.setText(texto.getText()+"1");
                break;
            case (R.id.btn2):
                limpiar(texto);
                texto.setText(texto.getText()+"2");
                break;
            case (R.id.btn3):
                limpiar(texto);
                texto.setText(texto.getText()+"3");
                break;
            case (R.id.btn4):
                limpiar(texto);
                texto.setText(texto.getText()+"4");
                break;
            case (R.id.btn5):
                limpiar(texto);
                texto.setText(texto.getText()+"5");
                break;
            case (R.id.btn6):
                limpiar(texto);
                texto.setText(texto.getText()+"6");
                break;
            case (R.id.btn7):
                limpiar(texto);
                texto.setText(texto.getText()+"7");
                break;
            case (R.id.btn8):
                limpiar(texto);
                texto.setText(texto.getText()+"8");
                break;
            case (R.id.btn9):
                limpiar(texto);
                texto.setText(texto.getText()+"9");
                break;
            case (R.id.btndecimal):
                limpiar(texto);
                texto.setText(texto.getText()+".");
                break;
            case (R.id.btnmas):
                if(texto.getText()!="")
                {
                    primer=Float.parseFloat(texto.getText().toString());
                    operacion='+';
                    operaOn=true;
                   // texto.setText("");
                }

                break;
            case (R.id.btnmenos):
                if(texto.getText()!="")
                {
                    primer=Float.parseFloat(texto.getText().toString());
                    operacion='-';
                    operaOn=true;
                 //   texto.setText("");
                }
                break;

            case (R.id.btnpor):
                if(texto.getText()!="")
                {
                    primer=Float.parseFloat(texto.getText().toString());
                    operacion='*';
                    operaOn=true;
                  //  texto.setText("");
                }
                break;
            case (R.id.btndiv):
                if(texto.getText()!="")
                {
                    primer=Float.parseFloat(texto.getText().toString());
                    operacion='/';
                    operaOn=true;
                   // texto.setText("");
                }
                break;
            case (R.id.btncancel):
                texto.setText("");
                operacion='0';
                primer=0;
                result=0;
                igualOn=false;
                operaOn=false;
                break;
            case (R.id.btnigual):
                if(primer!=0)
                {
                    igualOn=true;
                    operaOn=false;
                    if(operacion=='+')
                    {

                        result=primer+Float.parseFloat(texto.getText().toString());
                         result(texto);

                    }else
                    {
                        if(operacion=='-')
                        {
                            result=primer-Float.parseFloat(texto.getText().toString());
                            result(texto);
                        }else
                        {
                            if(operacion=='*')
                            {
                                result=primer*Float.parseFloat(texto.getText().toString());
                                result(texto);
                            }else
                            {
                                if(operacion=='/' && Float.parseFloat(texto.getText().toString())>0)
                                {
                                    result=primer/Float.parseFloat(texto.getText().toString());
                                    result(texto);

                                }else
                                {
                                    texto.setText("ERROR");
                                }
                            }
                        }
                    }
                    operacion='0';
                    primer=0;
                }

                break;






    }

    }

}
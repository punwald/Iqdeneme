package com.punwald.iqdeneme;

import android.app.Activity;
import android.widget.TextView;

/**
 * Created by efdal on 11/19/17.
 */

public class kategoriler extends Activity{
    int sorular[],cevaplar[];

    public static void yenileme(){

    }
    public void cevaplama(TextView cevap,int suan,int cevapD[]){
            if(!(cevap.toString().isEmpty())){
                String cevapS=cevap.getText().toString();
                if(cevapS.equals(cevapD[suan])){

                }
            }
    }

}

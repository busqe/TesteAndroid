package br.banco.services.contact;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import br.banco.services.contact.domain.ContactForm;

public interface ILoad {


    interface Presenter {

        void onLoadData(Bundle savedInstanceState, Context context);
        void onErrorLoad(Context context, int msgCode);
        //  void onSuccessLoad(int message) ;
    }

    interface Model{


        void loadData(ContactForm form, Context context);
        void saveData(ContactForm form, Context context);
        void clearData(ContactForm form, Context context);
    }

    interface Views{

        void updateAlertView(int msgCode, Context context);
    }




}
package com.example.ankhleu.trackingyourspendingv1.data;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/18.
 */

public class account {


String year;    //年
String month;   //月
String day;     //日
int Budget;     //預算

ArrayList<ArrayList<String>> pay=new ArrayList<ArrayList<String>>();        //pay為付錢金額


String kind;    //類別
String myself;  //沒活動類別
String travel;  //有活動類別
String receipt; //收據
String notes;   //備註




}

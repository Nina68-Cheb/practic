package com.example.myzadanie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
val somelise = listOf(
"a"
"b"
"c"
)\\ создание списка с которого будут браться элементы
var list = mutablelistOf <String> ()// список куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (s In somelist) { // с помощью цикла for берем все значения из первого списка list.add(s)
            // и записываем во второй список
        }
        println(list) // выводим содержимое второй коллекции на экран
    }
}
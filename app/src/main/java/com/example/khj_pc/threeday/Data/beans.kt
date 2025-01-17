package com.example.khj_pc.threeday.Data

data class Data(val full_sentence : String, val target : String)

data class WordData(val word : String, val type : String)

data class Result(val src : WordData, val target : WordData, val value : Double)

data class DataResponse(val result : ArrayList<Result>, val word2vec : ArrayList<WordData>, val lstm : ArrayList<String>)
package com.example.quizappgames

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String ="total_question"
    const val CORRECT_ANSWER: String ="correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Austrial",
                "Armenia",
                "Austria",
                1
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                "brazil",
                "belgium",
                "belarus",
                "bulgarian",
                2
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "brazil",
                "belgium",
                "belarus",
                "bulgarian",
                1
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_dannebrog,
                "dominican",
                "dannebrogser",
                "dannebrog",
                "dominica",
                3
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
                5,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_ecuador,
                "ethiopia",
                "emerdor",
                "dannebrog",
                "ecuador",
                4
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
                6,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_finland,
                "fuji",
                "finland",
                "fiji",
                "philippines",
                2
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
                7,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                "kuwait",
                "conko",
                "cuba",
                "korea",
                1
        )
        questionsList.add(que7)

        //8
        val que8 = Question(
                8,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_newzealand,
                "norway",
                "nigeria",
                "netherlands",
                "new zealand",
                4
        )
        questionsList.add(que8)

        //9
        val que9 = Question(
                9,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_nigeria,
                "norway",
                "nigeria",
                "netherlands",
                "new zealand",
                2
        )
        questionsList.add(que9)

        //10
        val que10 = Question(
                10,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_south_korea,
                "north_korea",
                "korea",
                "south_korea",
                "kenya",
                3
        )
        questionsList.add(que10)

        return questionsList
    }
}

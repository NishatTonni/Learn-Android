package com.tonni.triviaquizapp

object setData {
    const val name:String = "name"
    const val score:String = "score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "What is the capital of Bangladesh?",
            1,
            "khulna",
            "India",
            "Dhaka",
            "Bogura",
            3
        )
        var q2 = QuestionData(
            "How many total Districts are there in Bangladesh?",
            2,
            "60",
            "61",
            "62",
            "64",
            4
        )
        var q3 = QuestionData(
            "What is the country calling code for Bangladesh?",
            3,
            "+49",
            "+230",
            "+880",
            "+97",
            3
        )
        var q4 = QuestionData(
            "Official language of Bangladesh is",
            4,
            "Bengali",
            "Urdu",
            "Arabic",
            "Hindi",
            1
        )
        var q5 = QuestionData(
            "Internet tld of Bangladesh is",
            5,
            ".in",
            ".bd",
            ".uk",
            ".us",
            2
        )
        var q6 = QuestionData(
            "National game of Bangladesh is",
            6,
            "Cricket",
            "Kabadi",
            "Hockey",
            "Football",
            2
        )
        var q7 = QuestionData(
            "How many provinces are there in Bangladesh?",
            7,
            "5",
            "6",
            "7",
            "8",
            4
        )
        var q8 = QuestionData(
            "What is the currency of Bangladesh?",
            8,
            "Rupee",
            "Dollar",
            "Pond",
            "Taka",
            4
        )
        var q9 = QuestionData(
            "Which of following river is longest in Bangladesh?",
            9,
            "Padma",
            "Kobadak",
            "Surma",
            "None of these",
            3
        )
        var q10 = QuestionData(
            "Who is the first president of Bangladesh?",
            10,
            "Abdus sattar",
            "Ziaur Rahman",
            "Sheikh Mujibur Rahman",
            "None of these",
            3
        )
        var q11 = QuestionData(
            "Highest population city of Bangladesh is",
            11,
            "Natore",
            "Dhaka",
            "palang",
            "paltan",
            2
        )
        var q12 = QuestionData(
            "When Bangladesh got independence?",
            12,
            "1970",
            "1971",
            "1972",
            "1973",
            2
        )
        var q13 = QuestionData(
            "Who is the current prime minister of Bangladesh?",
            13,
            "Khaleda zia",
            "Sajeeb Wazed",
            "Shaikeh Hasina",
            "None of these",
            3
        )
        var q14 = QuestionData(
            "Kazi Nazrul Islam is Associated with",
            14,
            "Poetry",
            "Politics",
            "Hockey",
            "Cricket",
            1
        )
        var q15 = QuestionData(
            "Who is the first female pilot of Bangladesh?",
            15,
            "Nayma Haque",
            "Kaniz fatema Roksana",
            "Nasim begum",
            "None of these",
            2
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        que.add(q6)
        que.add(q7)
        que.add(q8)
        que.add(q9)
        que.add(q10)
        que.add(q11)
        que.add(q12)
        que.add(q13)
        que.add(q14)
        que.add(q15)
        return que

    }
}
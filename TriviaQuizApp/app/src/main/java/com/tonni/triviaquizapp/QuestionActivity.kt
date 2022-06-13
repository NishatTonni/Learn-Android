package com.tonni.triviaquizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.daimajia.androidanimations.library.specials.RollOutAnimator
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private var Name: String? = null
    private var score: Int = 0

    private var currentPosition: Int = 1
    private var questionList: ArrayList<QuestionData>? = null
    private var selectedOption: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        Name = intent.getStringExtra(setData.name)

        questionList = setData.getQuestion()
        setQuestion()

        option1.setOnClickListener {
            selectedOptionStyle(option1 ,1)
            checkQuestionAnswer()
            Handler().postDelayed({
                nextQuestion()
            }, 1000)


        }

        option2.setOnClickListener {
            selectedOptionStyle(option2 ,2)
            checkQuestionAnswer()
            Handler().postDelayed({
               nextQuestion()
            }, 1000)


        }

        option3.setOnClickListener {
            selectedOptionStyle(option3 ,3)
            checkQuestionAnswer()
            Handler().postDelayed({
                nextQuestion()
            }, 1000)

        }

        option4.setOnClickListener {
            selectedOptionStyle(option4 ,4)
            checkQuestionAnswer()
            Handler().postDelayed({
                nextQuestion()
            }, 1000)

        }

        YoYo.with(Techniques.StandUp,)
            .duration(700)
            .repeat(4)
            .playOn(findViewById(R.id.option1));

        YoYo.with(Techniques.StandUp,)
            .duration(700)
            .repeat(4)
            .playOn(findViewById(R.id.option2));

        YoYo.with(Techniques.StandUp,)
            .duration(700)
            .repeat(4)
            .playOn(findViewById(R.id.option3));

        YoYo.with(Techniques.StandUp,)
            .duration(700)
            .repeat(4)
            .playOn(findViewById(R.id.option4));

    }


    fun setColor(opt: Int ,color: Int) {
        when (opt) {
            1 -> {
                option1.background = ContextCompat.getDrawable(this ,color)
            }

            2 -> {
                option2.background = ContextCompat.getDrawable(this ,color)
            }

            3 -> {
                option3.background = ContextCompat.getDrawable(this ,color)
            }

            4 -> {
                option4.background = ContextCompat.getDrawable(this ,color)
            }
        }

    }

    fun setQuestion() {

        val question = questionList!![currentPosition - 1]
        setOptionStyle()

        progressBarId.progress = currentPosition
        progressBarId.max = questionList!!.size
        progressTextId.text = "${currentPosition}" + "/" + "${questionList!!.size}"
        questionTextHead.text = question.question
        option1.text = question.option_one
        option2.text = question.option_two
        option3.text = question.option_three
        option4.text = question.option_four

    }

    fun setOptionStyle() {
        var optionList: ArrayList<TextView> = arrayListOf()
        optionList.add(0 ,option1)
        optionList.add(1 ,option2)
        optionList.add(2 ,option3)
        optionList.add(3 ,option4)

        for (op in optionList) {
            op.setTextColor(Color.parseColor("#555151"))
            op.background = ContextCompat.getDrawable(this ,R.drawable.question_optionbackground)
            op.typeface = Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view: TextView ,opt: Int) {
        setOptionStyle()
        selectedOption = opt
        view.background = ContextCompat.getDrawable(this ,R.drawable.selected_question_option)
        view.typeface = Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))

    }

    fun checkQuestionAnswer() {
        if (selectedOption != 0) {
            val question = questionList!![currentPosition - 1]
            if (selectedOption != question.correct_ans) {
                setColor(selectedOption ,R.drawable.wrong_question_option)
            } else {
                score++
            }
            setColor(question.correct_ans ,R.drawable.correct_question_option)

        }
    }


    fun nextQuestion(){

        if (currentPosition == questionList!!.size){
            var intent = Intent(this ,ResultActivity::class.java)
            intent.putExtra(setData.name ,Name.toString())
            intent.putExtra(setData.score ,score.toString())
            intent.putExtra("total size" ,questionList!!.size.toString())
            startActivity(intent)
            finish()
        }
        else {
            currentPosition++

            when {
                currentPosition <= questionList!!.size -> {
                    setQuestion()
                }
            }
        }
        selectedOption = 0

    }

}
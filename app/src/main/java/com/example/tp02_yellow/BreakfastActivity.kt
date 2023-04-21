package com.example.tp02_yellow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class BreakfastActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)

        val backBtn = findViewById<Button>(R.id.breakfastBackBtn)
        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val spinner: Spinner = findViewById(R.id.daySelectSpinner)
        spinner.onItemSelectedListener = this

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.days_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        val textView: TextView = findViewById(R.id.breakfastTxt) as TextView
        textView.text = "Please select a day"
        if(pos == 0){
            textView.text = "Poached Egg\n\nFarm Grits\n\nChocolate CHip Pancakes\n\nPork Sausage Patty\n\n" +
                    "Breakfast Potatoes\n\nRoasted Cauliflower Florets\n\nCream of Wheat\n\nMeatless Vegetarian Sausage Patty"
        }
        else if(pos == 1){
            textView.text = "Scrambled Eggs\n\nLatin Tofu Scramble\n\nFrench Toast Sticks\n\nTurkey Bacon\n\n" +
                    "Parmesan Potato Wedges\n\nOnions and Peppers\n\nGrits, Jalapeno Cheese\n\nMeatless Sausage Link"
        }
        else if(pos == 2){
            textView.text = "Scrambled Eggs\n\nPepper Scramble Breakfast Taco\n\n Trix Pancake\n\n" +
                    "Pork Sausage Link\n\nLyonnaise Potatoes\n\nCurried Wegetable Chickpea Hash\n\n" +
                    "Steel Cut Oatmeal\n\nMeatless Vegetarian Sausage Patty"
        }
        else if(pos == 3){
            textView.text = "Scrambled Eggs\n\nMini Egg Strata, Spinach, Parmesan\n\nBiscuits and Sausage Gravy\n\n" +
                    "Bacon\n\nTater Tots\n\nSauteed Green Beans, Onions, Tomatoes\n\nStrawberry Chia Oatmeal\n\nMeatless Sausage Link"
        }
        else if(pos == 4){
            textView.text = "Scrambled eggs\n\nKale Tofu Scramble Breakfast Taco\n\n" +
                    "Cinnamon French Toast\n\nCountry Ham\n\nRoasted Potatoes\n\nSteamed Brocolli\n\n" +
                    "Apple Cinnamon Oatmeal\n\nMeatless Vegetarian Sausage Patty"
        }
        else if(pos == 5){
            textView.text = "Scrambled Eggs\n\nSour Cream and Chive Scrambled Eggs\n\nBlueberry Pancakes\n\n" +
                    "Chicken Kielbasa Sausage\n\nThyme Roasted Potatoes\n\nSauteed Spinach\n\nGrits\n\nMeatless Sausage Link"
        }
        else if(pos == 6){
            textView.text = "Pepper and Onion Tofu Scramble\n\nStrawberry Chia Seed Pancakes\n\nCandied Bacon\n\nFried Hash Brown Patty\n\n" +
                    "Roasted Mushroom Mix\n\nChocolate Oatmeal\n\nMeatless Vegetarian Sausage Patty"
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        val textView: TextView = findViewById(R.id.breakfastTxt) as TextView
        textView.text = "Please select a day"
    }

}